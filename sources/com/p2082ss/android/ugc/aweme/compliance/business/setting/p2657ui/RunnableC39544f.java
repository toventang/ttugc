package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.login.DialogC58952a;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.f */
final /* synthetic */ class RunnableC39544f implements Runnable {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f93276a;

    static {
        Covode.recordClassIndex(47252);
    }

    RunnableC39544f(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f93276a = childrenModeSettingActivity;
    }

    public final void run() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f93276a;
        if (childrenModeSettingActivity.f93265t == null) {
            childrenModeSettingActivity.f93265t = new DialogC58952a(childrenModeSettingActivity);
        }
        childrenModeSettingActivity.f93265t.show();
    }
}
