package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.c */
final /* synthetic */ class View$OnClickListenerC70057c implements View.OnClickListener {

    /* renamed from: a */
    private final C70045a f156669a;

    static {
        Covode.recordClassIndex(82477);
    }

    View$OnClickListenerC70057c(C70045a aVar) {
        this.f156669a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C70045a aVar = this.f156669a;
        if (aVar.f156642g != null) {
            MediaPlayerModule mediaPlayerModule = aVar.f156642g;
            if (mediaPlayerModule.f134716d) {
                mediaPlayerModule.f134715c = true;
                mediaPlayerModule.mo96697b();
                return;
            }
            mediaPlayerModule.f134715c = false;
            mediaPlayerModule.mo96696a();
        }
    }
}
