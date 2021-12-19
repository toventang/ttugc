package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup */
public final class AwemeStatisticsBackup implements Serializable {
    @AbstractC27891c(mo46611a = "aweme_id")
    private String aid = "";
    @AbstractC27891c(mo46611a = "comment_count")
    private Long commentCount = 0L;
    @AbstractC27891c(mo46611a = "digg_count")
    private Long diggCount = 0L;
    @AbstractC27891c(mo46611a = "download_count")
    private Long downloadCount = 0L;
    @AbstractC27891c(mo46611a = "forward_count")
    private Long forwardCount = 0L;
    @AbstractC27891c(mo46611a = "play_count")
    private Long playCount = 0L;
    @AbstractC27891c(mo46611a = "share_count")
    private Long shareCount = 0L;

    static {
        Covode.recordClassIndex(58639);
    }

    public final String getAid() {
        return this.aid;
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final Long getDiggCount() {
        return this.diggCount;
    }

    public final Long getDownloadCount() {
        return this.downloadCount;
    }

    public final Long getForwardCount() {
        return this.forwardCount;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Long getShareCount() {
        return this.shareCount;
    }

    public final String toString() {
        return "AwemeStatistics{aid='" + this.aid + "', comemntCount=" + this.commentCount + ", diggCount=" + this.diggCount + ", playCount=" + this.playCount + ", shareCount=" + this.shareCount + ", forwardCount=" + this.forwardCount + "}";
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setDiggCount(Long l) {
        this.diggCount = l;
    }

    public final void setDownloadCount$common_feed_release(Long l) {
        this.downloadCount = l;
    }

    public final void setForwardCount(Long l) {
        this.forwardCount = l;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setShareCount(Long l) {
        this.shareCount = l;
    }
}
