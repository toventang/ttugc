package com.p2082ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.medialoader.LoaderListener */
public interface LoaderListener {
    static {
        Covode.recordClassIndex(101216);
    }

    void onLoaderTaskCancel(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskCompleted(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskStart(LoaderEventInfo loaderEventInfo);
}
