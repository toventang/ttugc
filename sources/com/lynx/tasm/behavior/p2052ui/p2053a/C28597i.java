package com.lynx.tasm.behavior.p2052ui.p2053a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.a.i */
public class C28597i {

    /* renamed from: a */
    final int f67326a;

    /* renamed from: b */
    private final float f67327b;

    static {
        Covode.recordClassIndex(34632);
    }

    /* renamed from: a */
    public final boolean mo49425a() {
        if (this.f67326a == -32) {
            return true;
        }
        return false;
    }

    public C28597i(double d) {
        float f = (float) d;
        this.f67327b = f;
        if (f >= 0.0f) {
            this.f67326a = 0;
        } else {
            this.f67326a = (int) f;
        }
    }

    /* renamed from: a */
    public final float mo49424a(float f, float f2) {
        float f3 = this.f67327b;
        if (0.0f < f3 && f3 <= 1.0f) {
            return f3 * f;
        }
        if (mo49425a()) {
            return f2;
        }
        return this.f67327b;
    }
}
