package com.p2082ss.android.ugc.aweme.discover.jedi;

import android.content.Context;
import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$initAdapter$layoutManager$1 */
public final class SearchJediMixFeedFragment$initAdapter$layoutManager$1 extends WrapGridLayoutManager {

    /* renamed from: L */
    final /* synthetic */ C42135b f98188L;

    static {
        Covode.recordClassIndex(50055);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4355a(String str) {
        try {
            super.mo4355a(str);
        } catch (Exception e) {
            C2688c.m7778a(1, "MixFeedFragment", e.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchJediMixFeedFragment$initAdapter$layoutManager$1(C42135b bVar, Context context) {
        super(context, 2);
        this.f98188L = bVar;
    }
}
