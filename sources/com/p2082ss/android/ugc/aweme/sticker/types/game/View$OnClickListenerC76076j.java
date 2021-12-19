package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.j */
final /* synthetic */ class View$OnClickListenerC76076j implements View.OnClickListener {

    /* renamed from: a */
    private final C76074h f170931a;

    static {
        Covode.recordClassIndex(89021);
    }

    View$OnClickListenerC76076j(C76074h hVar) {
        this.f170931a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C76074h hVar = this.f170931a;
        if (hVar.f170925a != null) {
            hVar.f170925a.mo119796a();
        }
    }
}
