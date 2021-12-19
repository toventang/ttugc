package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51536j;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.ContactsActivity;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.s */
final /* synthetic */ class C51748s implements C51492c.AbstractC51494b {

    /* renamed from: a */
    private final ContactsActivity.C516532 f119256a;

    /* renamed from: b */
    private final User f119257b;

    /* renamed from: c */
    private final ContactModel f119258c;

    static {
        Covode.recordClassIndex(61111);
    }

    C51748s(ContactsActivity.C516532 r1, User user, ContactModel contactModel) {
        this.f119256a = r1;
        this.f119257b = user;
        this.f119258c = contactModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c.AbstractC51494b
    /* renamed from: a */
    public final void mo87010a(String str) {
        ContactsActivity.C516532 r5 = this.f119256a;
        User user = this.f119257b;
        ContactModel contactModel = this.f119258c;
        boolean unused = C51536j.m96014a(ContactsActivity.this, contactModel.phoneNumber, ContactsActivity.this.f119001p.mo87004a(C80580in.m139697j(user)) + str, R.string.cnd);
    }
}
