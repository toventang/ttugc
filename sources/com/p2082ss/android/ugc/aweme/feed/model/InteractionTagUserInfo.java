package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo */
public final class InteractionTagUserInfo implements Serializable {
    @AbstractC27891c(mo46611a = "avatar_thumb")
    public UrlModel avatarThumb;
    @AbstractC27891c(mo46611a = "custom_verify")
    public String customVerify;
    @AbstractC27891c(mo46611a = "enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @AbstractC27891c(mo46611a = "follow_status")
    public int followStatus;
    @AbstractC27891c(mo46611a = "follower_status")
    public int followerStatus;
    @AbstractC27891c(mo46611a = "interest_level")
    public int interestLevel;
    @AbstractC27891c(mo46611a = "is_private_account")
    public int isPrivateAccount;
    @AbstractC27891c(mo46611a = "nickname")
    public String nickname;
    @AbstractC27891c(mo46611a = "uid")
    public String uid;
    @AbstractC27891c(mo46611a = "unique_id")
    public String uniqueId;

    static {
        Covode.recordClassIndex(58716);
    }

    public InteractionTagUserInfo() {
        this(null, null, null, null, 0, 0, 0, null, null, 0, 1023, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_InteractionTagUserInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93181x522b4059(int i) {
        return i;
    }

    public static /* synthetic */ InteractionTagUserInfo copy$default(InteractionTagUserInfo interactionTagUserInfo, String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = interactionTagUserInfo.uid;
        }
        if ((i5 & 2) != 0) {
            str2 = interactionTagUserInfo.uniqueId;
        }
        if ((i5 & 4) != 0) {
            str3 = interactionTagUserInfo.nickname;
        }
        if ((i5 & 8) != 0) {
            urlModel = interactionTagUserInfo.avatarThumb;
        }
        if ((i5 & 16) != 0) {
            i = interactionTagUserInfo.followStatus;
        }
        if ((i5 & 32) != 0) {
            i2 = interactionTagUserInfo.followerStatus;
        }
        if ((i5 & 64) != 0) {
            i3 = interactionTagUserInfo.isPrivateAccount;
        }
        if ((i5 & 128) != 0) {
            str4 = interactionTagUserInfo.customVerify;
        }
        if ((i5 & 256) != 0) {
            str5 = interactionTagUserInfo.enterpriseVerifyReason;
        }
        if ((i5 & 512) != 0) {
            i4 = interactionTagUserInfo.interestLevel;
        }
        return interactionTagUserInfo.copy(str, str2, str3, urlModel, i, i2, i3, str4, str5, i4);
    }

    public final String component1() {
        return this.uid;
    }

    public final int component10() {
        return this.interestLevel;
    }

    public final String component2() {
        return this.uniqueId;
    }

    public final String component3() {
        return this.nickname;
    }

    public final UrlModel component4() {
        return this.avatarThumb;
    }

    public final int component5() {
        return this.followStatus;
    }

    public final int component6() {
        return this.followerStatus;
    }

    public final int component7() {
        return this.isPrivateAccount;
    }

    public final String component8() {
        return this.customVerify;
    }

    public final String component9() {
        return this.enterpriseVerifyReason;
    }

    public final InteractionTagUserInfo copy(String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4) {
        return new InteractionTagUserInfo(str, str2, str3, urlModel, i, i2, i3, str4, str5, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionTagUserInfo)) {
            return false;
        }
        InteractionTagUserInfo interactionTagUserInfo = (InteractionTagUserInfo) obj;
        return C89219l.m154714a(this.uid, interactionTagUserInfo.uid) && C89219l.m154714a(this.uniqueId, interactionTagUserInfo.uniqueId) && C89219l.m154714a(this.nickname, interactionTagUserInfo.nickname) && C89219l.m154714a(this.avatarThumb, interactionTagUserInfo.avatarThumb) && this.followStatus == interactionTagUserInfo.followStatus && this.followerStatus == interactionTagUserInfo.followerStatus && this.isPrivateAccount == interactionTagUserInfo.isPrivateAccount && C89219l.m154714a(this.customVerify, interactionTagUserInfo.customVerify) && C89219l.m154714a(this.enterpriseVerifyReason, interactionTagUserInfo.enterpriseVerifyReason) && this.interestLevel == interactionTagUserInfo.interestLevel;
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uniqueId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nickname;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.avatarThumb;
        int hashCode4 = (((((((hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + m93181x522b4059(this.followStatus)) * 31) + m93181x522b4059(this.followerStatus)) * 31) + m93181x522b4059(this.isPrivateAccount)) * 31;
        String str4 = this.customVerify;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.enterpriseVerifyReason;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((hashCode5 + i) * 31) + m93181x522b4059(this.interestLevel);
    }

    public final String toString() {
        return "InteractionTagUserInfo(uid=" + this.uid + ", uniqueId=" + this.uniqueId + ", nickname=" + this.nickname + ", avatarThumb=" + this.avatarThumb + ", followStatus=" + this.followStatus + ", followerStatus=" + this.followerStatus + ", isPrivateAccount=" + this.isPrivateAccount + ", customVerify=" + this.customVerify + ", enterpriseVerifyReason=" + this.enterpriseVerifyReason + ", interestLevel=" + this.interestLevel + ")";
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final int getInterestLevel() {
        return this.interestLevel;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setInterestLevel(int i) {
        this.interestLevel = i;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setPrivateAccount(int i) {
        this.isPrivateAccount = i;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public InteractionTagUserInfo(String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4) {
        this.uid = str;
        this.uniqueId = str2;
        this.nickname = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
        this.followerStatus = i2;
        this.isPrivateAccount = i3;
        this.customVerify = str4;
        this.enterpriseVerifyReason = str5;
        this.interestLevel = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InteractionTagUserInfo(java.lang.String r13, java.lang.String r14, java.lang.String r15, com.p2082ss.android.ugc.aweme.base.model.UrlModel r16, int r17, int r18, int r19, java.lang.String r20, java.lang.String r21, int r22, int r23, p4600h.p4611f.p4613b.C89214g r24) {
        /*
            r12 = this;
            r6 = r17
            r7 = r18
            r2 = r13
            r8 = r19
            r3 = r14
            r9 = r20
            r4 = r15
            r1 = r23
            r5 = r16
            r0 = r1 & 1
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x0016
            r2 = r10
        L_0x0016:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x001b
            r3 = r10
        L_0x001b:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0020
            r4 = r10
        L_0x0020:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0025
            r5 = 0
        L_0x0025:
            r0 = r1 & 16
            r11 = 0
            if (r0 == 0) goto L_0x002b
            r6 = 0
        L_0x002b:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0030
            r7 = 0
        L_0x0030:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0035
            r8 = 0
        L_0x0035:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            r9 = r10
        L_0x003a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
        L_0x003e:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0047
        L_0x0042:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0047:
            r11 = r22
            goto L_0x0042
        L_0x004a:
            r10 = r21
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int, int, int, java.lang.String, java.lang.String, int, int, h.f.b.g):void");
    }
}
