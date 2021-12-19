package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomExtra */
public class RoomExtra implements Serializable {
    @AbstractC27891c(mo46611a = "config")
    public RoomConfig config;
    @AbstractC27891c(mo46611a = "with_promotion")
    public boolean withPromotion;

    static {
        Covode.recordClassIndex(58813);
    }

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}
