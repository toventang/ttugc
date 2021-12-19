package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.e */
final /* synthetic */ class View$OnClickListenerC32317e implements View.OnClickListener {

    /* renamed from: a */
    private final CountryListActivity f77097a;

    /* renamed from: b */
    private final C32311b f77098b;

    static {
        Covode.recordClassIndex(39085);
    }

    View$OnClickListenerC32317e(CountryListActivity countryListActivity, C32311b bVar) {
        this.f77097a = countryListActivity;
        this.f77098b = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        CountryListActivity countryListActivity = this.f77097a;
        C32311b bVar = this.f77098b;
        String obj = countryListActivity.f77046d.getText().toString();
        countryListActivity.f77044b.clear();
        Iterator<C31966a> it = countryListActivity.f77045c.iterator();
        while (it.hasNext()) {
            C31966a next = it.next();
            if (next.f76336e.toLowerCase().contains(obj) || countryListActivity.getString(next.f76332a).toLowerCase().contains(obj)) {
                countryListActivity.f77044b.add(next);
            }
        }
        bVar.notifyDataSetChanged();
    }
}
