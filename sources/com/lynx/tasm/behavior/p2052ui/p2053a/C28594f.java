package com.lynx.tasm.behavior.p2052ui.p2053a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.a.f */
public class C28594f {

    /* renamed from: a */
    private final int f67321a;

    /* renamed from: b */
    private final float f67322b;

    static {
        Covode.recordClassIndex(34629);
    }

    public C28594f(double d) {
        float f = (float) d;
        this.f67322b = f;
        if (f >= 0.0f) {
            this.f67321a = 0;
        } else {
            this.f67321a = (int) f;
        }
    }

    /* renamed from: a */
    public final float mo49422a(float f) {
        float f2 = this.f67322b;
        if (f2 < 0.0f) {
            int i = this.f67321a;
            if (i == -36) {
                return f * 0.5f;
            }
            if (i == -34 || i == -33) {
                return f;
            }
            return 0.0f;
        } else if (0.0f >= f2 || f2 > 1.0f) {
            return f2;
        } else {
            return f2 * f;
        }
    }
}
