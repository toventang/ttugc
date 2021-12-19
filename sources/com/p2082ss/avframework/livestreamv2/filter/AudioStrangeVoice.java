package com.p2082ss.avframework.livestreamv2.filter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.effect.EffectWrapper;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.filter.AudioStrangeVoice */
class AudioStrangeVoice extends IAudioStrangeVoice {
    private EffectWrapper mEffect;
    private AudioDeviceModule.AudioRenderSink mPlayer;

    static {
        Covode.recordClassIndex(100457);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioStrangeVoice
    public void release() {
        super.release();
        this.mEffect = null;
        this.mPlayer = null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioStrangeVoice
    public int setAudioStrangeResource(String str) {
        EffectWrapper effectWrapper = this.mEffect;
        if (effectWrapper == null) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return effectWrapper.setAudioEffectConfig(str);
    }

    public AudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, EffectWrapper effectWrapper, int i, int i2) {
        this.mEffect = effectWrapper;
        this.mPlayer = audioRenderSink;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioStrangeVoice
    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        EffectWrapper effectWrapper;
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        if (this.mEnable && (effectWrapper = this.mEffect) != null && effectWrapper.processStrangeVoice(buffer, i, i2, i3, j) == 0 && this.mIsPlayerMode && (audioRenderSink = this.mPlayer) != null) {
            audioRenderSink.onData(buffer, i, i2, i3, j);
        }
        return buffer;
    }
}
