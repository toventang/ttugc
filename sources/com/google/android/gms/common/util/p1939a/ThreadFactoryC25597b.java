package com.google.android.gms.common.util.p1939a;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
public final class ThreadFactoryC25597b implements ThreadFactory {

    /* renamed from: a */
    private final String f60705a;

    /* renamed from: b */
    private final int f60706b;

    /* renamed from: c */
    private final ThreadFactory f60707c;

    static {
        Covode.recordClassIndex(31007);
    }

    public ThreadFactoryC25597b(String str) {
        this(str, (byte) 0);
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f60707c.newThread(new RunnableC25599d(runnable));
        newThread.setName(this.f60705a);
        return newThread;
    }

    private ThreadFactoryC25597b(String str, byte b) {
        this.f60707c = Executors.defaultThreadFactory();
        this.f60705a = (String) C25565r.m49315a((Object) str, (Object) "Name must not be null");
        this.f60706b = 0;
    }
}
