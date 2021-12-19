package com.p2082ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory */
public interface AudioSinkFactory {
    static {
        Covode.recordClassIndex(100387);
    }

    AudioSink create(String str);

    void destroy(AudioSink audioSink);

    int getBitWidth();

    int getChannelCount();

    int getIntervalMs();

    int getSampleRate();
}
