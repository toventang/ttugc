package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod */
public final class TPLoginMethod extends BaseLoginMethod {
    private boolean loginFromFeedPage;
    private final String platform;
    private TPUserInfo userInfo;

    static {
        Covode.recordClassIndex(38717);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo) {
        this(str, str2, tPUserInfo, false, null, null, null, null, 248, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z) {
        this(str, str2, tPUserInfo, z, null, null, null, null, 240, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo) {
        this(str, str2, tPUserInfo, z, commonUserInfo, null, null, null, 224, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l, null, null, 192, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l, l2, null, 128, null);
    }

    public final boolean getLoginFromFeedPage() {
        return this.loginFromFeedPage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setLoginFromFeedPage(boolean z) {
        this.loginFromFeedPage = z;
    }

    public final void setUserInfo(TPUserInfo tPUserInfo) {
        C89219l.m154721d(tPUserInfo, "");
        this.userInfo = tPUserInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public final void updateUserInfo(User user) {
        C89219l.m154721d(user, "");
        super.updateUserInfo(user);
        if (!(!C89219l.m154714a((Object) user.getUid(), (Object) getUid()))) {
            this.userInfo = TPUserInfo.C31965a.m66333a(user);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        super(str, LoginMethodName.THIRD_PARTY, commonUserInfo, null, l, l2, bool, null, null, 392, null);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(tPUserInfo, "");
        C89219l.m154721d(commonUserInfo, "");
        this.platform = str2;
        this.userInfo = tPUserInfo;
        this.loginFromFeedPage = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, int i, C89214g gVar) {
        this(str, str2, tPUserInfo, (i & 8) != 0 ? false : z, (i & 16) != 0 ? CommonUserInfo.C31964a.m66331a() : commonUserInfo, (i & 32) != 0 ? -1L : l, (i & 64) != 0 ? -1L : l2, (i & 128) != 0 ? false : bool);
    }
}
