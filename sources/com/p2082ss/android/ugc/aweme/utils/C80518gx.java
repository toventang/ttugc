package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;

/* renamed from: com.ss.android.ugc.aweme.utils.gx */
public final class C80518gx extends AbstractC21721e {
    static {
        Covode.recordClassIndex(93791);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "SecurityExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        if (th instanceof SecurityException) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("com.google.android.gms.common.internal.BaseGmsClient".equals(stackTraceElement.getClassName()) && "a".equals(stackTraceElement.getMethodName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
