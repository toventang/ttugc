package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.FansStruct */
public class FansStruct implements Serializable {
    @AbstractC27891c(mo46611a = "fans_level")
    public int fansLevel;
    @AbstractC27891c(mo46611a = "fans_name")
    public String fansName;
    @AbstractC27891c(mo46611a = "is_fan")
    public boolean isFan;
    @AbstractC27891c(mo46611a = "light_up")
    public boolean lightUp;

    static {
        Covode.recordClassIndex(58790);
    }

    public int getFansLevel() {
        return this.fansLevel;
    }

    public String getFansName() {
        return this.fansName;
    }

    public boolean isFan() {
        return this.isFan;
    }

    public boolean isLightUp() {
        return this.lightUp;
    }

    public void setFan(boolean z) {
        this.isFan = z;
    }

    public void setFansLevel(int i) {
        this.fansLevel = i;
    }

    public void setFansName(String str) {
        this.fansName = str;
    }

    public void setLightUp(boolean z) {
        this.lightUp = z;
    }
}
