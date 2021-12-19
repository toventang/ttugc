package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55274d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserExtra */
public class UserExtra {
    @AbstractC27891c(mo46611a = "is_disable_show_follow_bar")
    private boolean isDisableShowFollowBar;
    private boolean isSayHelloLogger;
    @AbstractC27891c(mo46611a = "uid")
    String uid;

    static {
        Covode.recordClassIndex(63491);
    }

    public UserExtra() {
    }

    public boolean getIsDisableShowFollowBar() {
        return this.isDisableShowFollowBar;
    }

    public boolean getIsSayHelloLogger() {
        return this.isSayHelloLogger;
    }

    public String getUid() {
        return this.uid;
    }

    public void setIsDisableShowFollowBar(boolean z) {
        this.isDisableShowFollowBar = z;
    }

    public void setIsSayHelloLogger(boolean z) {
        this.isSayHelloLogger = z;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static boolean isDisableShowFollowBar(String str) {
        C55274d.m101066a();
        UserExtra a = C55274d.m101065a(str);
        if (a == null || !a.isDisableShowFollowBar) {
            return false;
        }
        return true;
    }

    public UserExtra(String str, boolean z, boolean z2) {
        this.uid = str;
        this.isDisableShowFollowBar = z;
        this.isSayHelloLogger = z2;
    }
}
