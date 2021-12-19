package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cd */
final /* synthetic */ class View$OnClickListenerC50170cd implements View.OnClickListener {

    /* renamed from: a */
    private final C50166cc f115843a;

    static {
        Covode.recordClassIndex(59296);
    }

    View$OnClickListenerC50170cd(C50166cc ccVar) {
        this.f115843a = ccVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C50166cc ccVar = this.f115843a;
        if (TextUtils.isEmpty(ccVar.f115819m) || TextUtils.isEmpty(ccVar.f115821o)) {
            ccVar.f115819m = new SpannableStringBuilder(ccVar.f113953L.getProcessedDesc());
            ccVar.f115821o = new SpannableStringBuilder(ccVar.f113953L.getEllipsizeDesc());
        }
        boolean equals = ccVar.f115811e.getText().toString().equals(ccVar.f113959R.getString(R.string.bua));
        if (equals) {
            ccVar.mo85317a(ccVar.f115819m, equals);
        } else {
            ccVar.mo85317a(ccVar.f115821o, equals);
        }
    }
}
