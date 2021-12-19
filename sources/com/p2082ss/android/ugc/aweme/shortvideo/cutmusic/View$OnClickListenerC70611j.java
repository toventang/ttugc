package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.j */
public final /* synthetic */ class View$OnClickListenerC70611j implements View.OnClickListener {

    /* renamed from: a */
    private final View$OnTouchListenerC70606h f158035a;

    static {
        Covode.recordClassIndex(83077);
    }

    View$OnClickListenerC70611j(View$OnTouchListenerC70606h hVar) {
        this.f158035a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        View$OnTouchListenerC70606h hVar = this.f158035a;
        if (hVar.f158026j != null) {
            hVar.f158026j.mo111390c(hVar.f158024h);
        }
    }
}
