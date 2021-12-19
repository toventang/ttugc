package com.p2082ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.p */
public final /* synthetic */ class C36243p implements MentionTextView.AbstractC81409f {

    /* renamed from: a */
    private final C36229h f85615a;

    static {
        Covode.recordClassIndex(43509);
    }

    C36243p(C36229h hVar) {
        this.f85615a = hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81409f
    /* renamed from: a */
    public final void mo63408a(TextExtraStruct textExtraStruct) {
        C36229h hVar = this.f85615a;
        if (textExtraStruct.getUserId().equals(C31575b.m65865g().getCurUserId())) {
            C39162r.m79460a("self_mention_click", new C33744d().mo59983a("enter_from", hVar.f85567C).f79943a);
        }
        if (C17873f.m33102j() != null) {
            SmartRouter.buildRoute(C17873f.m33102j(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_uid", textExtraStruct.getSecUid()).open();
        }
        hVar.f85586k.getContext();
        C39162r.m79455a(StringSet.name, "comment_at", textExtraStruct.getUserId(), 0);
        hVar.mo63396a(textExtraStruct.getUserId(), "comment_at");
    }
}
