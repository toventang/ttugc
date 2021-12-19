package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.utils.AudioFrame;

/* renamed from: com.ss.bytertc.engine.IAudioFrameObserver */
public interface IAudioFrameObserver {
    static {
        Covode.recordClassIndex(100886);
    }

    void onMixedAudioFrame(AudioFrame audioFrame);

    void onPlaybackAudioFrame(AudioFrame audioFrame);

    void onPlaybackAudioFrameBeforeMixing(String str, AudioFrame audioFrame);

    void onRecordAudioFrame(AudioFrame audioFrame);
}
