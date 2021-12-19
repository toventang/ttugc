package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeControl */
public class AwemeControl implements Serializable {
    @AbstractC27891c(mo46611a = "can_comment")
    public boolean canComment = true;
    @AbstractC27891c(mo46611a = "can_forward")
    public boolean canForward = true;
    @AbstractC27891c(mo46611a = "can_share")
    public boolean canShare = true;
    @AbstractC27891c(mo46611a = "can_show_comment")
    public boolean canShowComment = true;

    static {
        Covode.recordClassIndex(58626);
    }

    public boolean canComment() {
        return this.canComment;
    }

    public boolean canForward() {
        return this.canForward;
    }

    public boolean canShare() {
        return this.canShare;
    }

    public boolean canShowComment() {
        return this.canShowComment;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanForward(boolean z) {
        this.canForward = z;
    }

    public void setCanShare(boolean z) {
        this.canShare = z;
    }

    public void setCanShowComment(boolean z) {
        this.canShowComment = z;
    }
}
