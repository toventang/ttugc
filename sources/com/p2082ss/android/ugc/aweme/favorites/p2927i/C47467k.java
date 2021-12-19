package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.k */
final /* synthetic */ class C47467k implements AbstractC78597a {

    /* renamed from: a */
    static final AbstractC78597a f110270a = new C47467k();

    static {
        Covode.recordClassIndex(56080);
    }

    private C47467k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a
    public final void onIntercept(String str, Effect effect) {
        C39162r.m79460a("shoot", new C33744d().mo59983a("creation_id", str).mo59983a("shoot_way", "prop_page").mo59983a("prop_id", effect.getEffectId()).mo59983a("enter_from", "prop_collection").f79943a);
    }
}
