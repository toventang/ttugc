package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AbstractC9517ad;
import com.bytedance.android.livesdk.model.AbstractC9917y;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.C9584d;
import com.bytedance.android.livesdk.model.C9587g;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.user.b */
public interface AbstractC2994b {
    static {
        Covode.recordClassIndex(3456);
    }

    boolean childrenManagerForbidWalletFunctions();

    C9584d getAnchorInfo();

    AbstractC9917y getAnchorLevel();

    C9587g getAuthenticationInfo();

    String getAutoGraph();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getBackgroundImgUrl();

    List<ImageModel> getBadgeImageList();

    long getCreateTime();

    String getDisplayId();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    long getId();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    String getNickName();

    User.C2992b getOwnRoom();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    int getStatus();

    List<User> getTopFans();

    int getTopVipNo();

    C9542az getUserAttr();

    List<ImageModel> getUserBadges();

    AbstractC9517ad getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isFollowing();

    boolean isVerified();

    void setFollowStatus(int i);

    void setUserAttr(C9542az azVar);

    /* renamed from: com.bytedance.android.live.base.model.user.b$a */
    public enum EnumC2995a {
        Login,
        Logout,
        Update;

        static {
            Covode.recordClassIndex(3457);
        }
    }
}
