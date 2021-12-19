package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.services.BaseUserService */
public class BaseUserService implements IUserService {
    static {
        Covode.recordClassIndex(79595);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public void clearUser() {
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public void refreshUser() {
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public boolean getAuthGoods() {
        return C31575b.m65865g().getAuthGoods();
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public User getCurrentUser() {
        return C31575b.m65865g().getCurUser();
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public String getCurrentUserID() {
        return C31575b.m65865g().getCurUserId();
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public boolean isLogin() {
        return C31575b.m65865g().isLogin();
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public void logout() {
        C31575b.m65860b().logout("expired_logout", "sdk_expired_logout");
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public boolean isOldUser() {
        return SharePrefCache.inst().getIsOldUser().mo59941c().booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public boolean isUserEmpty(User user) {
        return C31575b.m65865g().isUserEmpty(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public void setBroadcasterRoomId(long j) {
        C31575b.m65865g().getCurUser().setBroadcasterRoomId(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public void setIsOldUser(boolean z) {
        SharePrefCache.inst().getIsOldUser().mo59940b(Boolean.valueOf(z));
    }

    public static IUserService createIUserServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(13008);
        Object a = C81908b.m141854a(IUserService.class, z);
        if (a != null) {
            IUserService iUserService = (IUserService) a;
            MethodCollector.m26664o(13008);
            return iUserService;
        }
        if (C81908b.f183342dm == null) {
            synchronized (IUserService.class) {
                try {
                    if (C81908b.f183342dm == null) {
                        C81908b.f183342dm = new BaseUserService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13008);
                    throw th;
                }
            }
        }
        BaseUserService baseUserService = (BaseUserService) C81908b.f183342dm;
        MethodCollector.m26664o(13008);
        return baseUserService;
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IUserService
    public void logout(String str, String str2) {
        C31575b.m65860b().logout(str, str2);
    }
}
