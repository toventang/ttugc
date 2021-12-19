package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.FriendTabStruct */
public class FriendTabStruct {
    @AbstractC27891c(mo46611a = "default_follow_tab")
    public boolean defaultFollowTab;
    @AbstractC27891c(mo46611a = "friend_tab_desc")
    public String friendTabDesc;

    static {
        Covode.recordClassIndex(80366);
    }

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
