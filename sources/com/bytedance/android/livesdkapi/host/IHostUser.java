package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.livesdkapi.depend.p684f.AbstractC11670a;
import com.bytedance.android.livesdkapi.depend.p684f.AbstractC11671b;
import com.bytedance.android.livesdkapi.host.p695c.AbstractC11800a;
import com.bytedance.android.livesdkapi.host.p695c.AbstractC11801b;
import com.bytedance.android.livesdkapi.model.C11839e;
import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IHostUser extends AbstractC2953a {
    public static final int MESSAGE_NICKNAME_DUPLICATE = 20014;
    public static final int MESSAGE_NICKNAME_DUPLICATE_2 = 20041;

    static {
        Covode.recordClassIndex(13489);
    }

    List<C11839e> getAllFriends();

    AbstractC2994b getCurUser();

    long getCurUserId();

    int getCurUserMode();

    boolean interceptOperation(String str);

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMinorMode();

    void login(ActivityC0945e eVar, AbstractC11800a aVar, String str, String str2, int i, String str3, String str4, String str5);

    void markAsOutOfDate(boolean z);

    void onFollowStatusChanged(int i, long j);

    void registerCurrentUserUpdateListener(AbstractC11671b bVar);

    void registerFollowStatusListener(AbstractC11670a aVar);

    void requestLivePermission(AbstractC11827c cVar);

    void setRoomAttrsAdminFlag(int i);

    void unFollowWithConfirm(Activity activity, int i, long j, AbstractC11801b bVar);

    void unRegisterCurrentUserUpdateListener(AbstractC11671b bVar);

    void unRegisterFollowStatusListener(AbstractC11670a aVar);

    void updateUser(AbstractC2994b bVar);
}
