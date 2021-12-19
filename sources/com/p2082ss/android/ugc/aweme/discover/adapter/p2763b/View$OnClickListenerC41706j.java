package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41936o;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.j */
public final /* synthetic */ class View$OnClickListenerC41706j implements View.OnClickListener {

    /* renamed from: a */
    private final C41703h f97308a;

    static {
        Covode.recordClassIndex(49619);
    }

    View$OnClickListenerC41706j(C41703h hVar) {
        this.f97308a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C41703h hVar = this.f97308a;
        if (hVar.f97297j != null) {
            if (hVar.f97300m != null) {
                hVar.f97300m.mo71676a("sug", Integer.valueOf(hVar.f97299l), "complete", hVar.f97297j);
            }
            AbstractC81915c.m141874a(new C41936o(hVar.f97297j.f151667b));
            C41702g.m83658a(hVar.f97299l, hVar.f97297j);
        }
    }
}
