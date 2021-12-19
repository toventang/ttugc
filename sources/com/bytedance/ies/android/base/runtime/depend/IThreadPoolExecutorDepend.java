package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

public interface IThreadPoolExecutorDepend {
    static {
        Covode.recordClassIndex(18395);
    }

    ExecutorService getCPUThreadExecutor();

    ExecutorService getIOThreadExecutor();

    ExecutorService getNormalThreadExecutor();
}
