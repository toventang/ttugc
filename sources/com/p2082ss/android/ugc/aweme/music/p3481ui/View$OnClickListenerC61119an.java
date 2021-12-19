package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.an */
public final /* synthetic */ class View$OnClickListenerC61119an implements View.OnClickListener {

    /* renamed from: a */
    private final C61100ah f138793a;

    /* renamed from: b */
    private final List f138794b;

    static {
        Covode.recordClassIndex(71722);
    }

    View$OnClickListenerC61119an(C61100ah ahVar, List list) {
        this.f138793a = ahVar;
        this.f138794b = list;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C61100ah ahVar = this.f138793a;
        ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) this.f138794b.get(0);
        if (ahVar.f138732aw != null) {
            ahVar.f138732aw.mo98693a(ahVar.getContext(), externalMusicInfo, true);
        }
    }
}
