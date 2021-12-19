package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IUserService */
public interface IUserService {
    static {
        Covode.recordClassIndex(60672);
    }

    void clearUser();

    boolean getAuthGoods();

    User getCurrentUser();

    String getCurrentUserID();

    boolean isLogin();

    boolean isOldUser();

    boolean isUserEmpty(User user);

    void logout();

    void logout(String str, String str2);

    void refreshUser();

    void setBroadcasterRoomId(long j);

    void setIsOldUser(boolean z);
}
