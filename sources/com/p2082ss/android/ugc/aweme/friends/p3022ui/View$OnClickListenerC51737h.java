package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.h */
final /* synthetic */ class View$OnClickListenerC51737h implements View.OnClickListener {

    /* renamed from: a */
    private final ContactsActivity f119244a;

    static {
        Covode.recordClassIndex(61100);
    }

    View$OnClickListenerC51737h(ContactsActivity contactsActivity) {
        this.f119244a = contactsActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C31575b.m65863e().bindMobile(this.f119244a, "", null, null);
    }
}
