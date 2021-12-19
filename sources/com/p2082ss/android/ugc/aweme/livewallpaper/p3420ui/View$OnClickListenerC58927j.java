package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.j */
final /* synthetic */ class View$OnClickListenerC58927j implements View.OnClickListener {

    /* renamed from: a */
    private final LocalLiveWallPaperActivity f134153a;

    static {
        Covode.recordClassIndex(69246);
    }

    View$OnClickListenerC58927j(LocalLiveWallPaperActivity localLiveWallPaperActivity) {
        this.f134153a = localLiveWallPaperActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f134153a.showSettingDialog(view);
    }
}
