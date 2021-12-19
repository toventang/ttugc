package com.p2082ss.android.ugc.aweme.emoji.emojichoose.p2902a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a.b */
public final class C46488b {

    /* renamed from: a */
    public C46489c f108342a;

    static {
        Covode.recordClassIndex(55073);
    }

    public C46488b(RecyclerView recyclerView) {
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C46489c cVar = new C46489c();
        this.f108342a = cVar;
        recyclerView.setAdapter(cVar);
    }
}
