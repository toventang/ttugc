package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.ui.o */
public final /* synthetic */ class C51744o implements SwipeRefreshLayout.AbstractC34634b {

    /* renamed from: a */
    private final ContactsActivity f119251a;

    static {
        Covode.recordClassIndex(61107);
    }

    C51744o(ContactsActivity contactsActivity) {
        this.f119251a = contactsActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
    /* renamed from: a */
    public final void mo59551a() {
        ContactsActivity contactsActivity = this.f119251a;
        if (contactsActivity.f118995j != null) {
            contactsActivity.f118995j.mo57616a(1);
            return;
        }
        contactsActivity.f118989d.setRefreshing(false);
    }
}
