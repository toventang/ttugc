package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.a */
final /* synthetic */ class View$OnClickListenerC57624a implements View.OnClickListener {

    /* renamed from: a */
    private final HomeBottomTabView f131526a;

    static {
        Covode.recordClassIndex(67585);
    }

    View$OnClickListenerC57624a(HomeBottomTabView homeBottomTabView) {
        this.f131526a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f131526a.setCurrentTab("homepage_hot");
    }
}
