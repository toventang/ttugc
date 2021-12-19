package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.mediakit.net.AVMDLThreadPool */
public class AVMDLThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;
    private static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    private static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    /* renamed from: com.ss.mediakit.net.AVMDLThreadPool$AsyncRunnable */
    public static class AsyncRunnable implements Runnable {
        private Runnable mRunnable;

        static {
            Covode.recordClassIndex(101237);
        }

        public void run() {
            this.mRunnable.run();
            AVMDLThreadPool._finished(this);
        }

        public AsyncRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    static {
        Covode.recordClassIndex(101236);
    }

    public static int getPoolSize() {
        MethodCollector.m26663i(10349);
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        int poolSize = mExecutorInstance.getPoolSize();
        MethodCollector.m26664o(10349);
        return poolSize;
    }

    public static void shutdown() {
        MethodCollector.m26663i(10487);
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
        MethodCollector.m26664o(10487);
    }

    private static void _promoteRunnable() {
        MethodCollector.m26663i(10654);
        if (mReadyRunnables.size() > 0) {
            Iterator<AsyncRunnable> it = mReadyRunnables.iterator();
            if (it.hasNext()) {
                AsyncRunnable next = it.next();
                it.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
        MethodCollector.m26664o(10654);
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        MethodCollector.m26663i(10039);
        if (mExecutorInstance == null) {
            synchronized (AVMDLThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10039);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = mExecutorInstance;
        MethodCollector.m26664o(10039);
        return threadPoolExecutor;
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        synchronized (AVMDLThreadPool.class) {
            MethodCollector.m26663i(10489);
            mRunningRunnables.remove(asyncRunnable);
            _promoteRunnable();
            MethodCollector.m26664o(10489);
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        MethodCollector.m26663i(9880);
        synchronized (AVMDLThreadPool.class) {
            try {
                mExecutorInstance = threadPoolExecutor;
            } finally {
                MethodCollector.m26664o(9880);
            }
        }
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        synchronized (AVMDLThreadPool.class) {
            MethodCollector.m26663i(10191);
            if (runnable == null) {
                MethodCollector.m26664o(10191);
                return null;
            }
            if (mExecutorInstance == null) {
                getExecutorInstance();
            }
            AVMDLLog.m147905d("AVMDLThreadPool", "addExecuteTask,cur thread num:" + getPoolSize());
            AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
            if (mRunningRunnables.size() >= 64) {
                mReadyRunnables.add(asyncRunnable);
                MethodCollector.m26664o(10191);
                return null;
            }
            mRunningRunnables.add(asyncRunnable);
            Future<?> submit = mExecutorInstance.submit(asyncRunnable);
            MethodCollector.m26664o(10191);
            return submit;
        }
    }
}
