package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ah */
final /* synthetic */ class CallableC63832ah implements Callable {

    /* renamed from: a */
    private final UserResponse f144714a;

    static {
        Covode.recordClassIndex(75256);
    }

    CallableC63832ah(UserResponse userResponse) {
        this.f144714a = userResponse;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C51423a.m95784a(4, "aweme/v1/user", GsonHolder.m138943c().mo123620b().mo46674b(this.f144714a));
        return null;
    }
}
