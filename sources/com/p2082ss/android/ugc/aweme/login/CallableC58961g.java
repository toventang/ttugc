package com.p2082ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.login.g */
public final /* synthetic */ class CallableC58961g implements Callable {

    /* renamed from: a */
    private final Bundle f134200a;

    /* renamed from: b */
    private final C31366b f134201b;

    static {
        Covode.recordClassIndex(69288);
    }

    public CallableC58961g(Bundle bundle, C31366b bVar) {
        this.f134200a = bundle;
        this.f134201b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C58958d.m108331b(this.f134200a, this.f134201b);
    }
}
