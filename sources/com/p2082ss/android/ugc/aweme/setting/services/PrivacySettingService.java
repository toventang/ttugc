package com.p2082ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.policy.C63143a;
import com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.services.PrivacySettingService */
public class PrivacySettingService implements IPrivacySettingService {
    static {
        Covode.recordClassIndex(80667);
    }

    /* renamed from: a */
    public static IPrivacySettingService m120774a() {
        MethodCollector.m26663i(4926);
        Object a = C81908b.m141854a(IPrivacySettingService.class, false);
        if (a != null) {
            IPrivacySettingService iPrivacySettingService = (IPrivacySettingService) a;
            MethodCollector.m26664o(4926);
            return iPrivacySettingService;
        }
        if (C81908b.f183316dM == null) {
            synchronized (IPrivacySettingService.class) {
                try {
                    if (C81908b.f183316dM == null) {
                        C81908b.f183316dM = new PrivacySettingService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4926);
                    throw th;
                }
            }
        }
        PrivacySettingService privacySettingService = (PrivacySettingService) C81908b.f183316dM;
        MethodCollector.m26664o(4926);
        return privacySettingService;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService
    /* renamed from: b */
    public final void mo108852b(Activity activity) {
        new C63143a(activity).mo101483a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService
    /* renamed from: a */
    public final boolean mo108851a(Activity activity) {
        int a = C16048b.m29633a().mo25412a(true, "publish_privacy_account_confirm", 0);
        if (!C31575b.m65865g().getCurUser().isAcceptPrivatePolicy()) {
            if (C31575b.m65865g().getCurUser().isSecret()) {
                new C63143a(activity).mo101483a();
                return false;
            } else if (a != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService
    /* renamed from: a */
    public final void mo108850a(Activity activity, IPrivacySettingService.AbstractC68424a aVar) {
        int i;
        int i2;
        int a = C16048b.m29633a().mo25412a(true, "publish_privacy_account_confirm", 0);
        C17197a.C17200a aVar2 = new C17197a.C17200a(activity);
        if (a == 1) {
            i = R.string.rr;
        } else {
            i = R.string.rt;
        }
        C17197a.C17200a a2 = aVar2.mo27189a(i);
        if (a == 1) {
            i2 = R.string.rq;
        } else {
            i2 = R.string.rs;
        }
        C17197a.C17200a b = a2.mo27194b(i2).mo27192a(activity.getString(R.string.es1), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68428b(aVar), false).mo27196b(activity.getString(R.string.a8y), DialogInterface$OnClickListenerC68429c.f153185a, false);
        b.f41084o = new DialogInterface$OnShowListenerC68430d(activity);
        b.mo27193a().mo27185c();
        C39162r.m79460a("account_privacy_show_notify", new C33744d().f79943a);
    }
}
