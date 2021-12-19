package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import p077b.C1743j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.v */
public final /* synthetic */ class C35921v implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a */
    private final C1743j f84780a;

    static {
        Covode.recordClassIndex(43161);
    }

    C35921v(C1743j jVar) {
        this.f84780a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        this.f84780a.mo5555a(obj);
    }
}
