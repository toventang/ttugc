package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39260s;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39727a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.recommend.RecommendViewModel */
public final class RecommendViewModel extends BasePrivacyUserSettingViewModel implements AbstractC90253j {
    static {
        Covode.recordClassIndex(47685);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final Integer mo69143a(C39258q qVar) {
        C89219l.m154721d(qVar, "");
        C39260s sVar = qVar.f92748g;
        if (sVar != null) {
            return Integer.valueOf(sVar.f92751a);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo69142b(int i) {
        C89219l.m154721d("upvote", "");
        AbstractC88979t<BaseResponse> a = C39727a.f93575a.setRecommendSetting("upvote", i).mo143280b(C39727a.C39738k.f93587a).mo143264a(C39727a.C39739l.f93588a);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69144a(C39258q qVar, int i) {
        C89219l.m154721d(qVar, "");
        C39260s sVar = qVar.f92748g;
        if (sVar != null) {
            sVar.f92751a = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69141a(int i, BaseResponse baseResponse) {
        String str;
        C89219l.m154721d(baseResponse, "");
        super.mo69141a(i, baseResponse);
        if (i == 1) {
            str = "on";
        } else {
            str = "off";
        }
        C39162r.m79460a("change_recommend_permission", new C33744d().mo59983a("enter_from", "recommend_permission").mo59983a("to_status", str).f79943a);
    }
}
