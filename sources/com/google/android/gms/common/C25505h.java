package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25499b;
import com.google.android.gms.common.p1938c.C25500c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.google.android.gms.common.h */
public class C25505h {

    /* renamed from: b */
    private static C25505h f60490b;

    /* renamed from: a */
    public final Context f60491a;

    static {
        Covode.recordClassIndex(30904);
    }

    private C25505h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f60491a = applicationContext;
    }

    /* renamed from: a */
    public static C25505h m49190a(Context context) {
        MethodCollector.m26663i(9277);
        C25565r.m49314a(context);
        synchronized (C25505h.class) {
            try {
                if (f60490b == null) {
                    C25581m.m49372a(context);
                    f60490b = new C25505h(context);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(9277);
                throw th;
            }
        }
        C25505h hVar = f60490b;
        MethodCollector.m26664o(9277);
        return hVar;
    }

    /* renamed from: a */
    private final C25594u m49192a(String str) {
        String str2;
        try {
            PackageInfo packageInfo = C25500c.f60481a.mo41741a(this.f60491a).f60480a.getPackageManager().getPackageInfo(str, 64);
            boolean b = C25504g.m49184b(this.f60491a);
            if (packageInfo == null) {
                return C25594u.m49398a("null pkg");
            }
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                return C25594u.m49398a("single cert required");
            }
            BinderC25585q qVar = new BinderC25585q(packageInfo.signatures[0].toByteArray());
            String str3 = packageInfo.packageName;
            C25594u a = C25581m.m49371a(str3, qVar, b, false);
            if (!a.f60700b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !C25581m.m49371a(str3, qVar, false, true).f60700b) {
                return a;
            }
            return C25594u.m49398a("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "no pkg ".concat(valueOf);
            } else {
                str2 = new String("no pkg ");
            }
            return C25594u.m49398a(str2);
        }
    }

    /* renamed from: a */
    public final boolean mo41743a(int i) {
        C25594u uVar;
        String[] a = C25499b.m49171a(C25500c.f60481a.mo41741a(this.f60491a).f60480a.getPackageManager(), i);
        if (a == null || a.length == 0) {
            uVar = C25594u.m49398a("no pkgs");
        } else {
            uVar = null;
            for (String str : a) {
                uVar = m49192a(str);
                if (uVar.f60700b) {
                    break;
                }
            }
        }
        if (!uVar.f60700b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (uVar.f60701c != null) {
                uVar.mo41852a();
            } else {
                uVar.mo41852a();
            }
        }
        return uVar.f60700b;
    }

    /* renamed from: a */
    private static AbstractBinderC25582n m49191a(PackageInfo packageInfo, AbstractBinderC25582n... nVarArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        BinderC25585q qVar = new BinderC25585q(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(qVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m49193a(PackageInfo packageInfo, boolean z) {
        AbstractBinderC25582n a;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                a = m49191a(packageInfo, C25587s.f60663a);
            } else {
                a = m49191a(packageInfo, C25587s.f60663a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }
}
