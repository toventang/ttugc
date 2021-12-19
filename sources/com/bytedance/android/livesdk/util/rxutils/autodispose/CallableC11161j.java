package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.j */
public final /* synthetic */ class CallableC11161j implements Callable {

    /* renamed from: a */
    private final AbstractC11136ab f26777a;

    static {
        Covode.recordClassIndex(12788);
    }

    CallableC11161j(AbstractC11136ab abVar) {
        this.f26777a = abVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C11152e.m19795c(this.f26777a);
    }
}
