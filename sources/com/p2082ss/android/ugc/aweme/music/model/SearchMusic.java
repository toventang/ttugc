package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.SearchMusic */
public class SearchMusic implements Serializable {
    @AbstractC27891c(mo46611a = "card_type")
    private int cardType = 1;
    @AbstractC27891c(mo46611a = "has_more")
    private boolean hasMore;
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "dynamic_patch")
    private C42345d mDynamicPatch;
    @AbstractC27891c(mo46611a = "music")
    private Music music;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(71418);
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final C42345d getMDynamicPatch() {
        return this.mDynamicPatch;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final int getType() {
        return this.type;
    }

    public MusicModel convertToMusicModel() {
        if (this.type != 999 || this.mDynamicPatch == null) {
            Music music2 = this.music;
            if (music2 != null) {
                return music2.convertToMusicModel();
            }
            return new MusicModel();
        }
        DynamicMusicModel dynamicMusicModel = new DynamicMusicModel();
        dynamicMusicModel.setDynamicPatch(this.mDynamicPatch);
        return dynamicMusicModel;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMDynamicPatch(C42345d dVar) {
        this.mDynamicPatch = dVar;
    }

    public final void setMusic(Music music2) {
        this.music = music2;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setRequestId(String str) {
        Music music2 = this.music;
        if (music2 != null) {
            music2.requestId = str;
        }
    }
}
