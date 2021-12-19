package com.p2082ss.android.ugc.aweme.compliance.business.vzbv.p2659ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.vzbv.p2658a.C39589a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.vzbv.ui.a */
final /* synthetic */ class DialogInterface$OnClickListenerC39590a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final PrivacyAccountTipActivity f93354a;

    static {
        Covode.recordClassIndex(47302);
    }

    DialogInterface$OnClickListenerC39590a(PrivacyAccountTipActivity privacyAccountTipActivity) {
        this.f93354a = privacyAccountTipActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PrivacyAccountTipActivity privacyAccountTipActivity = this.f93354a;
        SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().mo59940b(true);
        if (!privacyAccountTipActivity.isDestroyed()) {
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = PrivacyAccountTipActivity.m80374b();
            }
            if (!C58029j.f132253e) {
                new C23144b(privacyAccountTipActivity).mo37635a(privacyAccountTipActivity.getString(R.string.dck)).mo37637b();
                C39223a.m79595i().mo68685d();
                SettingServiceImpl.m120782v().providePushSettingChangePresenter().mo57616a("notify_private_account", 1);
                C39589a.m80372a("privacy_account_setting_confirm", privacyAccountTipActivity.f93349a);
                C39162r.m79460a("tns_privacy_notify_confirm_check", new C33744d().f79943a);
            }
        }
        if (privacyAccountTipActivity.f93350b == null) {
            privacyAccountTipActivity.mo69008a();
        }
        privacyAccountTipActivity.f93350b.mo103291a();
        privacyAccountTipActivity.finish();
        C39223a.m79595i().mo68685d();
        SettingServiceImpl.m120782v().providePushSettingChangePresenter().mo57616a("notify_private_account", 1);
        C39589a.m80372a("privacy_account_setting_confirm", privacyAccountTipActivity.f93349a);
        C39162r.m79460a("tns_privacy_notify_confirm_check", new C33744d().f79943a);
    }
}
