package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.c */
public final /* synthetic */ class CallableC31323c implements Callable {

    /* renamed from: a */
    private final C31310a f75046a;

    static {
        Covode.recordClassIndex(38023);
    }

    CallableC31323c(C31310a aVar) {
        this.f75046a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C31310a aVar = this.f75046a;
        AbstractC31339n poll = aVar.f75030e.poll();
        if (poll == null) {
            return null;
        }
        aVar.mo57321d(poll);
        return null;
    }
}
