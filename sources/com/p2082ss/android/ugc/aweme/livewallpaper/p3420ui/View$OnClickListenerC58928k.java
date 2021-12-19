package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.k */
final /* synthetic */ class View$OnClickListenerC58928k implements View.OnClickListener {

    /* renamed from: a */
    private final LocalLiveWallPaperActivity f134154a;

    static {
        Covode.recordClassIndex(69247);
    }

    View$OnClickListenerC58928k(LocalLiveWallPaperActivity localLiveWallPaperActivity) {
        this.f134154a = localLiveWallPaperActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f134154a.exit(view);
    }
}
