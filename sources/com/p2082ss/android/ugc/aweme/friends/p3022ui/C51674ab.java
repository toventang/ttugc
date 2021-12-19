package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.ui.ab */
public final /* synthetic */ class C51674ab implements AbstractC69681f {

    /* renamed from: a */
    private final InviteFriendsActivity f119119a;

    /* renamed from: b */
    private final InviteFriendSharePackage f119120b;

    static {
        Covode.recordClassIndex(61037);
    }

    C51674ab(InviteFriendsActivity inviteFriendsActivity, InviteFriendSharePackage inviteFriendSharePackage) {
        this.f119119a = inviteFriendsActivity;
        this.f119120b = inviteFriendSharePackage;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
    /* renamed from: a_ */
    public final void mo87413a_(AbstractC69581b bVar) {
        InviteFriendsActivity inviteFriendsActivity = this.f119119a;
        InviteFriendSharePackage inviteFriendSharePackage = this.f119120b;
        if (!inviteFriendSharePackage.mo109321a(bVar, inviteFriendsActivity)) {
            bVar.mo61913a(inviteFriendSharePackage.mo87088a(bVar), inviteFriendsActivity);
        }
    }
}
