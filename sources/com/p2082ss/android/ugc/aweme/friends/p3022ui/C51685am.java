package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.ui.am */
public final /* synthetic */ class C51685am implements AbstractC88433f {

    /* renamed from: a */
    private final InviteUserListActivity f119133a;

    static {
        Covode.recordClassIndex(61048);
    }

    C51685am(InviteUserListActivity inviteUserListActivity) {
        this.f119133a = inviteUserListActivity;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        InviteUserListActivity inviteUserListActivity = this.f119133a;
        C79546d dVar = (C79546d) obj;
        if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
            C39162r.m79460a("friend_list_notify_confirm", new C33744d().mo59983a("enter_from", "facebook").f79943a);
            inviteUserListActivity.f119092n = C79519c.C79521b.f178476a.mo86987a(inviteUserListActivity.f119093o);
            if (TextUtils.isEmpty(inviteUserListActivity.f119092n)) {
                new C23144b(inviteUserListActivity).mo37640e(R.string.cnj).mo37637b();
            } else {
                inviteUserListActivity.mo87406c();
            }
        } else if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
            inviteUserListActivity.f119086h.setRefreshing(false);
            inviteUserListActivity.finish();
        }
    }
}
