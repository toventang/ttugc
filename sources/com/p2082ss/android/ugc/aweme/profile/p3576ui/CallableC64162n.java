package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.n */
public final /* synthetic */ class CallableC64162n implements Callable {

    /* renamed from: a */
    private final C64066c f145526a;

    /* renamed from: b */
    private final IAVDraftService f145527b;

    static {
        Covode.recordClassIndex(75606);
    }

    CallableC64162n(C64066c cVar, IAVDraftService iAVDraftService) {
        this.f145526a = cVar;
        this.f145527b = iAVDraftService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f145526a.mo103663a(this.f145527b);
    }
}
