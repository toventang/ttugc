package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoDecoder;

final /* synthetic */ class VideoDecoderWrapper$$Lambda$0 implements VideoDecoder.Callback {
    private final long arg$1;

    static {
        Covode.recordClassIndex(106744);
    }

    VideoDecoderWrapper$$Lambda$0(long j) {
        this.arg$1 = j;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public final void onDecodedFrame(VideoFrame videoFrame) {
        VideoDecoderWrapper.lambda$createDecoderCallback$0$VideoDecoderWrapper(this.arg$1, videoFrame);
    }
}
