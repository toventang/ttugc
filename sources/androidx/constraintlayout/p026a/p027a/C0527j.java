package androidx.constraintlayout.p026a.p027a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a.j */
public class C0527j extends C0520f {

    /* renamed from: ax */
    protected C0520f[] f2097ax = new C0520f[4];

    /* renamed from: ay */
    protected int f2098ay;

    static {
        Covode.recordClassIndex(594);
    }

    /* renamed from: z */
    public final void mo2336z() {
        this.f2098ay = 0;
    }

    /* renamed from: a */
    public final void mo2335a(C0520f fVar) {
        int i = this.f2098ay + 1;
        C0520f[] fVarArr = this.f2097ax;
        if (i > fVarArr.length) {
            this.f2097ax = (C0520f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        C0520f[] fVarArr2 = this.f2097ax;
        int i2 = this.f2098ay;
        fVarArr2[i2] = fVar;
        this.f2098ay = i2 + 1;
    }
}
