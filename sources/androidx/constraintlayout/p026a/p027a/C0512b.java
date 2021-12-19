package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0536b;
import androidx.constraintlayout.p026a.C0539e;
import androidx.constraintlayout.p026a.C0545h;
import androidx.constraintlayout.p026a.p027a.C0520f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.a.b */
public final class C0512b extends C0527j {

    /* renamed from: a */
    public int f1945a;

    /* renamed from: az */
    private ArrayList<C0530m> f1946az = new ArrayList<>(4);

    /* renamed from: b */
    public boolean f1947b = true;

    static {
        Covode.recordClassIndex(579);
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final boolean mo2276a() {
        return true;
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: b */
    public final void mo2277b() {
        super.mo2277b();
        this.f1946az.clear();
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: c */
    public final void mo2278c() {
        C0530m mVar;
        int i = this.f1945a;
        float f = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                mVar = this.f2050y.f1965a;
            } else if (i == 2) {
                mVar = this.f2049x.f1965a;
            } else if (i == 3) {
                mVar = this.f2051z.f1965a;
            } else {
                return;
            }
            f = 0.0f;
        } else {
            mVar = this.f2048w.f1965a;
        }
        int size = this.f1946az.size();
        C0530m mVar2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0530m mVar3 = this.f1946az.get(i2);
            if (mVar3.f2115i == 1) {
                int i3 = this.f1945a;
                if (i3 == 0 || i3 == 2) {
                    if (mVar3.f2105f < f) {
                        f = mVar3.f2105f;
                        mVar2 = mVar3.f2104e;
                    }
                } else if (mVar3.f2105f > f) {
                    f = mVar3.f2105f;
                    mVar2 = mVar3.f2104e;
                }
            } else {
                return;
            }
        }
        if (C0539e.f2135h != null) {
            C0539e.f2135h.f2182z++;
        }
        mVar.f2104e = mVar2;
        mVar.f2105f = f;
        mVar.mo2350d();
        int i4 = this.f1945a;
        if (i4 == 0) {
            this.f2050y.f1965a.mo2338a(mVar2, f);
        } else if (i4 == 1) {
            this.f2048w.f1965a.mo2338a(mVar2, f);
        } else if (i4 == 2) {
            this.f2051z.f1965a.mo2338a(mVar2, f);
        } else if (i4 == 3) {
            this.f2049x.f1965a.mo2338a(mVar2, f);
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2274a(int i) {
        C0530m mVar;
        C0530m mVar2;
        if (this.f1987H != null && ((C0523g) this.f1987H).mo2330h(2)) {
            int i2 = this.f1945a;
            if (i2 == 0) {
                mVar = this.f2048w.f1965a;
            } else if (i2 == 1) {
                mVar = this.f2050y.f1965a;
            } else if (i2 == 2) {
                mVar = this.f2049x.f1965a;
            } else if (i2 == 3) {
                mVar = this.f2051z.f1965a;
            } else {
                return;
            }
            mVar.f2106g = 5;
            int i3 = this.f1945a;
            if (i3 == 0 || i3 == 1) {
                this.f2049x.f1965a.mo2338a((C0530m) null, 0.0f);
                this.f2051z.f1965a.mo2338a((C0530m) null, 0.0f);
            } else {
                this.f2048w.f1965a.mo2338a((C0530m) null, 0.0f);
                this.f2050y.f1965a.mo2338a((C0530m) null, 0.0f);
            }
            this.f1946az.clear();
            for (int i4 = 0; i4 < this.f2098ay; i4++) {
                C0520f fVar = this.f2097ax[i4];
                if (this.f1947b || fVar.mo2276a()) {
                    int i5 = this.f1945a;
                    if (i5 == 0) {
                        mVar2 = fVar.f2048w.f1965a;
                    } else if (i5 == 1) {
                        mVar2 = fVar.f2050y.f1965a;
                    } else if (i5 == 2) {
                        mVar2 = fVar.f2049x.f1965a;
                    } else if (i5 == 3) {
                        mVar2 = fVar.f2051z.f1965a;
                    }
                    if (mVar2 != null) {
                        this.f1946az.add(mVar2);
                        mVar2.mo2348a(mVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2275a(C0539e eVar) {
        boolean z;
        int i;
        int i2;
        this.f1984E[0] = this.f2048w;
        this.f1984E[2] = this.f2049x;
        this.f1984E[1] = this.f2050y;
        this.f1984E[3] = this.f2051z;
        for (int i3 = 0; i3 < this.f1984E.length; i3++) {
            this.f1984E[i3].f1974j = eVar.mo2367a(this.f1984E[i3]);
        }
        int i4 = this.f1945a;
        if (i4 >= 0 && i4 < 4) {
            C0515e eVar2 = this.f1984E[this.f1945a];
            int i5 = 0;
            while (true) {
                if (i5 >= this.f2098ay) {
                    z = false;
                    break;
                }
                C0520f fVar = this.f2097ax[i5];
                if ((this.f1947b || fVar.mo2276a()) && ((((i = this.f1945a) == 0 || i == 1) && fVar.mo2323w() == C0520f.EnumC0522a.MATCH_CONSTRAINT) || (((i2 = this.f1945a) == 2 || i2 == 3) && fVar.mo2324x() == C0520f.EnumC0522a.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            z = true;
            int i6 = this.f1945a;
            if (i6 == 0 || i6 == 1 ? this.f1987H.mo2323w() == C0520f.EnumC0522a.WRAP_CONTENT : this.f1987H.mo2324x() == C0520f.EnumC0522a.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.f2098ay; i7++) {
                C0520f fVar2 = this.f2097ax[i7];
                if (this.f1947b || fVar2.mo2276a()) {
                    C0545h a = eVar.mo2367a(fVar2.f1984E[this.f1945a]);
                    fVar2.f1984E[this.f1945a].f1974j = a;
                    int i8 = this.f1945a;
                    if (i8 == 0 || i8 == 2) {
                        C0545h hVar = eVar2.f1974j;
                        C0536b b = eVar.mo2376b();
                        C0545h c = eVar.mo2379c();
                        c.f2193e = 0;
                        b.mo2360b(hVar, a, c, 0);
                        if (z) {
                            eVar.mo2370a(b, (int) (b.f2130d.mo2272b(c) * -1.0f), 1);
                        }
                        eVar.mo2369a(b);
                    } else {
                        C0545h hVar2 = eVar2.f1974j;
                        C0536b b2 = eVar.mo2376b();
                        C0545h c2 = eVar.mo2379c();
                        c2.f2193e = 0;
                        b2.mo2354a(hVar2, a, c2, 0);
                        if (z) {
                            eVar.mo2370a(b2, (int) (b2.f2130d.mo2272b(c2) * -1.0f), 1);
                        }
                        eVar.mo2369a(b2);
                    }
                }
            }
            int i9 = this.f1945a;
            if (i9 == 0) {
                eVar.mo2378c(this.f2050y.f1974j, this.f2048w.f1974j, 0, 6);
                if (!z) {
                    eVar.mo2378c(this.f2048w.f1974j, this.f1987H.f2050y.f1974j, 0, 5);
                }
            } else if (i9 == 1) {
                eVar.mo2378c(this.f2048w.f1974j, this.f2050y.f1974j, 0, 6);
                if (!z) {
                    eVar.mo2378c(this.f2048w.f1974j, this.f1987H.f2048w.f1974j, 0, 5);
                }
            } else if (i9 == 2) {
                eVar.mo2378c(this.f2051z.f1974j, this.f2049x.f1974j, 0, 6);
                if (!z) {
                    eVar.mo2378c(this.f2049x.f1974j, this.f1987H.f2051z.f1974j, 0, 5);
                }
            } else if (i9 == 3) {
                eVar.mo2378c(this.f2049x.f1974j, this.f2051z.f1974j, 0, 6);
                if (!z) {
                    eVar.mo2378c(this.f2049x.f1974j, this.f1987H.f2049x.f1974j, 0, 5);
                }
            }
        }
    }
}
