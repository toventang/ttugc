package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88292p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.w */
public final /* synthetic */ class View$OnClickListenerC52150w implements View.OnClickListener {

    /* renamed from: a */
    private final C52125f f120144a;

    static {
        Covode.recordClassIndex(61531);
    }

    View$OnClickListenerC52150w(C52125f fVar) {
        this.f120144a = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C52125f fVar = this.f120144a;
        C88292p value = fVar.f120094d.getValue();
        if (value == null || value.f200341g != 0) {
            fVar.f120111u.setCurrentItem(((Integer) view.getTag()).intValue());
        }
    }
}
