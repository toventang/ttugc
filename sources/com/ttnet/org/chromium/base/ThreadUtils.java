package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadUtils {

    /* renamed from: a */
    public static boolean f198316a;

    /* renamed from: b */
    public static final /* synthetic */ boolean f198317b = true;

    /* renamed from: c */
    private static final Object f198318c = new Object();

    /* renamed from: d */
    private static boolean f198319d;

    /* renamed from: e */
    private static Handler f198320e;

    static {
        Covode.recordClassIndex(103361);
    }

    /* renamed from: b */
    public static boolean m151759b() {
        if (m151755a().getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Handler m151755a() {
        Handler handler;
        MethodCollector.m26663i(3996);
        synchronized (f198318c) {
            try {
                if (f198320e == null) {
                    if (!f198319d) {
                        f198320e = new Handler(Looper.getMainLooper());
                    } else {
                        RuntimeException runtimeException = new RuntimeException("Did not yet override the UI thread");
                        MethodCollector.m26664o(3996);
                        throw runtimeException;
                    }
                }
                handler = f198320e;
            } finally {
                MethodCollector.m26664o(3996);
            }
        }
        return handler;
    }

    /* renamed from: a */
    public static void m151757a(Runnable runnable) {
        m151755a().post(runnable);
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    /* renamed from: a */
    public static <T> T m151756a(Callable<T> callable) {
        try {
            return (T) m151758b(callable);
        } catch (ExecutionException e) {
            throw new RuntimeException("Error occurred waiting for callable", e);
        }
    }

    private static boolean isThreadPriorityAudio(int i) {
        if (Process.getThreadPriority(i) == -16) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static <T> T m151758b(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        if (m151759b()) {
            futureTask.run();
        } else {
            m151755a().post(futureTask);
        }
        try {
            return (T) futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted waiting for callable", e);
        }
    }
}
