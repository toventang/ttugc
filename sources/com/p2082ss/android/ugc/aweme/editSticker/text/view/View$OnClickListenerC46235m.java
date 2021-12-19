package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.m */
public final /* synthetic */ class View$OnClickListenerC46235m implements View.OnClickListener {

    /* renamed from: a */
    private final C46224i f107728a;

    static {
        Covode.recordClassIndex(54797);
    }

    View$OnClickListenerC46235m(C46224i iVar) {
        this.f107728a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C46224i iVar = this.f107728a;
        if (iVar.f107690M != null) {
            iVar.f107690M.mo77584a();
        }
        if (iVar.f107679B != null) {
            iVar.f107679B.mo78316a(iVar.getTextWrapList());
        }
    }
}
