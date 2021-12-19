package com.p2082ss.avframework.capture.audio;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.capture.audio.AudioCapturerFromADM */
public class AudioCapturerFromADM extends AudioCapturer {
    private AudioDeviceModule mAdm;
    private int mMode;
    AudioCapturer.AudioCaptureObserver mObserver;
    private int mStat;

    static {
        Covode.recordClassIndex(99865);
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void pause() {
        super.pause();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.pause();
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void resume() {
        super.resume();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.resume();
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void stop() {
        this.mAdm.stopRecording();
        this.mStat = 2;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mAdm.getParameter().getInt("audio_channels");
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.m26663i(3844);
        super.release();
        this.mAdm = null;
        MethodCollector.m26664o(3844);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void start() {
        int startRecording = this.mAdm.startRecording();
        if (startRecording == 0) {
            this.mStat = 1;
            return;
        }
        throw new IllegalStateException("Start adm audio record failure (" + startRecording + ")");
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void mute(boolean z) {
        this.mMute = z;
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicMute(z);
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void setOutputFormat(int i, int i2, int i3) {
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("audio_channels", i2);
            parameter.setInt("audio_sample", i);
            this.mAdm.setParameter(parameter);
        }
    }

    public AudioCapturerFromADM(int i, AudioDeviceModule audioDeviceModule, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAdm = audioDeviceModule;
        this.mObserver = audioCaptureObserver;
        audioDeviceModule.setAudioCaptureObserver(audioCaptureObserver);
        this.mAdm.setParameter(this.mAdm.getParameter());
        setMode(i);
    }
}
