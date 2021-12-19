package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.m */
final /* synthetic */ class View$OnClickListenerC58930m implements View.OnClickListener {

    /* renamed from: a */
    private final LocalLiveWallPaperActivity f134156a;

    static {
        Covode.recordClassIndex(69249);
    }

    View$OnClickListenerC58930m(LocalLiveWallPaperActivity localLiveWallPaperActivity) {
        this.f134156a = localLiveWallPaperActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f134156a.howSetWallpapersTvClick(view);
    }
}
