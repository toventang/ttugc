package com.bytedance.apm.agent.instrumentation.p756io;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource */
public interface StreamCompleteListenerSource {
    static {
        Covode.recordClassIndex(14042);
    }

    void addStreamCompleteListener(StreamCompleteListener streamCompleteListener);

    void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener);
}
