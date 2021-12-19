package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.IAudioFrameObserver;
import com.p2082ss.bytertc.engine.data.AudioChannel;
import com.p2082ss.bytertc.engine.data.AudioSampleRate;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p2082ss.bytertc.engine.utils.AudioFrame;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.bytertc.engine.handler.RTCAudioFrameObserver */
public class RTCAudioFrameObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(101057);
    }

    public RTCAudioFrameObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public void onMixedAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onMixedAudioFrame(new AudioFrame(bArr, i, AudioSampleRate.fromId(i4), AudioChannel.fromId(i3)));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrame(new AudioFrame(bArr, i, AudioSampleRate.fromId(i4), AudioChannel.fromId(i3)));
        }
    }

    /* access modifiers changed from: package-private */
    public void onRecordAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onRecordAudioFrame(new AudioFrame(bArr, i, AudioSampleRate.fromId(i4), AudioChannel.fromId(i3)));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrameBeforeMixing(String str, byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (audioFrameObserver = rTCEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrameBeforeMixing(str, new AudioFrame(bArr, i, AudioSampleRate.fromId(i4), AudioChannel.fromId(i3)));
        }
    }
}
