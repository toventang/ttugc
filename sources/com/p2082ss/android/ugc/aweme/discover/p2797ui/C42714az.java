package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.az */
public final class C42714az {
    @AbstractC27891c(mo46611a = "searchLiveData")

    /* renamed from: a */
    public final SearchLiveList f99626a;
    @AbstractC27891c(mo46611a = "requestInfo")

    /* renamed from: b */
    public final C42663ak f99627b;

    static {
        Covode.recordClassIndex(50818);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42714az)) {
            return false;
        }
        C42714az azVar = (C42714az) obj;
        return C89219l.m154714a(this.f99626a, azVar.f99626a) && C89219l.m154714a(this.f99627b, azVar.f99627b);
    }

    public final int hashCode() {
        SearchLiveList searchLiveList = this.f99626a;
        int i = 0;
        int hashCode = (searchLiveList != null ? searchLiveList.hashCode() : 0) * 31;
        C42663ak akVar = this.f99627b;
        if (akVar != null) {
            i = akVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchLiveData(searchLiveList=" + this.f99626a + ", requestInfo=" + this.f99627b + ")";
    }

    public C42714az(SearchLiveList searchLiveList, C42663ak akVar) {
        C89219l.m154721d(akVar, "");
        this.f99626a = searchLiveList;
        this.f99627b = akVar;
    }
}
