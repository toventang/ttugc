package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.be */
public final class C73986be {
    static {
        Covode.recordClassIndex(86736);
    }

    /* renamed from: a */
    public static final String m130119a() {
        StringBuilder sb = new StringBuilder();
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        for (StackTraceElement stackTraceElement : currentThread.getStackTrace()) {
            sb.append(stackTraceElement.toString()).append("\n");
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
