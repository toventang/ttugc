package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39246g;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39727a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentViewModel */
public final class CommentViewModel extends BasePrivacyUserSettingViewModel implements AbstractC90253j {
    static {
        Covode.recordClassIndex(47610);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo69142b(int i) {
        return C39727a.m80619a(UGCMonitor.EVENT_COMMENT, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final Integer mo69143a(C39258q qVar) {
        C89219l.m154721d(qVar, "");
        C39246g gVar = qVar.f92742a;
        if (gVar != null) {
            return Integer.valueOf(gVar.f92704d);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69144a(C39258q qVar, int i) {
        C89219l.m154721d(qVar, "");
        C39246g gVar = qVar.f92742a;
        if (gVar != null) {
            gVar.f92704d = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    /* renamed from: a */
    public final void mo69141a(int i, BaseResponse baseResponse) {
        String str;
        C89219l.m154721d(baseResponse, "");
        super.mo69141a(i, baseResponse);
        if (i != 0) {
            if (i == 1) {
                str = "Friends";
            } else if (i != 3) {
                str = null;
            } else {
                str = "No_one";
            }
        } else if (C39631a.m80486b()) {
            str = "Followers";
        } else {
            str = "Everyone";
        }
        C39162r.m79460a("change_comment_permission", new C33744d().mo59983a("enter_from", "comment_permission").mo59983a("to_status", str).mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        User e = C39631a.m80489e();
        e.setCommentSetting(i);
        C39631a.m80490f().mo57069e().updateCurUser(e);
    }
}
