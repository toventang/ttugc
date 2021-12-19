package com.p2082ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchEffectListViewModel */
public final class SearchEffectListViewModel extends AbstractC1174ac {
    public final C1213t<SearchEffectPropsList> mData = new C1213t<>();

    static {
        Covode.recordClassIndex(50480);
    }

    public final LiveData<SearchEffectPropsList> getData() {
        return this.mData;
    }

    public final void fetch(String str, String str2, int i, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        SearchApi.m83820a().searchEffectList(str, str2, "search_tab", i, i2, C17867d.f42590n).mo5534a(new SearchEffectListViewModel$fetch$1(this), C1731i.f5564c, null);
    }
}
