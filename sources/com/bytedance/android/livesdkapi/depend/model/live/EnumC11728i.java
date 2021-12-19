package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.i */
public enum EnumC11728i {
    VIDEO("video_live", false, true),
    AUDIO(DataType.AUDIO, false, false),
    THIRD_PARTY("third_party", true, false),
    SCREEN_RECORD("screen_share", true, false),
    LIVE_STUDIO("live_studio", false, false),
    OFFICIAL_ACTIVITY("official_activity", false, false);
    
    @AbstractC27891c(mo46611a = "isStreamingBackground")
    public final boolean isStreamingBackground;
    @AbstractC27891c(mo46611a = "isUsingCamera")
    public final boolean isUsingCamera;
    @AbstractC27891c(mo46611a = "logStreamingType")
    public final String logStreamingType;

    public final String getModeFromServer() {
        if (this == VIDEO) {
            return "live";
        }
        if (this == SCREEN_RECORD) {
            return "live_by_record";
        }
        if (this == THIRD_PARTY) {
            return "computer";
        }
        return "";
    }

    static {
        Covode.recordClassIndex(13416);
    }

    public static EnumC11728i valueOf(int i) {
        if (i < 0 || i >= values().length) {
            return VIDEO;
        }
        return values()[i];
    }

    private EnumC11728i(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
