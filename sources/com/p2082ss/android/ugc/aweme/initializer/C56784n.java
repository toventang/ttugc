package com.p2082ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.initializer.n */
public final class C56784n implements AbstractC32846a {

    /* renamed from: a */
    private User f129343a;

    static {
        Covode.recordClassIndex(66649);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: a */
    public final String mo58658a() {
        return this.f129343a.getUniqueId();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: b */
    public final String mo58659b() {
        return this.f129343a.getShortId();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: c */
    public final String mo58660c() {
        return this.f129343a.getUid();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: d */
    public final String mo58661d() {
        return this.f129343a.getSecUid();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: e */
    public final boolean mo58662e() {
        return this.f129343a.isSecret();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: f */
    public final UrlModel mo58663f() {
        return this.f129343a.getAvatarThumb();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: g */
    public final UrlModel mo58664g() {
        return this.f129343a.getAvatarMedium();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: h */
    public final String mo58665h() {
        return this.f129343a.getNickname();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: i */
    public final String mo58666i() {
        return C80580in.m139690e(this.f129343a);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: k */
    public final boolean mo58668k() {
        return this.f129343a.isPostDefaultDownloadSetting();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: m */
    public final int mo58670m() {
        return this.f129343a.getFollowerCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: n */
    public final int mo58671n() {
        return this.f129343a.getFollowStatus();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: o */
    public final int mo58672o() {
        return this.f129343a.getFollowerStatus();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: p */
    public final boolean mo58673p() {
        return this.f129343a.isBlock;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: q */
    public final boolean mo58674q() {
        return this.f129343a.isBlocked();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: j */
    public final boolean mo58667j() {
        if (this.f129343a.getDownloadSetting() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a
    /* renamed from: l */
    public final boolean mo58669l() {
        if (this.f129343a.roomId > 0) {
            return true;
        }
        return false;
    }

    public C56784n(User user) {
        this.f129343a = user;
    }
}
