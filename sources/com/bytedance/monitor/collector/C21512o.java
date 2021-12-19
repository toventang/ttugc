package com.bytedance.monitor.collector;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.monitor.collector.o */
public final class C21512o {

    /* renamed from: a */
    public static boolean f51059a;

    static {
        Covode.recordClassIndex(25139);
    }

    /* renamed from: a */
    public static String m40409a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            sb.append("\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m40410b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            sb.append("\\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m40408a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            if (split.length == 2) {
                str2 = split[1];
            } else {
                str2 = "";
            }
            if (str.contains("{") && str.contains("}")) {
                String str3 = str.split("\\{")[0];
                try {
                    str = str3 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str3;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }
}
