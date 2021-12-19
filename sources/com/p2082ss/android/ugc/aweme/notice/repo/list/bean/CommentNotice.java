package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice */
public class CommentNotice implements Serializable {
    @AbstractC27891c(mo46611a = "aweme")
    Aweme aweme;
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)
    Comment comment;
    @AbstractC27891c(mo46611a = "comment_type")
    int commentType;
    @AbstractC27891c(mo46611a = "content")
    String content;
    @AbstractC27891c(mo46611a = "forward_id")
    String forwardId;
    @AbstractC27891c(mo46611a = "level1_comment")
    Comment level1Comment;
    @AbstractC27891c(mo46611a = "label_text")
    private String mLabelText;
    @AbstractC27891c(mo46611a = "label_type")
    private int mLabelType;
    @AbstractC27891c(mo46611a = "parent_id")
    String parentId;
    @AbstractC27891c(mo46611a = "relation_label")
    RelationDynamicLabel relationLabel;
    @AbstractC27891c(mo46611a = "reply_comment")
    Comment replyComment;

    static {
        Covode.recordClassIndex(72327);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentType() {
        return this.commentType;
    }

    public String getContent() {
        return this.content;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public String getParentId() {
        return this.parentId;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public boolean isReplyWithVideo() {
        int i = this.commentType;
        if (i == 17 || i == 18 || i == 19) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice$a */
    public interface AbstractC61625a {

        /* renamed from: a */
        public static final List<Integer> f139871a = Arrays.asList(23, 24, 25, 26, 27);

        static {
            Covode.recordClassIndex(72328);
        }
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentType(int i) {
        this.commentType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i) {
        this.mLabelType = i;
    }

    public void setLevel1Comment(Comment comment2) {
        this.level1Comment = comment2;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment2) {
        this.replyComment = comment2;
    }
}
