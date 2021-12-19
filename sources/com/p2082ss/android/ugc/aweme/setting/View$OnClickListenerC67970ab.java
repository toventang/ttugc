package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.ab */
final /* synthetic */ class View$OnClickListenerC67970ab implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152292a;

    static {
        Covode.recordClassIndex(80149);
    }

    View$OnClickListenerC67970ab(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152292a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f152292a.finish();
    }
}
