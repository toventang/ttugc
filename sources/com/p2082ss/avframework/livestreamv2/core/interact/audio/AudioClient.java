package com.p2082ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.Statistics;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.audio.AudioClient */
public interface AudioClient {
    static {
        Covode.recordClassIndex(100384);
    }

    Statistics getStatistics();

    void prepare(AudioCallback audioCallback);

    void release();

    void start();

    void stop();
}
