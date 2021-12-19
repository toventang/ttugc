package com.ttnet.org.chromium.base;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;

public class JavaHandlerThread {

    /* renamed from: c */
    static final /* synthetic */ boolean f198275c = true;

    /* renamed from: a */
    public final HandlerThread f198276a;

    /* renamed from: b */
    public Throwable f198277b;

    public native void nativeInitializeThread(long j, long j2);

    public native void nativeOnLooperStopped(long j);

    private Throwable getUncaughtExceptionIfAny() {
        return this.f198277b;
    }

    private boolean isAlive() {
        return this.f198276a.isAlive();
    }

    static {
        Covode.recordClassIndex(103349);
    }

    private void joinThread() {
        do {
            try {
                this.f198276a.join();
                return;
            } catch (InterruptedException unused) {
                if (0 != 0) {
                }
            }
        } while (0 != 0);
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.f198276a.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.C874333 */

            static {
                Covode.recordClassIndex(103352);
            }

            public final void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.f198277b = th;
            }
        });
    }

    private void quitThreadSafely(final long j) {
        new Handler(this.f198276a.getLooper()).post(new Runnable() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.RunnableC874322 */

            static {
                Covode.recordClassIndex(103351);
            }

            public final void run() {
                MethodCollector.m26663i(7901);
                JavaHandlerThread.this.f198276a.quit();
                JavaHandlerThread.this.nativeOnLooperStopped(j);
                MethodCollector.m26664o(7901);
            }
        });
        int i = Build.VERSION.SDK_INT;
        this.f198276a.getLooper().quitSafely();
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private JavaHandlerThread(String str, int i) {
        this.f198276a = new HandlerThread(str, i);
    }

    private void startAndInitialize(final long j, final long j2) {
        if (this.f198276a.getState() == Thread.State.NEW) {
            this.f198276a.start();
        }
        new Handler(this.f198276a.getLooper()).post(new Runnable() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.RunnableC874311 */

            static {
                Covode.recordClassIndex(103350);
            }

            public final void run() {
                MethodCollector.m26663i(7899);
                JavaHandlerThread.this.nativeInitializeThread(j, j2);
                MethodCollector.m26664o(7899);
            }
        });
    }
}
