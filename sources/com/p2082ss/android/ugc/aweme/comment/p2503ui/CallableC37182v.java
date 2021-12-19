package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.v */
public final /* synthetic */ class CallableC37182v implements Callable {

    /* renamed from: a */
    private final C37157k f87691a;

    /* renamed from: b */
    private final long f87692b;

    static {
        Covode.recordClassIndex(44536);
    }

    CallableC37182v(C37157k kVar, long j) {
        this.f87691a = kVar;
        this.f87692b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f87691a.mo64710d(this.f87692b);
    }
}
