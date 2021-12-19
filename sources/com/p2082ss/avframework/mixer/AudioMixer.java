package com.p2082ss.avframework.mixer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioSink;

/* renamed from: com.ss.avframework.mixer.AudioMixer */
public class AudioMixer extends NativeMixer {
    static {
        Covode.recordClassIndex(100640);
    }

    private native void nativeAddAudioSink(long j, AudioSink audioSink);

    private native void nativeAudioMixerRelease(long j);

    private native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    @Override // com.p2082ss.avframework.mixer.Mixer
    public boolean isAudioMixer() {
        return true;
    }

    /* renamed from: com.ss.avframework.mixer.AudioMixer$AudioMixerDescription */
    public static class AudioMixerDescription {
        public float volumeCoeff;

        static {
            Covode.recordClassIndex(100641);
        }

        public float getColumeCoeff() {
            return this.volumeCoeff;
        }

        public AudioMixerDescription() {
            this.volumeCoeff = 1.0f;
        }

        public AudioMixerDescription(float f) {
            this.volumeCoeff = f;
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(1054);
        if (this.mNativeObj != 0) {
            nativeAudioMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
        MethodCollector.m26664o(1054);
    }

    public AudioMixer(long j) {
        setNativeObj(j);
    }

    public int createTrack(AudioMixerDescription audioMixerDescription) {
        return super.nativeCreateTrack(audioMixerDescription);
    }

    public AudioMixerDescription getDescription(int i) {
        return (AudioMixerDescription) super.nativeGetDescription(i);
    }

    public void addAudioSink(AudioSink audioSink) {
        MethodCollector.m26663i(1050);
        if (audioSink != null) {
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
        MethodCollector.m26664o(1050);
    }

    public void removeAudioSink(AudioSink audioSink) {
        MethodCollector.m26663i(1053);
        if (audioSink != null) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
        MethodCollector.m26664o(1053);
    }

    public void updateDescription(int i, AudioMixerDescription audioMixerDescription) {
        super.nativeUpdateDescription(i, audioMixerDescription);
    }
}
