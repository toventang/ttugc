package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.livewallpaper.C58821a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.f */
final /* synthetic */ class View$OnClickListenerC58923f implements View.OnClickListener {

    /* renamed from: a */
    private final LiveWallPaperPreviewActivity f134149a;

    static {
        Covode.recordClassIndex(69242);
    }

    View$OnClickListenerC58923f(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f134149a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f134149a;
        if (liveWallPaperPreviewActivity.f134120e.isShouldMute()) {
            new C79459a(LiveWallPaperPreviewActivity.m108249a(liveWallPaperPreviewActivity)).mo123050a(R.string.haw).mo123053a();
            return;
        }
        liveWallPaperPreviewActivity.f134123h = !liveWallPaperPreviewActivity.f134123h;
        if (liveWallPaperPreviewActivity.f134123h) {
            liveWallPaperPreviewActivity.f134117b.setIconRes(R.raw.icon_speaker_2_ltr);
        } else {
            liveWallPaperPreviewActivity.f134117b.setIconRes(R.raw.icon_speaker_2_slash_ltr);
        }
        C58821a aVar = liveWallPaperPreviewActivity.f134121f;
        boolean z = liveWallPaperPreviewActivity.f134123h;
        if (aVar.f133901b == null) {
            return;
        }
        if (z) {
            aVar.f133901b.setVolume(1.0f, 1.0f);
        } else {
            aVar.f133901b.setVolume(0.0f, 0.0f);
        }
    }
}
