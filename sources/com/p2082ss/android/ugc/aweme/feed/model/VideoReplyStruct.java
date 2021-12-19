package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoReplyStruct */
public final class VideoReplyStruct implements Serializable {
    @AbstractC27891c(mo46611a = "alias_comment_id")
    public long aliasCommentId;
    @AbstractC27891c(mo46611a = "aweme_id")
    public long awemeId;
    @AbstractC27891c(mo46611a = "collect_stat")
    public Integer collectStat;
    @AbstractC27891c(mo46611a = "comment_id")
    public long commentId;
    @AbstractC27891c(mo46611a = "comment_msg")
    public String commentMsg;
    @AbstractC27891c(mo46611a = "comment_user_id")
    public long commentUserId;
    @AbstractC27891c(mo46611a = "user_avatar")
    public UrlModel userAvatar;
    @AbstractC27891c(mo46611a = "user_name")
    public String userName;

    static {
        Covode.recordClassIndex(58776);
    }

    public VideoReplyStruct() {
        this(0, 0, 0, null, null, 0, null, null, 255, null);
    }

    public final long getAliasCommentId() {
        return this.aliasCommentId;
    }

    public final long getAwemeId() {
        return this.awemeId;
    }

    public final Integer getCollectStat() {
        return this.collectStat;
    }

    public final long getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final long getCommentUserId() {
        return this.commentUserId;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setCollectStat(Integer num) {
        this.collectStat = num;
    }

    public VideoReplyStruct(long j, long j2, long j3, String str, String str2, long j4, UrlModel urlModel, Integer num) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.awemeId = j;
        this.commentId = j2;
        this.aliasCommentId = j3;
        this.userName = str;
        this.commentMsg = str2;
        this.commentUserId = j4;
        this.userAvatar = urlModel;
        this.collectStat = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoReplyStruct(long r15, long r17, long r19, java.lang.String r21, java.lang.String r22, long r23, com.p2082ss.android.ugc.aweme.base.model.UrlModel r25, java.lang.Integer r26, int r27, p4600h.p4611f.p4613b.C89214g r28) {
        /*
            r14 = this;
            r1 = r27
            r12 = r25
            r2 = r15
            r8 = r21
            r4 = r17
            r6 = r19
            r0 = r1 & 1
            r10 = 0
            if (r0 == 0) goto L_0x0013
            r2 = 0
        L_0x0013:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0019
            r4 = 0
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001f
            r6 = 0
        L_0x001f:
            r0 = r1 & 8
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0026
            r8 = r9
        L_0x0026:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0043
        L_0x002a:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0040
        L_0x002e:
            r0 = r1 & 64
            r13 = 0
            if (r0 == 0) goto L_0x0034
            r12 = r13
        L_0x0034:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r1 = r14
            r1.<init>(r2, r4, r6, r8, r9, r10, r12, r13)
            return
        L_0x003d:
            r13 = r26
            goto L_0x0038
        L_0x0040:
            r10 = r23
            goto L_0x002e
        L_0x0043:
            r9 = r22
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct.<init>(long, long, long, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.Integer, int, h.f.b.g):void");
    }
}
