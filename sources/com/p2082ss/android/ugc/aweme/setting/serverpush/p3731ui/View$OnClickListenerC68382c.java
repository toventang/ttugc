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

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.c */
final /* synthetic */ class View$OnClickListenerC68382c implements View.OnClickListener {

    /* renamed from: a */
    private final C68378a f153066a;

    static {
        Covode.recordClassIndex(80611);
    }

    View$OnClickListenerC68382c(C68378a aVar) {
        this.f153066a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C68378a aVar = this.f153066a;
        try {
            C80428fg.m139434b(aVar.getContext());
        } catch (Exception unused) {
            Context context = aVar.getContext();
            Intent intent = new Intent("android.settings.SETTINGS");
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
        C39162r.m79460a("notifications_click", new C33744d().mo59983a("status", C80428fg.m139432a(aVar.getContext()) ? "on" : "off").f79943a);
    }
}
