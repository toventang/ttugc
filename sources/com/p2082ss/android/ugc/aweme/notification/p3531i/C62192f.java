package com.p2082ss.android.ugc.aweme.notification.p3531i;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.f */
public final class C62192f extends C62208i.C62209a implements C62061as.AbstractC62063b {
    static {
        Covode.recordClassIndex(72946);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as.AbstractC62063b
    /* renamed from: x */
    public final void mo99842x() {
        ActivityC0945e l = mo100208l();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        SmartRouter.buildRoute(l, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "notification_page").withParam("enter_method", "click_turn_on_qna").open();
    }
}
