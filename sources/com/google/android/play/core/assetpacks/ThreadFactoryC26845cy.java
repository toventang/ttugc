package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.cy */
final /* synthetic */ class ThreadFactoryC26845cy implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f63701a = new ThreadFactoryC26845cy();

    static {
        Covode.recordClassIndex(32320);
    }

    private ThreadFactoryC26845cy() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
