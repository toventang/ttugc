package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.runtime.p933a.C13978a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.b */
public final class C14044b {

    /* renamed from: a */
    public static String f34213a;

    /* renamed from: b */
    private static Class<?> f34214b;

    /* renamed from: c */
    private static Field f34215c;

    /* renamed from: d */
    private static Field f34216d;

    /* renamed from: e */
    private static boolean f34217e;

    static {
        Covode.recordClassIndex(16111);
    }

    /* renamed from: a */
    private static long m25509a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    /* renamed from: a */
    public static String m25511a() {
        String str = f34213a;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: b */
    private static String m25516b() {
        BufferedReader bufferedReader;
        MethodCollector.m26663i(2061);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(2061);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C14061m.m25588a(bufferedReader);
                MethodCollector.m26664o(2061);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C14061m.m25588a(bufferedReader);
            MethodCollector.m26664o(2061);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m25515a(Context context) {
        if (context == null) {
            if (!C13978a.m25303a().f34085v) {
                return true;
            }
            return false;
        } else if (C13978a.m25303a().f34085v || m25523f(context)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public static String m25521d(Context context) {
        Class<?> g = m25524g(context);
        if (f34215c == null && g != null) {
            try {
                f34215c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f34215c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m25522e(Context context) {
        Class<?> g = m25524g(context);
        if (f34216d == null && g != null) {
            try {
                f34216d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f34216d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* renamed from: g */
    private static Class<?> m25524g(Context context) {
        if (f34214b == null && !f34217e) {
            try {
                f34214b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f34217e = true;
        }
        return f34214b;
    }

    /* renamed from: c */
    public static String m25520c(Context context) {
        if (!TextUtils.isEmpty(f34213a)) {
            return f34213a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) m25510a(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        f34213a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String b = m25516b();
        f34213a = b;
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: a */
    private static void m25513a(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m25509a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m25509a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m25509a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m25509a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m25509a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m25509a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m25509a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m25509a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m25509a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C14048e.f34226a.mo22585a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m25509a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C14048e.f34226a.mo22586b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m25509a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m25509a(C14048e.f34226a.mo22587c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: b */
    public static boolean m25518b(Context context) {
        String c = m25520c(context);
        if (c == null || c.contains(":") || c == null || (!c.equals(context.getPackageName()) && !c.equals(context.getApplicationInfo().processName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m25523f(Context context) {
        List<ActivityManager.RunningTaskInfo> list;
        ComponentName componentName;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) m25510a(context, "activity");
            if (activityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 21) {
                Pair<Boolean, Object> a = C15346a.m28238a(activityManager, new Object[]{1}, 101301, "java.util.List", false, null);
                if (((Boolean) a.first).booleanValue()) {
                    list = (List) a.second;
                } else {
                    list = activityManager.getRunningTasks(1);
                    C15346a.m28240a(list, activityManager, new Object[]{1}, 101301, "com_bytedance_crash_util_App_android_app_ActivityManager_getRunningTasks(Landroid/app/ActivityManager;I)Ljava/util/List;");
                }
                if (list == null || list.isEmpty() || (componentName = list.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) {
                    return false;
                }
                return true;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        return packageName.equals(runningAppProcessInfo.pkgList[0]);
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m25512a(Context context, JSONObject jSONObject) {
        try {
            m25513a(jSONObject);
            ActivityManager activityManager = (ActivityManager) m25510a(context, "activity");
            if (activityManager != null) {
                m25517b(jSONObject, activityManager);
            }
            m25514a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m25519b(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (!str.equals(context.getPackageName()) && !str.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m25517b(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", C14065p.f34247a.mo22593a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static Object m25510a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2020);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2020);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static void m25514a(JSONObject jSONObject, ActivityManager activityManager) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        JSONObject jSONObject2 = new JSONObject();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / 1048576;
        boolean z5 = true;
        if (nativeHeapAllocatedSize > 200) {
            z = true;
        } else {
            z = false;
        }
        C13864b.m25056a(jSONObject, "filters", "native_heap_leak", String.valueOf(z));
        if (nativeHeapAllocatedSize > 300) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13864b.m25056a(jSONObject, "filters", "native_heap_leak_300M", String.valueOf(z2));
        if (nativeHeapAllocatedSize > 500) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13864b.m25056a(jSONObject, "filters", "native_heap_leak_500M", String.valueOf(z3));
        if (nativeHeapAllocatedSize > 800) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13864b.m25056a(jSONObject, "filters", "native_heap_leak_800M", String.valueOf(z4));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        if (((float) (j - freeMemory)) <= ((float) maxMemory) * 0.95f) {
            z5 = false;
        }
        C13864b.m25056a(jSONObject, "filters", "java_heap_leak", String.valueOf(z5));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }
}
