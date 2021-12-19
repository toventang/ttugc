package androidx.core.p037h;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.q */
public class C0787q {

    /* renamed from: a */
    private int f2945a;

    /* renamed from: b */
    private int f2946b;

    static {
        Covode.recordClassIndex(868);
    }

    /* renamed from: a */
    public final int mo2913a() {
        return this.f2945a | this.f2946b;
    }

    /* renamed from: a */
    public final void mo2914a(int i) {
        if (i == 1) {
            this.f2946b = 0;
        } else {
            this.f2945a = 0;
        }
    }

    /* renamed from: a */
    public final void mo2915a(int i, int i2) {
        if (i2 == 1) {
            this.f2946b = i;
        } else {
            this.f2945a = i;
        }
    }
}
