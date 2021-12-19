package com.p2082ss.android.ugc.aweme.discover.alading;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.c */
public final class C41826c extends RecyclerView.AbstractC1353c {

    /* renamed from: a */
    private final RecyclerView.AbstractC1350a<?> f97565a;

    static {
        Covode.recordClassIndex(49742);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4655a() {
        super.mo4655a();
        this.f97565a.notifyDataSetChanged();
    }

    public C41826c(RecyclerView.AbstractC1350a<?> aVar) {
        C89219l.m154721d(aVar, "");
        this.f97565a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: b */
    public final void mo4660b(int i, int i2) {
        super.mo4660b(i, i2);
        this.f97565a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: c */
    public final void mo4661c(int i, int i2) {
        super.mo4661c(i, i2);
        this.f97565a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4656a(int i, int i2) {
        super.mo4656a(i, i2);
        this.f97565a.notifyItemRangeChanged(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4657a(int i, int i2, int i3) {
        super.mo4657a(i, i2, i3);
        this.f97565a.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4658a(int i, int i2, Object obj) {
        super.mo4658a(i, i2, obj);
        this.f97565a.notifyItemRangeChanged(i, i2, obj);
    }
}
