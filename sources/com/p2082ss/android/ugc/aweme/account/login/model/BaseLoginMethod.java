package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import java.util.Date;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod */
public class BaseLoginMethod {
    private Boolean allowOneKeyLogin;
    private CommonUserInfo commonUserInfo;
    private Date expires;
    private Boolean isFromReInstallNet;
    private Boolean isTransToNormal;
    private Long lastActiveTime;
    private LoginMethodName loginMethodName;
    private Long loginTime;
    private String uid;

    static {
        Covode.recordClassIndex(38710);
    }

    public BaseLoginMethod() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final Boolean getAllowOneKeyLogin() {
        return this.allowOneKeyLogin;
    }

    public final CommonUserInfo getCommonUserInfo() {
        return this.commonUserInfo;
    }

    public Date getExpires() {
        return this.expires;
    }

    public final Long getLastActiveTime() {
        return this.lastActiveTime;
    }

    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    public final Long getLoginTime() {
        return this.loginTime;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Boolean isFromReInstallNet() {
        return this.isFromReInstallNet;
    }

    public final Boolean isTransToNormal() {
        return this.isTransToNormal;
    }

    public final boolean isExpired() {
        return new Date().after(getExpires());
    }

    public final void setAllowOneKeyLogin(Boolean bool) {
        this.allowOneKeyLogin = bool;
    }

    public final void setCommonUserInfo(CommonUserInfo commonUserInfo2) {
        this.commonUserInfo = commonUserInfo2;
    }

    public final void setFromReInstallNet(Boolean bool) {
        this.isFromReInstallNet = bool;
    }

    public final void setLastActiveTime(Long l) {
        this.lastActiveTime = l;
    }

    public final void setLoginTime(Long l) {
        this.loginTime = l;
    }

    public final void setTransToNormal(Boolean bool) {
        this.isTransToNormal = bool;
    }

    public final void allowOneKeyLogin(boolean z) {
        this.allowOneKeyLogin = Boolean.valueOf(z);
    }

    public void setExpires(Date date) {
        C89219l.m154721d(date, "");
        this.expires = date;
    }

    public void setLoginMethodName(LoginMethodName loginMethodName2) {
        C89219l.m154721d(loginMethodName2, "");
        this.loginMethodName = loginMethodName2;
    }

    public final void setUid(String str) {
        C89219l.m154721d(str, "");
        this.uid = str;
    }

    public void updateUserInfo(C80053c cVar) {
        String str;
        C89219l.m154721d(cVar, "");
        if (!(!C89219l.m154714a((Object) cVar.f179384a, (Object) this.uid))) {
            String str2 = cVar.f179387d;
            String str3 = cVar.f179388e;
            CommonUserInfo commonUserInfo2 = this.commonUserInfo;
            if (commonUserInfo2 != null) {
                str = commonUserInfo2.getSecUid();
            } else {
                str = null;
            }
            this.commonUserInfo = new CommonUserInfo(str2, str3, str, null, 8, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateUserInfo(com.p2082ss.android.ugc.aweme.profile.model.User r10) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod.updateUserInfo(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(loginMethodName2, "");
        C89219l.m154721d(date, "");
        this.uid = str;
        this.loginMethodName = loginMethodName2;
        this.commonUserInfo = commonUserInfo2;
        this.expires = date;
        this.loginTime = l;
        this.lastActiveTime = l2;
        this.allowOneKeyLogin = bool;
        this.isFromReInstallNet = bool2;
        this.isTransToNormal = bool3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LoginMethodName.DEFAULT : loginMethodName2, (i & 4) != 0 ? CommonUserInfo.C31964a.m66331a() : commonUserInfo2, (i & 8) != 0 ? new Date(System.currentTimeMillis() + 2592000000L) : date, (i & 16) != 0 ? -1L : l, (i & 32) != 0 ? -1L : l2, (i & 64) != 0 ? false : bool, (i & 128) != 0 ? false : bool2, (i & 256) != 0 ? false : bool3);
    }
}
