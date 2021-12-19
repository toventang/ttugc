package com.p2082ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.c */
public final class C49299c {
    static {
        Covode.recordClassIndex(58100);
    }

    /* renamed from: c */
    public static void m92354c(Lock lock) {
        if (lock != null) {
            try {
                lock.unlock();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m92352a(Lock lock) {
        if (lock != null) {
            return lock.tryLock();
        }
        return false;
    }

    /* renamed from: b */
    public static void m92353b(Lock lock) {
        if (lock != null) {
            try {
                lock.tryLock(1500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            } finally {
                m92354c(lock);
            }
        }
    }
}
