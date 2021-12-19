package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.ae */
public final /* synthetic */ class View$OnClickListenerC52236ae implements View.OnClickListener {

    /* renamed from: a */
    private final C52264i f120347a;

    static {
        Covode.recordClassIndex(61624);
    }

    View$OnClickListenerC52236ae(C52264i iVar) {
        this.f120347a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C52264i iVar = this.f120347a;
        iVar.f120433d.mo87951a();
        iVar.mo88018a(false, (AbstractC45904h) null, false);
    }
}
