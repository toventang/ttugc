package com.bytedance.android.livesdk.performance;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.performance.c */
public final class C10088c extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    public final AbstractC11808h.AbstractC11811c f24504a;

    static {
        Covode.recordClassIndex(11651);
    }

    public C10088c(AbstractC11808h.AbstractC11811c cVar) {
        this.f24504a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
        if (i != 0) {
            AbstractC11808h.AbstractC11811c cVar = this.f24504a;
            if (cVar != null) {
                cVar.mo16948a();
                return;
            }
            return;
        }
        AbstractC11808h.AbstractC11811c cVar2 = this.f24504a;
        if (cVar2 != null) {
            cVar2.mo16951b();
        }
    }
}
