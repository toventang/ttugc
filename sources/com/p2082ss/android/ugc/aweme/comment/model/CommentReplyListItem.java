package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentReplyListItem */
public class CommentReplyListItem {
    public CommentReplyButtonStruct mButtonStruct;
    public Comment mComment;
    public List<Comment> mReplyComments = new ArrayList();

    static {
        Covode.recordClassIndex(43863);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        Comment comment;
        if (!(obj instanceof CommentReplyListItem) || (comment = this.mComment) == null) {
            return super.equals(obj);
        }
        return comment.equals(((CommentReplyListItem) obj).mComment);
    }
}
