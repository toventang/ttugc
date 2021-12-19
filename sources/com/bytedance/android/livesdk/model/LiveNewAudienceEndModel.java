package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class LiveNewAudienceEndModel {
    @AbstractC27891c(mo46611a = "enable_count_down")
    public int enableCountDown;
    @AbstractC27891c(mo46611a = "enable")
    public int enableLab;
    @AbstractC27891c(mo46611a = "count_down_delay_time")
    public int timeCountDown = 3;
    @AbstractC27891c(mo46611a = "count_down_total_time")
    public int timeJumpRoom = 8;

    static {
        Covode.recordClassIndex(11041);
    }
}
