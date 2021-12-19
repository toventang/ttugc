package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0545h;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.constraintlayout.a.a.e */
public final class C0515e {

    /* renamed from: a */
    public C0530m f1965a = new C0530m(this);

    /* renamed from: b */
    public final C0520f f1966b;

    /* renamed from: c */
    public final EnumC0519c f1967c;

    /* renamed from: d */
    public C0515e f1968d;

    /* renamed from: e */
    public int f1969e = 0;

    /* renamed from: f */
    int f1970f = -1;

    /* renamed from: g */
    public EnumC0518b f1971g = EnumC0518b.NONE;

    /* renamed from: h */
    public EnumC0517a f1972h = EnumC0517a.RELAXED;

    /* renamed from: i */
    public int f1973i = 0;

    /* renamed from: j */
    public C0545h f1974j;

    static {
        Covode.recordClassIndex(582);
    }

    /* renamed from: d */
    public final boolean mo2284d() {
        if (this.f1968d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2280a() {
        C0545h hVar = this.f1974j;
        if (hVar == null) {
            this.f1974j = new C0545h(C0545h.EnumC0546a.UNRESTRICTED);
        } else {
            hVar.mo2385a();
        }
    }

    /* renamed from: b */
    public final int mo2282b() {
        C0515e eVar;
        if (this.f1966b.f2011ag == 8) {
            return 0;
        }
        if (this.f1970f < 0 || (eVar = this.f1968d) == null || eVar.f1966b.f2011ag != 8) {
            return this.f1969e;
        }
        return this.f1970f;
    }

    /* renamed from: c */
    public final void mo2283c() {
        this.f1968d = null;
        this.f1969e = 0;
        this.f1970f = -1;
        this.f1971g = EnumC0518b.STRONG;
        this.f1973i = 0;
        this.f1972h = EnumC0517a.RELAXED;
        this.f1965a.mo2342b();
    }

    /* renamed from: androidx.constraintlayout.a.a.e$a */
    public enum EnumC0517a {
        RELAXED,
        STRICT;

        static {
            Covode.recordClassIndex(584);
        }
    }

    /* renamed from: androidx.constraintlayout.a.a.e$b */
    public enum EnumC0518b {
        NONE,
        STRONG,
        WEAK;

        static {
            Covode.recordClassIndex(585);
        }
    }

    public final String toString() {
        return this.f1966b.f2012ah + ":" + this.f1967c.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.a.e$1 */
    public static /* synthetic */ class C05161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f1975a;

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
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0515e.C05161.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.a.a.e$c */
    public enum EnumC0519c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;

        static {
            Covode.recordClassIndex(586);
        }
    }

    public C0515e(C0520f fVar, EnumC0519c cVar) {
        this.f1966b = fVar;
        this.f1967c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r5.f1966b.mo2318s() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r2 != androidx.constraintlayout.p026a.p027a.C0515e.EnumC0519c.CENTER_Y) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        if (r2 != androidx.constraintlayout.p026a.p027a.C0515e.EnumC0519c.CENTER_X) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r3 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        if (r2 != androidx.constraintlayout.p026a.p027a.C0515e.EnumC0519c.CENTER_Y) goto L_0x0089;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2281a(androidx.constraintlayout.p026a.p027a.C0515e r6, int r7, int r8, androidx.constraintlayout.p026a.p027a.C0515e.EnumC0518b r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0515e.mo2281a(androidx.constraintlayout.a.a.e, int, int, androidx.constraintlayout.a.a.e$b, int, boolean):boolean");
    }
}
