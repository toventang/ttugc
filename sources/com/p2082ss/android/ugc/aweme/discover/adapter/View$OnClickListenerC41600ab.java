package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.widget.DialogC43041d;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ab */
final /* synthetic */ class View$OnClickListenerC41600ab implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC43041d f97026a;

    static {
        Covode.recordClassIndex(49513);
    }

    View$OnClickListenerC41600ab(DialogC43041d dVar) {
        this.f97026a = dVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f97026a.dismiss();
    }
}
