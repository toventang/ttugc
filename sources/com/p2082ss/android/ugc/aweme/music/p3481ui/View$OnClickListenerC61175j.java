package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.music.ui.j */
final /* synthetic */ class View$OnClickListenerC61175j implements View.OnClickListener {

    /* renamed from: a */
    private final EditOriginMusicTitleActivity f138901a;

    static {
        Covode.recordClassIndex(71780);
    }

    View$OnClickListenerC61175j(EditOriginMusicTitleActivity editOriginMusicTitleActivity) {
        this.f138901a = editOriginMusicTitleActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f138901a.onViewClicked(view);
    }
}
