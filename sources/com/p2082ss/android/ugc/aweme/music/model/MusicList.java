package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicList */
public class MusicList extends BaseResponse {
    @AbstractC27891c(mo46611a = "child_collections")
    public List<MusicCollectionItem> childCollections;
    @AbstractC27891c(mo46611a = "cursor")
    public int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "music_list")
    public List<Music> items;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "music_type")
    public int mMusicType;
    @AbstractC27891c(mo46611a = "mc_info")
    public MusicCollectionItem mcInfo;
    @AbstractC27891c(mo46611a = "radio_cursor")
    public int radioCursor;

    static {
        Covode.recordClassIndex(71407);
    }

    public int getCursor() {
        int i = this.radioCursor;
        if (i > 0) {
            return i;
        }
        return this.cursor;
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
