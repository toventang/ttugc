package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.av */
final /* synthetic */ class View$OnClickListenerC68007av implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152357a;

    static {
        Covode.recordClassIndex(80203);
    }

    View$OnClickListenerC68007av(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152357a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f152357a.mo108569k();
    }
}
