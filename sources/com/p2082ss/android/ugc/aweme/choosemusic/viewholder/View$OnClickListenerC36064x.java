package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35894an;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35758d;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35855a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.x */
final /* synthetic */ class View$OnClickListenerC36064x implements View.OnClickListener {

    /* renamed from: a */
    private final C36061v f85184a;

    /* renamed from: b */
    private final C35894an f85185b;

    /* renamed from: c */
    private final int f85186c;

    static {
        Covode.recordClassIndex(43312);
    }

    View$OnClickListenerC36064x(C36061v vVar, C35894an anVar, int i) {
        this.f85184a = vVar;
        this.f85185b = anVar;
        this.f85186c = i;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C35894an anVar = this.f85185b;
        int i = this.f85186c;
        String str = "";
        C39162r.m79460a("sug_arrow_click", new C35855a().mo62963a("words_source", "sug").mo62963a("search_position", "video_music").mo62961a("words_position", i).mo62963a("words_content", anVar.getContent()).mo62963a("group_id", anVar.getWordRecord() != null ? anVar.getWordRecord().getId() : str).mo62963a("creation_id", C35936b.f84815d).mo62964a(anVar.getExtraParam()).mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
        C35855a a = new C35855a().mo62963a("action_type", "complete").mo62963a("enter_method", "sug").mo62963a("group_id", anVar.getWordRecord() != null ? anVar.getWordRecord().getId() : str).mo62963a("input_keyword", anVar.getExtraParam() != null ? anVar.getExtraParam().get("raw_query") : str).mo62961a("order", i);
        if (anVar.getExtraParam() != null) {
            str = anVar.getExtraParam().get("impr_id");
        }
        C39162r.m79460a("search_trending_click", a.mo62963a("query_id", str).mo62963a("search_keyword", anVar.getContent()).mo62963a("search_type", "video_music").mo62963a("words_type", "sug").mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
        AbstractC81915c.m141874a(new C35758d(anVar.getContent()));
    }
}
