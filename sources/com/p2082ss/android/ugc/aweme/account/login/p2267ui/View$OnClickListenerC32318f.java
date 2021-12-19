package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.f */
final /* synthetic */ class View$OnClickListenerC32318f implements View.OnClickListener {

    /* renamed from: a */
    private final CountryListActivity f77099a;

    static {
        Covode.recordClassIndex(39086);
    }

    View$OnClickListenerC32318f(CountryListActivity countryListActivity) {
        this.f77099a = countryListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f77099a.onBackPressed();
    }
}
