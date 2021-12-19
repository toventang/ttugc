package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.AbstractC25521an;
import com.google.android.gms.common.internal.C25522ao;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p1934b.BinderC25327b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.m */
public final class C25581m {

    /* renamed from: a */
    private static volatile AbstractC25521an f60653a;

    /* renamed from: b */
    private static final Object f60654b = new Object();

    /* renamed from: c */
    private static Context f60655c;

    static {
        Covode.recordClassIndex(30988);
    }

    /* renamed from: a */
    static synchronized void m49372a(Context context) {
        synchronized (C25581m.class) {
            MethodCollector.m26663i(7932);
            if (f60655c != null || context == null) {
                MethodCollector.m26664o(7932);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            f60655c = applicationContext;
            MethodCollector.m26664o(7932);
        }
    }

    /* renamed from: a */
    static C25594u m49371a(String str, AbstractBinderC25582n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m49373b(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static C25594u m49373b(String str, AbstractBinderC25582n nVar, boolean z, boolean z2) {
        String str2;
        AbstractC25521an anVar;
        MethodCollector.m26663i(8086);
        try {
            if (f60653a == null) {
                C25565r.m49314a(f60655c);
                synchronized (f60654b) {
                    try {
                        if (f60653a == null) {
                            IBinder a = DynamiteModule.m49545a(f60655c, DynamiteModule.f60795d, "com.google.android.gms.googlecertificates").mo41907a("com.google.android.gms.common.GoogleCertificatesImpl");
                            if (a == null) {
                                anVar = null;
                            } else {
                                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                                if (queryLocalInterface instanceof AbstractC25521an) {
                                    anVar = (AbstractC25521an) queryLocalInterface;
                                } else {
                                    anVar = new C25522ao(a);
                                }
                            }
                            f60653a = anVar;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(8086);
                        throw th;
                    }
                }
            }
            C25565r.m49314a(f60655c);
            try {
                if (f60653a.mo41773a(new zzj(str, nVar, z, z2), BinderC25327b.m48694a(f60655c.getPackageManager()))) {
                    C25594u uVar = C25594u.f60699a;
                    MethodCollector.m26664o(8086);
                    return uVar;
                }
                C25618w wVar = new C25618w(new CallableC25583o(z, str, nVar), (byte) 0);
                MethodCollector.m26664o(8086);
                return wVar;
            } catch (RemoteException e) {
                C25594u a2 = C25594u.m49399a("module call", e);
                MethodCollector.m26664o(8086);
                return a2;
            }
        } catch (DynamiteModule.C25653a e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str2 = "module init: ".concat(valueOf);
            } else {
                str2 = new String("module init: ");
            }
            C25594u a3 = C25594u.m49399a(str2, e2);
            MethodCollector.m26664o(8086);
            return a3;
        }
    }
}
