package com.p2082ss.android.ugc.aweme.discover.alading;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.d */
public final class C41827d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final RecyclerView f97566a;

    /* renamed from: b */
    public final C41805a f97567b;

    static {
        Covode.recordClassIndex(49743);
    }

    /* renamed from: a */
    public final void mo70986a(RecyclerView.AbstractC1350a<?> aVar) {
        C89219l.m154721d(aVar, "");
        this.f97567b.mo70964a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41827d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.a1w);
        C89219l.m154716b(recyclerView, "");
        this.f97566a = recyclerView;
        C41805a aVar = new C41805a();
        this.f97567b = aVar;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
    }
}
