package com.p2082ss.android.ugc.aweme.p2719cv;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.cv.p */
public class C40794p {

    /* renamed from: a */
    private static volatile Field f95517a;

    /* renamed from: b */
    private static volatile Field f95518b;

    static {
        Covode.recordClassIndex(48646);
    }

    C40794p() {
    }

    /* renamed from: a */
    static String m82278a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: b */
    static Object m82281b(Object obj) {
        MethodCollector.m26663i(5083);
        try {
            if (f95517a == null) {
                synchronized (C40794p.class) {
                    try {
                        if (f95517a == null) {
                            Field declaredField = obj.getClass().getDeclaredField("callable");
                            f95517a = declaredField;
                            declaredField.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5083);
                        throw th;
                    }
                }
            }
            Object obj2 = f95517a.get(obj);
            MethodCollector.m26664o(5083);
            return obj2;
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(5083);
            return null;
        }
    }

    /* renamed from: c */
    private static Object m82282c(Object obj) {
        MethodCollector.m26663i(5086);
        try {
            if (f95518b == null) {
                synchronized (C40794p.class) {
                    try {
                        if (f95518b == null) {
                            Field declaredField = obj.getClass().getDeclaredField("task");
                            f95518b = declaredField;
                            declaredField.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5086);
                        throw th;
                    }
                }
            }
            Object obj2 = f95518b.get(obj);
            MethodCollector.m26664o(5086);
            return obj2;
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(5086);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m82280a(Class cls) {
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "bolts.TaskCompletionSource".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m82277a(Object obj) {
        Object c;
        Object b;
        if ((obj instanceof FutureTask) && (b = m82281b(obj)) != null) {
            obj = b;
        }
        if ("java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName()) && (c = m82282c(obj)) != null) {
            obj = c;
        }
        StringBuilder sb = new StringBuilder();
        if (!m82280a((Class) obj.getClass())) {
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf("@");
            if (indexOf > 0) {
                obj2 = obj2.substring(0, indexOf);
            }
            sb.append(obj2).append(",");
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 != null) {
                    Class<?> cls = obj3.getClass();
                    if (!m82280a((Class) cls)) {
                        String name = cls.getName();
                        int indexOf2 = name.indexOf("@");
                        if (indexOf2 > 0) {
                            name = name.substring(0, indexOf2);
                        }
                        sb.append(name).append(",");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString().replaceAll("class ", "");
    }

    /* renamed from: a */
    static String m82279a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.contains("libcore.io") && !className.contains("java.io") && !className.contains("android.database.sqlite") && !className.contains("android.database.AbstractCursor") && !className.contains("dalvik.system") && !className.contains("android.os") && !className.contains("com.ss.android.ugc.conan") && !className.contains("com.lody.whale")) {
                    String methodName = stackTraceElement.getMethodName();
                    if (!methodName.equals("getThreadStackTrace") && !methodName.equals("getStackTrace")) {
                        sb.append("\tat ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
                    }
                }
            }
        }
        return sb.toString();
    }
}
