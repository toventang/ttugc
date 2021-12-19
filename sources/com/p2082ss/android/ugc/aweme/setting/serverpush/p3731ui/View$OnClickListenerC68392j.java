package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.j */
final /* synthetic */ class View$OnClickListenerC68392j implements View.OnClickListener {

    /* renamed from: a */
    private final C68386g f153116a;

    static {
        Covode.recordClassIndex(80621);
    }

    View$OnClickListenerC68392j(C68386g gVar) {
        this.f153116a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C68386g gVar = this.f153116a;
        if (view.getId() == R.id.pi && gVar.getActivity() != null) {
            gVar.getActivity().onBackPressed();
        }
    }
}
