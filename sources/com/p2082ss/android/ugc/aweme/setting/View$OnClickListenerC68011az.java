package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.az */
final /* synthetic */ class View$OnClickListenerC68011az implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152361a;

    static {
        Covode.recordClassIndex(80207);
    }

    View$OnClickListenerC68011az(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152361a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f152361a.mo108567i();
    }
}
