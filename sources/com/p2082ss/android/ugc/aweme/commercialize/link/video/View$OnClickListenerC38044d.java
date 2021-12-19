package com.p2082ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.d */
final /* synthetic */ class View$OnClickListenerC38044d implements View.OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f89900a;

    /* renamed from: b */
    private final AbstractC38047g f89901b;

    static {
        Covode.recordClassIndex(45509);
    }

    View$OnClickListenerC38044d(CommerceTagLayout commerceTagLayout, AbstractC38047g gVar) {
        this.f89900a = commerceTagLayout;
        this.f89901b = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f89900a;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new RunnableC38045e(commerceTagLayout, this.f89901b));
    }
}
