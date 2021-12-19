package com.facebook.p1870h;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.imageutils.C24660c;

/* renamed from: com.facebook.h.b */
public final class C24313b {

    /* renamed from: a */
    public static final C24314c f57651a = new C24314c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C24314c f57652b = new C24314c("PNG", "png");

    /* renamed from: c */
    public static final C24314c f57653c = new C24314c("GIF", "gif");

    /* renamed from: d */
    public static final C24314c f57654d = new C24314c("BMP", "bmp");

    /* renamed from: e */
    public static final C24314c f57655e = new C24314c("ICO", "ico");

    /* renamed from: f */
    public static final C24314c f57656f = new C24314c("WEBP_SIMPLE", "webp");

    /* renamed from: g */
    public static final C24314c f57657g = new C24314c("WEBP_LOSSLESS", "webp");

    /* renamed from: h */
    public static final C24314c f57658h = new C24314c("WEBP_EXTENDED", "webp");

    /* renamed from: i */
    public static final C24314c f57659i = new C24314c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j */
    public static final C24314c f57660j = new C24314c("WEBP_ANIMATED", "webp");

    /* renamed from: k */
    public static final C24314c f57661k = new C24314c("HEIF", "heif");

    /* renamed from: l */
    public static final C24314c f57662l = null;

    static {
        Covode.recordClassIndex(28454);
    }

    /* renamed from: a */
    public static boolean m46264a(C24314c cVar) {
        if (m46265b(cVar) || cVar == f57660j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m46265b(C24314c cVar) {
        if (cVar == f57656f || cVar == f57657g || cVar == f57658h || cVar == f57659i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m46266c(C24314c cVar) {
        try {
            if (cVar == C24660c.m47177a()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24099a.m45658c("DefaultImageFormats", "isHeifFormat error", th);
            return false;
        }
    }
}
