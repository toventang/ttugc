package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.f */
final /* synthetic */ class View$OnClickListenerC53445f implements View.OnClickListener {

    /* renamed from: a */
    private final C53443e f122661a;

    /* renamed from: b */
    private final AbstractC58069b f122662b;

    static {
        Covode.recordClassIndex(63014);
    }

    View$OnClickListenerC53445f(C53443e eVar, AbstractC58069b bVar) {
        this.f122661a = eVar;
        this.f122662b = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C53443e eVar = this.f122661a;
        AbstractC58069b bVar = this.f122662b;
        C53449i.m98635a(3);
        C39162r.m79460a("choose_language_popup", new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("language_type", bVar.mo90022f()).f79943a);
        if (TextUtils.equals(bVar.mo90022f(), SettingServiceImpl.m120782v().mo108857a(eVar.f122657a).mo90022f())) {
            eVar.f122658b.dismiss();
            return;
        }
        eVar.f122658b.dismiss();
        C53453b.C53456a.f122693a.mo90023a(bVar.mo90017a(), bVar.mo90022f(), eVar.f122657a);
        C31575b.m65865g().updateLanguage(null, SettingServiceImpl.m120782v().mo108872h(), 0);
    }
}
