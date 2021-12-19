package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.al */
final /* synthetic */ class View$OnClickListenerC51684al implements View.OnClickListener {

    /* renamed from: a */
    private final InviteUserListActivity f119132a;

    static {
        Covode.recordClassIndex(61047);
    }

    View$OnClickListenerC51684al(InviteUserListActivity inviteUserListActivity) {
        this.f119132a = inviteUserListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f119132a.onBackPressed();
    }
}
