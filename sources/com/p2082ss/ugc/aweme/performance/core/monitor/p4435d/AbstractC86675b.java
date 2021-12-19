package com.p2082ss.ugc.aweme.performance.core.monitor.p4435d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86667c;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.b */
public interface AbstractC86675b {
    static {
        Covode.recordClassIndex(101903);
    }

    void flush(C86667c cVar);

    void onJankHappened(String str, long j, long j2, long j3);

    void onMessageArrive(String str, long j);

    void onMessageLeave(String str, long j);

    void setThreshold(long j);
}
