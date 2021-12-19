package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class MediaItemStats {
    @AbstractC27891c(mo46611a = "comment_count")
    private int commentCount;
    @AbstractC27891c(mo46611a = "digg_count")
    private int diggCount;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f8754id;
    @AbstractC27891c(mo46611a = "play_count")
    private int playCount;
    @AbstractC27891c(mo46611a = "share_count")
    private int shareCount;

    static {
        Covode.recordClassIndex(3434);
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getId() {
        return this.f8754id;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setId(long j) {
        this.f8754id = j;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }
}
