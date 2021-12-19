package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoItemInfo */
public final class VideoItemInfo extends DataBaseResponse {
    @AbstractC27891c(mo46611a = "video")
    private VideoItem videoItem;

    static {
        Covode.recordClassIndex(92131);
    }

    public final VideoItem getVideoItem() {
        return this.videoItem;
    }

    public final void setVideoItem(VideoItem videoItem2) {
        this.videoItem = videoItem2;
    }
}
