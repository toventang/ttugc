package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.twitter.sdk.android.core.internal.i */
public final class C87730i {

    /* renamed from: a */
    public static final int f199247a;

    /* renamed from: b */
    public static final int f199248b;

    /* renamed from: c */
    private static final int f199249c;

    static {
        Covode.recordClassIndex(103719);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f199249c = availableProcessors;
        f199247a = availableProcessors + 1;
        f199248b = (availableProcessors * 2) + 1;
    }

    /* renamed from: a */
    public static ThreadFactory m152681a(String str) {
        return new ThreadFactoryC87731j(str, new AtomicLong(1));
    }

    /* renamed from: a */
    public static void m152682a(String str, ExecutorService executorService) {
        m152683a(str, executorService, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    private static void m152683a(String str, ExecutorService executorService, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new RunnableC87732k(executorService, timeUnit, str), "Twitter Shutdown Hook for ".concat(String.valueOf(str))));
    }
}
