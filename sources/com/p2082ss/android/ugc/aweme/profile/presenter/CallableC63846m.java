package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.m */
final /* synthetic */ class CallableC63846m implements Callable {

    /* renamed from: a */
    private final Throwable f144764a;

    static {
        Covode.recordClassIndex(75270);
    }

    CallableC63846m(Throwable th) {
        this.f144764a = th;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th = this.f144764a;
        if (th instanceof Exception) {
            throw th;
        }
        throw new IllegalStateException("AwemeModel.fetchListRx: " + th.getMessage());
    }
}
