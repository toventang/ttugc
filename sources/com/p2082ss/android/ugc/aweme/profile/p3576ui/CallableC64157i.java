package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.i */
public final /* synthetic */ class CallableC64157i implements Callable {

    /* renamed from: a */
    private final C64066c f145518a;

    /* renamed from: b */
    private final IAVDraftService f145519b;

    static {
        Covode.recordClassIndex(75601);
    }

    CallableC64157i(C64066c cVar, IAVDraftService iAVDraftService) {
        this.f145518a = cVar;
        this.f145519b = iAVDraftService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C29339a.m58754b(new RunnableC64159k(this.f145518a, this.f145519b.draftList(false)));
        return null;
    }
}
