package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cy */
public final /* synthetic */ class View$OnClickListenerC73600cy implements View.OnClickListener {

    /* renamed from: a */
    private final C73560cj f165417a;

    static {
        Covode.recordClassIndex(86338);
    }

    View$OnClickListenerC73600cy(C73560cj cjVar) {
        this.f165417a = cjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73560cj cjVar = this.f165417a;
        C73543bz bzVar = cjVar.f165258A;
        new C23226a.C23227a().mo37817a(new C73541by()).mo37819a(true).f55057a.show(bzVar.f165230a.getChildFragmentManager(), "VideoPrivacySettingsSheet");
        C39162r.m79460a("click_video_privacy_settings_entrance", new C84425b().mo129406a("creation_id", cjVar.f165268K.creationId).mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", cjVar.f165268K.mShootWay).mo129406a("content_type", C71817eu.m126792c(cjVar.f165268K)).mo129406a("content_source", cjVar.f165268K.getAvetParameter().getContentSource()).f188764a);
    }
}
