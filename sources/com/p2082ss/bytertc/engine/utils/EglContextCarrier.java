package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import org.webrtc.EglBase;

/* renamed from: com.ss.bytertc.engine.utils.EglContextCarrier */
public interface EglContextCarrier {
    static {
        Covode.recordClassIndex(101146);
    }

    EglBase.Context getEglBaseContext();

    void setEglBaseContext(EglBase.Context context);
}
