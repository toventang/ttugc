package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IUserDepend;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.ab */
public final class C37662ab implements IUserDepend {
    static {
        Covode.recordClassIndex(45095);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getAvatarURL() {
        IAccountUserService e;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null) {
            return null;
        }
        return e.getAvatarUrl();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getNickname() {
        IAccountUserService e;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null) {
            return null;
        }
        return e.getNickName();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getSecUid() {
        IAccountUserService e;
        User curUser;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null || (curUser = e.getCurUser()) == null) {
            return null;
        }
        return curUser.getSecUid();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getUniqueID() {
        IAccountUserService e;
        User curUser;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null || (curUser = e.getCurUser()) == null) {
            return null;
        }
        return curUser.getUniqueId();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getUserId() {
        IAccountUserService e;
        User curUser;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null || (curUser = e.getCurUser()) == null) {
            return null;
        }
        return curUser.getUid();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final boolean hasBoundPhone() {
        IAccountUserService e;
        User curUser;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null || (curUser = e.getCurUser()) == null) {
            return false;
        }
        return curUser.isPhoneBinded();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final boolean hasLogin() {
        IAccountUserService e;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null) {
            return false;
        }
        return e.isLogin();
    }
}
