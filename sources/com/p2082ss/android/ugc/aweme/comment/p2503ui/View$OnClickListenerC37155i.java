package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38884aj;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.i */
final /* synthetic */ class View$OnClickListenerC37155i implements View.OnClickListener {

    /* renamed from: a */
    private final C37035b f87550a;

    /* renamed from: b */
    private final Aweme f87551b;

    static {
        Covode.recordClassIndex(44509);
    }

    View$OnClickListenerC37155i(C37035b bVar, Aweme aweme) {
        this.f87550a = bVar;
        this.f87551b = aweme;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37035b bVar = this.f87550a;
        Aweme aweme = this.f87551b;
        if (aweme.isAd()) {
            AdCommentDependImpl.m75903b().mo59062a(bVar.getContext(), aweme.getAwemeRawAd().getCreativeIdStr(), "background", aweme.getAwemeRawAd().getLogExtra());
            C18129a.m33746a("draw_ad", "replay", aweme.getAwemeRawAd()).mo28897a("refer", "background").mo28902c();
        }
        AbstractC81915c.m141874a(new C38884aj(aweme.getAid()));
        bVar.mo63694h();
    }
}
