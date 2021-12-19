package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56255h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent */
public class CommentContent extends BaseContent {
    @AbstractC27891c(mo46611a = "author_id")
    private String authorId;
    @AbstractC27891c(mo46611a = "author_name")
    private String authorName;
    @AbstractC27891c(mo46611a = "avatar_url")
    private UrlModel avatarUrl;
    @AbstractC27891c(mo46611a = "aweme_id")
    private String awemeId;
    @AbstractC27891c(mo46611a = "aweme_type")
    private int awemeType;
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)
    private String comment;
    @AbstractC27891c(mo46611a = "comment_id")
    private String commentId;
    @AbstractC27891c(mo46611a = "cover_url")
    private UrlModel coverUrl;
    @AbstractC27891c(mo46611a = "is_reply_with_video")
    private boolean isReplyWithVideo;
    @AbstractC27891c(mo46611a = "is_sub_comment")
    private boolean isSubComment;
    @AbstractC27891c(mo46611a = "reply_user_id")
    private String replyUserId;
    @AbstractC27891c(mo46611a = "reply_user_name")
    private String replyUserName;

    static {
        Covode.recordClassIndex(63426);
    }

    public String getAuthorId() {
        return this.authorId;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public String getComment() {
        return this.comment;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getReplyUserId() {
        return this.replyUserId;
    }

    public String getReplyUserName() {
        return this.replyUserName;
    }

    public boolean isReplyWithVideo() {
        return this.isReplyWithVideo;
    }

    public boolean isSubComment() {
        return this.isSubComment;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return C17867d.m33078a().getResources().getString(R.string.c_x, this.authorName);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        String str;
        String str2;
        String str3;
        String awemeId2 = getAwemeId();
        UrlModel coverUrl2 = getCoverUrl();
        int awemeType2 = getAwemeType();
        String commentId2 = getCommentId();
        String comment2 = getComment();
        String authorName2 = getAuthorName();
        String authorId2 = getAuthorId();
        String replyUserName2 = getReplyUserName();
        String replyUserId2 = getReplyUserId();
        UrlModel avatarUrl2 = getAvatarUrl();
        boolean isSubComment2 = isSubComment();
        boolean isReplyWithVideo2 = isReplyWithVideo();
        C89219l.m154721d(coverUrl2, "");
        C89219l.m154721d(avatarUrl2, "");
        SharePackage.C69654a a = new SharePackage.C69654a().mo109803a(UGCMonitor.EVENT_COMMENT);
        if (commentId2 == null) {
            str = "";
        } else {
            str = commentId2;
        }
        SharePackage.C69654a b = a.mo109806b(str);
        if (commentId2 == null) {
            str2 = "";
        } else {
            str2 = commentId2;
        }
        SharePackage.C69654a c = b.mo109807c(str2);
        if (comment2 == null) {
            str3 = "";
        } else {
            str3 = comment2;
        }
        CommentSharePackage commentSharePackage = new CommentSharePackage(c.mo109808d(str3).mo109809e(""));
        Bundle bundle = commentSharePackage.f155492i;
        if (awemeId2 == null) {
            awemeId2 = "";
        }
        bundle.putString("aweme_id", awemeId2);
        if (comment2 == null) {
            comment2 = "";
        }
        bundle.putString("comment_text", comment2);
        if (commentId2 == null) {
            commentId2 = "";
        }
        bundle.putString("comment_id", commentId2);
        if (authorName2 == null) {
            authorName2 = "";
        }
        bundle.putString("comment_author_name", authorName2);
        if (authorId2 == null) {
            authorId2 = "";
        }
        bundle.putString("comment_author_id", authorId2);
        if (replyUserName2 == null) {
            replyUserName2 = "";
        }
        bundle.putString("comment_reply_user_name", replyUserName2);
        if (replyUserId2 == null) {
            replyUserId2 = "";
        }
        bundle.putString("comment_reply_user_id", replyUserId2);
        bundle.putSerializable("video_cover", coverUrl2);
        bundle.putSerializable("comment_author_avatar_url", avatarUrl2);
        bundle.putInt("aweme_type", awemeType2);
        bundle.putBoolean("comment_is_sub_comment", isSubComment2);
        bundle.putBoolean("comment_is_reply_with_video", isReplyWithVideo2);
        return commentSharePackage;
    }

    public void setAuthorId(String str) {
        this.authorId = str;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setReplyUserId(String str) {
        this.replyUserId = str;
    }

    public void setReplyUserName(String str) {
        this.replyUserName = str;
    }

    public void setReplyWithVideo(boolean z) {
        this.isReplyWithVideo = z;
    }

    public void setSubComment(boolean z) {
        this.isSubComment = z;
    }

    public static CommentContent obtain(C56255h hVar) {
        CommentContent commentContent = new CommentContent();
        commentContent.setAwemeId(hVar.f128303c);
        commentContent.setAwemeType(hVar.f128306f);
        commentContent.setComment(hVar.f128307g);
        commentContent.setCommentId(hVar.f128302b);
        commentContent.setType(0);
        commentContent.setCoverUrl(hVar.f128301a);
        return commentContent;
    }

    public static CommentContent fromSharePackage(SharePackage sharePackage) {
        CommentContent commentContent = new CommentContent();
        Bundle bundle = sharePackage.f155492i;
        commentContent.setAwemeId(bundle.getString("aweme_id"));
        commentContent.setComment(bundle.getString("comment_text"));
        commentContent.setCommentId(bundle.getString("comment_id"));
        commentContent.setAuthorName(bundle.getString("comment_author_name"));
        commentContent.setAuthorId(bundle.getString("comment_author_id"));
        commentContent.setReplyUserName(bundle.getString("comment_reply_user_name"));
        commentContent.setReplyUserId(bundle.getString("comment_reply_user_id"));
        commentContent.setCoverUrl((UrlModel) bundle.getSerializable("video_cover"));
        commentContent.setAvatarUrl((UrlModel) bundle.getSerializable("comment_author_avatar_url"));
        commentContent.setAwemeType(bundle.getInt("aweme_type"));
        commentContent.setSubComment(bundle.getBoolean("comment_is_sub_comment"));
        commentContent.setReplyWithVideo(bundle.getBoolean("comment_is_reply_with_video"));
        commentContent.setType(0);
        return commentContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        return C17867d.m33078a().getResources().getString(R.string.c_w);
    }
}
