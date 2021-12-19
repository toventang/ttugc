package com.p2082ss.android.ugc.aweme.account.login.p2260e;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.login.e.b */
final /* synthetic */ class CallableC31911b implements Callable {

    /* renamed from: a */
    private final C31910a f76247a;

    /* renamed from: b */
    private final Intent f76248b;

    static {
        Covode.recordClassIndex(38655);
    }

    CallableC31911b(C31910a aVar, Intent intent) {
        this.f76247a = aVar;
        this.f76248b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f76247a.mo57841a(this.f76248b);
    }
}
