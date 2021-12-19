package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.webrtc.VideoDecoder;

/* access modifiers changed from: package-private */
public class VideoDecoderWrapper {
    static long nativeVideoDecoder;

    static {
        Covode.recordClassIndex(106743);
    }

    private static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame);

    private static native void nativeSetDecoderInitCostTime(long j, long j2);

    VideoDecoderWrapper() {
    }

    static VideoDecoder.Callback createDecoderCallback(long j) {
        nativeVideoDecoder = j;
        return new VideoDecoderWrapper$$Lambda$0(j);
    }

    public static void SetDecoderInitCostTime(long j) {
        MethodCollector.m26663i(477);
        long j2 = nativeVideoDecoder;
        if (j2 != 0) {
            nativeSetDecoderInitCostTime(j2, j);
        }
        MethodCollector.m26664o(477);
    }

    static final /* synthetic */ void lambda$createDecoderCallback$0$VideoDecoderWrapper(long j, VideoFrame videoFrame) {
        MethodCollector.m26663i(482);
        nativeOnDecodedFrame(j, videoFrame);
        MethodCollector.m26664o(482);
    }
}
