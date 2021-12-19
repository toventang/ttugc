package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51536j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ad */
final /* synthetic */ class C51676ad implements C51492c.AbstractC51494b {

    /* renamed from: a */
    private final InviteFriendsActivity f119122a;

    /* renamed from: b */
    private final User f119123b;

    /* renamed from: c */
    private final ContactModel f119124c;

    static {
        Covode.recordClassIndex(61039);
    }

    C51676ad(InviteFriendsActivity inviteFriendsActivity, User user, ContactModel contactModel) {
        this.f119122a = inviteFriendsActivity;
        this.f119123b = user;
        this.f119124c = contactModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c.AbstractC51494b
    /* renamed from: a */
    public final void mo87010a(String str) {
        InviteFriendsActivity inviteFriendsActivity = this.f119122a;
        User user = this.f119123b;
        ContactModel contactModel = this.f119124c;
        boolean unused = C51536j.m96014a(inviteFriendsActivity, contactModel.phoneNumber, inviteFriendsActivity.f119061h.mo87004a(C80580in.m139697j(user)) + str, R.string.cnd);
    }
}
