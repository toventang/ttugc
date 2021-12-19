package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.b */
final /* synthetic */ class View$OnClickListenerC68381b implements View.OnClickListener {

    /* renamed from: a */
    private final C68378a f153065a;

    static {
        Covode.recordClassIndex(80610);
    }

    View$OnClickListenerC68381b(C68378a aVar) {
        this.f153065a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C68378a aVar = this.f153065a;
        if (view.getId() == R.id.pi && aVar.getActivity() != null) {
            aVar.getActivity().onBackPressed();
        }
    }
}
