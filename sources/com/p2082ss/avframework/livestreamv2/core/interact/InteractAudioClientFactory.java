package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.livestreamv2.core.InteractEngine;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioClientFactory */
class InteractAudioClientFactory implements AudioClientFactory {
    private int mChannelCount = 44100;
    InteractEngine mEngine;
    private int mSampleRate = 2;

    static {
        Covode.recordClassIndex(100355);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getBitWidth() {
        return 16;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getChannelCount() {
        int i;
        MethodCollector.m26663i(3149);
        synchronized (this) {
            try {
                i = this.mChannelCount;
            } finally {
                MethodCollector.m26664o(3149);
            }
        }
        return i;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getSampleRate() {
        int i;
        MethodCollector.m26663i(3148);
        synchronized (this) {
            try {
                i = this.mSampleRate;
            } finally {
                MethodCollector.m26664o(3148);
            }
        }
        return i;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public AudioClient create() {
        AVLog.m147805d("InteractAudioClientFactory", "Create audio client ");
        if (this.mEngine.getBuilder().getLiveCoreBuilder() == null) {
            return null;
        }
        InteractAudioClient interactAudioClient = new InteractAudioClient(this.mChannelCount, this.mSampleRate, this.mEngine.getBuilder().isEnableRtcPushStatics());
        this.mEngine.addAudioFrameAvailableListener(interactAudioClient);
        return interactAudioClient;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public void destroy(AudioClient audioClient) {
        AVLog.m147805d("InteractAudioClientFactory", "Destroy audio client ");
        this.mEngine.removeAudioFrameAvailableListener((InteractAudioClient) audioClient);
    }

    public InteractAudioClientFactory(InteractEngine interactEngine) {
        this.mEngine = interactEngine;
        LiveCore.Builder liveCoreBuilder = interactEngine.getBuilder().getLiveCoreBuilder();
        if (liveCoreBuilder != null) {
            this.mChannelCount = liveCoreBuilder.getAudioChannel();
            this.mSampleRate = liveCoreBuilder.getAudioSampleHZ();
        }
    }
}
