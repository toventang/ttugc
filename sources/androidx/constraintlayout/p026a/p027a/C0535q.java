package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0537c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.a.q */
public class C0535q extends C0520f {

    /* renamed from: aQ */
    public ArrayList<C0520f> f2126aQ = new ArrayList<>();

    static {
        Covode.recordClassIndex(602);
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: f */
    public void mo2303f() {
        this.f2126aQ.clear();
        super.mo2303f();
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: u */
    public final void mo2321u() {
        super.mo2321u();
        ArrayList<C0520f> arrayList = this.f2126aQ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0520f fVar = this.f2126aQ.get(i);
                fVar.mo2287a(mo2312m(), mo2313n());
                if (!(fVar instanceof C0523g)) {
                    fVar.mo2321u();
                }
            }
        }
    }

    /* renamed from: z */
    public void mo2331z() {
        mo2321u();
        ArrayList<C0520f> arrayList = this.f2126aQ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0520f fVar = this.f2126aQ.get(i);
                if (fVar instanceof C0535q) {
                    ((C0535q) fVar).mo2331z();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2352a(C0520f fVar) {
        this.f2126aQ.remove(fVar);
        fVar.f1987H = null;
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2291a(C0537c cVar) {
        super.mo2291a(cVar);
        int size = this.f2126aQ.size();
        for (int i = 0; i < size; i++) {
            this.f2126aQ.get(i).mo2291a(cVar);
        }
    }

    @Override // androidx.constraintlayout.p026a.p027a.C0520f
    /* renamed from: a */
    public final void mo2287a(int i, int i2) {
        super.mo2287a(i, i2);
        int size = this.f2126aQ.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f2126aQ.get(i3).mo2287a(mo2314o(), mo2315p());
        }
    }
}
