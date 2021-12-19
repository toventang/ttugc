package com.bytedance.ies.xelement.p1364b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.b.k */
public enum EnumC19010k {
    PLAYBACK_STATE_START("start"),
    PLAYBACK_STATE_PLAYING("play"),
    PLAYBACK_STATE_PAUSED("pause"),
    PLAYBACK_STATE_STOPPED("stop"),
    PLAYBACK_STATE_ENDED("ended"),
    PLAYBACK_STATE_ERROR("error");
    

    /* renamed from: b */
    private final String f44977b;

    public final String getDesc() {
        return this.f44977b;
    }

    static {
        Covode.recordClassIndex(21759);
    }

    private EnumC19010k(String str) {
        this.f44977b = str;
    }
}
