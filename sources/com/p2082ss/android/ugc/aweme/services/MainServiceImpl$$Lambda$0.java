package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceImpl$$Lambda$0 */
final /* synthetic */ class MainServiceImpl$$Lambda$0 implements AbstractC78597a {
    private final String arg$1;

    static {
        Covode.recordClassIndex(79688);
    }

    MainServiceImpl$$Lambda$0(String str) {
        this.arg$1 = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a
    public final void onIntercept(String str, Effect effect) {
        C39162r.m79460a("shoot", (String) new C33744d().mo59983a("creation_id", str).mo59983a("shoot_way", "scan").mo59983a("prop_id", this.arg$1).f79943a);
    }
}
