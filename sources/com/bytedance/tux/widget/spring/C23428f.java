package com.bytedance.tux.widget.spring;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.widget.spring.f */
public final class C23428f {

    /* renamed from: a */
    public static final C23428f f55564a = new C23428f();

    /* renamed from: b */
    private static boolean f55565b;

    private C23428f() {
    }

    static {
        Covode.recordClassIndex(27388);
    }

    /* renamed from: a */
    private static void m44094a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Float f, Integer num8, Integer num9, Integer num10) {
        C89219l.m154719c(str, "");
        if (f55565b) {
            if (num != null) {
                num.intValue();
            }
            if (num2 != null) {
                num2.intValue();
            }
            if (num3 != null) {
                num3.intValue();
            }
            if (num4 != null) {
                num4.intValue();
            }
            if (num5 != null) {
                num5.intValue();
            }
            if (num6 != null) {
                num6.intValue();
            }
            if (num7 != null) {
                num7.intValue();
            }
            if (f != null) {
                f.floatValue();
            }
            if (num8 != null) {
                num8.intValue();
            }
            if (num9 != null) {
                num9.intValue();
            }
            if (num10 != null) {
                num10.intValue();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m44095a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Float f, Integer num8, Integer num9, Integer num10, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            num5 = null;
        }
        if ((i & 128) != 0) {
            num6 = null;
        }
        if ((i & 256) != 0) {
            num7 = null;
        }
        if ((i & 1024) != 0) {
            f = null;
        }
        if ((i & 4096) != 0) {
            num8 = null;
        }
        if ((i & 8192) != 0) {
            num9 = null;
        }
        if ((i & 16384) != 0) {
            num10 = null;
        }
        m44094a(str, num, num2, num3, num4, num5, num6, num7, f, num8, num9, num10);
    }
}
