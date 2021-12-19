package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.effect.q */
final /* synthetic */ class C46368q implements AbstractC1729g {

    /* renamed from: a */
    private final EffectJobService f108066a;

    static {
        Covode.recordClassIndex(54945);
    }

    C46368q(EffectJobService effectJobService) {
        this.f108066a = effectJobService;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        EffectJobService effectJobService = this.f108066a;
        AbstractC59040ay ayVar = (AbstractC59040ay) C34506c.m70491a(effectJobService, AbstractC59040ay.class);
        ayVar.mo60974b();
        ayVar.mo60971a(System.currentTimeMillis());
        effectJobService.stopSelf();
        return null;
    }
}
