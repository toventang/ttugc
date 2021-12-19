package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.j */
public final /* synthetic */ class ThreadFactoryC87731j implements ThreadFactory {

    /* renamed from: a */
    private final String f199250a;

    /* renamed from: b */
    private final AtomicLong f199251b;

    static {
        Covode.recordClassIndex(103720);
    }

    ThreadFactoryC87731j(String str, AtomicLong atomicLong) {
        this.f199250a = str;
        this.f199251b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f199250a;
        AtomicLong atomicLong = this.f199251b;
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName(str + atomicLong.getAndIncrement());
        return newThread;
    }
}
