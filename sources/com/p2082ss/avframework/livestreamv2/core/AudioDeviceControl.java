package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceControl */
public class AudioDeviceControl implements IAudioDeviceControl {
    private AudioDeviceModule mAudioDeviceModule;
    private List<AudioLayer> mLayers = new ArrayList();

    static {
        Covode.recordClassIndex(100178);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack[] getTracks() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public float getVolume() {
        return 0.0f;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public void setVolume(float f) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceControl$AudioLayer */
    public class AudioLayer implements IAudioDeviceControl.IAudioTrack {
        private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
        private int mChannel;
        private final String mName;
        private int mSampleHz;
        public int mTrackId;
        private float mVolumeCoeff = 1.0f;

        static {
            Covode.recordClassIndex(100179);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public int getChannel() {
            return this.mChannel;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public int getSampleHz() {
            return this.mSampleHz;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public float getVolume() {
            return this.mVolumeCoeff;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public String name() {
            return this.mName;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public long getQuirks() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.getQuirks();
            }
            return 0;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean isEnableAGC() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isEnableAGC();
            }
            return false;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean isMute() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isMute();
            }
            return true;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void dispose() {
            AudioDeviceControl.this.removeTrack(name());
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.release();
                this.mAudioRenderSink = null;
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setAudioTrack(AudioTrack audioTrack) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setAudioTrack(audioTrack);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setQuirks(long j) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setQuirks(j);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public double getOption(int i) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.getOption(i);
            }
            return 0.0d;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean setMute(boolean z) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink == null) {
                return true;
            }
            audioRenderSink.setMute(z);
            return true;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setVolume(float f) {
            this.mVolumeCoeff = f;
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setVolume(f);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void enableAGC(boolean z, boolean z2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setEnableAGC(z, z2);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void onData(ByteBuffer byteBuffer, int i, long j) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i, this.mSampleHz, this.mChannel, j / 1000000);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i3, i, i2, j / 1000000);
            }
        }

        public AudioLayer(String str, int i, int i2, int i3, AudioDeviceModule.AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
            this.mName = str;
            this.mTrackId = audioRenderSink.getRenderTrackId();
            this.mSampleHz = i;
            this.mChannel = i2;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean isEnableAEC() {
        return this.mAudioDeviceModule.isEnableBuiltInAEC();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean isEnableEcho() {
        return this.mAudioDeviceModule.isEchoMode();
    }

    public void release() {
        MethodCollector.m26663i(2713);
        synchronized (this.mLayers) {
            while (!this.mLayers.isEmpty()) {
                try {
                    AudioLayer remove = this.mLayers.remove(0);
                    if (remove != null) {
                        remove.dispose();
                    }
                } finally {
                    MethodCollector.m26664o(2713);
                }
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean enableAEC(boolean z) {
        this.mAudioDeviceModule.enableBuiltInAEC(z);
        return true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public boolean enableEcho(boolean z) {
        this.mAudioDeviceModule.enableEchoMode(z);
        return true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack getTrack(String str) {
        return findTrack(str);
    }

    public AudioDeviceControl(AudioDeviceModule audioDeviceModule) {
        this.mAudioDeviceModule = audioDeviceModule;
    }

    private void addTrack(AudioLayer audioLayer) {
        MethodCollector.m26663i(2696);
        synchronized (this.mLayers) {
            try {
                this.mLayers.add(audioLayer);
            } finally {
                MethodCollector.m26664o(2696);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public void setOriginTriggering(String str) {
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            this.mAudioDeviceModule.getRenderMixer().setOriginTrackIndex(findTrack.mTrackId);
        }
    }

    private AudioLayer findTrack(String str) {
        MethodCollector.m26663i(2704);
        synchronized (this.mLayers) {
            try {
                for (AudioLayer audioLayer : this.mLayers) {
                    if (audioLayer.name().equals(str)) {
                        return audioLayer;
                    }
                }
                MethodCollector.m26664o(2704);
                return null;
            } finally {
                MethodCollector.m26664o(2704);
            }
        }
    }

    public void removeTrack(String str) {
        MethodCollector.m26663i(2693);
        synchronized (this.mLayers) {
            try {
                Iterator<AudioLayer> it = this.mLayers.iterator();
                while (it.hasNext()) {
                    if (it.next().name().equals(str)) {
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.m26664o(2693);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack createTrack(String str, int i, int i2, int i3) {
        if (str == null) {
            return null;
        }
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            AVLog.logKibana(6, "AudioDeviceControl", "Audio render with name " + str + " already exists", null);
            return findTrack;
        }
        AudioLayer audioLayer = new AudioLayer(str, i, i2, i3, this.mAudioDeviceModule.createRenderSink());
        addTrack(audioLayer);
        return audioLayer;
    }
}
