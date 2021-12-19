package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchEffectListViewModel$fetch$1 */
public final class SearchEffectListViewModel$fetch$1<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ SearchEffectListViewModel this$0;

    static {
        Covode.recordClassIndex(50481);
    }

    SearchEffectListViewModel$fetch$1(SearchEffectListViewModel searchEffectListViewModel) {
        this.this$0 = searchEffectListViewModel;
    }

    @Override // p077b.AbstractC1729g
    public final Void then(C1731i<SearchEffectListResponse> iVar) {
        C89219l.m154716b(iVar, "");
        if (!iVar.mo5535a() || iVar.mo5545d() == null) {
            this.this$0.mData.setValue(null);
        } else {
            SearchEffectListResponse d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            SearchEffectListResponse searchEffectListResponse = d;
            if (searchEffectListResponse.status_code == 0) {
                this.this$0.mData.setValue(searchEffectListResponse.propsList);
            } else {
                this.this$0.mData.setValue(null);
            }
        }
        return null;
    }
}
