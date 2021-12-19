package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b */
public final class C72302b {

    /* renamed from: a */
    public static final C72302b f162099a = new C72302b();

    private C72302b() {
    }

    static {
        Covode.recordClassIndex(84969);
    }

    /* renamed from: a */
    public static boolean m127517a(float f, float f2) {
        if (Math.abs(f - f2) < 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m127518b(float f, float f2) {
        if (f <= f2 || m127517a(f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m127519c(float f, float f2) {
        if (f > f2 || m127517a(f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m127520d(float f, float f2) {
        if (f >= f2 || m127517a(f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m127521e(float f, float f2) {
        if (f < f2 || m127517a(f, f2)) {
            return true;
        }
        return false;
    }
}
