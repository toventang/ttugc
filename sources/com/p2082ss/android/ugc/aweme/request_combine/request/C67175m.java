package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.UserSettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67144f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.m */
public final class C67175m extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150595a;

    static {
        Covode.recordClassIndex(78778);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150595a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return "/aweme/v1/user/settings/";
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67144f());
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        UserSettingCombineModel userSettingCombineModel;
        C68348f userSetting;
        boolean z;
        String str;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            userSettingCombineModel = null;
        } else {
            userSettingCombineModel = data.getUserSettingCombineModel();
        }
        if (!(userSettingCombineModel == null || (userSetting = userSettingCombineModel.getUserSetting()) == null || userSetting.status_code != 0)) {
            this.f150595a = userSettingCombineModel;
            if (userSettingCombineModel.httpCode == 200) {
                C68348f userSetting2 = userSettingCombineModel.getUserSetting();
                C89219l.m154721d(userSetting2, "");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    SettingsRequestServiceImpl.m65417i().mo57279a(userSetting2);
                    C53603g.C53604a.m98850a();
                    C53603g.m98846c(Integer.valueOf(userSetting2.f152992n));
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    if (userSetting2.f152992n == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    createIIMServicebyMonsterPlugin.setKeyMtInnerPushSwitchOn(z);
                    createIIMServicebyMonsterPlugin.saveChatUserSetting(userSetting2.f152940C, userSetting2.f152941D, userSetting2.f152942E);
                    C53603g.C53604a.m98850a();
                    C53603g.m98843a(Integer.valueOf(userSetting2.f152995q));
                    C53603g.C53604a.m98850a();
                    C53603g.m98847d(Integer.valueOf(userSetting2.f152983e));
                    C53603g.C53604a.m98850a();
                    C53603g.m98844b(Integer.valueOf(userSetting2.f152959V));
                    if (C39223a.m79590d().mo68623h() == 1) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    C39162r.m79460a("tns_remove_photosensitive_status", new C33744d().mo59983a("status", str).f79943a);
                }
            }
            if (userSettingCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
