package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ec */
final /* synthetic */ class View$OnClickListenerC50262ec implements View.OnClickListener {

    /* renamed from: a */
    private final C50261eb f116061a;

    static {
        Covode.recordClassIndex(59388);
    }

    View$OnClickListenerC50262ec(C50261eb ebVar) {
        this.f116061a = ebVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C50261eb ebVar = this.f116061a;
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("enter_appeal", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("group_id", ebVar.f116150a.getFromGroupId()).f79943a);
            String reviewDetailUrl = ebVar.f116150a.getReviewDetailUrl();
            if (!TextUtils.isEmpty(reviewDetailUrl)) {
                Intent buildIntent = SmartRouter.buildRoute(view.getContext(), "aweme://webview/").buildIntent();
                buildIntent.setData(Uri.parse(reviewDetailUrl));
                Activity j = C17873f.m33102j();
                if (j != null) {
                    C84349a.m145093a(buildIntent, j);
                    j.startActivity(buildIntent);
                }
            }
        }
    }
}
