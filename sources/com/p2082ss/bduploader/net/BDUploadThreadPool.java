package com.p2082ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.bduploader.net.BDUploadThreadPool */
public class BDUploadThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;

    static {
        Covode.recordClassIndex(100824);
    }

    public static int getPoolSize() {
        MethodCollector.m26663i(5487);
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        int poolSize = mExecutorInstance.getPoolSize();
        MethodCollector.m26664o(5487);
        return poolSize;
    }

    public static void shutdown() {
        MethodCollector.m26663i(5490);
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
        MethodCollector.m26664o(5490);
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        MethodCollector.m26663i(5372);
        if (mExecutorInstance == null) {
            synchronized (BDUploadThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 300, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5372);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = mExecutorInstance;
        MethodCollector.m26664o(5372);
        return threadPoolExecutor;
    }

    public static Future addExecuteTask(Runnable runnable) {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.submit(runnable);
    }
}
