package androidx.recyclerview.widget;

import androidx.core.p036g.C0697g;
import androidx.recyclerview.widget.AbstractC1395ad;
import androidx.recyclerview.widget.AbstractC1409ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.v */
final class C1486v {

    /* renamed from: a */
    final AbstractC1409ag.AbstractC1414c f4924a;

    /* renamed from: b */
    final AbstractC1395ad.AbstractC1402d f4925b;

    /* renamed from: c */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f4926c;

    /* renamed from: d */
    final AbstractC1488a f4927d;

    /* renamed from: e */
    public int f4928e;

    /* renamed from: f */
    private RecyclerView.AbstractC1353c f4929f = new RecyclerView.AbstractC1353c() {
        /* class androidx.recyclerview.widget.C1486v.C14871 */

        static {
            Covode.recordClassIndex(1625);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4659b() {
            C1486v.this.f4927d.mo4925b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            C1486v vVar = C1486v.this;
            vVar.f4928e = vVar.f4926c.getItemCount();
            C1486v.this.f4927d.mo4920a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C1486v.this.f4927d.mo4923a(C1486v.this, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C1486v.this.f4928e += i2;
            C1486v.this.f4927d.mo4922a(C1486v.this, i, i2);
            if (C1486v.this.f4928e > 0 && C1486v.this.f4926c.mStateRestorationPolicy == RecyclerView.AbstractC1350a.EnumC1351a.PREVENT_WHEN_EMPTY) {
                C1486v.this.f4927d.mo4925b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C1486v.this.f4928e -= i2;
            C1486v.this.f4927d.mo4926b(C1486v.this, i, i2);
            if (C1486v.this.f4928e <= 0 && C1486v.this.f4926c.mStateRestorationPolicy == RecyclerView.AbstractC1350a.EnumC1351a.PREVENT_WHEN_EMPTY) {
                C1486v.this.f4927d.mo4925b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            C0697g.m2454a(z, (Object) "moving more than 1 item is not supported in RecyclerView");
            C1486v.this.f4927d.mo4927c(C1486v.this, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            C1486v.this.f4927d.mo4923a(C1486v.this, i, i2, obj);
        }
    };

    /* renamed from: androidx.recyclerview.widget.v$a */
    interface AbstractC1488a {
        static {
            Covode.recordClassIndex(1626);
        }

        /* renamed from: a */
        void mo4920a();

        /* renamed from: a */
        void mo4922a(C1486v vVar, int i, int i2);

        /* renamed from: a */
        void mo4923a(C1486v vVar, int i, int i2, Object obj);

        /* renamed from: b */
        void mo4925b();

        /* renamed from: b */
        void mo4926b(C1486v vVar, int i, int i2);

        /* renamed from: c */
        void mo4927c(C1486v vVar, int i, int i2);
    }

    static {
        Covode.recordClassIndex(1624);
    }

    C1486v(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar, AbstractC1488a aVar2, AbstractC1409ag agVar, AbstractC1395ad.AbstractC1402d dVar) {
        this.f4926c = aVar;
        this.f4927d = aVar2;
        this.f4924a = agVar.mo4883a(this);
        this.f4925b = dVar;
        this.f4928e = aVar.getItemCount();
        aVar.registerAdapterDataObserver(this.f4929f);
    }
}
