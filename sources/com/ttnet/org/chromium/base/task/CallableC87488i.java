package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.base.task.i */
public final /* synthetic */ class CallableC87488i implements Callable {

    /* renamed from: a */
    static final Callable f198447a = new CallableC87488i();

    static {
        Covode.recordClassIndex(103434);
    }

    private CallableC87488i() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new C87482e(Choreographer.getInstance());
    }
}
