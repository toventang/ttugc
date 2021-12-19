package com.p2082ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.forward.model.ForwardDetail */
public class ForwardDetail extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "aweme_info")
    private Aweme aweme;
    @AbstractC27891c(mo46611a = "comment_info")
    private Comment comment;
    @AbstractC27891c(mo46611a = "label_info")
    private String labelInfo;
    String requestId;

    static {
        Covode.recordClassIndex(60631);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            aweme2.setRequestId(str);
        }
        this.requestId = str;
    }
}
