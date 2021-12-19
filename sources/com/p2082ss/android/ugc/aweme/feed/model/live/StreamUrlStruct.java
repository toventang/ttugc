package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct */
public class StreamUrlStruct implements Serializable {
    @AbstractC27891c(mo46611a = "live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public LiveStreamUrlExtra liveStreamUrlExtra;
    @AbstractC27891c(mo46611a = "candidate_resolution")
    public ArrayList<String> mCandidateResolutionList;
    @AbstractC27891c(mo46611a = "default_resolution")
    public String mDefaultResolution;
    @AbstractC27891c(mo46611a = "flv_pull_url")
    public HashMap<String, String> mFlvPullUrlMap;
    @AbstractC27891c(mo46611a = "provider")
    public int provider;
    @AbstractC27891c(mo46611a = "rtmp_pull_url")
    public String rtmp_pull_url;
    @AbstractC27891c(mo46611a = "rtmp_push_url")
    public String rtmp_push_url;
    public String sdkParams = "";
    @AbstractC27891c(mo46611a = "sid")
    public long sid;

    static {
        Covode.recordClassIndex(58817);
    }

    public String toString() {
        return "StreamUrlStruct{sid=" + this.sid + ", rtmp_pull_url='" + this.rtmp_pull_url + '\'' + ", rtmp_push_url='" + this.rtmp_push_url + '\'' + ", provider=" + this.provider + ", mFlvPullUrlMap=" + this.mFlvPullUrlMap + ", mCandidateResolutionList=" + this.mCandidateResolutionList + ", mDefaultResolution='" + this.mDefaultResolution + '\'' + ", liveCoreSDKData=" + this.liveCoreSDKData + ", liveStreamUrlExtra=" + this.liveStreamUrlExtra + '}';
    }
}
