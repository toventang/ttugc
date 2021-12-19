package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.ab */
public final /* synthetic */ class View$OnClickListenerC70065ab implements View.OnClickListener {

    /* renamed from: a */
    private final C70582z.C70585c f156677a;

    /* renamed from: b */
    private final C70582z.C70585c f156678b;

    static {
        Covode.recordClassIndex(82485);
    }

    View$OnClickListenerC70065ab(C70582z.C70585c cVar, C70582z.C70585c cVar2) {
        this.f156677a = cVar;
        this.f156678b = cVar2;
    }

    public final void onClick(View view) {
        int adapterPosition;
        ClickAgent.onClick(view);
        C70582z.C70585c cVar = this.f156677a;
        C70582z.C70585c cVar2 = this.f156678b;
        if (C70582z.this.f157927d && (adapterPosition = cVar2.getAdapterPosition()) <= C70582z.this.f157924a.size() && adapterPosition >= 0) {
            C70582z.this.f157926c.mo110976a(adapterPosition, C70582z.this.f157924a.get(adapterPosition).f156680b.mo110571a(true));
        }
    }
}
