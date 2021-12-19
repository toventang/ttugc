package androidx.p060l;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.p060l.AbstractC1134m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.l.q */
public class C1146q extends AbstractC1134m {

    /* renamed from: a */
    ArrayList<AbstractC1134m> f3888a = new ArrayList<>();

    /* renamed from: p */
    int f3889p;

    /* renamed from: q */
    boolean f3890q = false;

    /* renamed from: r */
    private boolean f3891r = true;

    /* renamed from: s */
    private int f3892s = 0;

    static {
        Covode.recordClassIndex(1239);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3859a(C1150s sVar) {
        if (mo3918a(sVar.f3900b)) {
            Iterator<AbstractC1134m> it = this.f3888a.iterator();
            while (it.hasNext()) {
                AbstractC1134m next = it.next();
                if (next.mo3918a(sVar.f3900b)) {
                    next.mo3859a(sVar);
                    sVar.f3901c.add(next);
                }
            }
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3916a(AbstractC1145p pVar) {
        super.mo3916a(pVar);
        this.f3892s |= 2;
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            this.f3888a.get(i).mo3916a(pVar);
        }
    }

    @Override // androidx.p060l.AbstractC1134m, java.lang.Object
    public /* synthetic */ Object clone() {
        return clone();
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: e */
    public final AbstractC1134m mo3931e() {
        C1146q qVar = (C1146q) super.clone();
        qVar.f3888a = new ArrayList<>();
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            qVar.mo3941a(this.f3888a.get(i).clone());
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final void mo3924b() {
        if (this.f3888a.isEmpty()) {
            mo3926c();
            mo3929d();
            return;
        }
        C1148a aVar = new C1148a(this);
        Iterator<AbstractC1134m> it = this.f3888a.iterator();
        while (it.hasNext()) {
            it.next().mo3908a(aVar);
        }
        this.f3889p = this.f3888a.size();
        if (!this.f3891r) {
            for (int i = 1; i < this.f3888a.size(); i++) {
                final AbstractC1134m mVar = this.f3888a.get(i);
                this.f3888a.get(i - 1).mo3908a(new C1141n() {
                    /* class androidx.p060l.C1146q.C11471 */

                    static {
                        Covode.recordClassIndex(1240);
                    }

                    @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
                    /* renamed from: a */
                    public final void mo3865a(AbstractC1134m mVar) {
                        mVar.mo3924b();
                        mVar.mo3922b(this);
                    }
                });
            }
            AbstractC1134m mVar2 = this.f3888a.get(0);
            if (mVar2 != null) {
                mVar2.mo3924b();
                return;
            }
            return;
        }
        Iterator<AbstractC1134m> it2 = this.f3888a.iterator();
        while (it2.hasNext()) {
            it2.next().mo3924b();
        }
    }

    /* renamed from: androidx.l.q$a */
    static class C1148a extends C1141n {

        /* renamed from: a */
        C1146q f3895a;

        static {
            Covode.recordClassIndex(1241);
        }

        C1148a(C1146q qVar) {
            this.f3895a = qVar;
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
        /* renamed from: a */
        public final void mo3865a(AbstractC1134m mVar) {
            C1146q qVar = this.f3895a;
            qVar.f3889p--;
            if (this.f3895a.f3889p == 0) {
                this.f3895a.f3890q = false;
                this.f3895a.mo3929d();
            }
            mVar.mo3922b(this);
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
        /* renamed from: d */
        public final void mo3868d(AbstractC1134m mVar) {
            if (!this.f3895a.f3890q) {
                this.f3895a.mo3926c();
                this.f3895a.f3890q = true;
            }
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC1134m mo3920b(long j) {
        return super.mo3920b(j);
    }

    /* renamed from: c */
    public final C1146q mo3908a(AbstractC1134m.AbstractC1140c cVar) {
        return (C1146q) super.mo3908a(cVar);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC1134m mo3922b(AbstractC1134m.AbstractC1140c cVar) {
        return super.mo3922b(cVar);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final /* synthetic */ AbstractC1134m mo3919b(int i) {
        for (int i2 = 0; i2 < this.f3888a.size(); i2++) {
            this.f3888a.get(i2).mo3919b(i);
        }
        return super.mo3919b(i);
    }

    /* renamed from: c */
    public final AbstractC1134m mo3943c(int i) {
        if (i < 0 || i >= this.f3888a.size()) {
            return null;
        }
        return this.f3888a.get(i);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: d */
    public final void mo3930d(View view) {
        super.mo3930d(view);
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            this.f3888a.get(i).mo3930d(view);
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: e */
    public final void mo3932e(View view) {
        super.mo3932e(view);
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            this.f3888a.get(i).mo3932e(view);
        }
    }

    /* renamed from: a */
    public final C1146q mo3940a(int i) {
        if (i == 0) {
            this.f3891r = true;
        } else if (i == 1) {
            this.f3891r = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i)));
        }
        return this;
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final /* synthetic */ AbstractC1134m mo3921b(View view) {
        for (int i = 0; i < this.f3888a.size(); i++) {
            this.f3888a.get(i).mo3921b(view);
        }
        return super.mo3921b(view);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: c */
    public final /* synthetic */ AbstractC1134m mo3925c(View view) {
        for (int i = 0; i < this.f3888a.size(); i++) {
            this.f3888a.get(i).mo3925c(view);
        }
        return super.mo3925c(view);
    }

    /* renamed from: a */
    public final C1146q mo3941a(AbstractC1134m mVar) {
        this.f3888a.add(mVar);
        mVar.f3857j = this;
        if (this.f3851d >= 0) {
            mVar.mo3906a(this.f3851d);
        }
        if ((this.f3892s & 1) != 0) {
            mVar.mo3907a(this.f3852e);
        }
        if ((this.f3892s & 2) != 0) {
            mVar.mo3916a(this.f3860m);
        }
        if ((this.f3892s & 4) != 0) {
            mVar.mo3914a(this.f3862o);
        }
        if ((this.f3892s & 8) != 0) {
            mVar.mo3915a(this.f3861n);
        }
        return this;
    }

    /* renamed from: b */
    public final C1146q mo3907a(TimeInterpolator timeInterpolator) {
        this.f3892s |= 1;
        ArrayList<AbstractC1134m> arrayList = this.f3888a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3888a.get(i).mo3907a(timeInterpolator);
            }
        }
        return (C1146q) super.mo3907a(timeInterpolator);
    }

    /* renamed from: c */
    public final C1146q mo3906a(long j) {
        super.mo3906a(j);
        if (this.f3851d >= 0) {
            int size = this.f3888a.size();
            for (int i = 0; i < size; i++) {
                this.f3888a.get(i).mo3906a(j);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final String mo3910a(String str) {
        String a = super.mo3910a(str);
        for (int i = 0; i < this.f3888a.size(); i++) {
            a = a + "\n" + this.f3888a.get(i).mo3910a(str + "  ");
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: c */
    public final void mo3927c(C1150s sVar) {
        super.mo3927c(sVar);
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            this.f3888a.get(i).mo3927c(sVar);
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final void mo3862b(C1150s sVar) {
        if (mo3918a(sVar.f3900b)) {
            Iterator<AbstractC1134m> it = this.f3888a.iterator();
            while (it.hasNext()) {
                AbstractC1134m next = it.next();
                if (next.mo3918a(sVar.f3900b)) {
                    next.mo3862b(sVar);
                    sVar.f3901c.add(next);
                }
            }
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3914a(AbstractC1119g gVar) {
        super.mo3914a(gVar);
        this.f3892s |= 4;
        for (int i = 0; i < this.f3888a.size(); i++) {
            this.f3888a.get(i).mo3914a(gVar);
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3915a(AbstractC1134m.AbstractC1139b bVar) {
        super.mo3915a(bVar);
        this.f3892s |= 8;
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            this.f3888a.get(i).mo3915a(bVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3912a(ViewGroup viewGroup, C1151t tVar, C1151t tVar2, ArrayList<C1150s> arrayList, ArrayList<C1150s> arrayList2) {
        long j = this.f3850c;
        int size = this.f3888a.size();
        for (int i = 0; i < size; i++) {
            AbstractC1134m mVar = this.f3888a.get(i);
            if (j > 0 && (this.f3891r || i == 0)) {
                long j2 = mVar.f3850c;
                if (j2 > 0) {
                    mVar.mo3920b(j2 + j);
                } else {
                    mVar.mo3920b(j);
                }
            }
            mVar.mo3912a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
