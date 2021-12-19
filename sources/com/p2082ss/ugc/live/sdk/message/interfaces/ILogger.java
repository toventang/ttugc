package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.ILogger */
public interface ILogger {
    static {
        Covode.recordClassIndex(102860);
    }

    void log(String str, String str2);

    boolean supportDebugInfo();
}
