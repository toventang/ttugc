package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.b */
final /* synthetic */ class View$OnClickListenerC53440b implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC53439a f122654a;

    static {
        Covode.recordClassIndex(63009);
    }

    View$OnClickListenerC53440b(DialogC53439a aVar) {
        this.f122654a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        DialogC53439a aVar = this.f122654a;
        C53449i.m98635a(3);
        C39162r.m79460a("choose_language_popup", new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("language_type", "cancel").f79943a);
        aVar.dismiss();
    }
}
