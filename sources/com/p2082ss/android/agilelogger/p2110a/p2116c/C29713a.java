package com.p2082ss.android.agilelogger.p2110a.p2116c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.agilelogger.a.c.a */
public final class C29713a implements AbstractC29714b {
    static {
        Covode.recordClassIndex(36110);
    }

    @Override // com.p2082ss.android.agilelogger.p2110a.AbstractC29704b
    /* renamed from: a */
    public final /* synthetic */ String mo51950a(Object obj) {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        StringBuilder sb = new StringBuilder(256);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            return "\t─ " + stackTraceElementArr[0].toString();
        }
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append("\n");
            }
            if (i != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append("\n");
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i].toString());
            }
        }
        return sb.toString();
    }
}
