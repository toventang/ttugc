package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.i */
final /* synthetic */ class View$OnClickListenerC76075i implements View.OnClickListener {

    /* renamed from: a */
    private final C76074h f170930a;

    static {
        Covode.recordClassIndex(89020);
    }

    View$OnClickListenerC76075i(C76074h hVar) {
        this.f170930a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C76074h hVar = this.f170930a;
        if (hVar.f170925a != null) {
            hVar.f170925a.mo119797b();
        }
    }
}
