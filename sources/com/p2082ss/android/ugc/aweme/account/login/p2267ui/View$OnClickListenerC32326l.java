package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.l */
final /* synthetic */ class View$OnClickListenerC32326l implements View.OnClickListener {

    /* renamed from: a */
    private final MusCountryListActivity f77113a;

    /* renamed from: b */
    private final C32319g f77114b;

    static {
        Covode.recordClassIndex(39094);
    }

    View$OnClickListenerC32326l(MusCountryListActivity musCountryListActivity, C32319g gVar) {
        this.f77113a = musCountryListActivity;
        this.f77114b = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusCountryListActivity musCountryListActivity = this.f77113a;
        C32319g gVar = this.f77114b;
        String lowerCase = musCountryListActivity.f77054d.getText().toString().toLowerCase();
        musCountryListActivity.f77052b.clear();
        Iterator<C31966a> it = musCountryListActivity.f77053c.iterator();
        while (it.hasNext()) {
            C31966a next = it.next();
            if (next.f76336e.toLowerCase().contains(lowerCase) || musCountryListActivity.getString(next.f76332a).toLowerCase().contains(lowerCase)) {
                musCountryListActivity.f77052b.add(next);
            }
        }
        gVar.notifyDataSetChanged();
    }
}
