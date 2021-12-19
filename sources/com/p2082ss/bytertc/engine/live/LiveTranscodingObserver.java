package com.p2082ss.bytertc.engine.live;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import java.lang.ref.WeakReference;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.live.LiveTranscodingObserver */
public class LiveTranscodingObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(101077);
    }

    public boolean isSupportClientPushStream() {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl == null || (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) == null) {
            return false;
        }
        return liveTranscodingObserver.isSupportClientPushStream();
    }

    public LiveTranscodingObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onMixingVideoFrame(VideoFrame videoFrame) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onMixingVideoFrame(videoFrame);
        }
    }

    public void onDataFrame(byte[] bArr, long j) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onDataFrame(bArr, j);
        }
    }

    public void onMixingAudioFrame(byte[] bArr, int i) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onMixingAudioFrame(bArr, i);
        }
    }

    public void onStreamMixingEvent(int i, String str, int i2, int i3) {
        ILiveTranscodingObserver liveTranscodingObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (liveTranscodingObserver = rTCEngineImpl.getLiveTranscodingObserver()) != null) {
            liveTranscodingObserver.onStreamMixingEvent(i, str, i2, i3);
        }
    }
}
