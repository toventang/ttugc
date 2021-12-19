package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.internal.C56808a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cz */
public final /* synthetic */ class View$OnClickListenerC73601cz implements View.OnClickListener {

    /* renamed from: a */
    private final C73560cj f165418a;

    static {
        Covode.recordClassIndex(86339);
    }

    View$OnClickListenerC73601cz(C73560cj cjVar) {
        this.f165418a = cjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73560cj cjVar = this.f165418a;
        if (!C63238c.f143594u.mo93903b()) {
            C63238c.f143594u.mo93898a(cjVar, "", "", (AbstractC63269z.AbstractC63270a) null);
            return;
        }
        C39162r.m79460a("click_video_tag", new C33744d().mo59983a("enter_from", "video_post_page").f79943a);
        C56808a.f129376a.mo93956a(cjVar.getContext(), "video_post_page", null, cjVar.f165339n.f156258b.getPermission(), cjVar.f165268K.tagUserList, new C73649es(cjVar));
    }
}
