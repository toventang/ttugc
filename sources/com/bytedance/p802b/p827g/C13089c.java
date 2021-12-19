package com.bytedance.p802b.p827g;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.b.g.c */
public final class C13089c {

    /* renamed from: a */
    private long f31922a;

    /* renamed from: b */
    private long f31923b;

    /* renamed from: c */
    private long f31924c;

    /* renamed from: d */
    private long f31925d;

    static {
        Covode.recordClassIndex(14925);
    }

    C13089c() {
    }

    /* renamed from: com.bytedance.b.g.c$a */
    public static class C13090a {

        /* renamed from: a */
        public static final C13089c f31926a = new C13089c();

        static {
            Covode.recordClassIndex(14926);
        }
    }

    /* renamed from: a */
    public final long mo20932a() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
        long j = parseLong - this.f31922a;
        this.f31922a = parseLong;
        return j;
    }

    /* renamed from: b */
    public final long mo20933b() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
        long j = parseLong - this.f31923b;
        this.f31923b = parseLong;
        return j;
    }

    /* renamed from: c */
    public final long mo20934c() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
        long j = parseLong - this.f31924c;
        this.f31924c = parseLong;
        return j;
    }

    /* renamed from: d */
    public final long mo20935d() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
        long j = parseLong - this.f31925d;
        this.f31925d = parseLong;
        return j;
    }

    /* renamed from: e */
    public static Debug.MemoryInfo m23535e() {
        if (C13113a.f31955g == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) m23534a(C13113a.f31955g, "activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static long m23533a(Debug.MemoryInfo memoryInfo) {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
        if (!TextUtils.isEmpty(memoryStat)) {
            try {
                return ((long) Integer.parseInt(memoryStat)) * 1024;
            } catch (Exception e) {
                C13118b.m23587a("APM-Memory", "getGraphics", e);
                e.printStackTrace();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static Object m23534a(Application application, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return application.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return application.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = application.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
