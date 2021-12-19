package com.p2082ss.android.ugc.aweme.homepage.api.data;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.data.b */
public final class C52949b extends ReentrantLock {

    /* renamed from: a */
    private volatile boolean f121758a;

    static {
        Covode.recordClassIndex(62474);
    }

    public final void unlock() {
        super.unlock();
        this.f121758a = true;
    }

    public final boolean tryLock() {
        if (!this.f121758a) {
            return super.tryLock();
        }
        return true;
    }

    @Override // java.util.concurrent.locks.Lock, java.util.concurrent.locks.ReentrantLock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        if (!this.f121758a) {
            return super.tryLock(j, timeUnit);
        }
        return true;
    }
}
