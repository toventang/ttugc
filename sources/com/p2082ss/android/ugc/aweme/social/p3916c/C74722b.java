package com.p2082ss.android.ugc.aweme.social.p3916c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.c.b */
public final class C74722b {
    static {
        Covode.recordClassIndex(87559);
    }

    /* renamed from: a */
    public static final User m131180a(C74721a aVar) {
        C89219l.m154721d(aVar, "");
        User user = new User();
        user.setUid(aVar.getUid());
        user.setSecUid(aVar.getSecUid());
        user.setNickname(aVar.getNickName());
        user.setSignature(aVar.getSignature());
        user.setAvatarThumb(aVar.getAvatarThumb());
        if (aVar.getFollowStatus() == 1 && aVar.getFollowerStatus() == 1) {
            user.setFollowStatus(2);
        } else {
            user.setFollowStatus(aVar.getFollowStatus());
        }
        user.setFollowerStatus(aVar.getFollowerStatus());
        user.setUniqueId(aVar.getUniqueId());
        user.setShortId(aVar.getShortId());
        user.setCustomVerify(aVar.getCustomVerify());
        user.setEnterpriseVerifyReason(aVar.getEnterpriseVerifyReason());
        user.setVerificationType(aVar.getVerificationType());
        user.setRemarkName(aVar.getRemarkName());
        user.isBlock = aVar.isBlock();
        user.setContactName(aVar.getContactName());
        user.setCommerceUserLevel(aVar.getCommerceUserLevel());
        user.setWithCommerceEntry(aVar.isWithCommerceEntry());
        user.setAccountType(aVar.getAccountType());
        user.setRecommendReason(aVar.getRecommendReason());
        user.setSecret(aVar.isSecret());
        user.setPrivateAccount(aVar.isPrivateAccount());
        user.setMutualStruct(aVar.getMMutualStruct());
        user.setRecType(aVar.getRecType());
        user.setFriendTypeStr(aVar.getFriendTypeStr());
        user.setRequestId(aVar.getRequestId());
        user.setSocialInfo(aVar.getSocialInfo());
        return user;
    }

    /* renamed from: a */
    public static final C74721a m131181a(User user) {
        C89219l.m154721d(user, "");
        C74721a aVar = new C74721a();
        aVar.setUid(user.getUid());
        aVar.setSecUid(user.getSecUid());
        aVar.setNickName(user.getNickname());
        aVar.setSignature(user.getSignature());
        aVar.setAvatarThumb(user.getAvatarThumb());
        boolean z = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            aVar.setFollowStatus(2);
        } else {
            aVar.setFollowStatus(user.getFollowStatus());
        }
        aVar.setFollowerStatus(user.getFollowerStatus());
        aVar.setUniqueId(user.getUniqueId());
        aVar.setShortId(user.getShortId());
        aVar.setCustomVerify(user.getCustomVerify());
        aVar.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        aVar.setVerificationType(user.getVerificationType());
        aVar.setRemarkName(user.getRemarkName());
        aVar.setBlock(user.isBlock());
        aVar.setContactName(user.getContactName());
        aVar.setCommerceUserLevel(user.getCommerceUserLevel());
        aVar.setWithCommerceEntry(user.isWithCommerceEntry());
        aVar.setCheckedUnreadStoryMillis(0);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z = false;
        }
        aVar.setEnterprise(z);
        aVar.setAccountType(user.getAccountType());
        aVar.setRecommendReason(user.getRecommendReason());
        aVar.setSecret(user.isSecret());
        aVar.setPrivateAccount(user.isPrivateAccount());
        aVar.setMMutualStruct(user.getMutualStruct());
        aVar.setRecType(user.getRecType());
        aVar.setFriendTypeStr(user.getFriendTypeStr());
        aVar.setRequestId(user.getRequestId());
        aVar.setSocialInfo(user.getSocialInfo());
        return aVar;
    }
}
