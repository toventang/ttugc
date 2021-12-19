package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.StreamUrlModel */
public class StreamUrlModel implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f114481id;
    @AbstractC27891c(mo46611a = "rtmp_pull_url")
    public String rtmpPullUrl;

    static {
        Covode.recordClassIndex(58758);
    }

    public String getId() {
        return this.f114481id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.f114481id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
