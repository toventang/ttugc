package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1392ac;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.i */
public final class C36049i extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private int f85157a = -1;

    /* renamed from: b */
    private final AbstractC1392ac f85158b;

    /* renamed from: c */
    private final AbstractC36039d f85159c;

    static {
        Covode.recordClassIndex(43297);
    }

    public C36049i(AbstractC1392ac acVar, AbstractC36039d dVar) {
        C89219l.m154721d(acVar, "");
        C89219l.m154721d(dVar, "");
        this.f85158b = acVar;
        this.f85159c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        int i2;
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        View a = this.f85158b.mo4855a(layoutManager);
        if (a == null || layoutManager == null) {
            i2 = 0;
        } else {
            i2 = RecyclerView.AbstractC1362i.m4426e(a);
        }
        this.f85159c.mo63199a(recyclerView, i);
        if (i == 0 && this.f85157a != i2) {
            this.f85157a = i2;
            this.f85159c.mo63198a(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        C89219l.m154721d(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        this.f85159c.mo63200a(recyclerView, this.f85157a, i);
    }
}
