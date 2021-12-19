package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.ttnet.org.chromium.base.metrics.C87469a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SysUtils {

    /* renamed from: a */
    static final /* synthetic */ boolean f198312a = true;

    /* renamed from: b */
    private static Boolean f198313b;

    /* renamed from: c */
    private static Integer f198314c;

    /* renamed from: d */
    private static C87469a.C87470a f198315d = new C87469a.C87470a("Android.SysUtilsLowEndMatches");

    private static native void nativeLogPageFaultCountToTracing();

    private SysUtils() {
    }

    static {
        Covode.recordClassIndex(103360);
    }

    public static boolean isCurrentlyLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) m151754a(C87445c.f198342a, "activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* renamed from: a */
    private static int m151753a() {
        MethodCollector.m26663i(7753);
        Pattern compile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.find()) {
                            int parseInt = Integer.parseInt(matcher.group(1));
                            if (parseInt <= 1024) {
                                matcher.group(1);
                            } else {
                                bufferedReader.close();
                                fileReader.close();
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                MethodCollector.m26664o(7753);
                                return parseInt;
                            }
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        MethodCollector.m26664o(7753);
                        throw th;
                    }
                }
                bufferedReader.close();
                fileReader.close();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                MethodCollector.m26664o(7753);
                return 0;
            } catch (Throwable th2) {
                fileReader.close();
                MethodCollector.m26664o(7753);
                throw th2;
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            MethodCollector.m26664o(7753);
            throw th3;
        }
    }

    public static boolean isLowEndDevice() {
        boolean z;
        boolean z2;
        if (f198313b == null) {
            boolean z3 = true;
            if (f198312a || CommandLine.f198246a.get() != null) {
                if (!CommandLine.m151722b().mo141481a()) {
                    if (CommandLine.m151722b().mo141481a()) {
                        z3 = false;
                    } else {
                        Integer valueOf = Integer.valueOf(m151753a());
                        f198314c = valueOf;
                        if (valueOf.intValue() <= 0 || (Build.VERSION.SDK_INT < 26 ? f198314c.intValue() / 1024 > 512 : f198314c.intValue() / 1024 > 1024)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (C87445c.f198342a != null) {
                            int i = Build.VERSION.SDK_INT;
                            z2 = ((ActivityManager) m151754a(C87445c.f198342a, "activity")).isLowRamDevice();
                        } else {
                            z2 = false;
                        }
                        C87469a.C87470a aVar = f198315d;
                        if (z != z2) {
                            z3 = false;
                        }
                        aVar.mo141535a(z3);
                        z3 = z;
                    }
                }
                f198313b = Boolean.valueOf(z3);
            } else {
                throw new AssertionError();
            }
        }
        return f198313b.booleanValue();
    }

    /* renamed from: a */
    private static Object m151754a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7756);
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
                    MethodCollector.m26664o(7756);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
