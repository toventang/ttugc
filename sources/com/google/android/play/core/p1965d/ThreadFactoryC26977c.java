package com.google.android.play.core.p1965d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.d.c */
public final class ThreadFactoryC26977c implements ThreadFactory {
    static {
        Covode.recordClassIndex(32453);
    }

    ThreadFactoryC26977c() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
