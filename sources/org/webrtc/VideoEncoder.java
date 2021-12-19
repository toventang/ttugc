package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface VideoEncoder {

    public interface Callback {
        static {
            Covode.recordClassIndex(106746);
        }

        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class CodecSpecificInfo {
        static {
            Covode.recordClassIndex(106747);
        }
    }

    static {
        Covode.recordClassIndex(106745);
    }

    VideoCodecStatus encode(VideoFrame videoFrame, boolean z);

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    VideoCodecStatus release();

    VideoCodecStatus requestKeyFrame();

    VideoCodecStatus setRateAllocation(int i, int i2);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* renamed from: on */
        public final boolean f205066on;

        private ScalingSettings() {
        }

        static {
            Covode.recordClassIndex(106749);
        }

        public String toString() {
            if (this.f205066on) {
                return "[ " + this.low + ", " + this.high + " ]";
            }
            return "OFF";
        }

        public ScalingSettings(boolean z) {
            this.f205066on = z;
        }

        public ScalingSettings(int i, int i2) {
            this.f205066on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.f205066on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);
        
        private int value;

        static {
            Covode.recordClassIndex(106748);
        }

        static ScaleMode fromValue(int i) {
            if (i == 0) {
                return AUTO;
            }
            if (i == 1) {
                return STRETCH;
            }
            if (i == 2) {
                return FIT_WITH_CROPPING;
            }
            if (i != 3) {
                return AUTO;
            }
            return FIT_WITH_FILLING;
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public static class Settings {
        public final int height;
        public final int matrixId;
        public final int maxQp;
        public final int minQp;
        public final int primaryId;
        public final int rangeId;
        public final ScaleMode scaleMode;
        public final int targetBps;
        public final int targetFps;
        public final int transferId;
        public final int width;

        static {
            Covode.recordClassIndex(106750);
        }

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.width = i;
            this.height = i2;
            this.scaleMode = ScaleMode.fromValue(i3);
            this.targetBps = i4;
            this.targetFps = i5;
            this.primaryId = i6;
            this.transferId = i7;
            this.matrixId = i8;
            this.rangeId = i9;
            this.maxQp = i10;
            this.minQp = i11;
        }
    }
}
