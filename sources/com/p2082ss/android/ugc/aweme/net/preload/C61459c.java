package com.p2082ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.net.preload.c */
public final class C61459c {

    /* renamed from: a */
    final ReentrantLock f139519a;

    /* renamed from: b */
    final Condition f139520b;

    static {
        Covode.recordClassIndex(72115);
    }

    public C61459c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f139519a = reentrantLock;
        this.f139520b = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public final void mo99133a() {
        ReentrantLock reentrantLock = this.f139519a;
        reentrantLock.lock();
        try {
            this.f139520b.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
