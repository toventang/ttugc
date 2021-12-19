package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.l */
public final /* synthetic */ class View$OnClickListenerC52273l implements View.OnClickListener {

    /* renamed from: a */
    private final C52264i f120462a;

    static {
        Covode.recordClassIndex(61661);
    }

    View$OnClickListenerC52273l(C52264i iVar) {
        this.f120462a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C52264i iVar = this.f120462a;
        iVar.f120433d.mo87951a();
        iVar.f120420K.clear();
        iVar.mo88017a(false, (AbstractC45904h) null);
    }
}
