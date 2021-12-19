package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.hf */
public final class C80532hf {
    static {
        Covode.recordClassIndex(93805);
    }

    /* renamed from: a */
    public static final String m139602a(int i) {
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        StringBuilder sb = new StringBuilder();
        C89219l.m154716b(stackTrace, "");
        int length = stackTrace.length;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (i2 >= i) {
                return sb.toString();
            }
            sb.append("at " + stackTraceElement + '\n');
        }
        return sb.toString();
    }
}
