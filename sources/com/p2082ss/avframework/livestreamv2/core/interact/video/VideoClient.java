package com.p2082ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.Statistics;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.video.VideoClient */
public interface VideoClient {
    static {
        Covode.recordClassIndex(100453);
    }

    Statistics getStatistics();

    void prepare(VideoCallback videoCallback);

    void release();

    void start();

    void stop();
}
