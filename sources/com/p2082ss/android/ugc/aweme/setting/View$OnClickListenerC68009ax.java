package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.ax */
final /* synthetic */ class View$OnClickListenerC68009ax implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152359a;

    static {
        Covode.recordClassIndex(80205);
    }

    View$OnClickListenerC68009ax(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152359a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f152359a.mo108568j();
    }
}
