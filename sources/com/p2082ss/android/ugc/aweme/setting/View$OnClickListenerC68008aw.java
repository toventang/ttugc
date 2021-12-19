package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.p2082ss.android.ugc.aweme.setting.api.DoBStatusApi;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.setting.aw */
final /* synthetic */ class View$OnClickListenerC68008aw implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152358a;

    static {
        Covode.recordClassIndex(80204);
    }

    View$OnClickListenerC68008aw(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152358a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152358a;
        DialogC17223o oVar = new DialogC17223o(i18nSettingManageMyAccountActivity);
        oVar.show();
        DoBStatusApi.C67990a.m120303a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67971ac(i18nSettingManageMyAccountActivity, oVar), new C67972ad(i18nSettingManageMyAccountActivity, oVar));
    }
}
