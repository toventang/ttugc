package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.e */
final /* synthetic */ class View$OnClickListenerC57631e implements View.OnClickListener {

    /* renamed from: a */
    private final HomeBottomTabView f131541a;

    static {
        Covode.recordClassIndex(67592);
    }

    View$OnClickListenerC57631e(HomeBottomTabView homeBottomTabView) {
        this.f131541a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f131541a.setCurrentTab("personal_homepage");
    }
}
