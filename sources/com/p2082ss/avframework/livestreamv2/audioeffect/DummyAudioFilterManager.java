package com.p2082ss.avframework.livestreamv2.audioeffect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor;
import com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.DummyAudioFilterManager */
public class DummyAudioFilterManager extends IAudioFilterManager {
    static {
        Covode.recordClassIndex(100104);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public double getPitchShift() {
        return 0.0d;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void initEarMonitor() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public boolean isSupportHardWareEarMonitor() {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public String name() {
        return "DummyAudioFilter";
    }

    @Override // com.p2082ss.avframework.engine.AudioProcessor
    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        return buffer;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMVolume(float f) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setDRCEnable(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setEchoMode(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setLoopEnable(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMixerEnable(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMusicPitch(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setOriginEnable(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public void setPitchShift(double d) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(String str, String str2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setVoiceVolume(float f) {
    }
}
