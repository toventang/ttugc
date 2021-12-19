package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatusResponse */
public final class CommentStatusResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "comment_status_list")
    private List<CommentStatus> commentStatus;

    static {
        Covode.recordClassIndex(63428);
    }

    public final List<CommentStatus> getCommentStatus() {
        return this.commentStatus;
    }

    public final void setCommentStatus(List<CommentStatus> list) {
        this.commentStatus = list;
    }
}
