package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.SubscribeState */
public enum SubscribeState {
    SUBSCRIBE_STATE_SUCCESS,
    SUBSCRIBE_STATE_FAILED_NOT_IN_ROOM,
    SUBSCRIBE_STATE_FAILED_STREAM_NOT_FOUND,
    SUBSCRIBE_STATE_FAILED_AUTO_MODE,
    SUBSCRIBE_STATE_FAILED_SIGNAL;

    static {
        Covode.recordClassIndex(100941);
    }
}
