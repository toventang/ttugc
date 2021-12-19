package com.p2082ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.aa */
public abstract class AbstractC63822aa extends C39088c<AbstractC39085b<UserResponse>, AbstractC63855s> {
    static {
        Covode.recordClassIndex(75246);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public void mo57526a_(Exception exc) {
    }

    /* renamed from: a */
    public final void mo103278a(User user) {
        if (this.f92287i != null && ((AbstractC63855s) this.f92287i).mo103333b()) {
            user.getFollowingCount();
            if (C63973ae.m115689a(user)) {
                user.getFansCount();
            } else {
                user.getFollowerCount();
            }
            user.getTotalFavorited();
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                user.getRemarkName();
                user.getStarBillboardRank();
                user.getBrandInfo();
            } else {
                user.getNickname();
                user.getStarBillboardRank();
                user.getBrandInfo();
            }
            user.getFollowStatus();
            user.getSignature();
            user.isLive();
            StoryUnreadUtils.hasUnreadStory(user);
            C80630u.m139797a(user);
            user.getAwemeCount();
            user.getRepostCount();
            user.getFavoritingCount();
            if (user.getOriginalMusician() != null) {
                user.getOriginalMusician().getMusicCount();
            }
            if (user.getEffectArtistDetail() != null) {
                user.getEffectArtistDetail().getTotal();
            }
            user.getEnterpriseVerifyReason();
            if (user.isAdVirtual()) {
                user.getNickname();
            } else if (TextUtils.isEmpty(user.getUniqueId())) {
                user.getShortId();
            } else {
                user.getUniqueId();
            }
            if (C80580in.m139694g(user)) {
                user.getFollowerStatus();
            } else {
                user.getFollowStatus();
                user.getFollowerStatus();
            }
            user.getCustomVerify();
            user.getProfileNgoStruct();
            user.getProfileBadge();
            user.getLivePushNotificationStatus();
        }
    }
}
