package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.v */
public final class C24781v<T> {

    /* renamed from: a */
    public T f58800a;

    /* renamed from: b */
    public CountDownLatch f58801b = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(28934);
    }

    public C24781v(final Callable<T> callable) {
        C24872m.m47689c().execute(new FutureTask(new Callable<Void>() {
            /* class com.facebook.internal.C24781v.CallableC247821 */

            static {
                Covode.recordClassIndex(28935);
            }

            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                try {
                    C24781v.this.f58800a = (T) callable.call();
                    C24781v.this.f58801b.countDown();
                    return null;
                } catch (Throwable th) {
                    C24781v.this.f58801b.countDown();
                    throw th;
                }
            }
        }));
    }
}
