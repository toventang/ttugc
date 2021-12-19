package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class LiveCoreSDKData {
    @AbstractC27891c(mo46611a = "pull_data")
    PullData pullData;

    public static class Quality {
        @AbstractC27891c(mo46611a = StringSet.name)
        public String name;
        @AbstractC27891c(mo46611a = "sdk_key")
        public String sdkKey;

        static {
            Covode.recordClassIndex(13370);
        }
    }

    static {
        Covode.recordClassIndex(13367);
    }

    public static class Options {
        @AbstractC27891c(mo46611a = "default_preview_quality")
        Quality defaultPreviewQuality;
        @AbstractC27891c(mo46611a = "default_quality")
        Quality defaultQuality;
        @AbstractC27891c(mo46611a = "qualities")
        List<Quality> qualityList;

        static {
            Covode.recordClassIndex(13368);
        }

        public Quality getDefaultQuality() {
            return this.defaultQuality;
        }

        public List<Quality> getQualityList() {
            return this.qualityList;
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    public static class PullData {
        @AbstractC27891c(mo46611a = "options")
        Options options;
        @AbstractC27891c(mo46611a = "stream_data")
        String streamData;

        static {
            Covode.recordClassIndex(13369);
        }

        public Options getOptions() {
            return this.options;
        }

        public String getStreamData() {
            return this.streamData;
        }

        public void setOptions(Options options2) {
            this.options = options2;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public Quality getDefaultQuality() {
        PullData pullData2 = this.pullData;
        if (pullData2 == null || pullData2.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultQuality;
    }

    public List<Quality> getQualityList() {
        PullData pullData2 = this.pullData;
        if (pullData2 == null || pullData2.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().getQualityList();
    }

    public void setPullData(PullData pullData2) {
        this.pullData = pullData2;
    }
}
