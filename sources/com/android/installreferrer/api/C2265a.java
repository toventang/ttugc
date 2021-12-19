package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.p1921b.p1922a.AbstractC25064a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.List;

/* renamed from: com.android.installreferrer.api.a */
final class C2265a extends InstallReferrerClient {

    /* renamed from: a */
    public int f6799a;

    /* renamed from: b */
    public AbstractC25064a f6800b;

    /* renamed from: c */
    private final Context f6801c;

    /* renamed from: d */
    private ServiceConnection f6802d;

    static {
        Covode.recordClassIndex(2475);
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public final boolean mo6230a() {
        return (this.f6799a != 2 || this.f6800b == null || this.f6802d == null) ? false : true;
    }

    /* renamed from: d */
    private boolean m6889d() {
        try {
            if (this.f6801c.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public final void mo6231b() {
        this.f6799a = 3;
        ServiceConnection serviceConnection = this.f6802d;
        if (serviceConnection != null) {
            this.f6801c.unbindService(serviceConnection);
            this.f6802d = null;
        }
        this.f6800b = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: c */
    public final ReferrerDetails mo6232c() {
        if (mo6230a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6801c.getPackageName());
            try {
                return new ReferrerDetails(this.f6800b.mo40982a(bundle));
            } catch (RemoteException e) {
                this.f6799a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    /* renamed from: com.android.installreferrer.api.a$a */
    final class ServiceConnectionC2266a implements ServiceConnection {

        /* renamed from: b */
        private final InstallReferrerStateListener f6804b;

        static {
            Covode.recordClassIndex(2476);
        }

        /* synthetic */ ServiceConnectionC2266a(C2265a aVar, InstallReferrerStateListener installReferrerStateListener, byte b) {
            this(installReferrerStateListener);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C2265a.this.f6800b = null;
            C2265a.this.f6799a = 0;
            this.f6804b.onInstallReferrerServiceDisconnected();
        }

        private ServiceConnectionC2266a(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f6804b = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC25064a aVar;
            C2265a aVar2 = C2265a.this;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof AbstractC25064a) {
                    aVar = (AbstractC25064a) queryLocalInterface;
                } else {
                    aVar = new AbstractC25064a.AbstractBinderC25065a.C25066a(iBinder);
                }
            }
            aVar2.f6800b = aVar;
            C2265a.this.f6799a = 2;
            this.f6804b.onInstallReferrerSetupFinished(0);
        }
    }

    public C2265a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f6801c = applicationContext;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public final void mo6229a(InstallReferrerStateListener installReferrerStateListener) {
        boolean z;
        if (mo6230a()) {
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f6799a;
        if (i == 1) {
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f6801c.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !m6889d()) {
                        this.f6799a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC2266a aVar = new ServiceConnectionC2266a(this, installReferrerStateListener, (byte) 0);
                    this.f6802d = aVar;
                    try {
                        Context context = this.f6801c;
                        if (context == null || !(context instanceof Context)) {
                            z = context.bindService(intent2, aVar, 1);
                        } else if (!C65713d.m117625a(context, intent2)) {
                            z = context.bindService(intent2, aVar, 1);
                        } else {
                            return;
                        }
                        if (!z) {
                            this.f6799a = 0;
                            installReferrerStateListener.onInstallReferrerSetupFinished(1);
                            return;
                        }
                        return;
                    } catch (SecurityException unused) {
                        this.f6799a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
            }
            this.f6799a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        }
    }
}
