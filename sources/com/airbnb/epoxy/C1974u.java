package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.epoxy.u */
public class C1974u extends RecyclerView.ViewHolder {

    /* renamed from: a */
    AbstractC1956s f5894a;

    /* renamed from: b */
    List<Object> f5895b;

    /* renamed from: c */
    private AbstractC1954q f5896c;

    static {
        Covode.recordClassIndex(2167);
    }

    /* renamed from: a */
    public final Object mo5819a() {
        AbstractC1954q qVar = this.f5896c;
        if (qVar != null) {
            return qVar;
        }
        return this.itemView;
    }

    /* renamed from: b */
    public final AbstractC1956s<?> mo5821b() {
        mo5822c();
        return this.f5894a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5822c() {
        if (this.f5894a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public String toString() {
        return "EpoxyViewHolder{epoxyModel=" + this.f5894a + ", view=" + this.itemView + ", super=" + super.toString() + '}';
    }

    public C1974u(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo5820a(AbstractC1956s sVar, AbstractC1956s<?> sVar2, List<Object> list, int i) {
        this.f5895b = list;
        if (this.f5896c == null && (sVar instanceof AbstractC1973t)) {
            AbstractC1954q h = ((AbstractC1973t) sVar).mo5818h();
            this.f5896c = h;
            h.mo5782a(this.itemView);
        }
        boolean z = sVar instanceof AbstractC1975v;
        if (z) {
            mo5819a();
            ((AbstractC1975v) sVar).mo5823b(i);
        }
        if (sVar2 != null) {
            sVar.mo5789a(mo5819a(), sVar2);
        } else if (list.isEmpty()) {
            sVar.mo5788a(mo5819a());
        } else {
            sVar.mo5790a(mo5819a(), list);
        }
        if (z) {
            mo5819a();
            ((AbstractC1975v) sVar).mo5824c(i);
        }
        this.f5894a = sVar;
    }
}
