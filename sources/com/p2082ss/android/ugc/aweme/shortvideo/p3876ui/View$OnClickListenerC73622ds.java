package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71826f;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ds */
public final /* synthetic */ class View$OnClickListenerC73622ds implements View.OnClickListener {

    /* renamed from: a */
    private final C73560cj f165443a;

    static {
        Covode.recordClassIndex(86360);
    }

    View$OnClickListenerC73622ds(C73560cj cjVar) {
        this.f165443a = cjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73560cj cjVar = this.f165443a;
        C39162r.m79460a("click_privacy_setting", new C84425b().mo129406a("creation_id", cjVar.f165268K.creationId).mo129406a("enter_from", "video_post_page").mo129406a("content_type", C71817eu.m126792c(cjVar.f165268K)).mo129406a("content_source", cjVar.f165268K.getAvetParameter().getContentSource()).mo129406a("shoot_way", cjVar.f165268K.mShootWay).mo129406a("enter_method", "publishing").mo129403a("is_private", cjVar.f165284a ? 1 : 0).f188764a);
        int permission = cjVar.f165339n.f156258b.getPermission();
        cjVar.f165303aa = "click_audience_select";
        C71826f.m126820a(cjVar.f165303aa, permission);
    }
}
