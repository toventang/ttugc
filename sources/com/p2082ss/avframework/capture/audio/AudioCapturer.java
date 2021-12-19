package com.p2082ss.avframework.capture.audio;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioSource;

/* renamed from: com.ss.avframework.capture.audio.AudioCapturer */
public abstract class AudioCapturer extends AudioSource {
    private int mMode = 1;
    protected boolean mMute;

    /* renamed from: com.ss.avframework.capture.audio.AudioCapturer$AudioCaptureObserver */
    public interface AudioCaptureObserver {
        static {
            Covode.recordClassIndex(99862);
        }

        void onAudioCaptureError(int i, Exception exc);
    }

    static {
        Covode.recordClassIndex(99861);
    }

    public void pause() {
    }

    public void resume() {
    }

    public abstract void start();

    public abstract void stop();

    public abstract int updateChannel();

    public int getMode() {
        return this.mMode;
    }

    public boolean isMute() {
        return this.mMute;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource
    public synchronized void release() {
        super.release();
    }

    public void setAudioQuantizeGapPeriod(long j) {
        nativeSetAudioQuantizeGapPeriod(j);
    }

    public void setMode(int i) {
        this.mMode = i;
    }

    public void setVolume(double d) {
        nativeSetVolume(d);
    }

    public void mute(boolean z) {
        this.mMute = z;
        nativeSetMute(z);
    }

    public void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }
}
