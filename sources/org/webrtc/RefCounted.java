package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface RefCounted {
    static {
        Covode.recordClassIndex(106692);
    }

    void release();

    void retain();
}
