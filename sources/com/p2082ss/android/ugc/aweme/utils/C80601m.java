package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.m */
public final class C80601m {

    /* renamed from: a */
    public static final C80601m f180228a = new C80601m();

    private C80601m() {
    }

    static {
        Covode.recordClassIndex(93874);
    }

    /* renamed from: a */
    public static final String m139744a() {
        StringBuilder sb = new StringBuilder();
        Activity[] activityStack = ActivityStack.getActivityStack();
        int min = Math.min(activityStack.length, 10);
        for (int i = 0; i < min; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(activityStack[i].getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static final String m139745a(String[] strArr) {
        C89219l.m154721d(strArr, "");
        StringBuilder sb = new StringBuilder();
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = strArr[i];
                C89219l.m154716b(stackTraceElement, "");
                String className = stackTraceElement.getClassName();
                C89219l.m154716b(className, "");
                if (C89361p.m154874b(className, str, false)) {
                    if (!C89361p.m154870a((CharSequence) sb)) {
                        sb.append("\n");
                    }
                    sb.append(stackTraceElement.getClassName()).append("(").append(stackTraceElement.getMethodName()).append(":").append(stackTraceElement.getLineNumber()).append(")");
                } else {
                    i++;
                }
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
