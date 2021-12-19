package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39243d;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39727a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.GroupChatViewModel */
public final class GroupChatViewModel extends BasePrivacyUserSettingViewModel implements AbstractC90253j {
    static {
        Covode.recordClassIndex(47646);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo69142b(int i) {
        return C39727a.m80620b("group_chat_invite", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final Integer mo69143a(C39258q qVar) {
        C89219l.m154721d(qVar, "");
        C39243d dVar = qVar.f92746e;
        if (dVar != null) {
            return Integer.valueOf(dVar.f92686b);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69144a(C39258q qVar, int i) {
        C89219l.m154721d(qVar, "");
        C39243d dVar = qVar.f92746e;
        if (dVar != null) {
            dVar.f92686b = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69141a(int i, BaseResponse baseResponse) {
        String str;
        C89219l.m154721d(baseResponse, "");
        super.mo69141a(i, baseResponse);
        if (i == 1) {
            str = "Friends";
        } else if (i != 2) {
            str = null;
        } else {
            str = "No_one";
        }
        C39162r.m79460a("change_group_chat_permission", new C33744d().mo59983a("enter_from", "group_chat_permission").mo59983a("to_status", str).mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
    }
}
