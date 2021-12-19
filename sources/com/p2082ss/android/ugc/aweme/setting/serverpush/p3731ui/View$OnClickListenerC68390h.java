package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.h */
final /* synthetic */ class View$OnClickListenerC68390h implements View.OnClickListener {

    /* renamed from: a */
    private final C68386g f153114a;

    static {
        Covode.recordClassIndex(80619);
    }

    View$OnClickListenerC68390h(C68386g gVar) {
        this.f153114a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C68386g gVar = this.f153114a;
        try {
            C80428fg.m139434b(gVar.getContext());
        } catch (Exception unused) {
            Context context = gVar.getContext();
            Intent intent = new Intent("android.settings.SETTINGS");
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
        C39162r.m79460a("notifications_click", new C33744d().mo59983a("status", C80428fg.m139432a(gVar.getContext()) ? "on" : "off").f79943a);
    }
}
