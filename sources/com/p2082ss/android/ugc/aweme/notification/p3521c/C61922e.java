package com.p2082ss.android.ugc.aweme.notification.p3521c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62339d;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62341f;
import com.p2082ss.android.ugc.aweme.notification.view.template.EnumC62343h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.c.e */
public final class C61922e implements AbstractC62329c {
    static {
        Covode.recordClassIndex(72671);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final void mo100001a(C62339d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final boolean mo100002a(C62341f fVar) {
        User user;
        C61621c cVar;
        C61624f fVar2;
        List<User> list;
        C89219l.m154721d(fVar, "");
        if (fVar.f141477d != EnumC62343h.Root) {
            return false;
        }
        C61630e eVar = fVar.f141474a;
        String str = null;
        if (eVar == null || (cVar = eVar.f139886b) == null || (fVar2 = cVar.f139843d) == null || (list = fVar2.f139866a) == null) {
            user = null;
        } else {
            user = (User) C89070n.m154583g((List) list);
        }
        C33744d a = new C33744d().mo59983a("enter_from", "notification_page");
        if (user != null) {
            str = user.getUid();
        }
        C39162r.m79460a("enter_personal_detail", a.mo59983a("to_user_id", str).mo59983a("enter_method", "click_cell").f79943a);
        return false;
    }
}
