package com.bytedance.android.livesdk.live.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import java.util.Map;

public class RoomSlideUpGuide {
    @AbstractC27891c(mo46611a = "max_show_times")
    private int maxShowTimes;
    @AbstractC27891c(mo46611a = "play_times")
    private int playTimes;
    @AbstractC27891c(mo46611a = "switch")
    private Map<String, Boolean> switchs = new HashMap();

    static {
        Covode.recordClassIndex(10229);
    }

    public int getMaxShowTimes() {
        return this.maxShowTimes;
    }

    public int getPlayTimes() {
        return this.playTimes;
    }

    public static RoomSlideUpGuide defaultInstance() {
        RoomSlideUpGuide roomSlideUpGuide = new RoomSlideUpGuide();
        roomSlideUpGuide.playTimes = 3;
        roomSlideUpGuide.maxShowTimes = 2;
        roomSlideUpGuide.switchs = new HashMap();
        return roomSlideUpGuide;
    }

    public boolean isGuideEnable(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Boolean> map = this.switchs;
        if (map != null) {
            bool = map.get(str);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
