package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.p027a.C0520f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.a.d */
public final class C0514d {

    /* renamed from: a */
    public C0520f f1948a;

    /* renamed from: b */
    public C0520f f1949b;

    /* renamed from: c */
    public C0520f f1950c;

    /* renamed from: d */
    public C0520f f1951d;

    /* renamed from: e */
    public C0520f f1952e;

    /* renamed from: f */
    public C0520f f1953f;

    /* renamed from: g */
    public C0520f f1954g;

    /* renamed from: h */
    protected ArrayList<C0520f> f1955h;

    /* renamed from: i */
    protected int f1956i;

    /* renamed from: j */
    protected int f1957j;

    /* renamed from: k */
    public float f1958k;

    /* renamed from: l */
    protected boolean f1959l;

    /* renamed from: m */
    protected boolean f1960m;

    /* renamed from: n */
    protected boolean f1961n;

    /* renamed from: o */
    boolean f1962o;

    /* renamed from: p */
    private int f1963p;

    /* renamed from: q */
    private boolean f1964q;

    static {
        Covode.recordClassIndex(581);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2279a() {
        int i = this.f1963p * 2;
        C0520f fVar = this.f1948a;
        boolean z = false;
        C0520f fVar2 = fVar;
        while (true) {
            this.f1956i++;
            fVar.f2025au[this.f1963p] = null;
            fVar.f2024at[this.f1963p] = null;
            if (fVar.f2011ag != 8) {
                if (this.f1949b == null) {
                    this.f1949b = fVar;
                }
                this.f1951d = fVar;
                if (fVar.f1986G[this.f1963p] == C0520f.EnumC0522a.MATCH_CONSTRAINT && (fVar.f2034i[this.f1963p] == 0 || fVar.f2034i[this.f1963p] == 3 || fVar.f2034i[this.f1963p] == 2)) {
                    this.f1957j++;
                    float f = fVar.f2023as[this.f1963p];
                    if (f > 0.0f) {
                        this.f1958k += fVar.f2023as[this.f1963p];
                    }
                    int i2 = this.f1963p;
                    if (fVar.f2011ag != 8 && fVar.f1986G[i2] == C0520f.EnumC0522a.MATCH_CONSTRAINT && (fVar.f2034i[i2] == 0 || fVar.f2034i[i2] == 3)) {
                        if (f < 0.0f) {
                            this.f1959l = true;
                        } else {
                            this.f1960m = true;
                        }
                        if (this.f1955h == null) {
                            this.f1955h = new ArrayList<>();
                        }
                        this.f1955h.add(fVar);
                    }
                    if (this.f1953f == null) {
                        this.f1953f = fVar;
                    }
                    C0520f fVar3 = this.f1954g;
                    if (fVar3 != null) {
                        fVar3.f2024at[this.f1963p] = fVar;
                    }
                    this.f1954g = fVar;
                }
            }
            if (fVar2 != fVar) {
                fVar2.f2025au[this.f1963p] = fVar;
            }
            C0515e eVar = fVar.f1984E[i + 1].f1968d;
            if (eVar == null) {
                break;
            }
            C0520f fVar4 = eVar.f1966b;
            if (fVar4.f1984E[i].f1968d == null || fVar4.f1984E[i].f1968d.f1966b != fVar) {
                break;
            }
            fVar2 = fVar;
            fVar = fVar4;
        }
        this.f1950c = fVar;
        if (this.f1963p != 0 || !this.f1964q) {
            this.f1952e = this.f1948a;
        } else {
            this.f1952e = fVar;
        }
        if (this.f1960m && this.f1959l) {
            z = true;
        }
        this.f1961n = z;
    }

    public C0514d(C0520f fVar, int i, boolean z) {
        this.f1948a = fVar;
        this.f1963p = i;
        this.f1964q = z;
    }
}
