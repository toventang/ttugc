package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.i */
public abstract class AbstractC78453i extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private LinearLayoutManager f176286a;

    static {
        Covode.recordClassIndex(91581);
    }

    /* renamed from: a */
    public abstract void mo122099a();

    /* renamed from: b */
    public abstract boolean mo122100b();

    /* renamed from: c */
    public abstract boolean mo122101c();

    public AbstractC78453i(LinearLayoutManager linearLayoutManager) {
        C89219l.m154721d(linearLayoutManager, "");
        this.f176286a = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        C89219l.m154721d(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        int s = this.f176286a.mo4730s();
        int A = this.f176286a.mo4685A();
        int k = this.f176286a.mo4371k();
        if (!mo122101c() && !mo122100b() && s + k >= A && k >= 0) {
            mo122099a();
        }
    }
}
