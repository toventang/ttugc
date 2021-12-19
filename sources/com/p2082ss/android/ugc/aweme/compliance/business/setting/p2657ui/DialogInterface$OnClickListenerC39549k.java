package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29823c;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.k */
final /* synthetic */ class DialogInterface$OnClickListenerC39549k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f93281a;

    static {
        Covode.recordClassIndex(47257);
    }

    DialogInterface$OnClickListenerC39549k(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f93281a = childrenModeSettingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C29823c.m60080a(this.f93281a, "log_out_popup", "cancel");
    }
}
