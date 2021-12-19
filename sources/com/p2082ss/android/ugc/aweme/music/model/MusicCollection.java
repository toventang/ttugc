package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollection */
public class MusicCollection extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "mc_list")
    public List<MusicCollectionItem> items;

    static {
        Covode.recordClassIndex(71402);
    }

    public List<MusicCollectionItem> getItems() {
        List<MusicCollectionItem> list = this.items;
        if (list == null || list.isEmpty()) {
            return this.items;
        }
        return MusicCollectionFilterKt.distinctByName(this.items);
    }
}
