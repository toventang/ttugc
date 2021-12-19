package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.b */
final /* synthetic */ class View$OnClickListenerC68545b implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC68505a f153365a;

    static {
        Covode.recordClassIndex(80798);
    }

    View$OnClickListenerC68545b(DialogC68505a aVar) {
        this.f153365a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153365a.hide();
    }
}
