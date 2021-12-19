package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.LiveAnchorInfo */
public class LiveAnchorInfo implements Serializable {
    @AbstractC27891c(mo46611a = "scheduled_master_switch")
    private boolean globalSwitch;
    @AbstractC27891c(mo46611a = "scheduled_profile_switch")
    private boolean profileSwitch;
    @AbstractC27891c(mo46611a = "scheduled_time_text")
    private String scheduledTimeText;

    static {
        Covode.recordClassIndex(75186);
    }

    public String getScheduledTimeText() {
        return this.scheduledTimeText;
    }

    public boolean isGlobalSwitch() {
        return this.globalSwitch;
    }

    public boolean isProfileSwitch() {
        return this.profileSwitch;
    }

    public void setGlobalSwitch(boolean z) {
        this.globalSwitch = z;
    }

    public void setProfileSwitch(boolean z) {
        this.profileSwitch = z;
    }

    public void setScheduledTimeText(String str) {
        this.scheduledTimeText = str;
    }
}
