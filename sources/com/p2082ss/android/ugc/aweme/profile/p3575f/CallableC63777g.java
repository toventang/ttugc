package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.f.g */
public final /* synthetic */ class CallableC63777g implements Callable {

    /* renamed from: a */
    private final int f144565a;

    /* renamed from: b */
    private final boolean f144566b;

    /* renamed from: c */
    private final Exception f144567c;

    static {
        Covode.recordClassIndex(75105);
    }

    CallableC63777g(int i, boolean z, Exception exc) {
        this.f144565a = i;
        this.f144566b = z;
        this.f144567c = exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C63775e.m115336b(this.f144565a, this.f144566b, this.f144567c);
    }
}
