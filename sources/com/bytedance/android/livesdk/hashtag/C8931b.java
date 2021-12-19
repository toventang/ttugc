package com.bytedance.android.livesdk.hashtag;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.b */
public final class C8931b extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private boolean f22005a;

    /* renamed from: b */
    private final AbstractC89171a<C89391z> f22006b;

    static {
        Covode.recordClassIndex(9823);
    }

    public C8931b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f22006b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (i == 0 && this.f22005a && linearLayoutManager.mo4374n() == linearLayoutManager.mo4685A() - 1) {
            this.f22006b.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        C89219l.m154721d(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22005a = z;
    }
}
