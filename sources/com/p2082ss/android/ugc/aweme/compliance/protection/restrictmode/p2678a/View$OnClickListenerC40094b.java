package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2678a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.b */
final /* synthetic */ class View$OnClickListenerC40094b implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC22772b f94161a;

    /* renamed from: b */
    private final SpecialTopicEntry f94162b;

    static {
        Covode.recordClassIndex(47870);
    }

    View$OnClickListenerC40094b(AbstractC22772b bVar, SpecialTopicEntry specialTopicEntry) {
        this.f94161a = bVar;
        this.f94162b = specialTopicEntry;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC22772b bVar = this.f94161a;
        SpecialTopicEntry specialTopicEntry = this.f94162b;
        SmartRouter.buildRoute(bVar.getActivity(), specialTopicEntry.getLandingRoute()).open();
        C39162r.m79460a("topic_entrance_click", new C33744d().mo59983a("enter_from", bVar.mo37091g()).mo59983a(StringSet.type, specialTopicEntry.getEventName()).mo59983a("url", specialTopicEntry.getLandingRoute()).f79943a);
    }
}
