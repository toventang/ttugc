package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.favorites.i.g */
public final /* synthetic */ class View$OnClickListenerC47452g implements View.OnClickListener {

    /* renamed from: a */
    private final View$OnClickListenerC47450e f110225a;

    static {
        Covode.recordClassIndex(56065);
    }

    View$OnClickListenerC47452g(View$OnClickListenerC47450e eVar) {
        this.f110225a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f110225a.onClick(view);
    }
}
