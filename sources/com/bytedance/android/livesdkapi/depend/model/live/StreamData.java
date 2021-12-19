package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class StreamData {
    @AbstractC27891c(mo46611a = "data")
    StreamDataContent data;

    public static class StreamDataContent {
        @AbstractC27891c(mo46611a = "origin")
        StreamDataOrigin defaultQuality;

        static {
            Covode.recordClassIndex(13376);
        }
    }

    public static class StreamDataOrigin {
        @AbstractC27891c(mo46611a = "main")
        StreamDataOriginMain main;

        static {
            Covode.recordClassIndex(13377);
        }
    }

    public static class StreamDataOriginMain {
        @AbstractC27891c(mo46611a = "sdk_params")
        String sdkParams;

        static {
            Covode.recordClassIndex(13378);
        }
    }

    static {
        Covode.recordClassIndex(13375);
    }

    public static class StreamDataOriginMainSDKParams {
        @AbstractC27891c(mo46611a = "resolution")
        String resolution;

        static {
            Covode.recordClassIndex(13379);
        }

        public int getHeight() {
            if (TextUtils.isEmpty(this.resolution)) {
                return 0;
            }
            String[] split = TextUtils.split(this.resolution, "x");
            if (split.length > 0) {
                return Integer.parseInt(split[split.length - 1]);
            }
            return 0;
        }

        public int getWidth() {
            if (!TextUtils.isEmpty(this.resolution)) {
                String[] split = TextUtils.split(this.resolution, "x");
                if (split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            }
            return 0;
        }
    }

    public String getStreamDataOriginMain() {
        StreamDataContent streamDataContent = this.data;
        if (streamDataContent == null || streamDataContent.defaultQuality == null || this.data.defaultQuality.main == null || this.data.defaultQuality.main.sdkParams == null) {
            return null;
        }
        return this.data.defaultQuality.main.sdkParams;
    }
}
