package com.bytedance.crash.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.C14052g;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.crash.util.ab */
public final class C14042ab {

    /* renamed from: a */
    private static final StackTraceElement f34212a = new StackTraceElement("", "", "", 0);

    /* renamed from: a */
    public static void m25495a(Throwable th, int i) {
        String localizedMessage = th.getLocalizedMessage();
        try {
            m25494a(th.getClass().getName(), i);
            if (localizedMessage != null) {
                m25494a(": ", i);
                m25494a(localizedMessage, i);
            }
            m25494a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m25499a(Throwable th, List<StackTraceElement> list) {
        if (th != null) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            list.add(f34212a);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > 384;
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (z && i2 > 256) {
                    list.add(f34212a);
                    break;
                }
                list.add(stackTraceElement);
                i2++;
                i++;
            }
            if (z) {
                for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            for (Throwable th2 : th.getSuppressed()) {
                m25500a(th2, list, "\t", newSetFromMap, 128);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m25500a(cause, list, "", newSetFromMap, 128);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m25500a(java.lang.Throwable r7, java.util.List<java.lang.StackTraceElement> r8, java.lang.String r9, java.util.Set<java.lang.Throwable> r10, int r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14042ab.m25500a(java.lang.Throwable, java.util.List, java.lang.String, java.util.Set, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r7 != false) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m25497a(java.lang.Throwable r13, java.io.PrintWriter r14) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14042ab.m25497a(java.lang.Throwable, java.io.PrintWriter):void");
    }

    /* renamed from: a */
    public static void m25496a(Throwable th, int i, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                NativeTools.m25458a().mo22558a(i, str2);
                NativeTools.m25458a().mo22558a(i, str);
            } catch (Throwable unused) {
            }
            m25495a(th, i);
            for (StackTraceElement stackTraceElement : stackTrace) {
                m25493a(stackTraceElement, i);
            }
            int i2 = Build.VERSION.SDK_INT;
            Throwable[] suppressed = th.getSuppressed();
            int length = suppressed.length;
            for (int i3 = 0; i3 < length; i3++) {
                m25496a(suppressed[i3], i, "Suppressed: ", str2 + "\t");
            }
            th = th.getCause();
            if (th != null) {
                str = "Caused by: ";
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (r9 != false) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m25498a(java.lang.Throwable r15, java.io.PrintWriter r16, java.lang.String r17, java.lang.String r18, java.util.Set<java.lang.Throwable> r19, int r20) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14042ab.m25498a(java.lang.Throwable, java.io.PrintWriter, java.lang.String, java.lang.String, java.util.Set, int):void");
    }

    static {
        Covode.recordClassIndex(16109);
    }

    /* renamed from: a */
    public static String m25488a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m25497a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* renamed from: b */
    public static StackTraceElement[] m25502b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            m25499a(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    /* renamed from: c */
    public static boolean m25503c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (!(th instanceof OutOfMemoryError)) {
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
                if (th == null) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m25504d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (true) {
            try {
                if (th instanceof OutOfMemoryError) {
                    if (!th.getMessage().contains("allocate")) {
                        if (th.getMessage().contains("thrown")) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
                if (th == null) {
                    return false;
                }
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m25490a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m25487a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14042ab.m25487a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0027 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m25501b(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14042ab.m25501b(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public static String m25491a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            m25492a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m25494a(String str, int i) {
        NativeTools.m25458a().mo22558a(i, str);
    }

    /* renamed from: a */
    public static StringBuilder m25492a(StackTraceElement stackTraceElement, StringBuilder sb) {
        sb.append("  at ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
        return sb;
    }

    /* renamed from: a */
    public static void m25493a(StackTraceElement stackTraceElement, int i) {
        try {
            m25494a("\tat ", i);
            m25494a(stackTraceElement.getClassName(), i);
            m25494a(".", i);
            m25494a(stackTraceElement.getMethodName(), i);
            if (stackTraceElement.isNativeMethod()) {
                m25494a("(Native Method)", i);
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    m25494a("(", i);
                    m25494a(stackTraceElement.getFileName(), i);
                    m25494a(":", i);
                    m25494a(String.valueOf(stackTraceElement.getLineNumber()), i);
                    m25494a(")", i);
                } else {
                    m25494a("(", i);
                    m25494a(stackTraceElement.getFileName(), i);
                    m25494a(")", i);
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                m25494a("(Unknown Source:", i);
                m25494a(String.valueOf(stackTraceElement.getLineNumber()), i);
                m25494a(")", i);
            } else {
                m25494a("(Unknown Source)", i);
            }
            m25494a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m25489a(Throwable th, PrintStream printStream, C14052g.C14053a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        C14052g gVar = new C14052g(printStream, messageDigest, aVar);
        try {
            m25497a(th, gVar);
        } catch (Throwable unused2) {
        }
        gVar.close();
        if (messageDigest != null) {
            return m25490a(messageDigest.digest());
        }
        return null;
    }
}
