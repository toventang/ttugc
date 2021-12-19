package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.GeneralPermission */
public class GeneralPermission implements Serializable {
    @AbstractC27891c(mo46611a = "following_follower_list_toast")
    public int followingFollowerListToast;
    @AbstractC27891c(mo46611a = "follow_toast")
    public int mFollowToast;
    @AbstractC27891c(mo46611a = "follow_toast_type")
    public int mFollowToastType;
    @AbstractC27891c(mo46611a = "original_list")
    public int mOriginalList;
    @AbstractC27891c(mo46611a = "profile_toast")
    public String mProfileToast;
    @AbstractC27891c(mo46611a = "share_profile_toast")
    public String mShareProfileToast;
    @AbstractC27891c(mo46611a = "share_toast")
    public int mShareToast;
    @AbstractC27891c(mo46611a = "shop_toast")
    public int mShopToast;

    static {
        Covode.recordClassIndex(75174);
    }

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getFollowToastType() {
        return this.mFollowToastType;
    }

    public int getFollowingFollowerListToast() {
        return this.followingFollowerListToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public String getProfileToast() {
        return this.mProfileToast;
    }

    public String getShareProfileToast() {
        return this.mShareProfileToast;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }
}
