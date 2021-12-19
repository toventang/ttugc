package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.au */
final /* synthetic */ class View$OnClickListenerC40009au implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94032a;

    static {
        Covode.recordClassIndex(47775);
    }

    View$OnClickListenerC40009au(C39986a aVar) {
        this.f94032a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C39986a aVar = this.f94032a;
        aVar.getContext();
        if (!C39986a.m80960e()) {
            aVar.mo69174c(R.string.dcp);
            return;
        }
        if (C39986a.m80957c(aVar.f93984c) == 0) {
            aVar.f93988g = !aVar.f93988g;
            aVar.f93992k.mo70126a(new C40022f(aVar));
            C39162r.m79460a("disable_video_stitch", new C33744d().mo59983a("to_status", aVar.f93988g ? "on" : "off").f79943a);
        }
        C1731i.m5640b(new CallableC40028l(aVar), C1731i.f5562a).mo5534a(new C40029m(aVar), C1731i.f5564c, null);
    }
}
