package com.p2082ss.ugc.aweme.performance.core.monitor.p4437f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.f.b */
public final class C86679b {

    /* renamed from: a */
    public static final C86679b f195382a = new C86679b();

    private C86679b() {
    }

    static {
        Covode.recordClassIndex(101907);
    }

    /* renamed from: b */
    public static StackTraceElement[] m150155b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return null;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (C86678a.m150153a(stackTraceElement)) {
                stackTraceElementArr2[i] = stackTraceElement;
                i++;
            }
        }
        return stackTraceElementArr2;
    }

    /* renamed from: a */
    public static String m150154a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                C89219l.m154719c(stackTraceElement, "");
                C89219l.m154719c(sb, "");
                sb.append("  at ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
            }
        }
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }
}
