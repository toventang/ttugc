package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.music.p3463a.C60328b;
import com.p2082ss.android.ugc.aweme.p2759di.CommerceServiceImpl;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.ag */
final /* synthetic */ class View$OnClickListenerC35774ag implements View.OnClickListener {

    /* renamed from: a */
    private final C35771af f84437a;

    static {
        Covode.recordClassIndex(43013);
    }

    View$OnClickListenerC35774ag(C35771af afVar) {
        this.f84437a = afVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C35771af afVar = this.f84437a;
        if (C60328b.m110043a() != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "change_music_page");
            hashMap.put("category_name", afVar.f84422n);
            C39162r.m79460a("click_ad_sticker", hashMap);
            if (!CommerceServiceImpl.m83407a().mo60112a(afVar.getContext(), afVar.f84424p.f90279b.f90300c, false)) {
                CommerceServiceImpl.m83407a().mo60111a(afVar.getContext(), afVar.f84424p.f90279b.f90301d, afVar.f84424p.f90279b.f90302e);
            }
        }
    }
}
