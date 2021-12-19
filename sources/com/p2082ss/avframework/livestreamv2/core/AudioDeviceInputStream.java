package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.livestreamv2.IInputAudioStream;
import com.p2082ss.avframework.mixer.AudioMixer;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceInputStream */
public class AudioDeviceInputStream extends AudioSink implements IInputAudioStream {
    private final WeakReference<AudioDeviceModule> mAudioDeviceModule;
    public final IInputAudioStream mAudioStream;

    static {
        Covode.recordClassIndex(100180);
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public AudioTrack getAudioTrack() {
        return null;
    }

    @Override // com.p2082ss.avframework.engine.AudioSink
    public void onNoData() {
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceInputStream$RenderStream */
    class RenderStream implements IInputAudioStream {
        private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
        private boolean mStart;
        private float mVolume = 1.0f;

        static {
            Covode.recordClassIndex(100181);
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public AudioTrack getAudioTrack() {
            return null;
        }

        public AudioDeviceModule.AudioRenderSink getAudioRenderSink() {
            return this.mAudioRenderSink;
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public int getChannel() {
            return AudioDeviceInputStream.this.getChannel();
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public int getSample() {
            return AudioDeviceInputStream.this.getSample();
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public String name() {
            return AudioDeviceInputStream.this.name();
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public AudioMixer.AudioMixerDescription getMixerDescription() {
            AudioMixer.AudioMixerDescription audioMixerDescription = new AudioMixer.AudioMixerDescription();
            audioMixerDescription.volumeCoeff = this.mVolume;
            return audioMixerDescription;
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public void release() {
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public int start() {
            this.mStart = true;
            return AudioDeviceInputStream.this.start();
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public int stop() {
            this.mStart = false;
            return AudioDeviceInputStream.this.stop();
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
            AudioDeviceModule.AudioRenderSink audioRenderSink;
            if (audioMixerDescription != null && (audioRenderSink = this.mAudioRenderSink) != null) {
                audioRenderSink.setVolume(audioMixerDescription.volumeCoeff);
                this.mVolume = audioMixerDescription.volumeCoeff;
            }
        }

        public RenderStream(AudioDeviceModule.AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
        }

        @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            if (AudioDeviceInputStream.this.mAudioStream == null || !this.mStart) {
                return -1;
            }
            AudioDeviceInputStream.this.mAudioStream.pushAudioFrame(byteBuffer, i, i2, 16, i4, j);
            return 0;
        }
    }

    public IInputAudioStream getAudioRenderSink() {
        return this.mAudioStream;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int getChannel() {
        return this.mAudioStream.getChannel();
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public AudioMixer.AudioMixerDescription getMixerDescription() {
        return this.mAudioStream.getMixerDescription();
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int getSample() {
        return this.mAudioStream.getSample();
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public String name() {
        return this.mAudioStream.name();
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int start() {
        return this.mAudioStream.start();
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int stop() {
        return this.mAudioStream.stop();
    }

    public RenderStream createRenderSteream() {
        if (this.mAudioDeviceModule.get() != null) {
            return new RenderStream(this.mAudioDeviceModule.get().createRenderSink());
        }
        return null;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public synchronized void release() {
        MethodCollector.m26663i(167);
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            iInputAudioStream.release();
            if (this.mAudioDeviceModule.get() != null) {
                this.mAudioDeviceModule.get().getRenderMixer().removeAudioSink(this);
            }
        }
        MethodCollector.m26664o(167);
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
        this.mAudioStream.setMixerDescription(audioMixerDescription);
    }

    public AudioDeviceInputStream(AudioDeviceModule audioDeviceModule, IInputAudioStream iInputAudioStream) {
        WeakReference<AudioDeviceModule> weakReference = new WeakReference<>(audioDeviceModule);
        this.mAudioDeviceModule = weakReference;
        this.mAudioStream = iInputAudioStream;
        weakReference.get().getRenderMixer().addAudioSink(this);
    }

    @Override // com.p2082ss.avframework.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            iInputAudioStream.pushAudioFrame((ByteBuffer) buffer, i2, i3, 16, i * i3, j * 1000);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputAudioStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            return iInputAudioStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }
}
