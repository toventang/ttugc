package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0539e;
import androidx.constraintlayout.p026a.p027a.C0515e;
import androidx.constraintlayout.p026a.p027a.C0520f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.constraintlayout.a.a.g */
public final class C0523g extends C0535q {

    /* renamed from: a */
    public boolean f2055a;

    /* renamed from: aA */
    int f2056aA;

    /* renamed from: aB */
    int f2057aB = 0;

    /* renamed from: aC */
    int f2058aC = 0;

    /* renamed from: aD */
    C0514d[] f2059aD = new C0514d[4];

    /* renamed from: aE */
    C0514d[] f2060aE = new C0514d[4];

    /* renamed from: aF */
    public List<C0524h> f2061aF = new ArrayList();

    /* renamed from: aG */
    public boolean f2062aG = false;

    /* renamed from: aH */
    public boolean f2063aH = false;

    /* renamed from: aI */
    public boolean f2064aI = false;

    /* renamed from: aJ */
    public int f2065aJ = 0;

    /* renamed from: aK */
    public int f2066aK = 0;

    /* renamed from: aL */
    public int f2067aL = 7;

    /* renamed from: aM */
    public boolean f2068aM = false;

    /* renamed from: aN */
    public boolean f2069aN = false;

    /* renamed from: aO */
    public boolean f2070aO = false;

    /* renamed from: aP */
    int f2071aP = 0;

    /* renamed from: aR */
    private C0533p f2072aR;

    /* renamed from: ax */
    int f2073ax;

    /* renamed from: ay */
    int f2074ay;

    /* renamed from: az */
    int f2075az;

    /* renamed from: b */
    public C0539e f2076b = new C0539e();

    static {
        Covode.recordClassIndex(590);
    }

    /* renamed from: D */
    private void m1971D() {
        this.f2057aB = 0;
        this.f2058aC = 0;
    }

    /* renamed from: A */
    public final void mo2326A() {
        m1970C();
        mo2274a(this.f2067aL);
    }

    /* renamed from: C */
    private void m1970C() {
        int size = this.f2126aQ.size();
        mo2277b();
        for (int i = 0; i < size; i++) {
            ((C0520f) this.f2126aQ.get(i)).mo2277b();
        }
    }

    /* renamed from: B */
    public final void mo2327B() {
        C0530m mVar = mo2286a(C0515e.EnumC0519c.LEFT).f1965a;
        C0530m mVar2 = mo2286a(C0515e.EnumC0519c.TOP).f1965a;
        mVar.mo2338a((C0530m) null, 0.0f);
        mVar2.mo2338a((C0530m) null, 0.0f);
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f, androidx.constraintlayout.p026a.p027a.C0535q
    /* renamed from: f */
    public final void mo2303f() {
        this.f2076b.mo2368a();
        this.f2073ax = 0;
        this.f2075az = 0;
        this.f2074ay = 0;
        this.f2056aA = 0;
        this.f2061aF.clear();
        this.f2068aM = false;
        super.mo2303f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03ae A[LOOP:9: B:183:0x03ac->B:184:0x03ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x039b A[SYNTHETIC] */
    @Override // androidx.constraintlayout.p026a.p027a.C0535q
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2331z() {
        /*
        // Method dump skipped, instructions count: 1211
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0523g.mo2331z():void");
    }

    /* renamed from: h */
    public final boolean mo2330h(int i) {
        if ((this.f2067aL & i) == i) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2274a(int i) {
        super.mo2274a(i);
        int size = this.f2126aQ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0520f) this.f2126aQ.get(i2)).mo2274a(i);
        }
    }

    /* renamed from: b */
    private void m1972b(C0520f fVar) {
        int i = this.f2057aB + 1;
        C0514d[] dVarArr = this.f2060aE;
        if (i >= dVarArr.length) {
            this.f2060aE = (C0514d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f2060aE[this.f2057aB] = new C0514d(fVar, 0, this.f2055a);
        this.f2057aB++;
    }

    /* renamed from: c */
    private void m1973c(C0520f fVar) {
        int i = this.f2058aC + 1;
        C0514d[] dVarArr = this.f2059aD;
        if (i >= dVarArr.length) {
            this.f2059aD = (C0514d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f2059aD[this.f2058aC] = new C0514d(fVar, 1, this.f2055a);
        this.f2058aC++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2328a(C0520f fVar, int i) {
        if (i == 0) {
            m1972b(fVar);
        } else if (i == 1) {
            m1973c(fVar);
        }
    }

    /* renamed from: e */
    public final void mo2329e(int i, int i2) {
        if (!(this.f1986G[0] == C0520f.EnumC0522a.WRAP_CONTENT || this.f2030e == null)) {
            this.f2030e.mo2347a(i);
        }
        if (this.f1986G[1] != C0520f.EnumC0522a.WRAP_CONTENT && this.f2031f != null) {
            this.f2031f.mo2347a(i2);
        }
    }
}
