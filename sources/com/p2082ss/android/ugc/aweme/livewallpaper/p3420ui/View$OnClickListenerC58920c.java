package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.c */
final /* synthetic */ class View$OnClickListenerC58920c implements View.OnClickListener {

    /* renamed from: a */
    private final LiveWallPaperPreviewActivity f134146a;

    static {
        Covode.recordClassIndex(69239);
    }

    View$OnClickListenerC58920c(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f134146a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f134146a.exit(view);
    }
}
