package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78104a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78105b;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bj */
public final class C73991bj {
    static {
        Covode.recordClassIndex(86741);
    }

    /* renamed from: a */
    public static void m130128a(String str) {
        C51423a.m95784a(3, "Tools-Client", str);
        C73992bk.m130134a(3, "Tools-Client", str);
        C78105b.m136531b(C78104a.f175370a, str);
    }

    /* renamed from: b */
    public static void m130131b(String str) {
        C51423a.m95784a(6, "Tools-Client", str);
        C73992bk.m130134a(6, "Tools-Client", str);
        C78105b.m136533d(C78104a.f175370a, str);
    }

    /* renamed from: c */
    public static void m130132c(String str) {
        C51423a.m95784a(5, "Tools-Client", str);
        C73992bk.m130134a(5, "Tools-Client", str);
        C78105b.m136534e(C78104a.f175370a, str);
    }

    /* renamed from: d */
    public static void m130133d(String str) {
        C51423a.m95784a(4, "Tools-Client", str);
        C73992bk.m130134a(4, "Tools-Client", str);
        C78105b.m136532c(C78104a.f175370a, str);
    }

    /* renamed from: a */
    public static void m130129a(Throwable th) {
        C51423a.m95784a(6, "Tools-Client", m130130b(th));
    }

    /* renamed from: b */
    public static String m130130b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }
}
