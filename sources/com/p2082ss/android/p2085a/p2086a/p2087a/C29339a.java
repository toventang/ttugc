package com.p2082ss.android.p2085a.p2086a.p2087a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.a.a.a.a */
public final class C29339a {

    /* renamed from: a */
    public static ExecutorService f69614a;

    /* renamed from: b */
    private static Handler f69615b;

    static {
        Covode.recordClassIndex(35725);
    }

    /* renamed from: a */
    private static void m58751a() {
        ExecutorService executorService = f69614a;
        if (executorService == null || executorService.isTerminated() || f69615b == null) {
            f69614a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f69615b = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static void m58752a(Runnable runnable) {
        m58751a();
        try {
            f69614a.execute(runnable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m58754b(Runnable runnable) {
        m58751a();
        Handler handler = f69615b;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: c */
    public static void m58755c(Runnable runnable) {
        m58751a();
        f69615b.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m58753a(Runnable runnable, int i) {
        m58751a();
        Handler handler = f69615b;
        if (handler != null) {
            handler.postDelayed(runnable, (long) i);
        }
    }
}
