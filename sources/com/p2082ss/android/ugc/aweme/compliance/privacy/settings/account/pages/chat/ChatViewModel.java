package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39243d;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39727a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68066a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat.ChatViewModel */
public final class ChatViewModel extends BasePrivacyUserSettingViewModel implements AbstractC90253j {
    static {
        Covode.recordClassIndex(47604);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo69142b(int i) {
        return C39727a.m80620b("direct_message", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final Integer mo69143a(C39258q qVar) {
        C89219l.m154721d(qVar, "");
        C39243d dVar = qVar.f92746e;
        if (dVar != null) {
            return Integer.valueOf(dVar.f92685a);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69144a(C39258q qVar, int i) {
        C89219l.m154721d(qVar, "");
        C39243d dVar = qVar.f92746e;
        if (dVar != null) {
            dVar.f92685a = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69141a(int i, BaseResponse baseResponse) {
        String str = "";
        C89219l.m154721d(baseResponse, str);
        super.mo69141a(i, baseResponse);
        if (i == 1) {
            str = "Everyone";
        } else if (i == 2) {
            str = "Friends";
        } else if (i == 3) {
            str = "No_one";
        }
        C39162r.m79460a("change_message_permission", new C33744d().mo59983a("enter_from", "message_permission").mo59983a("to_status", str).f79943a);
        AbstractC81915c.m141874a(new C68066a(i));
        IMService.createIIMServicebyMonsterPlugin(false).updateChatUserSetting(i);
    }
}
