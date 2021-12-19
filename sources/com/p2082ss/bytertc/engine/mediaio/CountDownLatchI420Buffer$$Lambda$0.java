package com.p2082ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer$$Lambda$0 */
public final /* synthetic */ class CountDownLatchI420Buffer$$Lambda$0 implements Runnable {
    private final CountDownLatchI420Buffer arg$1;
    private final Runnable arg$2;

    static {
        Covode.recordClassIndex(101111);
    }

    CountDownLatchI420Buffer$$Lambda$0(CountDownLatchI420Buffer countDownLatchI420Buffer, Runnable runnable) {
        this.arg$1 = countDownLatchI420Buffer;
        this.arg$2 = runnable;
    }

    public final void run() {
        this.arg$1.lambda$new$0$CountDownLatchI420Buffer(this.arg$2);
    }
}
