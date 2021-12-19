package com.bytedance.apm.p789q;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.bytedance.apm.q.r */
public final class C12598r {
    static {
        Covode.recordClassIndex(14415);
    }

    /* renamed from: b */
    public static String m22723b(Throwable th) {
        return m22721a(th, 30);
    }

    /* renamed from: a */
    public static String m22720a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            cause.printStackTrace(printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                cause2.printStackTrace(printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2.length() > 1024) {
            return stringWriter2.substring(0, 1024);
        }
        return stringWriter2;
    }

    /* renamed from: a */
    public static String m22722a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            throw new IllegalArgumentException("stackTraceElements must not be null or empty");
        }
        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
        int i = 0;
        while (i < stackTraceElementArr.length && i <= 40) {
            if (i == 0) {
                if ("getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) {
                    i++;
                }
            } else if (i == 1 && "getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                i++;
            }
            sb.append("\tat " + stackTraceElementArr[i].getClassName()).append(".").append(stackTraceElementArr[i].getMethodName()).append("(").append(stackTraceElementArr[i].getFileName()).append(":").append(stackTraceElementArr[i].getLineNumber()).append(")\n");
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m22721a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            i2++;
            sb.append("\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
            if (i2 > i) {
                break;
            }
        }
        return sb.toString();
    }
}
