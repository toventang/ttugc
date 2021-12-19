package com.bytedance.tux.widget.spring.p1731a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.tux.widget.spring.a.a */
public final class C23422a {

    /* renamed from: a */
    public float f55557a = 2000.0f;

    /* renamed from: b */
    public float f55558b = 0.55f;

    static {
        Covode.recordClassIndex(27382);
    }

    /* renamed from: a */
    public final int mo38196a(int i) {
        float f = (float) i;
        float abs = Math.abs(f);
        float f2 = this.f55557a;
        if (abs >= f2) {
            if (f > 0.0f) {
                f = f2 - 1.0f;
            } else {
                f = (-f2) + 1.0f;
            }
        }
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            float f3 = this.f55558b;
            return (int) ((((f2 * f2) / ((f2 - f) * f3)) - (f2 / f3)) + 0.5f);
        }
        float f4 = this.f55558b;
        return -((int) ((((f2 * f2) / ((f + f2) * f4)) - (f2 / f4)) + 0.5f));
    }

    /* renamed from: a */
    public final int mo38197a(int i, int i2, int i3) {
        if (i > 0) {
            if (i3 >= 0) {
                float f = this.f55557a;
                i2 = (int) (((1.0f - (1.0f / (((this.f55558b * ((float) i)) / f) + 1.0f))) * f) + 0.5f);
            }
        } else if (i3 <= 0) {
            float f2 = this.f55557a;
            i2 = (int) ((-((1.0f - (1.0f / ((((-this.f55558b) * ((float) i)) / f2) + 1.0f))) * f2)) + 0.5f);
        }
        float f3 = (float) i2;
        float f4 = this.f55557a;
        if (f3 > f4 - 1.0f) {
            return (int) (f4 - 1.0f);
        }
        if (f3 < (-f4) + 1.0f) {
            return (int) ((-f4) + 1.0f);
        }
        return i2;
    }
}
