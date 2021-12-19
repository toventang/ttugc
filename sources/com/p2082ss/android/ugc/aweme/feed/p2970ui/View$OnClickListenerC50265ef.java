package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ef */
final /* synthetic */ class View$OnClickListenerC50265ef implements View.OnClickListener {

    /* renamed from: a */
    private final String f116064a;

    /* renamed from: b */
    private final Aweme f116065b;

    static {
        Covode.recordClassIndex(59391);
    }

    View$OnClickListenerC50265ef(String str, Aweme aweme) {
        this.f116064a = str;
        this.f116065b = aweme;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        String str = this.f116064a;
        Aweme aweme = this.f116065b;
        if (!C58001a.m104815a(view, 1200)) {
            SmartRouter.buildRoute(view.getContext(), "//webview").withParam(Uri.parse(str)).open();
            String str2 = "";
            C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("group_id", aweme.getAid()).mo59982a("music_id", aweme.getMusic() == null ? str2 : Long.valueOf(aweme.getMusic().getId()));
            if (aweme.getVideo() != null) {
                str2 = aweme.getVideo().isLongVideo() ? "1" : "0";
            }
            C39162r.m79460a("click_music_mute_detail", a.mo59983a("is_long_video", str2).f79943a);
        }
    }
}
