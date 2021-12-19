package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatus */
public final class CommentStatus {
    @AbstractC27891c(mo46611a = "cid")
    private Long commentId;
    @AbstractC27891c(mo46611a = "is_visible")
    private Boolean isVisible = true;
    @AbstractC27891c(mo46611a = "reason")
    private String reason;
    @AbstractC27891c(mo46611a = "comment_sharing_status")
    private Integer sharingStatus;

    static {
        Covode.recordClassIndex(63427);
    }

    public final Long getCommentId() {
        return this.commentId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Integer getSharingStatus() {
        return this.sharingStatus;
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setCommentId(Long l) {
        this.commentId = l;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setSharingStatus(Integer num) {
        this.sharingStatus = num;
    }

    public final void setVisible(Boolean bool) {
        this.isVisible = bool;
    }
}
