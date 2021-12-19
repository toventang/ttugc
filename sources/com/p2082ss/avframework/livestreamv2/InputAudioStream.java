package com.p2082ss.avframework.livestreamv2;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.livestreamv2.capture.AudioCapturerExternal;
import com.p2082ss.avframework.mixer.AudioMixer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.InputAudioStream */
class InputAudioStream implements AudioCapturer.AudioCaptureObserver, IInputAudioStream {
    private AudioCapturerExternal mAudioCapturer;
    private AudioMixer.AudioMixerDescription mAudioMixerDescription = new AudioMixer.AudioMixerDescription();
    private AudioTrack mAudioTrack;
    private int mChannel;
    private Handler mHandler;
    private Observer mObserver;
    private int mSample;

    /* renamed from: com.ss.avframework.livestreamv2.InputAudioStream$Observer */
    public interface Observer {
        static {
            Covode.recordClassIndex(100022);
        }

        void releaseInputStream(InputAudioStream inputAudioStream);

        void updateVolume(InputAudioStream inputAudioStream);
    }

    static {
        Covode.recordClassIndex(100021);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public AudioTrack getAudioTrack() {
        return this.mAudioTrack;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int getChannel() {
        return this.mChannel;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public AudioMixer.AudioMixerDescription getMixerDescription() {
        return this.mAudioMixerDescription;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int getSample() {
        return this.mSample;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public String name() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.mo132293id();
        }
        return "";
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int start() {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal == null) {
            return 0;
        }
        audioCapturerExternal.start();
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int stop() {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal == null) {
            return 0;
        }
        audioCapturerExternal.stop();
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public synchronized void release() {
        MethodCollector.m26663i(230);
        stop();
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.releaseInputStream(this);
        }
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            audioCapturerExternal.release();
            this.mAudioCapturer = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.mAudioTrack = null;
        }
        MethodCollector.m26664o(230);
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
        if (audioMixerDescription != null) {
            this.mAudioMixerDescription = audioMixerDescription;
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.updateVolume(this);
            }
        }
    }

    InputAudioStream(MediaEngineFactory mediaEngineFactory, Observer observer, int i, int i2, Handler handler) {
        AudioCapturerExternal audioCapturerExternal = new AudioCapturerExternal(i, i2, 16, handler, this);
        this.mAudioCapturer = audioCapturerExternal;
        this.mAudioTrack = mediaEngineFactory.createAudioTrack(audioCapturerExternal);
        this.mObserver = observer;
        this.mSample = i;
        this.mChannel = i2;
        this.mHandler = handler;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            return audioCapturerExternal.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }
}
