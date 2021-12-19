package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.b */
final /* synthetic */ class C58677b implements IAVEffectService.IAVEffectReadyCallback {

    /* renamed from: a */
    private final C1743j f133588a;

    static {
        Covode.recordClassIndex(68979);
    }

    C58677b(C1743j jVar) {
        this.f133588a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(Object obj) {
        C1743j jVar = this.f133588a;
        AbstractC46415f fVar = (AbstractC46415f) obj;
        if (fVar != null) {
            jVar.mo5555a(fVar.mo78917c());
        } else {
            jVar.mo5556b((Exception) new RuntimeException("Decompress failed"));
        }
    }
}
