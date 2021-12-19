package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentItemList */
public class CommentItemList extends BaseCommentResponse {
    @AbstractC27891c(mo46611a = "alias_comment_deleted")
    public boolean aliasCommentDeleted;
    @AbstractC27891c(mo46611a = "comment_prompt")
    public CommentPrompt commentPrompt = new CommentPrompt();
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_filtered_comments")
    public int hasFilteredComments;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "comments")
    public List<Comment> items;
    @AbstractC27891c(mo46611a = "new_insert_ids")
    public String newInsertIds;
    @AbstractC27891c(mo46611a = "reply_style")
    public int replyStyle;
    @AbstractC27891c(mo46611a = "top_gifts")
    public List<CommentGiftStruct> topGiftList;
    @AbstractC27891c(mo46611a = "total")
    public long total;

    static {
        Covode.recordClassIndex(43857);
    }

    public boolean hasFilteredComments() {
        if (this.hasFilteredComments == 1) {
            return true;
        }
        return false;
    }
}
