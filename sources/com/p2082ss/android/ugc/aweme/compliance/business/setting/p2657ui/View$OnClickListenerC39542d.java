package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.d */
final /* synthetic */ class View$OnClickListenerC39542d implements View.OnClickListener {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f93274a;

    static {
        Covode.recordClassIndex(47250);
    }

    View$OnClickListenerC39542d(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f93274a = childrenModeSettingActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f93274a.onVersionClick(view);
    }
}
