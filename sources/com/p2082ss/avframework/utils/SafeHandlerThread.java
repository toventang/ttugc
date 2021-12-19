package com.p2082ss.avframework.utils;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.avframework.utils.SafeHandlerThread */
public class SafeHandlerThread extends HandlerThread {
    private long mAliveTimeMs = 0;
    public IDispatchInterceptMainException mDispatch;
    private boolean mEnableSafeMode;
    protected SafeHandler mHandler;
    private boolean mHasStart;
    public final Object mLockFence = new Object();
    private AtomicBoolean mLocked = new AtomicBoolean(false);
    public boolean mQuiting;
    private final Runnable mReleaseRunnable = new Runnable() {
        /* class com.p2082ss.avframework.utils.SafeHandlerThread.RunnableC860431 */

        static {
            Covode.recordClassIndex(100737);
        }

        public void run() {
            MethodCollector.m26663i(437);
            if (SafeHandlerThread.this.isLocked() || SafeHandlerThread.this.mReleased) {
                MethodCollector.m26664o(437);
                return;
            }
            synchronized (SafeHandlerThread.this.mLockFence) {
                try {
                    if (!SafeHandlerThread.this.isLocked()) {
                        SafeHandlerThread.this.mReleased = true;
                        Runnable runnable = SafeHandlerThread.this.mReleaseRunnableOuter;
                        if (runnable != null) {
                            runnable.run();
                        }
                        SafeHandlerThread.this.release();
                    }
                } finally {
                    MethodCollector.m26664o(437);
                }
            }
        }
    };
    public Runnable mReleaseRunnableOuter;
    public volatile boolean mReleased;

    /* renamed from: com.ss.avframework.utils.SafeHandlerThread$IDispatchInterceptMainException */
    public interface IDispatchInterceptMainException {
        static {
            Covode.recordClassIndex(100740);
        }

        boolean dispatchInterceptMainException(String str, Throwable th);
    }

    static {
        Covode.recordClassIndex(100736);
    }

    public boolean isLocked() {
        return this.mLocked.get();
    }

    public SafeHandlerThread lock() {
        return lock(null);
    }

    public boolean quit() {
        this.mQuiting = true;
        return super.quit();
    }

    public boolean quitSafely() {
        this.mQuiting = true;
        return super.quitSafely();
    }

    private SafeHandler getHandlerInner() {
        if (this.mHandler == null) {
            this.mHandler = new SafeHandler(getLooper());
        }
        return this.mHandler;
    }

    public synchronized Handler getHandler() {
        SafeHandler handlerInner;
        MethodCollector.m26663i(1770);
        handlerInner = getHandlerInner();
        MethodCollector.m26664o(1770);
        return handlerInner;
    }

    public synchronized void start() {
        MethodCollector.m26663i(1289);
        synchronized (this) {
            try {
                if (!this.mHasStart) {
                    this.mHasStart = true;
                    super.start();
                }
            } finally {
                MethodCollector.m26664o(1289);
            }
        }
    }

    public void release() {
        AVLog.ioi("SafeHandlerThread", "Release thread:" + getName());
        int i = Build.VERSION.SDK_INT;
        try {
            quitSafely();
        } catch (Throwable unused) {
            super.quit();
        }
    }

    /* renamed from: com.ss.avframework.utils.SafeHandlerThread$SafeHandler */
    public static class SafeHandler extends Handler {
        private Handler.Callback mCallback;

        static {
            Covode.recordClassIndex(100741);
        }

        SafeHandler(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: package-private */
        public void setHandlerCallback(Handler.Callback callback) {
            this.mCallback = callback;
        }

        public void handleMessage(Message message) {
            Handler.Callback callback = this.mCallback;
            if (callback != null) {
                callback.handleMessage(message);
            }
        }
    }

    public void setAliveTimeMs(long j) {
        this.mAliveTimeMs = j;
    }

    public void post(Message message) {
        getHandler().sendMessage(message);
    }

    public void removeCallbacks(Runnable runnable) {
        getHandler().removeCallbacks(runnable);
    }

    public boolean post(int i) {
        return getHandler().sendEmptyMessage(i);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        return getHandler().postAtFrontOfQueue(runnable);
    }

    public void setHandlerCallback(Handler.Callback callback) {
        SafeHandler handlerInner = getHandlerInner();
        if (handlerInner != null) {
            handlerInner.setHandlerCallback(callback);
        }
    }

    public SafeHandlerThread(String str) {
        super(str);
    }

    public synchronized void enableSafeMode(IDispatchInterceptMainException iDispatchInterceptMainException) {
        MethodCollector.m26663i(1773);
        if (!this.mEnableSafeMode || this.mDispatch == null) {
            this.mEnableSafeMode = true;
            this.mDispatch = iDispatchInterceptMainException;
            getHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.utils.SafeHandlerThread.RunnableC860453 */

                static {
                    Covode.recordClassIndex(100739);
                }

                public void run() {
                    String str;
                    MethodCollector.m26663i(2855);
                    while (!SafeHandlerThread.this.mQuiting) {
                        try {
                            Looper.loop();
                        } catch (Throwable th) {
                            boolean dispatchInterceptMainException = SafeHandlerThread.this.mDispatch.dispatchInterceptMainException(SafeHandlerThread.this.getName(), th);
                            if (dispatchInterceptMainException) {
                                str = "";
                            } else {
                                str = "Crash!! ";
                            }
                            String str2 = str + "ReportError: thread-" + Thread.currentThread().getName() + ", message-" + th.getMessage();
                            AVLog.m147806e("SafeHandlerThread", str2);
                            if (AVLog.isLogKibanaDeviceSet()) {
                                AVLog.logKibana(6, "SafeHandlerThread", str2, th);
                            }
                            if (!dispatchInterceptMainException) {
                                try {
                                    Thread.sleep(1000);
                                } catch (Exception unused) {
                                }
                                MethodCollector.m26664o(2855);
                                throw th;
                            }
                        }
                    }
                    MethodCollector.m26664o(2855);
                }
            });
            MethodCollector.m26664o(1773);
            return;
        }
        MethodCollector.m26664o(1773);
    }

    public void setThreadName(final String str) {
        if (!post(new Runnable() {
            /* class com.p2082ss.avframework.utils.SafeHandlerThread.RunnableC860442 */

            static {
                Covode.recordClassIndex(100738);
            }

            public void run() {
                SafeHandlerThread.this.setName(str);
            }
        })) {
            AVLog.logKibana(6, "SafeHandlerThread", "Set name failed.current:" + getName() + ",new:" + str, null);
        }
    }

    public void unlock(Runnable runnable) {
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (this.mAliveTimeMs > 0) {
            this.mReleaseRunnableOuter = runnable;
            getHandlerInner().postDelayed(this.mReleaseRunnable, this.mAliveTimeMs);
        }
        this.mLocked.set(false);
    }

    public SafeHandlerThread lock(Handler.Callback callback) {
        MethodCollector.m26663i(1310);
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (!isLocked() && !this.mReleased) {
            synchronized (this.mLockFence) {
                try {
                    if (!this.mReleased) {
                        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
                        this.mLocked.set(true);
                        setHandlerCallback(callback);
                        return this;
                    }
                } finally {
                    MethodCollector.m26664o(1310);
                }
            }
        }
        MethodCollector.m26664o(1310);
        return null;
    }

    public boolean post(Runnable runnable) {
        return getHandler().post(runnable);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return getHandler().postDelayed(runnable, j);
    }

    public boolean post(int i, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, obj));
    }

    public boolean post(int i, int i2, int i3, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, i2, i3, obj));
    }
}
