package com.p2082ss.bytertc.engine.live;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.live.ILiveTranscodingObserver */
public interface ILiveTranscodingObserver {
    static {
        Covode.recordClassIndex(101066);
    }

    boolean isSupportClientPushStream();

    void onDataFrame(byte[] bArr, long j);

    void onMixingAudioFrame(byte[] bArr, int i);

    void onMixingVideoFrame(VideoFrame videoFrame);

    void onStreamMixingEvent(int i, String str, int i2, int i3);

    /* renamed from: com.ss.bytertc.engine.live.ILiveTranscodingObserver$StreamMixingType */
    public enum StreamMixingType {
        StreamMixingTypeByServer,
        StreamMixingTypeByClient;

        static {
            Covode.recordClassIndex(101068);
        }
    }

    /* renamed from: com.ss.bytertc.engine.live.ILiveTranscodingObserver$StreamMixingEvent */
    public enum StreamMixingEvent {
        StreamMixingChangeMixeType,
        StreamMixingFirstAudioFrameByClientMixer,
        StreamMixingFirstVideoFrameByClientMixer,
        StreamMixingStart,
        StreamMixingStartFailed,
        StreamMixingStartSuccess,
        StreamMixingStop,
        StreamMixingStopTimeout,
        StreamMixingUpdateTimeout;

        static {
            Covode.recordClassIndex(101067);
        }
    }
}
