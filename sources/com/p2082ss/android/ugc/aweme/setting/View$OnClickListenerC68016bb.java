package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.util.C33037g;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;

/* renamed from: com.ss.android.ugc.aweme.setting.bb */
final /* synthetic */ class View$OnClickListenerC68016bb implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152366a;

    static {
        Covode.recordClassIndex(80212);
    }

    View$OnClickListenerC68016bb(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152366a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152366a;
        C59206ab.m108755a("enter_delete_account").mo96746b("previous_page", "account_security_settings").mo96746b("enter_method", "click_button").mo96792f();
        C33037g.m67671a(i18nSettingManageMyAccountActivity);
    }
}
