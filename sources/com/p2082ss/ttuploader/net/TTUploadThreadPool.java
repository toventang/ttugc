package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.ttuploader.net.TTUploadThreadPool */
public class TTUploadThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;

    static {
        Covode.recordClassIndex(101522);
    }

    public static int getPoolSize() {
        MethodCollector.m26663i(13146);
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        int poolSize = mExecutorInstance.getPoolSize();
        MethodCollector.m26664o(13146);
        return poolSize;
    }

    public static void shutdown() {
        MethodCollector.m26663i(13147);
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
        MethodCollector.m26664o(13147);
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        MethodCollector.m26663i(13079);
        if (mExecutorInstance == null) {
            synchronized (TTUploadThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 300, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13079);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = mExecutorInstance;
        MethodCollector.m26664o(13079);
        return threadPoolExecutor;
    }

    public static Future addExecuteTask(Runnable runnable) {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.submit(runnable);
    }
}
