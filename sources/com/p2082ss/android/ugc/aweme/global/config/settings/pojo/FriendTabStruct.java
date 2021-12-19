package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FriendTabStruct */
public class FriendTabStruct {
    @AbstractC27891c(mo46611a = "default_follow_tab")
    private Boolean defaultFollowTab;
    @AbstractC27891c(mo46611a = "friend_tab_desc")
    private String friendTabDesc;

    static {
        Covode.recordClassIndex(62356);
    }

    public Boolean getDefaultFollowTab() {
        Boolean bool = this.defaultFollowTab;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public String getFriendTabDesc() {
        String str = this.friendTabDesc;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
