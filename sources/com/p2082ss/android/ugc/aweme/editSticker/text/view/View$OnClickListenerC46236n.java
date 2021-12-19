package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.n */
public final /* synthetic */ class View$OnClickListenerC46236n implements View.OnClickListener {

    /* renamed from: a */
    private final C46224i f107729a;

    static {
        Covode.recordClassIndex(54798);
    }

    View$OnClickListenerC46236n(C46224i iVar) {
        this.f107729a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C46224i iVar = this.f107729a;
        if (iVar.f107690M != null) {
            iVar.f107690M.mo77584a();
        }
        if (iVar.f107679B != null) {
            iVar.f107679B.mo78316a(iVar.getTextWrapList());
        }
    }
}
