package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig */
public final class CommentVideoConfig implements Serializable {
    private CommentVideoModel commentVideoModel;

    static {
        Covode.recordClassIndex(79849);
    }

    public final CommentVideoModel getCommentVideoModel() {
        return this.commentVideoModel;
    }

    public final void setCommentVideoModel(CommentVideoModel commentVideoModel2) {
        this.commentVideoModel = commentVideoModel2;
    }
}
