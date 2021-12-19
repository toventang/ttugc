package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.az */
final /* synthetic */ class View$OnClickListenerC40014az implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94037a;

    static {
        Covode.recordClassIndex(47780);
    }

    View$OnClickListenerC40014az(C39986a aVar) {
        this.f94037a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C39986a aVar = this.f94037a;
        aVar.getContext();
        if (!C39986a.m80960e()) {
            aVar.mo69174c(R.string.dcp);
        } else if (!((C34800h) aVar.f93994m.f95762k).f82200c && !aVar.mo69180i()) {
            aVar.mo69174c(R.string.bbo);
        } else if (aVar.f93984c != null && aVar.f93985d != null) {
            aVar.f93994m.mo70126a(new C40003ao(aVar));
            C39088c cVar = aVar.f93985d;
            int i = 3;
            Object[] objArr = new Object[3];
            objArr[0] = "item_download";
            objArr[1] = Integer.valueOf(((C34800h) aVar.f93994m.f95762k).f82200c ? 0 : 3);
            objArr[2] = aVar.f93984c.getAid();
            cVar.mo57616a(objArr);
            if (aVar.f93984c != null) {
                IAwemeService b = AwemeService.m70060b();
                Aweme aweme = aVar.f93984c;
                if (((C34800h) aVar.f93994m.f95762k).f82200c) {
                    i = 0;
                }
                b.mo60687c(aweme, i);
            }
        }
    }
}
