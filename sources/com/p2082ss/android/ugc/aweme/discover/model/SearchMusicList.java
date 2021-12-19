package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusicList */
public class SearchMusicList extends SearchApiResult {
    @AbstractC27891c(mo46611a = "cursor")
    public int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "music_info_list")
    public List<SearchMusic> searchMusicList;

    static {
        Covode.recordClassIndex(50504);
    }
}
