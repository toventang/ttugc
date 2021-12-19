package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.sticker.data.AbstractC75310e;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentVideoModel */
public final class CommentVideoModel implements AbstractC75310e, Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 6067284783174034475L;
    private final String awemeId;
    private final String awemeUserId;
    private final int channelId;
    private final String commentId;
    private final String commentMsg;
    private int endTime;
    private final String enterFrom;
    private final String enterMethod;
    private final String replyId;
    private final String replyToReplyId;
    private String shootWay;
    private int startTime;
    private final Type type;
    private final UrlModel userAvatar;
    private final String userId;
    private final String userName;

    static {
        Covode.recordClassIndex(43867);
    }

    public CommentVideoModel() {
        this(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_model_CommentVideoModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74399x1c137ad8(int i) {
        return i;
    }

    public static /* synthetic */ CommentVideoModel copy$default(CommentVideoModel commentVideoModel, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type2, String str10, String str11, int i4, Object obj) {
        String str12 = str2;
        String str13 = str;
        String str14 = str4;
        String str15 = str3;
        UrlModel urlModel2 = urlModel;
        String str16 = str7;
        String str17 = str6;
        String str18 = str5;
        String str19 = str9;
        int i5 = i;
        String str20 = str8;
        Type type3 = type2;
        int i6 = i3;
        int i7 = i2;
        String str21 = str11;
        String str22 = str10;
        if ((i4 & 1) != 0) {
            str13 = commentVideoModel.userId;
        }
        if ((i4 & 2) != 0) {
            str12 = commentVideoModel.userName;
        }
        if ((i4 & 4) != 0) {
            urlModel2 = commentVideoModel.userAvatar;
        }
        if ((i4 & 8) != 0) {
            str15 = commentVideoModel.commentMsg;
        }
        if ((i4 & 16) != 0) {
            str14 = commentVideoModel.commentId;
        }
        if ((i4 & 32) != 0) {
            str18 = commentVideoModel.awemeId;
        }
        if ((i4 & 64) != 0) {
            str17 = commentVideoModel.awemeUserId;
        }
        if ((i4 & 128) != 0) {
            str16 = commentVideoModel.replyId;
        }
        if ((i4 & 256) != 0) {
            str20 = commentVideoModel.replyToReplyId;
        }
        if ((i4 & 512) != 0) {
            i5 = commentVideoModel.channelId;
        }
        if ((i4 & 1024) != 0) {
            str19 = commentVideoModel.enterMethod;
        }
        if ((i4 & 2048) != 0) {
            i7 = commentVideoModel.startTime;
        }
        if ((i4 & 4096) != 0) {
            i6 = commentVideoModel.endTime;
        }
        if ((i4 & 8192) != 0) {
            type3 = commentVideoModel.type;
        }
        if ((i4 & 16384) != 0) {
            str22 = commentVideoModel.shootWay;
        }
        if ((i4 & 32768) != 0) {
            str21 = commentVideoModel.enterFrom;
        }
        return commentVideoModel.copy(str13, str12, urlModel2, str15, str14, str18, str17, str16, str20, i5, str19, i7, i6, type3, str22, str21);
    }

    public final String component1() {
        return this.userId;
    }

    public final int component10() {
        return this.channelId;
    }

    public final String component11() {
        return this.enterMethod;
    }

    public final int component12() {
        return this.startTime;
    }

    public final int component13() {
        return this.endTime;
    }

    public final Type component14() {
        return this.type;
    }

    public final String component15() {
        return this.shootWay;
    }

    public final String component16() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.userName;
    }

    public final UrlModel component3() {
        return this.userAvatar;
    }

    public final String component4() {
        return this.commentMsg;
    }

    public final String component5() {
        return this.commentId;
    }

    public final String component6() {
        return this.awemeId;
    }

    public final String component7() {
        return this.awemeUserId;
    }

    public final String component8() {
        return this.replyId;
    }

    public final String component9() {
        return this.replyToReplyId;
    }

    public final CommentVideoModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type2, String str10, String str11) {
        return new CommentVideoModel(str, str2, urlModel, str3, str4, str5, str6, str7, str8, i, str9, i2, i3, type2, str10, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentVideoModel)) {
            return false;
        }
        CommentVideoModel commentVideoModel = (CommentVideoModel) obj;
        return C89219l.m154714a(this.userId, commentVideoModel.userId) && C89219l.m154714a(this.userName, commentVideoModel.userName) && C89219l.m154714a(this.userAvatar, commentVideoModel.userAvatar) && C89219l.m154714a(this.commentMsg, commentVideoModel.commentMsg) && C89219l.m154714a(this.commentId, commentVideoModel.commentId) && C89219l.m154714a(this.awemeId, commentVideoModel.awemeId) && C89219l.m154714a(this.awemeUserId, commentVideoModel.awemeUserId) && C89219l.m154714a(this.replyId, commentVideoModel.replyId) && C89219l.m154714a(this.replyToReplyId, commentVideoModel.replyToReplyId) && this.channelId == commentVideoModel.channelId && C89219l.m154714a(this.enterMethod, commentVideoModel.enterMethod) && this.startTime == commentVideoModel.startTime && this.endTime == commentVideoModel.endTime && C89219l.m154714a(this.type, commentVideoModel.type) && C89219l.m154714a(this.shootWay, commentVideoModel.shootWay) && C89219l.m154714a(this.enterFrom, commentVideoModel.enterFrom);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.userAvatar;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.commentMsg;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.commentId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.awemeId;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.awemeUserId;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.replyId;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.replyToReplyId;
        int hashCode9 = (((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + m74399x1c137ad8(this.channelId)) * 31;
        String str9 = this.enterMethod;
        int hashCode10 = (((((hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + m74399x1c137ad8(this.startTime)) * 31) + m74399x1c137ad8(this.endTime)) * 31;
        Type type2 = this.type;
        int hashCode11 = (hashCode10 + (type2 != null ? type2.hashCode() : 0)) * 31;
        String str10 = this.shootWay;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.enterFrom;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "CommentVideoModel(userId=" + this.userId + ", userName=" + this.userName + ", userAvatar=" + this.userAvatar + ", commentMsg=" + this.commentMsg + ", commentId=" + this.commentId + ", awemeId=" + this.awemeId + ", awemeUserId=" + this.awemeUserId + ", replyId=" + this.replyId + ", replyToReplyId=" + this.replyToReplyId + ", channelId=" + this.channelId + ", enterMethod=" + this.enterMethod + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ", shootWay=" + this.shootWay + ", enterFrom=" + this.enterFrom + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.model.CommentVideoModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(43868);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.model.CommentVideoModel$Type */
    public enum Type {
        NONE(0),
        COMMENT(1),
        QUESTION(2);
        
        private final int code;

        public final int getCode() {
            return this.code;
        }

        static {
            Covode.recordClassIndex(43869);
        }

        private Type(int i) {
            this.code = i;
        }
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getAwemeUserId() {
        return this.awemeUserId;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getReplyId() {
        return this.replyId;
    }

    public final String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final Type getType() {
        return this.type;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final boolean isComment() {
        if (this.type == Type.COMMENT) {
            return true;
        }
        return false;
    }

    public final boolean isCommentFromEditPanel() {
        return C89219l.m154714a((Object) this.shootWay, (Object) "edit_panel");
    }

    public final boolean isQuestion() {
        if (this.type == Type.QUESTION) {
            return true;
        }
        return false;
    }

    public final boolean isCommentFromPanel() {
        if (C89219l.m154714a((Object) this.shootWay, (Object) "record_panel") || C89219l.m154714a((Object) this.shootWay, (Object) "edit_panel")) {
            return true;
        }
        return false;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        if (((long) this.startTime) > j || j > ((long) this.endTime)) {
            return false;
        }
        return true;
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type2, String str10, String str11) {
        this.userId = str;
        this.userName = str2;
        this.userAvatar = urlModel;
        this.commentMsg = str3;
        this.commentId = str4;
        this.awemeId = str5;
        this.awemeUserId = str6;
        this.replyId = str7;
        this.replyToReplyId = str8;
        this.channelId = i;
        this.enterMethod = str9;
        this.startTime = i2;
        this.endTime = i3;
        this.type = type2;
        this.shootWay = str10;
        this.enterFrom = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CommentVideoModel(java.lang.String r19, java.lang.String r20, com.p2082ss.android.ugc.aweme.base.model.UrlModel r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, int r30, int r31, com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel.Type r32, java.lang.String r33, java.lang.String r34, int r35, p4600h.p4611f.p4613b.C89214g r36) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel.<init>(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, com.ss.android.ugc.aweme.comment.model.CommentVideoModel$Type, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
