package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0539e;
import androidx.constraintlayout.p026a.C0545h;
import androidx.constraintlayout.p026a.p027a.C0515e;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.constraintlayout.a.a.m */
public final class C0530m extends C0532o {

    /* renamed from: a */
    C0515e f2100a;

    /* renamed from: b */
    float f2101b;

    /* renamed from: c */
    C0530m f2102c;

    /* renamed from: d */
    float f2103d;

    /* renamed from: e */
    C0530m f2104e;

    /* renamed from: f */
    public float f2105f;

    /* renamed from: g */
    public int f2106g;

    /* renamed from: j */
    private C0530m f2107j;

    /* renamed from: k */
    private float f2108k;

    /* renamed from: l */
    private C0531n f2109l;

    /* renamed from: m */
    private int f2110m = 1;

    /* renamed from: n */
    private C0531n f2111n;

    /* renamed from: o */
    private int f2112o = 1;

    static {
        Covode.recordClassIndex(597);
    }

    /* renamed from: a */
    private static String m1999a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0532o
    /* renamed from: b */
    public final void mo2342b() {
        super.mo2342b();
        this.f2102c = null;
        this.f2103d = 0.0f;
        this.f2109l = null;
        this.f2110m = 1;
        this.f2111n = null;
        this.f2112o = 1;
        this.f2104e = null;
        this.f2105f = 0.0f;
        this.f2101b = 0.0f;
        this.f2107j = null;
        this.f2108k = 0.0f;
        this.f2106g = 0;
    }

    public final String toString() {
        if (this.f2115i != 1) {
            return "{ " + this.f2100a + " UNRESOLVED} type: " + m1999a(this.f2106g);
        }
        if (this.f2104e == this) {
            return "[" + this.f2100a + ", RESOLVED: " + this.f2105f + "]  type: " + m1999a(this.f2106g);
        }
        return "[" + this.f2100a + ", RESOLVED: " + this.f2104e + ":" + this.f2105f + "] type: " + m1999a(this.f2106g);
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0532o
    /* renamed from: a */
    public final void mo2337a() {
        C0530m mVar;
        C0530m mVar2;
        C0530m mVar3;
        C0530m mVar4;
        C0530m mVar5;
        C0530m mVar6;
        float f;
        float f2;
        float f3;
        float f4;
        C0530m mVar7;
        boolean z = true;
        if (this.f2115i != 1 && this.f2106g != 4) {
            C0531n nVar = this.f2109l;
            if (nVar != null) {
                if (nVar.f2115i == 1) {
                    this.f2103d = ((float) this.f2110m) * this.f2109l.f2113a;
                } else {
                    return;
                }
            }
            C0531n nVar2 = this.f2111n;
            if (nVar2 != null) {
                if (nVar2.f2115i == 1) {
                    this.f2108k = ((float) this.f2112o) * this.f2111n.f2113a;
                } else {
                    return;
                }
            }
            if (this.f2106g == 1 && ((mVar7 = this.f2102c) == null || mVar7.f2115i == 1)) {
                C0530m mVar8 = this.f2102c;
                if (mVar8 == null) {
                    this.f2104e = this;
                    this.f2105f = this.f2103d;
                } else {
                    this.f2104e = mVar8.f2104e;
                    this.f2105f = mVar8.f2105f + this.f2103d;
                }
                mo2350d();
            } else if (this.f2106g == 2 && (mVar4 = this.f2102c) != null && mVar4.f2115i == 1 && (mVar5 = this.f2107j) != null && (mVar6 = mVar5.f2102c) != null && mVar6.f2115i == 1) {
                if (C0539e.f2135h != null) {
                    C0539e.f2135h.f2179w++;
                }
                this.f2104e = this.f2102c.f2104e;
                C0530m mVar9 = this.f2107j;
                mVar9.f2104e = mVar9.f2102c.f2104e;
                int i = 0;
                if (this.f2100a.f1967c == C0515e.EnumC0519c.RIGHT || this.f2100a.f1967c == C0515e.EnumC0519c.BOTTOM) {
                    f = this.f2102c.f2105f;
                    f2 = this.f2107j.f2102c.f2105f;
                } else {
                    z = false;
                    f = this.f2107j.f2102c.f2105f;
                    f2 = this.f2102c.f2105f;
                }
                float f5 = f - f2;
                if (this.f2100a.f1967c == C0515e.EnumC0519c.LEFT || this.f2100a.f1967c == C0515e.EnumC0519c.RIGHT) {
                    f4 = f5 - ((float) this.f2100a.f1966b.mo2310k());
                    f3 = this.f2100a.f1966b.f2007ac;
                } else {
                    f4 = f5 - ((float) this.f2100a.f1966b.mo2311l());
                    f3 = this.f2100a.f1966b.f2008ad;
                }
                int b = this.f2100a.mo2282b();
                int b2 = this.f2107j.f2100a.mo2282b();
                if (this.f2100a.f1968d == this.f2107j.f2100a.f1968d) {
                    f3 = 0.5f;
                    b2 = 0;
                } else {
                    i = b;
                }
                float f6 = (float) i;
                float f7 = (float) b2;
                float f8 = (f4 - f6) - f7;
                if (z) {
                    C0530m mVar10 = this.f2107j;
                    mVar10.f2105f = mVar10.f2102c.f2105f + f7 + (f8 * f3);
                    this.f2105f = (this.f2102c.f2105f - f6) - (f8 * (1.0f - f3));
                } else {
                    this.f2105f = this.f2102c.f2105f + f6 + (f8 * f3);
                    C0530m mVar11 = this.f2107j;
                    mVar11.f2105f = (mVar11.f2102c.f2105f - f7) - (f8 * (1.0f - f3));
                }
                mo2350d();
                this.f2107j.mo2350d();
            } else if (this.f2106g == 3 && (mVar = this.f2102c) != null && mVar.f2115i == 1 && (mVar2 = this.f2107j) != null && (mVar3 = mVar2.f2102c) != null && mVar3.f2115i == 1) {
                if (C0539e.f2135h != null) {
                    C0539e.f2135h.f2180x++;
                }
                C0530m mVar12 = this.f2102c;
                this.f2104e = mVar12.f2104e;
                C0530m mVar13 = this.f2107j;
                C0530m mVar14 = mVar13.f2102c;
                mVar13.f2104e = mVar14.f2104e;
                this.f2105f = mVar12.f2105f + this.f2103d;
                mVar13.f2105f = mVar14.f2105f + mVar13.f2103d;
                mo2350d();
                this.f2107j.mo2350d();
            } else if (this.f2106g == 5) {
                this.f2100a.f1966b.mo2278c();
            }
        }
    }

    public C0530m(C0515e eVar) {
        this.f2100a = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2341a(C0539e eVar) {
        C0545h hVar = this.f2100a.f1974j;
        C0530m mVar = this.f2104e;
        if (mVar == null) {
            eVar.mo2372a(hVar, (int) (this.f2105f + 0.5f));
        } else {
            eVar.mo2378c(hVar, eVar.mo2367a(mVar.f2100a), (int) (this.f2105f + 0.5f), 6);
        }
    }

    /* renamed from: b */
    public final void mo2343b(C0530m mVar, float f) {
        this.f2107j = mVar;
        this.f2108k = f;
    }

    /* renamed from: a */
    public final void mo2339a(C0530m mVar, int i) {
        this.f2106g = 1;
        this.f2102c = mVar;
        this.f2103d = (float) i;
        mVar.mo2348a(this);
    }

    /* renamed from: b */
    public final void mo2344b(C0530m mVar, int i) {
        this.f2102c = mVar;
        this.f2103d = (float) i;
        mVar.mo2348a(this);
    }

    /* renamed from: a */
    public final void mo2338a(C0530m mVar, float f) {
        if (this.f2115i == 0 || !(this.f2104e == mVar || this.f2105f == f)) {
            this.f2104e = mVar;
            this.f2105f = f;
            if (this.f2115i == 1) {
                mo2349c();
            }
            mo2350d();
        }
    }

    /* renamed from: b */
    public final void mo2345b(C0530m mVar, int i, C0531n nVar) {
        this.f2107j = mVar;
        this.f2111n = nVar;
        this.f2112o = i;
    }

    /* renamed from: a */
    public final void mo2340a(C0530m mVar, int i, C0531n nVar) {
        this.f2102c = mVar;
        mVar.mo2348a(this);
        this.f2109l = nVar;
        this.f2110m = i;
        nVar.mo2348a(this);
    }
}
