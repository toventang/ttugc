package com.google.android.gms.common.util.p1939a;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
public final class ThreadFactoryC25598c implements ThreadFactory {

    /* renamed from: a */
    private final String f60708a;

    /* renamed from: b */
    private final int f60709b;

    /* renamed from: c */
    private final AtomicInteger f60710c;

    /* renamed from: d */
    private final ThreadFactory f60711d;

    static {
        Covode.recordClassIndex(31008);
    }

    public ThreadFactoryC25598c(String str) {
        this(str, (byte) 0);
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f60711d.newThread(new RunnableC25599d(runnable));
        String str = this.f60708a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f60710c.getAndIncrement()).append("]").toString());
        return newThread;
    }

    private ThreadFactoryC25598c(String str, byte b) {
        this.f60710c = new AtomicInteger();
        this.f60711d = Executors.defaultThreadFactory();
        this.f60708a = (String) C25565r.m49315a((Object) str, (Object) "Name must not be null");
        this.f60709b = 0;
    }
}
