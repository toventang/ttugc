package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.am */
final /* synthetic */ class View$OnClickListenerC67981am implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152306a;

    static {
        Covode.recordClassIndex(80160);
    }

    View$OnClickListenerC67981am(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152306a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f152306a.mo108570l();
    }
}
