package com.p2082ss.android.ugc.aweme.comment.util;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36520p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.util.v */
public final class C37221v implements AbstractC36426l {

    /* renamed from: a */
    public List<CommentReplyListItem> f87755a;

    /* renamed from: b */
    public List<Comment> f87756b;

    /* renamed from: c */
    private String f87757c = "";

    /* renamed from: d */
    private int f87758d;

    /* renamed from: e */
    private Comment f87759e;

    static {
        Covode.recordClassIndex(44576);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l
    /* renamed from: a */
    public final List<Comment> mo63737a() {
        return this.f87756b;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l
    /* renamed from: c */
    public final void mo63742c() {
        List<CommentReplyListItem> list = this.f87755a;
        if (list != null) {
            list.clear();
        }
        List<Comment> list2 = this.f87756b;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l
    /* renamed from: b */
    public final void mo63741b() {
        if (this.f87755a == null) {
            this.f87755a = new ArrayList();
        }
        if (this.f87756b == null) {
            this.f87756b = new ArrayList();
        }
        this.f87759e = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l
    /* renamed from: a */
    public final void mo63738a(int i) {
        this.f87758d = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l
    /* renamed from: a */
    public final void mo63739a(String str) {
        if (str == null) {
            str = "";
        }
        this.f87757c = str;
    }

    /* renamed from: b */
    public final List<Comment> mo64774b(String str) {
        try {
            if (C13603b.m24435a((Collection) this.f87755a)) {
                return null;
            }
            return this.f87755a.get(Integer.parseInt(str)).mReplyComments;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public final CommentReplyListItem mo64777e(String str) {
        List<CommentReplyListItem> list = this.f87755a;
        if (list == null) {
            return null;
        }
        for (CommentReplyListItem commentReplyListItem : list) {
            if (commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                return commentReplyListItem;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final int mo64778f(String str) {
        if (this.f87755a == null) {
            return -1;
        }
        for (int i = 0; i < this.f87755a.size(); i++) {
            CommentReplyListItem commentReplyListItem = this.f87755a.get(i);
            if (!(commentReplyListItem == null || commentReplyListItem.mComment == null || !TextUtils.equals(commentReplyListItem.mComment.getCid(), str))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo64771a(Comment comment) {
        if (!(this.f87755a == null || comment == null)) {
            CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
            commentReplyListItem.mComment = comment;
            commentReplyListItem.mReplyComments = comment.getReplyComments();
            List<CommentReplyListItem> list = this.f87755a;
            list.add(Math.min(0, list.size()), commentReplyListItem);
            if (Math.min(0, this.f87755a.size()) == 0) {
                for (CommentReplyListItem commentReplyListItem2 : this.f87755a) {
                    CommentReplyButtonStruct commentReplyButtonStruct = commentReplyListItem2.mButtonStruct;
                    if (commentReplyButtonStruct != null) {
                        commentReplyButtonStruct.setCid(String.valueOf(Math.min(Integer.valueOf(commentReplyButtonStruct.getCid()).intValue() + 1, this.f87755a.size())));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l
    /* renamed from: a */
    public final void mo63740a(List<Comment> list) {
        int size;
        if (!(list == null || this.f87755a == null || this.f87756b == null)) {
            for (Comment comment : list) {
                CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
                comment.setCommentType(1);
                comment.setNeedHint(TextUtils.equals(this.f87757c, comment.getCid()));
                if (TextUtils.equals(this.f87757c, comment.getCid())) {
                    this.f87759e = comment;
                }
                commentReplyListItem.mComment = comment;
                if (!this.f87755a.contains(commentReplyListItem)) {
                    this.f87755a.add(commentReplyListItem);
                    this.f87756b.add(comment);
                    List<Comment> replyComments = comment.getReplyComments();
                    if (replyComments == null) {
                        size = 0;
                    } else {
                        size = replyComments.size();
                        if (size > 0) {
                            for (Comment comment2 : comment.getReplyComments()) {
                                comment2.setCommentType(2);
                                comment2.setNeedHint(TextUtils.equals(this.f87757c, comment2.getCid()));
                                if (TextUtils.equals(this.f87757c, comment2.getCid())) {
                                    this.f87759e = comment2;
                                }
                                if (!commentReplyListItem.mReplyComments.contains(comment2)) {
                                    commentReplyListItem.mReplyComments.add(comment2);
                                    this.f87756b.add(comment2);
                                }
                            }
                        }
                    }
                    if (comment.getReplyCommentTotal() - ((long) size) > 0) {
                        CommentReplyButtonStruct commentReplyButtonStruct = new CommentReplyButtonStruct(comment, this.f87755a.size() - 1);
                        commentReplyListItem.mButtonStruct = commentReplyButtonStruct;
                        this.f87756b.add(commentReplyButtonStruct);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final int mo64775c(String str) {
        int i = 0;
        if (!C13603b.m24435a((Collection) this.f87756b)) {
            for (int i2 = 0; i2 < this.f87756b.size(); i2++) {
                Comment comment = this.f87756b.get(i2);
                if (TextUtils.equals(comment.getFakeId(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem e = mo64777e(comment.getReplyId());
                        if (e != null) {
                            int indexOf = e.mReplyComments.indexOf(comment);
                            if (e.mButtonStruct != null) {
                                if (indexOf < e.mButtonStruct.getTopSize()) {
                                    e.mButtonStruct.setTopSize(e.mButtonStruct.getTopSize() - 1);
                                }
                                e.mButtonStruct.setExpandSize(e.mButtonStruct.getExpandSize() - 1);
                                e.mButtonStruct.setReplyCommentTotal(e.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= ((long) e.mButtonStruct.getTopSize())) {
                                    e.mButtonStruct.setStatus(4);
                                }
                            }
                            e.mComment.setReplyCommentTotal(e.mComment.getReplyCommentTotal() - 1);
                            e.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem e2 = mo64777e(comment.getCid());
                        if (e2 != null) {
                            if (e2.mButtonStruct != null) {
                                i = e2.mButtonStruct.getExpandSize() + 2;
                            } else {
                                i = e2.mReplyComments.size() + 1;
                            }
                            this.f87755a.remove(e2);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo64776d(String str) {
        int size;
        if (!C13603b.m24435a((Collection) this.f87756b)) {
            for (int i = 0; i < this.f87756b.size(); i++) {
                Comment comment = this.f87756b.get(i);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem e = mo64777e(comment.getReplyId());
                        if (e != null) {
                            int indexOf = e.mReplyComments.indexOf(comment);
                            if (e.mButtonStruct != null) {
                                if (indexOf < e.mButtonStruct.getTopSize()) {
                                    e.mButtonStruct.setTopSize(e.mButtonStruct.getTopSize() - 1);
                                }
                                e.mButtonStruct.setExpandSize(e.mButtonStruct.getExpandSize() - 1);
                                e.mButtonStruct.setReplyCommentTotal(e.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= ((long) e.mButtonStruct.getTopSize())) {
                                    e.mButtonStruct.setStatus(4);
                                }
                            }
                            e.mComment.setReplyCommentTotal(e.mComment.getReplyCommentTotal() - 1);
                            e.mReplyComments.remove(comment);
                            C36520p.m74325a(e.mComment.getCid(), -1);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem e2 = mo64777e(comment.getCid());
                        if (e2 == null) {
                            return 0;
                        }
                        if (e2.mButtonStruct != null) {
                            size = e2.mButtonStruct.getExpandSize() + 2;
                        } else {
                            size = e2.mReplyComments.size() + 1;
                        }
                        this.f87755a.remove(e2);
                        for (int indexOf2 = this.f87755a.indexOf(e2); indexOf2 < this.f87755a.size(); indexOf2++) {
                            CommentReplyButtonStruct commentReplyButtonStruct = this.f87755a.get(indexOf2).mButtonStruct;
                            if (commentReplyButtonStruct != null) {
                                commentReplyButtonStruct.setCid(String.valueOf(Math.max(Integer.valueOf(commentReplyButtonStruct.getCid()).intValue() - 1, 0)));
                            }
                        }
                        return size;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo64773a(String str, String str2) {
        List<CommentReplyListItem> list = this.f87755a;
        if (list == null) {
            return false;
        }
        for (CommentReplyListItem commentReplyListItem : list) {
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str2)) {
                List<Comment> list2 = commentReplyListItem.mReplyComments;
                if (list2 == null) {
                    return false;
                }
                for (Comment comment2 : list2) {
                    if (TextUtils.equals(comment2.getCid(), str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo64772a(String str, int i, Comment comment) {
        CommentReplyListItem e = mo64777e(str);
        if (e != null && i >= 0) {
            if (e.mButtonStruct != null) {
                e.mButtonStruct.addExpandSize(1);
                e.mButtonStruct.setReplyCommentTotal(e.mButtonStruct.getReplyCommentTotal() + 1);
            }
            if (e.mReplyComments == null) {
                e.mReplyComments = new ArrayList();
            }
            List<Comment> list = e.mReplyComments;
            list.add(Math.min(i, list.size()), comment);
            e.mComment.setReplyCommentTotal(e.mComment.getReplyCommentTotal() + 1);
            if (e.mButtonStruct != null) {
                return true;
            }
        }
        return false;
    }
}
