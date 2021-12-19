package com.p2082ss.android.ugc.aweme.commercialize.link.micro;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.micro.a */
public final class View$OnClickListenerC38040a extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public AbstractC38041a f89889a;

    static {
        Covode.recordClassIndex(45503);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC38041a aVar = this.f89889a;
        if (aVar != null) {
            aVar.mo66018b();
        }
    }
}
