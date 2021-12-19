package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.el */
public final /* synthetic */ class View$OnClickListenerC71808el implements View.OnClickListener {

    /* renamed from: a */
    private final C71804ej f160938a;

    static {
        Covode.recordClassIndex(84353);
    }

    View$OnClickListenerC71808el(C71804ej ejVar) {
        this.f160938a = ejVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C71804ej ejVar = this.f160938a;
        C39162r.m79460a("click_video_at", new C33744d().mo59983a("enter_from", "video_post_page").mo59983a("enter_method", "button").f79943a);
        if (ejVar.f160912c.getSelectionEnd() > ejVar.f160912c.getSelectionStart()) {
            return;
        }
        if (!C63238c.f143594u.mo93903b()) {
            C63238c.f143594u.mo93898a(ejVar.f160911b, "", "click_at_friend", (AbstractC63269z.AbstractC63270a) null);
        } else if (!ejVar.mo113465e()) {
            C63238c.f143578e.mo93877a(ejVar.f160911b);
        }
    }
}
