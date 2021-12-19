package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0536b;
import androidx.constraintlayout.p026a.C0539e;
import androidx.constraintlayout.p026a.C0545h;
import androidx.constraintlayout.p026a.p027a.C0515e;
import androidx.constraintlayout.p026a.p027a.C0520f;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.a.i */
public final class C0525i extends C0520f {

    /* renamed from: a */
    public float f2088a = -1.0f;

    /* renamed from: aA */
    private boolean f2089aA;

    /* renamed from: aB */
    private C0529l f2090aB = new C0529l();

    /* renamed from: aC */
    private int f2091aC = 8;

    /* renamed from: ax */
    public int f2092ax = -1;

    /* renamed from: ay */
    public C0515e f2093ay = this.f2049x;

    /* renamed from: az */
    public int f2094az;

    /* renamed from: b */
    public int f2095b = -1;

    static {
        Covode.recordClassIndex(592);
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final boolean mo2276a() {
        return true;
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: t */
    public final ArrayList<C0515e> mo2319t() {
        return this.f1985F;
    }

    public C0525i() {
        this.f1985F.clear();
        this.f1985F.add(this.f2093ay);
        int length = this.f1984E.length;
        for (int i = 0; i < length; i++) {
            this.f1984E[i] = this.f2093ay;
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: y */
    public final void mo2325y() {
        if (this.f1987H != null) {
            int b = C0539e.m2038b(this.f2093ay);
            if (this.f2094az == 1) {
                this.f1992M = b;
                this.f1993N = 0;
                mo2298d(this.f1987H.mo2311l());
                mo2296c(0);
                return;
            }
            this.f1992M = 0;
            this.f1993N = b;
            mo2296c(this.f1987H.mo2310k());
            mo2298d(0);
        }
    }

    /* renamed from: androidx.constraintlayout.a.a.i$1 */
    static /* synthetic */ class C05261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2096a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0525i.C05261.<clinit>():void");
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final C0515e mo2286a(C0515e.EnumC0519c cVar) {
        switch (C05261.f2096a[cVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f2094az == 1) {
                    return this.f2093ay;
                }
                break;
            case 3:
            case 4:
                if (this.f2094az == 0) {
                    return this.f2093ay;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    /* renamed from: h */
    public final void mo2330h(int i) {
        if (this.f2094az != i) {
            this.f2094az = i;
            this.f1985F.clear();
            if (this.f2094az == 1) {
                this.f2093ay = this.f2048w;
            } else {
                this.f2093ay = this.f2049x;
            }
            this.f1985F.add(this.f2093ay);
            int length = this.f1984E.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1984E[i2] = this.f2093ay;
            }
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2275a(C0539e eVar) {
        boolean z;
        C0520f fVar = this.f1987H;
        if (fVar != null) {
            C0515e a = fVar.mo2286a(C0515e.EnumC0519c.LEFT);
            C0515e a2 = fVar.mo2286a(C0515e.EnumC0519c.RIGHT);
            boolean z2 = true;
            if (this.f1987H == null || this.f1987H.f1986G[0] != C0520f.EnumC0522a.WRAP_CONTENT) {
                z = false;
            } else {
                z = true;
            }
            if (this.f2094az == 0) {
                a = fVar.mo2286a(C0515e.EnumC0519c.TOP);
                a2 = fVar.mo2286a(C0515e.EnumC0519c.BOTTOM);
                if (this.f1987H == null || this.f1987H.f1986G[1] != C0520f.EnumC0522a.WRAP_CONTENT) {
                    z2 = false;
                }
                z = z2;
            }
            if (this.f2095b != -1) {
                C0545h a3 = eVar.mo2367a(this.f2093ay);
                eVar.mo2378c(a3, eVar.mo2367a(a), this.f2095b, 6);
                if (z) {
                    eVar.mo2374a(eVar.mo2367a(a2), a3, 0, 5);
                }
            } else if (this.f2092ax != -1) {
                C0545h a4 = eVar.mo2367a(this.f2093ay);
                C0545h a5 = eVar.mo2367a(a2);
                eVar.mo2378c(a4, a5, -this.f2092ax, 6);
                if (z) {
                    eVar.mo2374a(a4, eVar.mo2367a(a), 0, 5);
                    eVar.mo2374a(a5, a4, 0, 5);
                }
            } else if (this.f2088a != -1.0f) {
                C0545h a6 = eVar.mo2367a(this.f2093ay);
                C0545h a7 = eVar.mo2367a(a);
                C0545h a8 = eVar.mo2367a(a2);
                float f = this.f2088a;
                boolean z3 = this.f2089aA;
                C0536b b = eVar.mo2376b();
                if (z3) {
                    b.mo2353a(eVar, 0);
                }
                b.f2130d.mo2269a(a6, -1.0f);
                b.f2130d.mo2269a(a7, 1.0f - f);
                b.f2130d.mo2269a(a8, f);
                eVar.mo2369a(b);
            }
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2274a(int i) {
        C0520f fVar = this.f1987H;
        if (fVar != null) {
            if (this.f2094az == 1) {
                this.f2049x.f1965a.mo2339a(fVar.f2049x.f1965a, 0);
                this.f2051z.f1965a.mo2339a(fVar.f2049x.f1965a, 0);
                if (this.f2095b != -1) {
                    this.f2048w.f1965a.mo2339a(fVar.f2048w.f1965a, this.f2095b);
                    this.f2050y.f1965a.mo2339a(fVar.f2048w.f1965a, this.f2095b);
                } else if (this.f2092ax != -1) {
                    this.f2048w.f1965a.mo2339a(fVar.f2050y.f1965a, -this.f2092ax);
                    this.f2050y.f1965a.mo2339a(fVar.f2050y.f1965a, -this.f2092ax);
                } else if (this.f2088a != -1.0f && fVar.mo2323w() == C0520f.EnumC0522a.FIXED) {
                    int i2 = (int) (((float) fVar.f1988I) * this.f2088a);
                    this.f2048w.f1965a.mo2339a(fVar.f2048w.f1965a, i2);
                    this.f2050y.f1965a.mo2339a(fVar.f2048w.f1965a, i2);
                }
            } else {
                this.f2048w.f1965a.mo2339a(fVar.f2048w.f1965a, 0);
                this.f2050y.f1965a.mo2339a(fVar.f2048w.f1965a, 0);
                if (this.f2095b != -1) {
                    this.f2049x.f1965a.mo2339a(fVar.f2049x.f1965a, this.f2095b);
                    this.f2051z.f1965a.mo2339a(fVar.f2049x.f1965a, this.f2095b);
                } else if (this.f2092ax != -1) {
                    this.f2049x.f1965a.mo2339a(fVar.f2051z.f1965a, -this.f2092ax);
                    this.f2051z.f1965a.mo2339a(fVar.f2051z.f1965a, -this.f2092ax);
                } else if (this.f2088a != -1.0f && fVar.mo2324x() == C0520f.EnumC0522a.FIXED) {
                    int i3 = (int) (((float) fVar.f1989J) * this.f2088a);
                    this.f2049x.f1965a.mo2339a(fVar.f2049x.f1965a, i3);
                    this.f2051z.f1965a.mo2339a(fVar.f2049x.f1965a, i3);
                }
            }
        }
    }
}
