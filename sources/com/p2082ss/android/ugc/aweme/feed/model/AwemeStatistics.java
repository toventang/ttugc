package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.utils.C34721g;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatistics */
public class AwemeStatistics implements Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "aid")
    public String aid;
    @AbstractC27891c(mo46611a = "comment_count")
    public long commentCount;
    @AbstractC27891c(mo46611a = "digg_count")
    public long diggCount;
    @AbstractC27891c(mo46611a = "download_count")
    public long downloadCount;
    @AbstractC27891c(mo46611a = "forward_count")
    public long forwardCount;
    @AbstractC27891c(mo46611a = "lose_comment_count")
    public int loseCommentCount;
    @AbstractC27891c(mo46611a = "lose_count")
    public int loseCount;
    @AbstractC27891c(mo46611a = "play_count")
    public long playCount;
    @AbstractC27891c(mo46611a = "share_count")
    public long shareCount;

    static {
        Covode.recordClassIndex(58638);
    }

    public String getAid() {
        return this.aid;
    }

    public long getCommentCount() {
        return this.commentCount;
    }

    public long getDiggCount() {
        return this.diggCount;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getForwardCount() {
        return this.forwardCount;
    }

    public int getLoseCommentCount() {
        return this.loseCommentCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public long getShareCount() {
        return this.shareCount;
    }

    @Override // java.lang.Object
    public AwemeStatistics clone() {
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        awemeStatistics.aid = this.aid;
        awemeStatistics.commentCount = this.commentCount;
        awemeStatistics.diggCount = this.diggCount;
        awemeStatistics.playCount = this.playCount;
        awemeStatistics.shareCount = this.shareCount;
        awemeStatistics.forwardCount = this.forwardCount;
        awemeStatistics.downloadCount = this.downloadCount;
        return awemeStatistics;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Long.valueOf(this.commentCount), Long.valueOf(this.diggCount), Long.valueOf(this.playCount), Long.valueOf(this.shareCount), Long.valueOf(this.forwardCount), Long.valueOf(this.downloadCount)});
    }

    public String toString() {
        return "AwemeStatistics{aid='" + this.aid + '\'' + ", commentCount=" + this.commentCount + ", diggCount=" + this.diggCount + ", playCount=" + this.playCount + ", shareCount=" + this.shareCount + ", forwardCount=" + this.forwardCount + ", downloadCount=" + this.downloadCount + '}';
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCommentCount(long j) {
        this.commentCount = j;
    }

    public void setDiggCount(long j) {
        this.diggCount = j;
    }

    public void setDownloadCount(long j) {
        this.downloadCount = j;
    }

    public void setForwardCount(long j) {
        this.forwardCount = j;
    }

    public void setLoseCommentCount(int i) {
        this.loseCommentCount = i;
    }

    public void setLoseCount(int i) {
        this.loseCount = i;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setShareCount(long j) {
        this.shareCount = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatistics)) {
            return false;
        }
        AwemeStatistics awemeStatistics = (AwemeStatistics) obj;
        if (this.commentCount == awemeStatistics.commentCount && this.diggCount == awemeStatistics.diggCount && this.playCount == awemeStatistics.playCount && this.shareCount == awemeStatistics.shareCount && this.forwardCount == awemeStatistics.forwardCount && this.downloadCount == awemeStatistics.downloadCount && C34721g.m70920a(this.aid, awemeStatistics.aid)) {
            return true;
        }
        return false;
    }
}
