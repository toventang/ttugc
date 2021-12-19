package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.b */
final /* synthetic */ class CallableC31322b implements Callable {

    /* renamed from: a */
    private final C31310a f75044a;

    /* renamed from: b */
    private final AbstractC31339n f75045b;

    static {
        Covode.recordClassIndex(38022);
    }

    CallableC31322b(C31310a aVar, AbstractC31339n nVar) {
        this.f75044a = aVar;
        this.f75045b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f75044a.mo57322e(this.f75045b);
    }
}
