package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.as */
final /* synthetic */ class View$OnClickListenerC40007as implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94029a;

    /* renamed from: b */
    private final C39256o f94030b;

    static {
        Covode.recordClassIndex(47773);
    }

    View$OnClickListenerC40007as(C39986a aVar, C39256o oVar) {
        this.f94029a = aVar;
        this.f94030b = oVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C39986a aVar = this.f94029a;
        if (this.f94030b.getResType() == 1) {
            aVar.mo69174c(R.string.fko);
        }
    }
}
