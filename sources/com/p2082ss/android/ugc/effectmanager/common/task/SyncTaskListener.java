package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.SyncTaskListener */
public interface SyncTaskListener<T> {
    static {
        Covode.recordClassIndex(95501);
    }

    void onFailed(SyncTask<T> syncTask, ExceptionResult exceptionResult);

    void onFinally(SyncTask<T> syncTask);

    void onProgress(SyncTask<T> syncTask, int i, long j);

    void onResponse(SyncTask<T> syncTask, T t);

    void onStart(SyncTask<T> syncTask);
}
