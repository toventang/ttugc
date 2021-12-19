package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.z */
public final /* synthetic */ class CallableC37186z implements Callable {

    /* renamed from: a */
    private final C37157k f87698a;

    /* renamed from: b */
    private final long f87699b;

    static {
        Covode.recordClassIndex(44540);
    }

    CallableC37186z(C37157k kVar, long j) {
        this.f87698a = kVar;
        this.f87699b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f87698a.mo64708c(this.f87699b);
    }
}
