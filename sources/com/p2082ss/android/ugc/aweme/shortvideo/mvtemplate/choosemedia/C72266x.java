package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.x */
public final class C72266x implements AbstractC1485u {

    /* renamed from: a */
    private final MvImageChooseAdapter f162002a;

    /* renamed from: b */
    private final RecyclerView f162003b;

    static {
        Covode.recordClassIndex(84931);
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        this.f162002a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        this.f162002a.notifyItemMoved(i, i2);
    }

    public C72266x(MvImageChooseAdapter mvImageChooseAdapter, RecyclerView recyclerView) {
        C89219l.m154721d(mvImageChooseAdapter, "");
        C89219l.m154721d(recyclerView, "");
        this.f162002a = mvImageChooseAdapter;
        this.f162003b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        this.f162002a.notifyItemRangeInserted(i, i2);
        if (i == 0) {
            this.f162003b.mo4413b(0);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        this.f162002a.notifyDataSetChanged();
    }
}
