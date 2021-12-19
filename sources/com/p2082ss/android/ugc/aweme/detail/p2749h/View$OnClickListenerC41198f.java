package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.h.f */
public final /* synthetic */ class View$OnClickListenerC41198f implements View.OnClickListener {

    /* renamed from: a */
    private final C41178b f96294a;

    /* renamed from: b */
    private final Aweme f96295b;

    static {
        Covode.recordClassIndex(49081);
    }

    View$OnClickListenerC41198f(C41178b bVar, Aweme aweme) {
        this.f96294a = bVar;
        this.f96295b = aweme;
    }

    public final void onClick(View view) {
        int i;
        String str;
        ClickAgent.onClick(view);
        C41178b bVar = this.f96294a;
        Aweme aweme = this.f96295b;
        CaptionItemModel d = C41178b.m82951d(aweme);
        if (d != null) {
            SmartRoute withParam = SmartRouter.buildRoute(bVar.f183419bv, "aweme://caption/translate/edit").withParam("subtitle_id", d.getClaSubtitleId()).withParam("enter_from", bVar.f114782aJ.getEventType()).withParam("enter_method", "video_edit").withParam("group_id", C59208ac.m108771e(aweme)).withParam("author_id", C59208ac.m108758a(aweme));
            if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                i = 0;
            } else {
                i = 1;
            }
            SmartRoute withParam2 = withParam.withParam("is_long", i);
            if (aweme.getVideo() == null || aweme.getVideo().getCaptionModel() == null || aweme.getVideo().getCaptionModel().getCaptionList() == null || aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage() == null) {
                str = "";
            } else {
                str = aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage().getLanguageName();
            }
            withParam2.withParam("video_lang", str).withParam("transl_lang", d.getLanguageName()).open();
        }
    }
}
