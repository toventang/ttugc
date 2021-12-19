package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct */
public class CommentReplyButtonStruct extends Comment {
    private String mCommentId;
    private long mCursor;
    private int mExpandSize;
    private boolean mHasMore = true;
    private int mStatus;
    private String mTopIds = "";
    private int mTopSize;

    static {
        Covode.recordClassIndex(43862);
    }

    public int getButtonStatus() {
        return this.mStatus;
    }

    public String getCommentId() {
        return this.mCommentId;
    }

    public long getCursor() {
        return this.mCursor;
    }

    public int getExpandSize() {
        return this.mExpandSize;
    }

    public String getTopIds() {
        return this.mTopIds;
    }

    public int getTopSize() {
        return this.mTopSize;
    }

    public boolean isHasMore() {
        return this.mHasMore;
    }

    public void setButtonStatus(int i) {
        this.mStatus = i;
    }

    public void setCursor(long j) {
        this.mCursor = j;
    }

    public void setHasMore(boolean z) {
        this.mHasMore = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.model.Comment
    public void setReplyCommentTotal(long j) {
        this.replyCommentTotal = j;
    }

    public void addExpandSize(int i) {
        this.mExpandSize += i;
    }

    public void setExpandSize(int i) {
        this.mExpandSize = Math.max(i, 0);
    }

    public void setTopSize(int i) {
        this.mTopSize = Math.max(i, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.model.Comment
    public void setReplyComments(List<Comment> list) {
        if (this.replyComments == null) {
            this.replyComments = new ArrayList();
        } else {
            this.replyComments.clear();
        }
        this.replyComments.addAll(list);
    }

    public CommentReplyButtonStruct(Comment comment, int i) {
        setCommentType(11);
        this.mCommentId = comment.getCid();
        this.cid = String.valueOf(i);
        if (comment.getReplyComments() != null) {
            int size = comment.getReplyComments().size();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(comment.getReplyComments().get(i2).getCid());
            }
            this.mTopIds = sb.toString();
            Integer topCount = comment.getTopCount();
            if (topCount != null) {
                this.mTopSize = topCount.intValue();
            } else {
                this.mTopSize = size;
            }
            this.mCursor = (long) Math.max(0, size - 1);
            this.mExpandSize = size;
        }
        setReplyCommentTotal(comment.getReplyCommentTotal());
    }
}
