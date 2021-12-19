package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.al */
final /* synthetic */ class View$OnClickListenerC73462al implements View.OnClickListener {

    /* renamed from: a */
    private final C73461ak f165066a;

    static {
        Covode.recordClassIndex(86199);
    }

    View$OnClickListenerC73462al(C73461ak akVar) {
        this.f165066a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73461ak akVar = this.f165066a;
        if (TextUtils.isEmpty(akVar.f165028M) || !C63244g.m114602a().mo73277e().getPublishPermissionDialogPublicQNA(true)) {
            akVar.mo116066b(0);
        } else {
            C63244g.m114602a().mo73277e().setPublishPermissionDialogPublicQNA(false);
            akVar.mo116064a(0, akVar.f165028M);
        }
        akVar.f165019D.setEnabled(true);
        akVar.f165019D.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_post));
    }
}
