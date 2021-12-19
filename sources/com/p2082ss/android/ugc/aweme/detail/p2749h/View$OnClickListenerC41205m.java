package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.h.m */
public final /* synthetic */ class View$OnClickListenerC41205m implements View.OnClickListener {

    /* renamed from: a */
    private final C41178b f96302a;

    /* renamed from: b */
    private final Aweme f96303b;

    static {
        Covode.recordClassIndex(49088);
    }

    View$OnClickListenerC41205m(C41178b bVar, Aweme aweme) {
        this.f96302a = bVar;
        this.f96303b = aweme;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C41178b bVar = this.f96302a;
        C39162r.m79460a("click_insight", new C33744d().mo59983a("enter_from", "banner_more_data").f79943a);
        C39162r.m79460a("enter_insight_detail", new C33744d().mo59983a("enter_from", "banner_more_data").f79943a);
        ShareDependService.C68822a.m121324a().mo109341a("https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=" + C80534hh.m139611c() + "#/video/" + this.f96303b.getAid(), bVar.f183419bv);
    }
}
