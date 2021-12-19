package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.LongVideo */
public class LongVideo implements Serializable {
    @AbstractC27891c(mo46611a = "long_video_type")
    public int longVideoType;
    @AbstractC27891c(mo46611a = "trailer_start_time")
    public int trailerStartTime;
    @AbstractC27891c(mo46611a = "video")
    public Video video;
    @AbstractC27891c(mo46611a = "video_control")
    public VideoControl videoControl;

    static {
        Covode.recordClassIndex(58723);
    }

    public int getLongVideoType() {
        return this.longVideoType;
    }

    public int getTrailerStartTime() {
        return this.trailerStartTime;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public void setLongVideoType(int i) {
        this.longVideoType = i;
    }

    public void setTrailerStartTime(int i) {
        this.trailerStartTime = i;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }
}
