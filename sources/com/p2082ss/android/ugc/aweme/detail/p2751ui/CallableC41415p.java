package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.ui.p */
public final /* synthetic */ class CallableC41415p implements Callable {

    /* renamed from: a */
    private final C41401l f96617a;

    /* renamed from: b */
    private final String f96618b;

    static {
        Covode.recordClassIndex(49310);
    }

    CallableC41415p(C41401l lVar, String str) {
        this.f96617a = lVar;
        this.f96618b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f96617a.mo70666c(this.f96618b);
    }
}
