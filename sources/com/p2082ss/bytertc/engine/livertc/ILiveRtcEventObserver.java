package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.RTCStream;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;

/* renamed from: com.ss.bytertc.engine.livertc.ILiveRtcEventObserver */
public interface ILiveRtcEventObserver {
    static {
        Covode.recordClassIndex(101078);
    }

    void onLiveTranscodingResult(String str, int i);

    void onStreamAdd(RTCStream rTCStream);

    void onStreamRemove(RTCStream rTCStream, IRTCEngineEventHandler.StreamRemoveReason streamRemoveReason);
}
