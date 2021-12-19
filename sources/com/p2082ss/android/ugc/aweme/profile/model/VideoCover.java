package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.VideoCover */
public final class VideoCover implements Serializable {
    @AbstractC27891c(mo46611a = "offset")
    private Integer offset;
    @AbstractC27891c(mo46611a = "video")
    private Video video;
    @AbstractC27891c(mo46611a = "video_id")
    private String videoId;

    static {
        Covode.recordClassIndex(75239);
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setVideo(Video video2) {
        this.video = video2;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
