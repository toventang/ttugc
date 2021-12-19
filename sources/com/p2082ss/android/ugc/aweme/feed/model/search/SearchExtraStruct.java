package com.p2082ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct */
public final class SearchExtraStruct implements Serializable {
    @AbstractC27891c(mo46611a = "liveProductStruct")
    private SearchLiveCommdityStruct searchLiveStruct;
    @AbstractC27891c(mo46611a = "searchShopStruct")
    private SearchShopStruct searchShopStruct;

    static {
        Covode.recordClassIndex(58825);
    }

    public final SearchLiveCommdityStruct getSearchLiveStruct() {
        return this.searchLiveStruct;
    }

    public final SearchShopStruct getSearchShopStruct() {
        return this.searchShopStruct;
    }

    public final void setSearchLiveStruct(SearchLiveCommdityStruct searchLiveCommdityStruct) {
        this.searchLiveStruct = searchLiveCommdityStruct;
    }

    public final void setSearchShopStruct(SearchShopStruct searchShopStruct2) {
        this.searchShopStruct = searchShopStruct2;
    }
}
