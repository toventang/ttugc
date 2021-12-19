package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.r */
public final /* synthetic */ class CallableC64171r implements Callable {

    /* renamed from: a */
    private final String f145541a;

    /* renamed from: b */
    private final long f145542b;

    static {
        Covode.recordClassIndex(75616);
    }

    CallableC64171r(String str, long j) {
        this.f145541a = str;
        this.f145542b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C64066c.m115890a(this.f145541a, this.f145542b);
    }
}
