package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.u */
public final class C2335u {
    static {
        Covode.recordClassIndex(2607);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.u$b */
    public static final class C2336b {

        /* renamed from: ǃ */
        private final boolean f7104;

        /* renamed from: ɩ */
        final String f7105;

        static {
            Covode.recordClassIndex(2608);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ */
        public final boolean mo6483() {
            return this.f7104;
        }

        C2336b(String str, boolean z) {
            this.f7105 = str;
            this.f7104 = z;
        }
    }

    /* renamed from: com.appsflyer.internal.u$e */
    static final class C2338e implements IInterface {

        /* renamed from: ǃ */
        private IBinder f7108;

        static {
            Covode.recordClassIndex(2610);
        }

        public final IBinder asBinder() {
            return this.f7108;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı */
        public final boolean mo6487() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f7108.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: ǃ */
        public final String mo6488() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f7108.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        C2338e(IBinder iBinder) {
            this.f7108 = iBinder;
        }
    }

    C2335u() {
    }

    /* renamed from: com.appsflyer.internal.u$d */
    static final class ServiceConnectionC2337d implements ServiceConnection {

        /* renamed from: ı */
        boolean f7106;

        /* renamed from: Ι */
        final LinkedBlockingQueue<IBinder> f7107;

        static {
            Covode.recordClassIndex(2609);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private ServiceConnectionC2337d() {
            this.f7107 = new LinkedBlockingQueue<>(1);
            this.f7106 = false;
        }

        /* synthetic */ ServiceConnectionC2337d(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f7107.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: ι */
    static C2336b m7146(Context context) {
        MethodCollector.m26663i(2638);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC2337d dVar = new ServiceConnectionC2337d((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!m7145xa6216dd1(context, intent, dVar, 1)) {
                        context.unbindService(dVar);
                        IOException iOException = new IOException("Google Play connection failed");
                        MethodCollector.m26664o(2638);
                        throw iOException;
                    } else if (!dVar.f7106) {
                        dVar.f7106 = true;
                        C2338e eVar = new C2338e(dVar.f7107.take());
                        C2336b bVar = new C2336b(eVar.mo6488(), eVar.mo6487());
                        context.unbindService(dVar);
                        MethodCollector.m26664o(2638);
                        return bVar;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(2638);
                        throw illegalStateException;
                    }
                } catch (Exception e) {
                    MethodCollector.m26664o(2638);
                    throw e;
                } catch (Throwable th) {
                    context.unbindService(dVar);
                    MethodCollector.m26664o(2638);
                    throw th;
                }
            } catch (Exception e2) {
                MethodCollector.m26664o(2638);
                throw e2;
            }
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Cannot be called from the main thread");
            MethodCollector.m26664o(2638);
            throw illegalStateException2;
        }
    }

    /* renamed from: com_appsflyer_internal_u_com_ss_android_ugc_aweme_lancet_StartServiceLancet_bindService */
    public static boolean m7145xa6216dd1(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, i);
        }
        if (C65713d.m117625a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
