package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39247h;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39727a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.C68570bv;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.LikedListViewModel */
public final class LikedListViewModel extends BasePrivacyUserSettingViewModel implements AbstractC90253j {
    static {
        Covode.recordClassIndex(47655);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final Integer mo69143a(C39258q qVar) {
        C89219l.m154721d(qVar, "");
        C39247h hVar = qVar.f92744c;
        if (hVar != null) {
            return Integer.valueOf(hVar.f92705a);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo69142b(int i) {
        AbstractC88979t<BaseResponse> a = C39727a.f93575a.setLikedList("favorite_list", i).mo143280b(C39727a.C39736i.f93585a).mo143264a(C39727a.C39737j.f93586a);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69144a(C39258q qVar, int i) {
        C89219l.m154721d(qVar, "");
        C39247h hVar = qVar.f92744c;
        if (hVar != null) {
            hVar.f92705a = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69141a(int i, BaseResponse baseResponse) {
        String str;
        C89219l.m154721d(baseResponse, "");
        super.mo69141a(i, baseResponse);
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        C33594aj<Integer> c = sVar.mo60059c();
        C89219l.m154716b(c, "");
        c.mo59940b(Integer.valueOf(i));
        AbstractC81915c.m141874a(new C68570bv());
        if (i == 0) {
            str = "Everyone";
        } else {
            str = "Only_me";
        }
        C39162r.m79460a("change_liked_permission", new C33744d().mo59983a("enter_from", "liked_permission").mo59983a("to_status", str).f79943a);
    }
}
