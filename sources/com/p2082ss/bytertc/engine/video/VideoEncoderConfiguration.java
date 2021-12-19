package com.p2082ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.video.VideoEncoderConfiguration */
public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FrameRate frameRate;
    public int kBitrate;
    public OrientationMode orientationMode;

    static {
        Covode.recordClassIndex(101185);
    }

    /* renamed from: com.ss.bytertc.engine.video.VideoEncoderConfiguration$OrientationMode */
    public enum OrientationMode {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101186);
        }

        private OrientationMode(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "VideoEncoderConfiguration{dimensions=" + this.dimensions + ", frameRate=" + this.frameRate + ", bitrate=" + this.kBitrate + ", orienttationMode=" + this.orientationMode + '}';
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FrameRate frameRate2, int i, OrientationMode orientationMode2) {
        this.dimensions = videoDimensions;
        this.frameRate = frameRate2;
        this.kBitrate = i;
        this.orientationMode = orientationMode2;
    }
}
