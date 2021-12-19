package com.p2082ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarFile;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.utils.id */
public final class C80569id {

    /* renamed from: a */
    private static HashMap<URL, JarFile> f180186a;

    /* renamed from: b */
    private static String f180187b = "test-jar";

    static {
        Covode.recordClassIndex(93842);
    }

    /* renamed from: b */
    private static void m139663b() {
        if (Build.VERSION.SDK_INT <= 23) {
            C1731i.m5640b(CallableC80570ie.f180188a, C1731i.f5562a);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m139660a() {
        MethodCollector.m26663i(7830);
        try {
            Field declaredField = Class.forName("libcore.net.url.JarURLConnectionImpl").getDeclaredField("jarCache");
            declaredField.setAccessible(true);
            HashMap<URL, JarFile> hashMap = (HashMap) declaredField.get(null);
            f180186a = hashMap;
            synchronized (hashMap) {
                try {
                    HashMap<URL, JarFile> hashMap2 = f180186a;
                    if (hashMap2 != null) {
                        try {
                            Iterator<Map.Entry<URL, JarFile>> it = hashMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<URL, JarFile> next = it.next();
                                URL key = next.getKey();
                                if (key.toString().endsWith(".apk") || key.toString().endsWith(".jar")) {
                                    try {
                                        JarFile value = next.getValue();
                                        value.size();
                                        value.close();
                                        it.remove();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(7830);
                }
            }
        } catch (Exception unused3) {
        }
        return null;
    }

    /* renamed from: a */
    private static long m139659a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) m139661a(context, "activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    private static void m139664b(int i) {
        try {
            int a = (int) ((m139659a(C17867d.m33078a()) / 1024) / 1024);
            C51423a.m95787a(C17873f.m33102j().getClass().getName() + "   freeMem :" + a);
            C34611o.m70668a("TYPE_TRIM_MEMORY", new C33743c().mo59974a("memoryLevel", Integer.valueOf(i)).mo59976a("page", C17873f.m33102j().getClass().getName()).mo59974a("freeMemory", Integer.valueOf(a)).mo59977a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m139662a(int i) {
        m139664b(i);
        try {
            C20761r.m39064b(i);
        } catch (Exception e) {
            C13849d.m25015a(e, "trimMemory : Lighten");
            e.printStackTrace();
        }
        m139663b();
        if (5 == i) {
            C51423a.m95787a("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            System.gc();
        } else if (10 == i) {
            C51423a.m95787a("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            System.gc();
        } else if (40 == i) {
            C51423a.m95787a("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
        } else {
            C51423a.m95787a("trimMemory level:".concat(String.valueOf(i)));
        }
    }

    /* renamed from: a */
    private static Object m139661a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7695);
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
                    MethodCollector.m26664o(7695);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
