package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55618a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import p4600h.C89376n;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.ContactListCell */
public final class ContactListCell extends BaseContactListCell<C55597b> {
    static {
        Covode.recordClassIndex(65350);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.BaseContactListCell
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo23350a(AbstractC17641a aVar) {
        mo23350a((C55597b) aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.BaseContactListCell
    /* renamed from: a */
    public final void mo92491a(C55597b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo23350a(bVar);
        ContactListViewModel a = mo92490a();
        String uid = bVar.f126828a.getUid();
        C89219l.m154716b(uid, "");
        C89219l.m154721d(uid, "");
        int i = C55618a.f126868c[a.mo23342g().getEntry().ordinal()];
        if (i == 1) {
            C89219l.m154721d(uid, "");
            C39162r.m79462a("show_group_member", C89387v.m154943a(C54603a.f125151a, "previous_page"), C89387v.m154943a("member_list", "enter_from"), C89387v.m154943a(uid, "to_user_id"));
        } else if (i == 2) {
            C89219l.m154721d(uid, "");
            C54603a.m100105a("show_add_member", C89387v.m154943a(uid, "to_user_id"));
        } else {
            throw new C89376n();
        }
    }
}
