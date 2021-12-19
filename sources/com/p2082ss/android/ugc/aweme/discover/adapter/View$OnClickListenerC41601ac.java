package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41597aa;
import com.p2082ss.android.ugc.aweme.discover.widget.DialogC43041d;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ac */
final /* synthetic */ class View$OnClickListenerC41601ac implements View.OnClickListener {

    /* renamed from: a */
    private final C41597aa.C415981 f97027a;

    /* renamed from: b */
    private final DialogC43041d f97028b;

    static {
        Covode.recordClassIndex(49514);
    }

    View$OnClickListenerC41601ac(C41597aa.C415981 r1, DialogC43041d dVar) {
        this.f97027a = r1;
        this.f97028b = dVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C41597aa.C415981 r0 = this.f97027a;
        DialogC43041d dVar = this.f97028b;
        C41597aa.this.f97020a.mo72863b();
        dVar.dismiss();
    }
}
