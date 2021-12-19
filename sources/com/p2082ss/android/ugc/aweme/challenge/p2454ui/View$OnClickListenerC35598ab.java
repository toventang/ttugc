package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.music.model.Music;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ab */
public final /* synthetic */ class View$OnClickListenerC35598ab implements View.OnClickListener {

    /* renamed from: a */
    private final C35596aa f83955a;

    /* renamed from: b */
    private final Music f83956b;

    static {
        Covode.recordClassIndex(42822);
    }

    View$OnClickListenerC35598ab(C35596aa aaVar, Music music) {
        this.f83955a = aaVar;
        this.f83956b = music;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C35596aa aaVar = this.f83955a;
        Music music = this.f83956b;
        C39162r.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(aaVar.f83951c).setValue(music.getMid()).setJsonObject(new C33743c().mo59976a("host", aaVar.f83950b).mo59977a()));
        SmartRouter.buildRoute(aaVar.f83949a, "aweme://music/detail").withParam("id", music.getMid()).withParam("extra_music_from", "from_related_tag").open();
    }
}
