package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.k */
final /* synthetic */ class View$OnClickListenerC51740k implements View.OnClickListener {

    /* renamed from: a */
    private final ContactsActivity f119247a;

    static {
        Covode.recordClassIndex(61103);
    }

    View$OnClickListenerC51740k(ContactsActivity contactsActivity) {
        this.f119247a = contactsActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f119247a.f118991f.setVisibility(8);
        SharePrefCache.inst().getHasEnterBindPhone().mo59940b(true);
    }
}
