package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.h */
final /* synthetic */ class C53482h implements IAVTransformService.ITransformProgress {

    /* renamed from: a */
    private final AvatarCutActivity.RunnableC534631 f122772a;

    static {
        Covode.recordClassIndex(63055);
    }

    C53482h(AvatarCutActivity.RunnableC534631 r1) {
        this.f122772a = r1;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
    public final void update(int i) {
        C29339a.m58754b(new RunnableC53483i(this.f122772a, i));
    }
}
