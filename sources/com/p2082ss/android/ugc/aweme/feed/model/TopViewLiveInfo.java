package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.TopViewLiveInfo */
public final class TopViewLiveInfo implements Serializable {
    @AbstractC27891c(mo46611a = "comment_count")
    private Long commentCount = 0L;
    private transient int currentIndex;
    @AbstractC27891c(mo46611a = "gift_count")
    private Long giftCount = 0L;
    @AbstractC27891c(mo46611a = "status_code")
    private int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    private String statusMsg;
    @AbstractC27891c(mo46611a = "viewer_count")
    private Long viewerCount = 0L;

    static {
        Covode.recordClassIndex(58763);
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final Long getGiftCount() {
        return this.giftCount;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final Long getViewerCount() {
        return this.viewerCount;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setGiftCount(Long l) {
        this.giftCount = l;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setViewerCount(Long l) {
        this.viewerCount = l;
    }
}
