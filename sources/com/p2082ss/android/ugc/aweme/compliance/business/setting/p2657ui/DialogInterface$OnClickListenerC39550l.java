package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.l */
final /* synthetic */ class DialogInterface$OnClickListenerC39550l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f93282a;

    static {
        Covode.recordClassIndex(47258);
    }

    DialogInterface$OnClickListenerC39550l(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f93282a = childrenModeSettingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f93282a;
        if (!ChildrenModeSettingActivity.m80335a()) {
            new C79459a(childrenModeSettingActivity).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C29823c.m60080a(childrenModeSettingActivity, "log_out_popup", "confirm");
        C39162r.m79460a("log_out", new C33744d().mo59983a("enter_from", "settings_page").mo59980a("f_mode", 1).f79943a);
        C31575b.m65859a();
        C31575b.f75524a.mo57064a(childrenModeSettingActivity);
        childrenModeSettingActivity.runOnUiThread(new RunnableC39544f(childrenModeSettingActivity));
        C31575b.m65860b().logout("user_logout", "user_logout");
    }
}
