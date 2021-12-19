package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SearchMusicList */
public class SearchMusicList {
    @AbstractC27891c(mo46611a = "cursor")
    public int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    int hasMore;
    @AbstractC27891c(mo46611a = "music_list")
    public List<SearchMusic> items;

    static {
        Covode.recordClassIndex(84614);
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
