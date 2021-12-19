package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMix */
public class SearchMix extends SearchApiResult {
    @AbstractC27891c(mo46611a = "aweme_list")
    public List<Aweme> awemeList;
    @AbstractC27891c(mo46611a = "cursor")
    public int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;

    static {
        Covode.recordClassIndex(50501);
    }
}
