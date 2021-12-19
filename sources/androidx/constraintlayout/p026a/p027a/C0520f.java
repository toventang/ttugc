package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0537c;
import androidx.constraintlayout.p026a.C0539e;
import androidx.constraintlayout.p026a.p027a.C0515e;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.a.f */
public class C0520f {

    /* renamed from: ab */
    public static float f1979ab = 0.5f;

    /* renamed from: A */
    C0515e f1980A = new C0515e(this, C0515e.EnumC0519c.BASELINE);

    /* renamed from: B */
    C0515e f1981B = new C0515e(this, C0515e.EnumC0519c.CENTER_X);

    /* renamed from: C */
    C0515e f1982C = new C0515e(this, C0515e.EnumC0519c.CENTER_Y);

    /* renamed from: D */
    C0515e f1983D;

    /* renamed from: E */
    protected C0515e[] f1984E;

    /* renamed from: F */
    protected ArrayList<C0515e> f1985F;

    /* renamed from: G */
    protected EnumC0522a[] f1986G;

    /* renamed from: H */
    public C0520f f1987H;

    /* renamed from: I */
    int f1988I;

    /* renamed from: J */
    int f1989J;

    /* renamed from: K */
    public float f1990K;

    /* renamed from: L */
    public int f1991L;

    /* renamed from: M */
    public int f1992M;

    /* renamed from: N */
    public int f1993N;

    /* renamed from: O */
    int f1994O;

    /* renamed from: P */
    int f1995P;

    /* renamed from: Q */
    public int f1996Q;

    /* renamed from: R */
    public int f1997R;

    /* renamed from: S */
    public int f1998S;

    /* renamed from: T */
    public int f1999T;

    /* renamed from: U */
    protected int f2000U;

    /* renamed from: V */
    protected int f2001V;

    /* renamed from: W */
    public int f2002W;

    /* renamed from: X */
    public int f2003X;

    /* renamed from: Y */
    public int f2004Y;

    /* renamed from: Z */
    public int f2005Z;

    /* renamed from: aa */
    public int f2006aa;

    /* renamed from: ac */
    public float f2007ac;

    /* renamed from: ad */
    public float f2008ad;

    /* renamed from: ae */
    public Object f2009ae;

    /* renamed from: af */
    public int f2010af;

    /* renamed from: ag */
    public int f2011ag;

    /* renamed from: ah */
    public String f2012ah;

    /* renamed from: ai */
    public String f2013ai;

    /* renamed from: aj */
    boolean f2014aj;

    /* renamed from: ak */
    boolean f2015ak;

    /* renamed from: al */
    boolean f2016al;

    /* renamed from: am */
    boolean f2017am;

    /* renamed from: an */
    public boolean f2018an;

    /* renamed from: ao */
    public int f2019ao;

    /* renamed from: ap */
    public int f2020ap;

    /* renamed from: aq */
    boolean f2021aq;

    /* renamed from: ar */
    boolean f2022ar;

    /* renamed from: as */
    public float[] f2023as;

    /* renamed from: at */
    protected C0520f[] f2024at;

    /* renamed from: au */
    protected C0520f[] f2025au;

    /* renamed from: av */
    C0520f f2026av;

    /* renamed from: aw */
    C0520f f2027aw;

    /* renamed from: c */
    public int f2028c = -1;

    /* renamed from: d */
    public int f2029d = -1;

    /* renamed from: e */
    C0531n f2030e;

    /* renamed from: f */
    C0531n f2031f;

    /* renamed from: g */
    public int f2032g;

    /* renamed from: h */
    public int f2033h;

    /* renamed from: i */
    int[] f2034i = new int[2];

    /* renamed from: j */
    public int f2035j;

    /* renamed from: k */
    public int f2036k;

    /* renamed from: l */
    public float f2037l = 1.0f;

    /* renamed from: m */
    public int f2038m;

    /* renamed from: n */
    public int f2039n;

    /* renamed from: o */
    public float f2040o = 1.0f;

    /* renamed from: p */
    public boolean f2041p;

    /* renamed from: q */
    public boolean f2042q;

    /* renamed from: r */
    int f2043r = -1;

    /* renamed from: s */
    float f2044s = 1.0f;

    /* renamed from: t */
    public C0524h f2045t;

    /* renamed from: u */
    public int[] f2046u = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: v */
    public float f2047v;

    /* renamed from: w */
    C0515e f2048w = new C0515e(this, C0515e.EnumC0519c.LEFT);

    /* renamed from: x */
    C0515e f2049x = new C0515e(this, C0515e.EnumC0519c.TOP);

    /* renamed from: y */
    C0515e f2050y = new C0515e(this, C0515e.EnumC0519c.RIGHT);

    /* renamed from: z */
    C0515e f2051z = new C0515e(this, C0515e.EnumC0519c.BOTTOM);

    /* renamed from: c */
    public void mo2278c() {
    }

    /* renamed from: t */
    public ArrayList<C0515e> mo2319t() {
        return this.f1985F;
    }

    /* renamed from: m */
    public final int mo2312m() {
        return this.f1996Q + this.f2000U;
    }

    /* renamed from: n */
    public final int mo2313n() {
        return this.f1997R + this.f2001V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo2314o() {
        return this.f1992M + this.f2000U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo2315p() {
        return this.f1993N + this.f2001V;
    }

    /* renamed from: q */
    public final int mo2316q() {
        return this.f1992M + this.f1988I;
    }

    /* renamed from: r */
    public final int mo2317r() {
        return this.f1993N + this.f1989J;
    }

    /* renamed from: s */
    public final boolean mo2318s() {
        if (this.f2002W > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final EnumC0522a mo2323w() {
        return this.f1986G[0];
    }

    /* renamed from: x */
    public final EnumC0522a mo2324x() {
        return this.f1986G[1];
    }

    static {
        Covode.recordClassIndex(587);
    }

    /* renamed from: i */
    public final C0531n mo2308i() {
        if (this.f2030e == null) {
            this.f2030e = new C0531n();
        }
        return this.f2030e;
    }

    /* renamed from: j */
    public final C0531n mo2309j() {
        if (this.f2031f == null) {
            this.f2031f = new C0531n();
        }
        return this.f2031f;
    }

    /* renamed from: k */
    public final int mo2310k() {
        if (this.f2011ag == 8) {
            return 0;
        }
        return this.f1988I;
    }

    /* renamed from: l */
    public final int mo2311l() {
        if (this.f2011ag == 8) {
            return 0;
        }
        return this.f1989J;
    }

    /* renamed from: e */
    public final boolean mo2302e() {
        if (this.f2033h == 0 && this.f1990K == 0.0f && this.f2038m == 0 && this.f2039n == 0 && this.f1986G[1] == EnumC0522a.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void mo2321u() {
        int i = this.f1992M;
        int i2 = this.f1993N;
        this.f1996Q = i;
        this.f1997R = i2;
        this.f1998S = (this.f1988I + i) - i;
        this.f1999T = (this.f1989J + i2) - i2;
    }

    /* renamed from: v */
    public final void mo2322v() {
        int size = this.f1985F.size();
        for (int i = 0; i < size; i++) {
            this.f1985F.get(i).mo2283c();
        }
    }

    /* renamed from: androidx.constraintlayout.a.a.f$a */
    public enum EnumC0522a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT;

        static {
            Covode.recordClassIndex(589);
        }
    }

    /* renamed from: b */
    public void mo2277b() {
        int i = 0;
        do {
            this.f1984E[i].f1965a.mo2342b();
            i++;
        } while (i < 6);
    }

    /* renamed from: d */
    public final boolean mo2300d() {
        if (this.f2032g == 0 && this.f1990K == 0.0f && this.f2035j == 0 && this.f2036k == 0 && this.f1986G[0] == EnumC0522a.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo2306g() {
        int i = 0;
        do {
            C0530m mVar = this.f1984E[i].f1965a;
            C0515e eVar = mVar.f2100a.f1968d;
            if (eVar != null) {
                if (eVar.f1968d == mVar.f2100a) {
                    mVar.f2106g = 4;
                    eVar.f1965a.f2106g = 4;
                }
                int b = mVar.f2100a.mo2282b();
                if (mVar.f2100a.f1967c == C0515e.EnumC0519c.RIGHT || mVar.f2100a.f1967c == C0515e.EnumC0519c.BOTTOM) {
                    b = -b;
                }
                mVar.mo2344b(eVar.f1965a, b);
            }
            i++;
        } while (i < 6);
    }

    /* renamed from: h */
    public final boolean mo2307h() {
        if (this.f2048w.f1965a.f2115i == 1 && this.f2050y.f1965a.f2115i == 1 && this.f2049x.f1965a.f2115i == 1 && this.f2051z.f1965a.f2115i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public void mo2325y() {
        int i;
        int i2;
        int b = C0539e.m2038b(this.f2048w);
        int b2 = C0539e.m2038b(this.f2049x);
        int b3 = C0539e.m2038b(this.f2050y);
        int b4 = C0539e.m2038b(this.f2051z);
        int i3 = b4 - b2;
        if (b3 - b < 0 || i3 < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i4 = b3 - b;
        int i5 = b4 - b2;
        this.f1992M = b;
        this.f1993N = b2;
        if (this.f2011ag == 8) {
            this.f1988I = 0;
            this.f1989J = 0;
            return;
        }
        if (this.f1986G[0] == EnumC0522a.FIXED && i4 < (i2 = this.f1988I)) {
            i4 = i2;
        }
        if (this.f1986G[1] == EnumC0522a.FIXED && i5 < (i = this.f1989J)) {
            i5 = i;
        }
        this.f1988I = i4;
        this.f1989J = i5;
        int i6 = this.f2004Y;
        if (i5 < i6) {
            this.f1989J = i6;
        }
        int i7 = this.f2003X;
        if (i4 < i7) {
            this.f1988I = i7;
        }
        this.f2017am = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.a.f$1 */
    public static /* synthetic */ class C05211 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2052a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2053b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0094 */
        static {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0520f.C05211.<clinit>():void");
        }
    }

    /* renamed from: f */
    public void mo2303f() {
        this.f2048w.mo2283c();
        this.f2049x.mo2283c();
        this.f2050y.mo2283c();
        this.f2051z.mo2283c();
        this.f1980A.mo2283c();
        this.f1981B.mo2283c();
        this.f1982C.mo2283c();
        this.f1983D.mo2283c();
        this.f1987H = null;
        this.f2047v = 0.0f;
        this.f1988I = 0;
        this.f1989J = 0;
        this.f1990K = 0.0f;
        this.f1991L = -1;
        this.f1992M = 0;
        this.f1993N = 0;
        this.f1996Q = 0;
        this.f1997R = 0;
        this.f1998S = 0;
        this.f1999T = 0;
        this.f2000U = 0;
        this.f2001V = 0;
        this.f2002W = 0;
        this.f2003X = 0;
        this.f2004Y = 0;
        this.f2005Z = 0;
        this.f2006aa = 0;
        float f = f1979ab;
        this.f2007ac = f;
        this.f2008ad = f;
        this.f1986G[0] = EnumC0522a.FIXED;
        this.f1986G[1] = EnumC0522a.FIXED;
        this.f2009ae = null;
        this.f2010af = 0;
        this.f2011ag = 0;
        this.f2013ai = null;
        this.f2014aj = false;
        this.f2015ak = false;
        this.f2019ao = 0;
        this.f2020ap = 0;
        this.f2021aq = false;
        this.f2022ar = false;
        float[] fArr = this.f2023as;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2028c = -1;
        this.f2029d = -1;
        int[] iArr = this.f2046u;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2032g = 0;
        this.f2033h = 0;
        this.f2037l = 1.0f;
        this.f2040o = 1.0f;
        this.f2036k = Integer.MAX_VALUE;
        this.f2039n = Integer.MAX_VALUE;
        this.f2035j = 0;
        this.f2038m = 0;
        this.f2043r = -1;
        this.f2044s = 1.0f;
        C0531n nVar = this.f2030e;
        if (nVar != null) {
            nVar.mo2342b();
        }
        C0531n nVar2 = this.f2031f;
        if (nVar2 != null) {
            nVar2.mo2342b();
        }
        this.f2045t = null;
        this.f2016al = false;
        this.f2017am = false;
        this.f2018an = false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f2013ai != null) {
            str = "type: " + this.f2013ai + " ";
        } else {
            str = str2;
        }
        StringBuilder append = sb.append(str);
        if (this.f2012ah != null) {
            str2 = "id: " + this.f2012ah + " ";
        }
        return append.append(str2).append("(").append(this.f1992M).append(", ").append(this.f1993N).append(") - (").append(this.f1988I).append(" x ").append(this.f1989J).append(") wrap: (").append(this.f2005Z).append(" x ").append(this.f2006aa).append(")").toString();
    }

    public C0520f() {
        C0515e eVar = new C0515e(this, C0515e.EnumC0519c.CENTER);
        this.f1983D = eVar;
        this.f1984E = new C0515e[]{this.f2048w, this.f2050y, this.f2049x, this.f2051z, this.f1980A, eVar};
        this.f1985F = new ArrayList<>();
        this.f1986G = new EnumC0522a[]{EnumC0522a.FIXED, EnumC0522a.FIXED};
        this.f1987H = null;
        this.f1988I = 0;
        this.f1989J = 0;
        this.f1990K = 0.0f;
        this.f1991L = -1;
        this.f1992M = 0;
        this.f1993N = 0;
        this.f1994O = 0;
        this.f1995P = 0;
        this.f1996Q = 0;
        this.f1997R = 0;
        this.f1998S = 0;
        this.f1999T = 0;
        this.f2000U = 0;
        this.f2001V = 0;
        this.f2002W = 0;
        float f = f1979ab;
        this.f2007ac = f;
        this.f2008ad = f;
        this.f2010af = 0;
        this.f2011ag = 0;
        this.f2012ah = null;
        this.f2013ai = null;
        this.f2016al = false;
        this.f2017am = false;
        this.f2018an = false;
        this.f2019ao = 0;
        this.f2020ap = 0;
        this.f2023as = new float[]{-1.0f, -1.0f};
        this.f2024at = new C0520f[]{null, null};
        this.f2025au = new C0520f[]{null, null};
        this.f2026av = null;
        this.f2027aw = null;
        this.f1985F.add(this.f2048w);
        this.f1985F.add(this.f2049x);
        this.f1985F.add(this.f2050y);
        this.f1985F.add(this.f2051z);
        this.f1985F.add(this.f1981B);
        this.f1985F.add(this.f1982C);
        this.f1985F.add(this.f1983D);
        this.f1985F.add(this.f1980A);
    }

    /* renamed from: a */
    public boolean mo2276a() {
        if (this.f2011ag != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo2274a(int i) {
        C0528k.m1994a(i, this);
    }

    /* renamed from: c */
    public final void mo2296c(int i) {
        this.f1988I = i;
        int i2 = this.f2003X;
        if (i < i2) {
            this.f1988I = i2;
        }
    }

    /* renamed from: d */
    public final void mo2298d(int i) {
        this.f1989J = i;
        int i2 = this.f2004Y;
        if (i < i2) {
            this.f1989J = i2;
        }
    }

    /* renamed from: e */
    public final void mo2301e(int i) {
        if (i < 0) {
            this.f2003X = 0;
        } else {
            this.f2003X = i;
        }
    }

    /* renamed from: f */
    public final void mo2304f(int i) {
        if (i < 0) {
            this.f2004Y = 0;
        } else {
            this.f2004Y = i;
        }
    }

    /* renamed from: b */
    public final int mo2292b(int i) {
        if (i == 0) {
            return mo2310k();
        }
        if (i == 1) {
            return mo2311l();
        }
        return 0;
    }

    /* renamed from: g */
    public final EnumC0522a mo2305g(int i) {
        if (i == 0) {
            return this.f1986G[0];
        }
        if (i == 1) {
            return this.f1986G[1];
        }
        return null;
    }

    /* renamed from: h */
    private boolean mo2330h(int i) {
        int i2 = i * 2;
        if (this.f1984E[i2].f1968d == null) {
            return false;
        }
        C0515e eVar = this.f1984E[i2].f1968d.f1968d;
        C0515e[] eVarArr = this.f1984E;
        if (eVar == eVarArr[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        if (eVarArr[i3].f1968d == null || this.f1984E[i3].f1968d.f1968d != this.f1984E[i3]) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo2290a(EnumC0522a aVar) {
        this.f1986G[0] = aVar;
        if (aVar == EnumC0522a.WRAP_CONTENT) {
            mo2296c(this.f2005Z);
        }
    }

    /* renamed from: a */
    public C0515e mo2286a(C0515e.EnumC0519c cVar) {
        switch (C05211.f2052a[cVar.ordinal()]) {
            case 1:
                return this.f2048w;
            case 2:
                return this.f2049x;
            case 3:
                return this.f2050y;
            case 4:
                return this.f2051z;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return this.f1980A;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return this.f1983D;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return this.f1981B;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return this.f1982C;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    /* renamed from: b */
    public final void mo2294b(EnumC0522a aVar) {
        this.f1986G[1] = aVar;
        if (aVar == EnumC0522a.WRAP_CONTENT) {
            mo2298d(this.f2006aa);
        }
    }

    /* renamed from: a */
    public void mo2291a(C0537c cVar) {
        this.f2048w.mo2280a();
        this.f2049x.mo2280a();
        this.f2050y.mo2280a();
        this.f2051z.mo2280a();
        this.f1980A.mo2280a();
        this.f1983D.mo2280a();
        this.f1981B.mo2280a();
        this.f1982C.mo2280a();
    }

    /* renamed from: b */
    public final void mo2295b(C0539e eVar) {
        eVar.mo2367a(this.f2048w);
        eVar.mo2367a(this.f2049x);
        eVar.mo2367a(this.f2050y);
        eVar.mo2367a(this.f2051z);
        if (this.f2002W > 0) {
            eVar.mo2367a(this.f1980A);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02d1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2275a(androidx.constraintlayout.p026a.C0539e r63) {
        /*
        // Method dump skipped, instructions count: 1166
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0520f.mo2275a(androidx.constraintlayout.a.e):void");
    }

    /* renamed from: a */
    public void mo2287a(int i, int i2) {
        this.f2000U = i;
        this.f2001V = i2;
    }

    /* renamed from: b */
    public final void mo2293b(int i, int i2) {
        this.f1992M = i;
        int i3 = i2 - i;
        this.f1988I = i3;
        int i4 = this.f2003X;
        if (i3 < i4) {
            this.f1988I = i4;
        }
    }

    /* renamed from: c */
    public final void mo2297c(int i, int i2) {
        this.f1993N = i;
        int i3 = i2 - i;
        this.f1989J = i3;
        int i4 = this.f2004Y;
        if (i3 < i4) {
            this.f1989J = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo2299d(int i, int i2) {
        if (i2 == 0) {
            this.f1994O = i;
        } else if (i2 == 1) {
            this.f1995P = i;
        }
    }

    /* renamed from: a */
    public final void mo2288a(int i, int i2, int i3) {
        if (i3 == 0) {
            mo2293b(i, i2);
        } else if (i3 == 1) {
            mo2297c(i, i2);
        }
        this.f2017am = true;
    }

    /* renamed from: a */
    public final void mo2289a(C0515e.EnumC0519c cVar, C0520f fVar, C0515e.EnumC0519c cVar2, int i, int i2) {
        mo2286a(cVar).mo2281a(fVar.mo2286a(cVar2), i, i2, C0515e.EnumC0518b.STRONG, 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1924a(androidx.constraintlayout.p026a.C0539e r28, boolean r29, androidx.constraintlayout.p026a.C0545h r30, androidx.constraintlayout.p026a.C0545h r31, androidx.constraintlayout.p026a.p027a.C0520f.EnumC0522a r32, boolean r33, androidx.constraintlayout.p026a.p027a.C0515e r34, androidx.constraintlayout.p026a.p027a.C0515e r35, int r36, int r37, int r38, int r39, float r40, boolean r41, boolean r42, int r43, int r44, int r45, float r46, boolean r47) {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0520f.m1924a(androidx.constraintlayout.a.e, boolean, androidx.constraintlayout.a.h, androidx.constraintlayout.a.h, androidx.constraintlayout.a.a.f$a, boolean, androidx.constraintlayout.a.a.e, androidx.constraintlayout.a.a.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
