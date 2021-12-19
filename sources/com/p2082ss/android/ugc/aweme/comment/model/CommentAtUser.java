package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtUser */
public final class CommentAtUser {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "avatar_thumb")
    public final UrlModel avatarThumb;
    @AbstractC27891c(mo46611a = "commerce_user_level")
    public final Integer commerceUserLevel;
    @AbstractC27891c(mo46611a = "contact_name")
    public final String contactName;
    @AbstractC27891c(mo46611a = "custom_verify")
    public final String customVerify;
    @AbstractC27891c(mo46611a = "enterprise_verify_reason")
    public final String enterpriseVerifyReason;
    @AbstractC27891c(mo46611a = "follow_status")
    public final Integer followStatus;
    @AbstractC27891c(mo46611a = "follower_status")
    public final Integer followerStatus;
    @AbstractC27891c(mo46611a = "is_block")
    public final Boolean isBlock;
    @AbstractC27891c(mo46611a = "nickname")
    public final String nickname;
    @AbstractC27891c(mo46611a = "recommend_reason")
    public final String recommendReason;
    @AbstractC27891c(mo46611a = "relation_type")
    public final String relationType;
    @AbstractC27891c(mo46611a = "remark_name")
    public final String remarkName;
    @AbstractC27891c(mo46611a = "sec_uid")
    public final String secUid;
    @AbstractC27891c(mo46611a = "short_id")
    public final String shortId;
    @AbstractC27891c(mo46611a = "signature")
    public final String signature;
    @AbstractC27891c(mo46611a = "uid")
    public final String uid;
    @AbstractC27891c(mo46611a = "unique_id")
    public final String uniqueId;
    @AbstractC27891c(mo46611a = "verification_type")
    public final Integer verificationType;
    @AbstractC27891c(mo46611a = "with_commerce_entry")
    public final Boolean withCommerceEntry;

    static {
        Covode.recordClassIndex(43854);
    }

    public CommentAtUser() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ CommentAtUser copy$default(CommentAtUser commentAtUser, String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, Integer num3, String str9, Boolean bool, String str10, Integer num4, Boolean bool2, String str11, String str12, int i, Object obj) {
        String str13 = str2;
        String str14 = str;
        String str15 = str5;
        Integer num5 = num2;
        String str16 = str3;
        String str17 = str4;
        UrlModel urlModel2 = urlModel;
        Integer num6 = num;
        Boolean bool3 = bool;
        String str18 = str9;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        Integer num7 = num3;
        String str22 = str10;
        String str23 = str12;
        Integer num8 = num4;
        Boolean bool4 = bool2;
        String str24 = str11;
        if ((i & 1) != 0) {
            str14 = commentAtUser.uid;
        }
        if ((i & 2) != 0) {
            str13 = commentAtUser.secUid;
        }
        if ((i & 4) != 0) {
            str16 = commentAtUser.nickname;
        }
        if ((i & 8) != 0) {
            str17 = commentAtUser.signature;
        }
        if ((i & 16) != 0) {
            urlModel2 = commentAtUser.avatarThumb;
        }
        if ((i & 32) != 0) {
            num6 = commentAtUser.followStatus;
        }
        if ((i & 64) != 0) {
            num5 = commentAtUser.followerStatus;
        }
        if ((i & 128) != 0) {
            str15 = commentAtUser.uniqueId;
        }
        if ((i & 256) != 0) {
            str19 = commentAtUser.shortId;
        }
        if ((i & 512) != 0) {
            str20 = commentAtUser.customVerify;
        }
        if ((i & 1024) != 0) {
            str21 = commentAtUser.enterpriseVerifyReason;
        }
        if ((i & 2048) != 0) {
            num7 = commentAtUser.verificationType;
        }
        if ((i & 4096) != 0) {
            str18 = commentAtUser.remarkName;
        }
        if ((i & 8192) != 0) {
            bool3 = commentAtUser.isBlock;
        }
        if ((i & 16384) != 0) {
            str22 = commentAtUser.contactName;
        }
        if ((32768 & i) != 0) {
            num8 = commentAtUser.commerceUserLevel;
        }
        if ((65536 & i) != 0) {
            bool4 = commentAtUser.withCommerceEntry;
        }
        if ((131072 & i) != 0) {
            str24 = commentAtUser.recommendReason;
        }
        if ((i & 262144) != 0) {
            str23 = commentAtUser.relationType;
        }
        return commentAtUser.copy(str14, str13, str16, str17, urlModel2, num6, num5, str15, str19, str20, str21, num7, str18, bool3, str22, num8, bool4, str24, str23);
    }

    public final CommentAtUser copy(String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, Integer num3, String str9, Boolean bool, String str10, Integer num4, Boolean bool2, String str11, String str12) {
        return new CommentAtUser(str, str2, str3, str4, urlModel, num, num2, str5, str6, str7, str8, num3, str9, bool, str10, num4, bool2, str11, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentAtUser)) {
            return false;
        }
        CommentAtUser commentAtUser = (CommentAtUser) obj;
        return C89219l.m154714a(this.uid, commentAtUser.uid) && C89219l.m154714a(this.secUid, commentAtUser.secUid) && C89219l.m154714a(this.nickname, commentAtUser.nickname) && C89219l.m154714a(this.signature, commentAtUser.signature) && C89219l.m154714a(this.avatarThumb, commentAtUser.avatarThumb) && C89219l.m154714a(this.followStatus, commentAtUser.followStatus) && C89219l.m154714a(this.followerStatus, commentAtUser.followerStatus) && C89219l.m154714a(this.uniqueId, commentAtUser.uniqueId) && C89219l.m154714a(this.shortId, commentAtUser.shortId) && C89219l.m154714a(this.customVerify, commentAtUser.customVerify) && C89219l.m154714a(this.enterpriseVerifyReason, commentAtUser.enterpriseVerifyReason) && C89219l.m154714a(this.verificationType, commentAtUser.verificationType) && C89219l.m154714a(this.remarkName, commentAtUser.remarkName) && C89219l.m154714a(this.isBlock, commentAtUser.isBlock) && C89219l.m154714a(this.contactName, commentAtUser.contactName) && C89219l.m154714a(this.commerceUserLevel, commentAtUser.commerceUserLevel) && C89219l.m154714a(this.withCommerceEntry, commentAtUser.withCommerceEntry) && C89219l.m154714a(this.recommendReason, commentAtUser.recommendReason) && C89219l.m154714a(this.relationType, commentAtUser.relationType);
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nickname;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.signature;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.avatarThumb;
        int hashCode5 = (hashCode4 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        Integer num = this.followStatus;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.followerStatus;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str5 = this.uniqueId;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.shortId;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.customVerify;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.enterpriseVerifyReason;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num3 = this.verificationType;
        int hashCode12 = (hashCode11 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str9 = this.remarkName;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool = this.isBlock;
        int hashCode14 = (hashCode13 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str10 = this.contactName;
        int hashCode15 = (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Integer num4 = this.commerceUserLevel;
        int hashCode16 = (hashCode15 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool2 = this.withCommerceEntry;
        int hashCode17 = (hashCode16 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str11 = this.recommendReason;
        int hashCode18 = (hashCode17 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.relationType;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode18 + i;
    }

    public final String toString() {
        return "CommentAtUser(uid=" + this.uid + ", secUid=" + this.secUid + ", nickname=" + this.nickname + ", signature=" + this.signature + ", avatarThumb=" + this.avatarThumb + ", followStatus=" + this.followStatus + ", followerStatus=" + this.followerStatus + ", uniqueId=" + this.uniqueId + ", shortId=" + this.shortId + ", customVerify=" + this.customVerify + ", enterpriseVerifyReason=" + this.enterpriseVerifyReason + ", verificationType=" + this.verificationType + ", remarkName=" + this.remarkName + ", isBlock=" + this.isBlock + ", contactName=" + this.contactName + ", commerceUserLevel=" + this.commerceUserLevel + ", withCommerceEntry=" + this.withCommerceEntry + ", recommendReason=" + this.recommendReason + ", relationType=" + this.relationType + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtUser$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(43855);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final CommentAtUser fromSearchSugInfo(C67684i iVar) {
            String str;
            if (iVar == null) {
                return null;
            }
            String userId = iVar.getUserId();
            String secUserId = iVar.getSecUserId();
            String userNickname = iVar.getUserNickname();
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(iVar.getUserAvatarUri());
            urlModel.setUrlList(C89070n.m154522b(iVar.getUserAvatarUri(), iVar.getUserAvatarUri()));
            String username = iVar.getUsername();
            if (iVar.isVerifiedUser()) {
                str = "verified";
            } else {
                str = "";
            }
            return new CommentAtUser(userId, secUserId, userNickname, null, urlModel, null, null, username, null, str, null, null, null, null, null, null, null, null, iVar.getUserRelationType(), 261480, null);
        }

        public final CommentAtUser toCommentAtUser(User user) {
            if (user == null) {
                return null;
            }
            return new CommentAtUser(user.getUid(), user.getSecUid(), user.getNickname(), user.getSignature(), user.getAvatarThumb(), Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.getUniqueId(), user.getShortId(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getRemarkName(), Boolean.valueOf(user.isBlock), user.getContactName(), Integer.valueOf(user.getCommerceUserLevel()), Boolean.valueOf(user.isWithCommerceEntry()), user.getRecommendReason(), null, 262144, null);
        }

        public final User toUser(CommentAtUser commentAtUser) {
            int i;
            int i2;
            int i3;
            boolean z;
            int i4;
            if (commentAtUser == null) {
                return null;
            }
            User user = new User();
            user.setUid(commentAtUser.uid);
            user.setSecUid(commentAtUser.secUid);
            user.setNickname(commentAtUser.nickname);
            user.setSignature(commentAtUser.signature);
            user.setAvatarThumb(commentAtUser.avatarThumb);
            Integer num = commentAtUser.followStatus;
            boolean z2 = false;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            user.setFollowStatus(i);
            Integer num2 = commentAtUser.followerStatus;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            user.setFollowerStatus(i2);
            user.setUniqueId(commentAtUser.uniqueId);
            user.setShortId(commentAtUser.shortId);
            user.setCustomVerify(commentAtUser.customVerify);
            user.setEnterpriseVerifyReason(commentAtUser.enterpriseVerifyReason);
            Integer num3 = commentAtUser.verificationType;
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = 0;
            }
            user.setVerificationType(i3);
            user.setRemarkName(commentAtUser.remarkName);
            Boolean bool = commentAtUser.isBlock;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            user.isBlock = z;
            user.setContactName(commentAtUser.contactName);
            Integer num4 = commentAtUser.commerceUserLevel;
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = 0;
            }
            user.setCommerceUserLevel(i4);
            Boolean bool2 = commentAtUser.withCommerceEntry;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            user.setWithCommerceEntry(z2);
            user.setRecommendReason(commentAtUser.recommendReason);
            return user;
        }
    }

    public CommentAtUser(String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, Integer num3, String str9, Boolean bool, String str10, Integer num4, Boolean bool2, String str11, String str12) {
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
        this.signature = str4;
        this.avatarThumb = urlModel;
        this.followStatus = num;
        this.followerStatus = num2;
        this.uniqueId = str5;
        this.shortId = str6;
        this.customVerify = str7;
        this.enterpriseVerifyReason = str8;
        this.verificationType = num3;
        this.remarkName = str9;
        this.isBlock = bool;
        this.contactName = str10;
        this.commerceUserLevel = num4;
        this.withCommerceEntry = bool2;
        this.recommendReason = str11;
        this.relationType = str12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentAtUser(String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, Integer num3, String str9, Boolean bool, String str10, Integer num4, Boolean bool2, String str11, String str12, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : urlModel, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : num4, (65536 & i) != 0 ? null : bool2, (131072 & i) != 0 ? null : str11, (i & 262144) != 0 ? null : str12);
    }
}
