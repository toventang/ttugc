package com.p2082ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.net.cache.c */
public final class C61317c {

    /* renamed from: a */
    final ReentrantLock f139262a;

    /* renamed from: b */
    final Condition f139263b;

    static {
        Covode.recordClassIndex(71948);
    }

    public C61317c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f139262a = reentrantLock;
        this.f139263b = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public final void mo98941a() {
        ReentrantLock reentrantLock = this.f139262a;
        reentrantLock.lock();
        try {
            this.f139263b.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
