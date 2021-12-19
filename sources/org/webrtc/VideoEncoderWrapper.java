package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import org.webrtc.VideoEncoder;

class VideoEncoderWrapper {
    static {
        Covode.recordClassIndex(106751);
    }

    private static native void nativeOnEncodedFrame(long j, ByteBuffer byteBuffer, int i, int i2, long j2, int i3);

    VideoEncoderWrapper() {
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f205066on;
    }

    static VideoEncoder.Callback createEncoderCallback(long j) {
        return new VideoEncoderWrapper$$Lambda$0(j);
    }

    static final /* synthetic */ void lambda$createEncoderCallback$0$VideoEncoderWrapper(long j, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        MethodCollector.m26663i(2838);
        nativeOnEncodedFrame(j, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative());
        MethodCollector.m26664o(2838);
    }
}
