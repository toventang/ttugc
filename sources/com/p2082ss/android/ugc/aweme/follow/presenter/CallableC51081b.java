package com.p2082ss.android.ugc.aweme.follow.presenter;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.b */
final /* synthetic */ class CallableC51081b implements Callable {

    /* renamed from: a */
    private final C51079a f117847a;

    /* renamed from: b */
    private final Message f117848b;

    static {
        Covode.recordClassIndex(60275);
    }

    CallableC51081b(C51079a aVar, Message message) {
        this.f117847a = aVar;
        this.f117848b = message;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f117847a.mo86488a(this.f117848b);
    }
}
