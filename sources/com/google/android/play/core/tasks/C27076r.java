package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.play.core.tasks.r */
public final class C27076r implements AbstractC27059a, AbstractC27060b {

    /* renamed from: a */
    public final CountDownLatch f64062a = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(32556);
    }

    private C27076r() {
    }

    public /* synthetic */ C27076r(byte b) {
    }

    @Override // com.google.android.play.core.tasks.AbstractC27059a
    /* renamed from: a */
    public final void mo35008a(Exception exc) {
        this.f64062a.countDown();
    }

    @Override // com.google.android.play.core.tasks.AbstractC27060b
    /* renamed from: a */
    public final void mo35009a(Object obj) {
        this.f64062a.countDown();
    }
}
