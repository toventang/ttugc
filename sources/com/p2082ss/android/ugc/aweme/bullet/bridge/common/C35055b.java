package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.b */
final /* synthetic */ class C35055b implements IAVProcessService.IProcessCallback {

    /* renamed from: a */
    private final C1743j f82711a;

    static {
        Covode.recordClassIndex(42166);
    }

    C35055b(C1743j jVar) {
        this.f82711a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(Object obj) {
        this.f82711a.mo5555a(obj);
    }
}
