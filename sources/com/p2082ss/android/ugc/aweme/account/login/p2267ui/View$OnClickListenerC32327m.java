package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.m */
final /* synthetic */ class View$OnClickListenerC32327m implements View.OnClickListener {

    /* renamed from: a */
    private final MusCountryListActivity f77115a;

    static {
        Covode.recordClassIndex(39095);
    }

    View$OnClickListenerC32327m(MusCountryListActivity musCountryListActivity) {
        this.f77115a = musCountryListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f77115a.onBackPressed();
    }
}
