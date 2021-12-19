package com.p2082ss.bytertc.engine.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.bytertc.engine.utils.GetDeviceHelper */
public class GetDeviceHelper {
    static {
        Covode.recordClassIndex(101153);
    }

    public static String getGpuName() {
        String gPURendererFallback;
        if (Build.VERSION.SDK_INT >= 22) {
            gPURendererFallback = GPUUtil.getGPURenderer();
        } else {
            gPURendererFallback = GPUUtil.getGPURendererFallback();
        }
        if (gPURendererFallback == null) {
            return "null-null";
        }
        return gPURendererFallback;
    }

    public static int getTotalMemory(Context context) {
        MethodCollector.m26663i(1621);
        if (context == null) {
            MethodCollector.m26664o(1621);
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) m147883xf02595ce(context, "activity");
        if (activityManager == null) {
            MethodCollector.m26664o(1621);
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        double d = (double) memoryInfo.totalMem;
        Double.isNaN(d);
        int ceil = (int) Math.ceil((((d * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        MethodCollector.m26664o(1621);
        return ceil;
    }

    /* renamed from: com_ss_bytertc_engine_utils_GetDeviceHelper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147883xf02595ce(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1651);
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
                    MethodCollector.m26664o(1651);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
