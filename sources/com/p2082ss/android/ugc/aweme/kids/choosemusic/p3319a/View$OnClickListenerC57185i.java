package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57183h;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.i */
final /* synthetic */ class View$OnClickListenerC57185i implements View.OnClickListener {

    /* renamed from: a */
    private final C57183h.C57184a f130211a;

    static {
        Covode.recordClassIndex(67086);
    }

    View$OnClickListenerC57185i(C57183h.C57184a aVar) {
        this.f130211a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C57183h.C57184a aVar = this.f130211a;
        if (C57183h.this.f130206a != null) {
            C57183h.this.f130206a.mo94454a(aVar.f130209c, aVar.getLayoutPosition());
        }
    }
}
