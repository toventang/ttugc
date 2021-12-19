package com.p2082ss.android.ugc.aweme.commercialize.link.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.e */
final /* synthetic */ class RunnableC38045e implements Runnable {

    /* renamed from: a */
    private final CommerceTagLayout f89902a;

    /* renamed from: b */
    private final AbstractC38047g f89903b;

    static {
        Covode.recordClassIndex(45510);
    }

    RunnableC38045e(CommerceTagLayout commerceTagLayout, AbstractC38047g gVar) {
        this.f89902a = commerceTagLayout;
        this.f89903b = gVar;
    }

    public final void run() {
        CommerceTagLayout commerceTagLayout = this.f89902a;
        AbstractC38047g gVar = this.f89903b;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        gVar.mo66019c();
    }
}
