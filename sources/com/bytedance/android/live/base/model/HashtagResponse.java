package com.bytedance.android.live.base.model;

import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;

public final class HashtagResponse {
    @AbstractC27891c(mo46611a = "game_hashtag")
    public Hashtag gameHashTag;
    @AbstractC27891c(mo46611a = "game_tag_list")
    public List<GameTag> gameTagList;
    @AbstractC27891c(mo46611a = "hashtag")
    public List<Hashtag> hashtags;

    static {
        Covode.recordClassIndex(3397);
    }

    public HashtagResponse() {
        this(null, null, null, 7, null);
    }

    public HashtagResponse(List<Hashtag> list, List<GameTag> list2, Hashtag hashtag) {
        this.hashtags = list;
        this.gameTagList = list2;
        this.gameHashTag = hashtag;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HashtagResponse(List list, List list2, Hashtag hashtag, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : hashtag);
    }
}
