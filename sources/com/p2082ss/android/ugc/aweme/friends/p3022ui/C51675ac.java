package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.ui.ac */
public final /* synthetic */ class C51675ac implements SwipeRefreshLayout.AbstractC34634b {

    /* renamed from: a */
    private final InviteFriendsActivity f119121a;

    static {
        Covode.recordClassIndex(61038);
    }

    C51675ac(InviteFriendsActivity inviteFriendsActivity) {
        this.f119121a = inviteFriendsActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
    /* renamed from: a */
    public final void mo59551a() {
        InviteFriendsActivity inviteFriendsActivity = this.f119121a;
        if (inviteFriendsActivity.f119063j != null) {
            inviteFriendsActivity.f119063j.mo57616a(1);
            return;
        }
        inviteFriendsActivity.f119057d.setRefreshing(false);
    }
}
