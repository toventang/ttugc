package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchLiveList */
public class SearchLiveList extends SearchApiResult {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "extra_data")
    List<SearchLiveStruct> extraData;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "data")
    public List<SearchLiveStruct> liveList;

    static {
        Covode.recordClassIndex(50499);
    }
}
