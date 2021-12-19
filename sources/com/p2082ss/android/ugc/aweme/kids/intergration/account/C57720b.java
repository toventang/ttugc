package com.p2082ss.android.ugc.aweme.kids.intergration.account;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.intergration.account.b */
public final class C57720b implements AbstractC57153a {

    /* renamed from: a */
    private final User f131705a;

    static {
        Covode.recordClassIndex(67694);
    }

    public final User getUser() {
        return this.f131705a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final String getSecUserId() {
        return this.f131705a.getSecUid();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final String getShortId() {
        return this.f131705a.getShortId();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final String getUniqueId() {
        return this.f131705a.getUniqueId();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final UrlModel getUserAvatar() {
        return this.f131705a.getAvatarMedium();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final String getUserId() {
        return this.f131705a.getUid();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final Integer getUserPeriod() {
        return Integer.valueOf(this.f131705a.getUserPeriod());
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final UrlModel getUserThumb() {
        UrlModel avatarThumb = this.f131705a.getAvatarThumb();
        C89219l.m154716b(avatarThumb, "");
        return avatarThumb;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a
    public final Boolean isKidsMode() {
        boolean z = true;
        if (this.f131705a.getAgeGatePostAction() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C57720b(User user) {
        C89219l.m154721d(user, "");
        this.f131705a = user;
    }
}
