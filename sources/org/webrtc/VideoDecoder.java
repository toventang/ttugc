package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface VideoDecoder {

    public interface Callback {
        static {
            Covode.recordClassIndex(106740);
        }

        void onDecodedFrame(VideoFrame videoFrame);
    }

    static {
        Covode.recordClassIndex(106738);
    }

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage);

    String getImplementationName();

    boolean getPrefersLateDecoding();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        static {
            Covode.recordClassIndex(106741);
        }

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final boolean output_by_dts;
        public final int width;

        static {
            Covode.recordClassIndex(106742);
        }

        public Settings(int i, int i2, int i3, boolean z) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.output_by_dts = z;
        }
    }
}
