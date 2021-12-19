package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.squareup.a.a.a.l */
public final class C29138l {

    /* renamed from: a */
    final CountDownLatch f68945a = new CountDownLatch(1);

    /* renamed from: b */
    long f68946b = -1;

    /* renamed from: c */
    long f68947c = -1;

    static {
        Covode.recordClassIndex(35487);
    }

    C29138l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50827a() {
        if (this.f68947c == -1) {
            long j = this.f68946b;
            if (j != -1) {
                this.f68947c = j - 1;
                this.f68945a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }
}
