package com.p2082ss.android.socialbase.downloader.p2182e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.e.a */
public final class C30434a {

    /* renamed from: a */
    public static int f72547a = 4;

    /* renamed from: b */
    private static AbstractC30435a f72548b;

    /* renamed from: com.ss.android.socialbase.downloader.e.a$a */
    public static abstract class AbstractC30435a {
        static {
            Covode.recordClassIndex(36954);
        }
    }

    static {
        Covode.recordClassIndex(36953);
    }

    /* renamed from: a */
    public static boolean m62025a() {
        if (f72547a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m62023a(String str) {
        if (f72547a <= 6) {
            m62026b(str);
        }
        if (f72548b != null) {
            m62026b(str);
        }
    }

    /* renamed from: b */
    private static String m62026b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return "Downloader-".concat(String.valueOf(str));
        }
        return "DownloaderLogger";
    }

    /* renamed from: a */
    public static void m62024a(String str, String str2) {
        if (str2 != null && f72548b != null) {
            m62026b(str);
        }
    }

    /* renamed from: c */
    public static void m62028c(String str, String str2) {
        if (str2 != null) {
            if (f72547a <= 4) {
                m62026b(str);
            }
            if (f72548b != null) {
                m62026b(str);
            }
        }
    }

    /* renamed from: d */
    public static void m62029d(String str, String str2) {
        if (str2 != null) {
            if (f72547a <= 5) {
                m62026b(str);
            }
            if (f72548b != null) {
                m62026b(str);
            }
        }
    }

    /* renamed from: e */
    public static void m62030e(String str, String str2) {
        if (str2 != null) {
            if (f72547a <= 6) {
                m62026b(str);
            }
            if (f72548b != null) {
                m62026b(str);
            }
        }
    }

    /* renamed from: b */
    public static void m62027b(String str, String str2) {
        if (str2 != null) {
            if (f72547a <= 3) {
                m62026b(str);
            }
            if (f72548b != null) {
                m62026b(str);
            }
        }
    }
}
