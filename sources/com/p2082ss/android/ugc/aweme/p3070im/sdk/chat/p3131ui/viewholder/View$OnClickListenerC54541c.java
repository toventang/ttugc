package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.c */
public final /* synthetic */ class View$OnClickListenerC54541c implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC54482a f125002a;

    /* renamed from: b */
    private final C19538ai f125003b;

    static {
        Covode.recordClassIndex(64252);
    }

    public View$OnClickListenerC54541c(AbstractC54482a aVar, C19538ai aiVar) {
        this.f125002a = aVar;
        this.f125003b = aiVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC54482a aVar = this.f125002a;
        if (AbstractC54482a.m99818b(this.f125003b) && aVar.f124810f != null) {
            aVar.f124810f.setChecked(!aVar.f124810f.isChecked());
        }
    }
}
