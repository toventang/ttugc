package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.CallBackLinearLayoutManager */
public final class CallBackLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f115328a;

    static {
        Covode.recordClassIndex(59108);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4324a(RecyclerView.C1378s sVar) {
        super.mo4324a(sVar);
        this.f115328a.invoke();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallBackLinearLayoutManager(Context context, AbstractC89171a<C89391z> aVar) {
        super(0, false);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f115328a = aVar;
    }
}
