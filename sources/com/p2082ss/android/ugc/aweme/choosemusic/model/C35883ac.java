package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ac */
final /* synthetic */ class C35883ac implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a */
    private final C1743j f84678a;

    static {
        Covode.recordClassIndex(43123);
    }

    C35883ac(C1743j jVar) {
        this.f84678a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        this.f84678a.mo5555a(obj);
    }
}
