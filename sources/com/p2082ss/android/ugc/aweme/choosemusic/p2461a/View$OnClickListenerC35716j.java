package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35714i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.j */
final /* synthetic */ class View$OnClickListenerC35716j implements View.OnClickListener {

    /* renamed from: a */
    private final C35714i.C35715a f84251a;

    static {
        Covode.recordClassIndex(42948);
    }

    View$OnClickListenerC35716j(C35714i.C35715a aVar) {
        this.f84251a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C35714i.C35715a aVar = this.f84251a;
        if (C35714i.this.f84246a != null) {
            C35714i.this.f84246a.mo62936a(aVar.f84249c, aVar.getLayoutPosition());
        }
    }
}
