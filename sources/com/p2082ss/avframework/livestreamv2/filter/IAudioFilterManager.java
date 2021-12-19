package com.p2082ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.filter.IAudioFilterManager */
public abstract class IAudioFilterManager extends AudioEffectProcessor {
    protected boolean mEnable;

    static {
        Covode.recordClassIndex(100534);
    }

    public IAudioStrangeVoice getAudioStrangeVoice() {
        return null;
    }

    public double getPitchShift() {
        return 0.0d;
    }

    public boolean isDummy() {
        return true;
    }

    public abstract String name();

    public void setPitchShift(double d) {
    }

    public void setTranspose(int i) {
    }

    public void setVoiceAccompanySourceLufs(float f) {
    }

    public void setVoiceAccompanySourcePeak(float f) {
    }

    public void setVoiceAccompanyTargetLufs(float f) {
    }

    public void setVoiceTargetLufs(float f) {
    }

    public void start() {
    }

    public void stop() {
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public static IAudioFilterManager create(Context context, Handler handler, AudioDeviceModule audioDeviceModule, LiveStreamBuilder liveStreamBuilder, IFilterManager iFilterManager) {
        if (audioDeviceModule != null) {
            return new LiveCoreKaraokFilter(audioDeviceModule, handler, liveStreamBuilder, iFilterManager);
        }
        return new IAudioFilterManager() {
            /* class com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager.C859741 */

            static {
                Covode.recordClassIndex(100535);
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void initEarMonitor() {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final boolean isSupportHardWareEarMonitor() {
                return false;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
            public final String name() {
                return "dummy";
            }

            @Override // com.p2082ss.avframework.engine.AudioProcessor
            public final Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
                return buffer;
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str, long j) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str, String str2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMMusic(String str, String str2, long j) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setBGMVolume(float f) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setDRCEnable(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setEchoMode(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setLoopEnable(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setMixerEnable(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setMusicPitch(int i) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setOriginEnable(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setTuningParams(String str) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setTuningParams(String str, String str2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
            public final void setVoiceVolume(float f) {
            }
        };
    }
}
