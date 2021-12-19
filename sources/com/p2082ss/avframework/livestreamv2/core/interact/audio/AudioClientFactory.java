package com.p2082ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory */
public interface AudioClientFactory {
    static {
        Covode.recordClassIndex(100385);
    }

    AudioClient create();

    void destroy(AudioClient audioClient);

    int getBitWidth();

    int getChannelCount();

    int getSampleRate();
}
