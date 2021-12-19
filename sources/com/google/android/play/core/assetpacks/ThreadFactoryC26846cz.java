package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.cz */
final /* synthetic */ class ThreadFactoryC26846cz implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f63702a = new ThreadFactoryC26846cz();

    static {
        Covode.recordClassIndex(32321);
    }

    private ThreadFactoryC26846cz() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
