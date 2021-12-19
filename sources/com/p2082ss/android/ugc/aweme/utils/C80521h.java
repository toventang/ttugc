package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;

/* renamed from: com.ss.android.ugc.aweme.utils.h */
public final class C80521h extends AbstractC21721e {

    /* renamed from: b */
    public static boolean f180136b;

    static {
        Covode.recordClassIndex(93794);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "ActivityTrimMemoryExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        if (th instanceof ArrayIndexOutOfBoundsException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTrimMemory".equals(stackTraceElement.getMethodName())) {
                    f180136b = true;
                    return true;
                }
            }
        }
        return false;
    }
}
