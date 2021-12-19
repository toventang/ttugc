package com.bytedance.apm.agent.instrumentation.p756io;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener */
public interface StreamCompleteListener {
    static {
        Covode.recordClassIndex(14040);
    }

    void streamComplete(StreamCompleteEvent streamCompleteEvent);

    void streamError(StreamCompleteEvent streamCompleteEvent);
}
