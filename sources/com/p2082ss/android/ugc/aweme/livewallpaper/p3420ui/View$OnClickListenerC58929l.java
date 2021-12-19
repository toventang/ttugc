package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.l */
final /* synthetic */ class View$OnClickListenerC58929l implements View.OnClickListener {

    /* renamed from: a */
    private final LocalLiveWallPaperActivity f134155a;

    static {
        Covode.recordClassIndex(69248);
    }

    View$OnClickListenerC58929l(LocalLiveWallPaperActivity localLiveWallPaperActivity) {
        this.f134155a = localLiveWallPaperActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f134155a.findWallpapersTvClick(view);
    }
}
