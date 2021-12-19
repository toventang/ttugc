package com.p2082ss.bytertc.engine.data;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.VideoStreamDescription;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import com.p2082ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.util.Arrays;

/* renamed from: com.ss.bytertc.engine.data.RTCData */
public class RTCData {
    private VideoEncoderConfiguration.OrientationMode mOrientationMode;
    private VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    static {
        Covode.recordClassIndex(100981);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.data.RTCData$SingletonHelper */
    public static class SingletonHelper {
        public static final RTCData INSTANCE = new RTCData();

        private SingletonHelper() {
        }

        static {
            Covode.recordClassIndex(100982);
        }
    }

    public static RTCData instance() {
        return SingletonHelper.INSTANCE;
    }

    public VideoEncoderConfiguration.OrientationMode getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public RTCData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(640, 360);
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE;
    }

    public void setOrientationMode(VideoEncoderConfiguration.OrientationMode orientationMode) {
        this.mOrientationMode = orientationMode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        LogUtil.m147888i("RTCData", "setVideoStreamDescriptions: " + Arrays.toString(videoStreamDescriptionArr));
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
