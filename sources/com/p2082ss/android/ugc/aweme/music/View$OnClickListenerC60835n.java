package com.p2082ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.music.n */
public final /* synthetic */ class View$OnClickListenerC60835n implements View.OnClickListener {

    /* renamed from: a */
    private final C60818j f138250a;

    static {
        Covode.recordClassIndex(71421);
    }

    public View$OnClickListenerC60835n(C60818j jVar) {
        this.f138250a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C60818j jVar = this.f138250a;
        if (jVar.f138224o != null && MusicService.m81198m().mo69308a(jVar.f138224o, jVar.itemView.getContext(), true)) {
            jVar.f138225p = !jVar.f138225p;
            if (jVar.f138225p) {
                C39162r.m79460a("favourite_song", new C33744d().mo59983a("enter_from", "personal_homepage_list").mo59983a("previous_page", jVar.f138227r).mo59983a("music_id", jVar.f138224o.getMusicId()).mo59983a("enter_method", "personal_list").f79943a);
            } else {
                C39162r.m79460a("cancel_favourite_song", new C33744d().mo59983a("enter_from", "personal_homepage_list").mo59983a("previous_page", jVar.f138227r).mo59983a("music_id", jVar.f138224o.getMusicId()).mo59983a("enter_method", "personal_list").f79943a);
            }
            boolean z = jVar.f138225p;
            AbstractC81915c.m141874a(new C60793b(z ? 1 : 0, jVar.f138224o));
            jVar.f138218i.mo98607b();
        }
    }
}
