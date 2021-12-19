package com.lynx.tasm.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SystemThread {
    private Thread mAndroidThread;
    public long mNativeThread;

    static {
        Covode.recordClassIndex(34444);
    }

    public static native void nativeRun(long j);

    public void join() {
        MethodCollector.m26663i(1374);
        try {
            this.mAndroidThread.join();
            MethodCollector.m26664o(1374);
        } catch (InterruptedException e) {
            e.printStackTrace();
            MethodCollector.m26664o(1374);
        }
    }

    public void stop() {
        Looper myLooper = Looper.myLooper();
        if (Thread.currentThread() == this.mAndroidThread && myLooper != null) {
            myLooper.quit();
        }
    }

    public static void attachMainThread(final long j) {
        MethodCollector.m26663i(1369);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            nativeRun(j);
            MethodCollector.m26664o(1369);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.base.SystemThread.RunnableC284512 */

            static {
                Covode.recordClassIndex(34446);
            }

            public final void run() {
                MethodCollector.m26663i(1280);
                SystemThread.nativeRun(j);
                MethodCollector.m26664o(1280);
            }
        });
        MethodCollector.m26664o(1369);
    }

    private void createAndroidThread(String str, int i) {
        MethodCollector.m26663i(1355);
        Thread thread = new Thread(new Runnable() {
            /* class com.lynx.tasm.base.SystemThread.RunnableC284501 */

            static {
                Covode.recordClassIndex(34445);
            }

            public final void run() {
                MethodCollector.m26663i(2148);
                Looper.prepare();
                SystemThread.nativeRun(SystemThread.this.mNativeThread);
                Looper.loop();
                MethodCollector.m26664o(2148);
            }
        }, str);
        this.mAndroidThread = thread;
        thread.setPriority(i);
        this.mAndroidThread.start();
        MethodCollector.m26664o(1355);
    }

    public static SystemThread create(long j, String str, int i) {
        return new SystemThread(j, str, i);
    }

    private SystemThread(long j, String str, int i) {
        this.mNativeThread = j;
        createAndroidThread(str, i);
    }
}
