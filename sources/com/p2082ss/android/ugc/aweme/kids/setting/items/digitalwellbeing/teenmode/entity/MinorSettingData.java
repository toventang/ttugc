package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.MinorSettingData */
public class MinorSettingData {
    @AbstractC27891c(mo46611a = "event_type")
    private int eventType;
    @AbstractC27891c(mo46611a = "event_value")
    private String eventValue;
    @AbstractC27891c(mo46611a = "password")
    private String password;

    static {
        Covode.recordClassIndex(67896);
    }

    public int getEventType() {
        return this.eventType;
    }

    public String getEventValue() {
        return this.eventValue;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEventType(int i) {
        this.eventType = i;
    }

    public void setEventValue(String str) {
        this.eventValue = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }
}
