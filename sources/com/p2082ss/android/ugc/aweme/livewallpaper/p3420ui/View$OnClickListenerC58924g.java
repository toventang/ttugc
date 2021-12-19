package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.g */
final /* synthetic */ class View$OnClickListenerC58924g implements View.OnClickListener {

    /* renamed from: a */
    private final LiveWallPaperPreviewActivity f134150a;

    static {
        Covode.recordClassIndex(69243);
    }

    View$OnClickListenerC58924g(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f134150a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f134150a.showSettingDialog(view);
    }
}
