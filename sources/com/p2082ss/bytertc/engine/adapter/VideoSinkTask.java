package com.p2082ss.bytertc.engine.adapter;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.bytertc.engine.adapter.VideoSinkTask */
public class VideoSinkTask extends HandlerThread {
    private Handler mHandler;
    private Object mLock = new Object();

    static {
        Covode.recordClassIndex(100963);
    }

    public VideoSinkTask() {
        super("VideoSinkTaskManager", 0);
    }

    public void exit() {
        MethodCollector.m26663i(993);
        synchronized (this.mLock) {
            try {
                int i = Build.VERSION.SDK_INT;
                quitSafely();
                this.mHandler = null;
            } finally {
                MethodCollector.m26664o(993);
            }
        }
    }

    public void init() {
        MethodCollector.m26663i(737);
        synchronized (this.mLock) {
            try {
                start();
                this.mHandler = new Handler(getLooper());
            } finally {
                MethodCollector.m26664o(737);
            }
        }
    }

    public void post(Runnable runnable) {
        MethodCollector.m26663i(741);
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } finally {
                MethodCollector.m26664o(741);
            }
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        MethodCollector.m26663i(984);
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.postDelayed(runnable, j);
                }
            } finally {
                MethodCollector.m26664o(984);
            }
        }
    }
}
