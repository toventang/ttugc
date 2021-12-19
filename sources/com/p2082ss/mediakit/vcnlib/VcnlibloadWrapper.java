package com.p2082ss.mediakit.vcnlib;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.mediakit.vcnlib.VcnlibloadWrapper */
public class VcnlibloadWrapper {
    private static boolean isVcnload;
    private static boolean isVcnverifyLiteload;
    private static boolean isVcnverifyload;

    static {
        Covode.recordClassIndex(101263);
    }

    /* renamed from: com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147918xc070514f(String str, String str2) {
        return 0;
    }

    public static boolean tryLoadVcnlib() {
        MethodCollector.m26663i(3796);
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z = true;
                if (isVcnload) {
                    return true;
                }
                try {
                    m147917x8bb49aa5("vcn");
                } catch (UnsatisfiedLinkError e) {
                    m147918xc070514f("vcn", "Can't load vcn library: ".concat(String.valueOf(e)));
                    z = false;
                }
                isVcnload = z;
                MethodCollector.m26664o(3796);
                return z;
            } finally {
                MethodCollector.m26664o(3796);
            }
        }
    }

    public static boolean tryLoadVcnverifyLitelib() {
        MethodCollector.m26663i(3928);
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z = true;
                if (isVcnverifyLiteload) {
                    return true;
                }
                try {
                    m147917x8bb49aa5("vcnverifylite");
                    m147918xc070514f("vcn", "load vcnverifylite suc");
                    CustomVerify.init();
                } catch (UnsatisfiedLinkError e) {
                    m147918xc070514f("vcn", "Can't load vcnverifylite library: ".concat(String.valueOf(e)));
                    z = false;
                }
                isVcnverifyLiteload = z;
                MethodCollector.m26664o(3928);
                return z;
            } finally {
                MethodCollector.m26664o(3928);
            }
        }
    }

    public static boolean tryLoadVcnverifylib() {
        boolean z;
        MethodCollector.m26663i(3858);
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z2 = true;
                if (isVcnverifyload) {
                    return true;
                }
                try {
                    m147917x8bb49aa5("vcnverify");
                    z = true;
                } catch (UnsatisfiedLinkError e) {
                    m147918xc070514f("vcn", "Can't load vcnverify library: ".concat(String.valueOf(e)));
                    z = false;
                }
                isVcnverifyload = z;
                if (!z && !tryLoadVcnverifyLitelib()) {
                    z2 = false;
                }
                MethodCollector.m26664o(3858);
                return z2;
            } finally {
                MethodCollector.m26664o(3858);
            }
        }
    }

    /* renamed from: com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147917x8bb49aa5(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
