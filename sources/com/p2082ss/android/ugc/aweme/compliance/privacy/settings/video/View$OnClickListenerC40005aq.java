package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.aq */
final /* synthetic */ class View$OnClickListenerC40005aq implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94027a;

    static {
        Covode.recordClassIndex(47771);
    }

    View$OnClickListenerC40005aq(C39986a aVar) {
        this.f94027a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C39986a aVar = this.f94027a;
        C39162r.m79460a("change_transl_auth_status", new C33744d().mo59983a("enter_method", "setting").mo59983a("to_status", aVar.f93989h ? "off" : "on").mo59983a("group_id", aVar.f93984c.getAid()).f79943a);
        aVar.mo69177f();
    }
}
