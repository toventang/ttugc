package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.api.f */
public final /* synthetic */ class CallableC63432f implements Callable {

    /* renamed from: a */
    private final String f144030a;

    static {
        Covode.recordClassIndex(74737);
    }

    CallableC63432f(String str) {
        this.f144030a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C63429c.m115016a(this.f144030a, true, null);
    }
}
