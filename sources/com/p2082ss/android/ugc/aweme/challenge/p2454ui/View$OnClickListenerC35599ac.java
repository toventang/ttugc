package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ac */
public final /* synthetic */ class View$OnClickListenerC35599ac implements View.OnClickListener {

    /* renamed from: a */
    private final C35596aa f83957a;

    /* renamed from: b */
    private final Challenge f83958b;

    static {
        Covode.recordClassIndex(42823);
    }

    View$OnClickListenerC35599ac(C35596aa aaVar, Challenge challenge) {
        this.f83957a = aaVar;
        this.f83958b = challenge;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C35596aa aaVar = this.f83957a;
        Challenge challenge = this.f83958b;
        C39162r.m79460a("click_related_tag", new C33744d().mo59983a("related_tag_id", challenge.getCid()).mo59983a("tag_id", aaVar.f83950b).f79943a);
        Context context = aaVar.f83949a;
        String str = aaVar.f83950b;
        CommerceChallengeServiceImpl.m75741e().mo65383a(challenge);
        SmartRouter.buildRoute(context, "//challenge/detail").withNavArg(new ChallengeDetailParam(challenge.getCid(), "from_related_tag", challenge.getType(), str)).open();
    }
}
