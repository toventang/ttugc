package com.p2082ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.f */
final /* synthetic */ class CallableC31545f implements Callable {

    /* renamed from: a */
    private final C31541b f75444a;

    /* renamed from: b */
    private final String f75445b;

    static {
        Covode.recordClassIndex(38263);
    }

    CallableC31545f(C31541b bVar, String str) {
        this.f75444a = bVar;
        this.f75445b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C31541b.m65797a(this.f75445b, true, false);
    }
}
