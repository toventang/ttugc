package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.settings.C63876c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ba */
final /* synthetic */ class View$OnClickListenerC68015ba implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152365a;

    static {
        Covode.recordClassIndex(80211);
    }

    View$OnClickListenerC68015ba(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152365a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f152365a;
        C39162r.onEventV3("ttelite_click_Pro_button");
        if (C31575b.m65865g().getCurUser().isForcePrivateAccount()) {
            new C23144b(i18nSettingManageMyAccountActivity).mo37640e(R.string.bu2).mo37637b();
        } else {
            SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, C63876c.m115573a(0, "settings")).open();
        }
    }
}
