package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.k */
public final /* synthetic */ class CallableC11162k implements Callable {

    /* renamed from: a */
    private final AbstractC11136ab f26778a;

    static {
        Covode.recordClassIndex(12789);
    }

    CallableC11162k(AbstractC11136ab abVar) {
        this.f26778a = abVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C11152e.m19794b(this.f26778a);
    }
}
