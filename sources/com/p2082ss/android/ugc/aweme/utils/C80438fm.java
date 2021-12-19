package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.ss.android.ugc.aweme.utils.fm */
public final class C80438fm extends AbstractC21721e {
    static {
        Covode.recordClassIndex(93706);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "PerformanceFinalizeFix";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        if (th instanceof TimeoutException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getClassName().startsWith("java.lang.Daemons") && "doFinalize".equals(stackTraceElement.getMethodName())) {
                    C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                    return true;
                }
            }
        }
        return false;
    }
}
