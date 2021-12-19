package com.p2082ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.login.h */
public final /* synthetic */ class CallableC58962h implements Callable {

    /* renamed from: a */
    private final Bundle f134202a;

    /* renamed from: b */
    private final C31366b f134203b;

    static {
        Covode.recordClassIndex(69289);
    }

    public CallableC58962h(Bundle bundle, C31366b bVar) {
        this.f134202a = bundle;
        this.f134203b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C58958d.m108326a(this.f134202a, this.f134203b);
    }
}
