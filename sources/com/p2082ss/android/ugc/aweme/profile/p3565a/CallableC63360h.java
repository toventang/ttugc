package com.p2082ss.android.ugc.aweme.profile.p3565a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.a.h */
final /* synthetic */ class CallableC63360h implements Callable {

    /* renamed from: a */
    private final C63356e f143861a;

    static {
        Covode.recordClassIndex(74651);
    }

    CallableC63360h(C63356e eVar) {
        this.f143861a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(AVExternalServiceImpl.m113114a().draftService().draftList(false).size());
    }
}
