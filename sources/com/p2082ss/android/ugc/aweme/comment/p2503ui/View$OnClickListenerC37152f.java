package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.p2498l.C36534b;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.f */
public final /* synthetic */ class View$OnClickListenerC37152f implements View.OnClickListener {

    /* renamed from: a */
    private final C37035b f87542a;

    /* renamed from: b */
    private final String f87543b;

    /* renamed from: c */
    private final Aweme f87544c;

    /* renamed from: d */
    private final C37437a f87545d;

    static {
        Covode.recordClassIndex(44506);
    }

    View$OnClickListenerC37152f(C37035b bVar, String str, Aweme aweme, C37437a aVar) {
        this.f87542a = bVar;
        this.f87543b = str;
        this.f87544c = aweme;
        this.f87545d = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37035b bVar = this.f87542a;
        String str = this.f87543b;
        Aweme aweme = this.f87544c;
        C37437a aVar = this.f87545d;
        C39162r.m79460a("select_report_ads", new C33744d().mo59983a("creativeId", aweme.getCommerceVideoAuthInfo().getCreativeId()).f79943a);
        SmartRoute buildRoute = SmartRouter.buildRoute(bVar.getContext(), C36534b.m74349a() + "%26selectTab%3d" + str);
        buildRoute.withParam("bundle_ad_id_from_aweme", aVar.getAdId()).withParam("bundle_advertiser_id_from_aweme", aVar.getAdvId()).withParam("bundle_creative_id_from_aweme", aVar.getCreativeId()).withParam("bundle_item_id_from_aweme", aVar.getItemId()).withParam("bundle_view_time_from_aweme", aVar.getLastViewTime()).withParam("bundle_desc_from_aweme", aweme.getDesc());
        if (!(aweme.getVideo() == null || aweme.getVideo().getCover() == null || aweme.getVideo().getCover().getUrlList() == null || aweme.getVideo().getCover().getUrlList().size() <= 0)) {
            buildRoute.withParam("bundle_cover_url_from_aweme", aweme.getVideo().getCover().getUrlList().get(0));
        }
        buildRoute.open();
    }
}
