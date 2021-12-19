package com.bytedance.apm.block.p766a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.block.a.l */
public final class C12383l {

    /* renamed from: a */
    public final StackTraceElement[] f29866a;

    static {
        Covode.recordClassIndex(14189);
    }

    public C12383l(StackTraceElement[] stackTraceElementArr) {
        this.f29866a = stackTraceElementArr;
    }

    /* renamed from: a */
    public static List<String> m22240a(C12383l[] lVarArr) {
        StackTraceElement[] stackTraceElementArr;
        ArrayList arrayList = new ArrayList();
        if (lVarArr != null && lVarArr.length > 0) {
            for (C12383l lVar : lVarArr) {
                if (!(lVar == null || (stackTraceElementArr = lVar.f29866a) == null || stackTraceElementArr.length <= 0)) {
                    arrayList.add(m22239a(stackTraceElementArr));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m22239a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
        int i = 0;
        while (i < stackTraceElementArr.length && i <= 40) {
            if (i == 0) {
                "getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName());
            } else if (i == 1) {
                if (!"getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                }
            } else if (i > 3) {
                sb.append("\tat ").append(stackTraceElementArr[i].getClassName()).append(".").append(stackTraceElementArr[i].getMethodName()).append("(").append(stackTraceElementArr[i].getFileName()).append(":").append(stackTraceElementArr[i].getLineNumber()).append(")\n");
            }
            i++;
        }
        return sb.toString();
    }
}
