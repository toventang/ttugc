package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RandomLinkMicSetting {
    @AbstractC27891c(mo46611a = "quickly_disconnected_ban_time")
    public int banTime = 30;
    @AbstractC27891c(mo46611a = "random_linkmic_bubble_strategy")
    public int bubbleStrategy = 2;
    @AbstractC27891c(mo46611a = "quickly_disconnected_judge")
    public DisconnectJudge disconnectJudge = new DisconnectJudge();
    @AbstractC27891c(mo46611a = "quickly_disconnected_time")
    public int disconnectTime = 10;

    public static class DisconnectJudge {
        @AbstractC27891c(mo46611a = "frequency")
        public int frequency = 10;
        @AbstractC27891c(mo46611a = "period")
        public int period = 10;

        static {
            Covode.recordClassIndex(11046);
        }
    }

    static {
        Covode.recordClassIndex(11045);
    }
}
