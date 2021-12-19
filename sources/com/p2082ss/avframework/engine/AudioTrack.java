package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.avframework.engine.AudioTrack */
public class AudioTrack extends MediaTrack {
    private AudioProcessor mAudioProcessor;

    static {
        Covode.recordClassIndex(99966);
    }

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public synchronized void release() {
        MethodCollector.m26663i(1802);
        super.release();
        AudioProcessor audioProcessor = this.mAudioProcessor;
        if (audioProcessor != null) {
            audioProcessor.release();
            this.mAudioProcessor = null;
        }
        MethodCollector.m26664o(1802);
    }

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public void addAudioSink(AudioSink audioSink) {
        super.addAudioSink(audioSink);
    }

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public void removeAudioSink(AudioSink audioSink) {
        super.removeAudioSink(audioSink);
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        MethodCollector.m26663i(1717);
        this.mAudioProcessor = audioProcessor;
        nativeSetAudioProcessor(audioProcessor);
        MethodCollector.m26664o(1717);
    }

    public AudioTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
