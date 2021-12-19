package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bb */
public final /* synthetic */ class View$OnClickListenerC72167bb implements View.OnClickListener {

    /* renamed from: a */
    private final MvImageChooseAdapter.C72050e f161777a;

    static {
        Covode.recordClassIndex(84832);
    }

    View$OnClickListenerC72167bb(MvImageChooseAdapter.C72050e eVar) {
        this.f161777a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f161777a.f161480f.performClick();
    }
}
