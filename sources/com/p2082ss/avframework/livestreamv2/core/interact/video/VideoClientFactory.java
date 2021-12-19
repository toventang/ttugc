package com.p2082ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory */
public interface VideoClientFactory {
    static {
        Covode.recordClassIndex(100454);
    }

    VideoClient create();

    void destroy(VideoClient videoClient);
}
