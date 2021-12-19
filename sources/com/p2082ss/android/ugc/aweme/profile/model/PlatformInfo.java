package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.PlatformInfo */
public class PlatformInfo implements Serializable {
    @AbstractC27891c(mo46611a = "full_synced")
    public boolean fullSynced;
    @AbstractC27891c(mo46611a = "nickname")
    public String nickName;
    @AbstractC27891c(mo46611a = "platform_name")
    public String patformName;

    static {
        Covode.recordClassIndex(75194);
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
