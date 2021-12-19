package com.p2082ss.android.ugc.tools.view.p4363b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.view.b.d */
public final /* synthetic */ class View$OnClickListenerC84930d implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC84926c.C84929b f189776a;

    static {
        Covode.recordClassIndex(98924);
    }

    View$OnClickListenerC84930d(AbstractC84926c.C84929b bVar) {
        this.f189776a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC84926c.C84929b bVar = this.f189776a;
        if (AbstractC84926c.this.f189769o != null) {
            AbstractC84926c.this.f189769o.mo112467a();
        }
        if (bVar.f189773a != null) {
            bVar.f189773a.f189777a = false;
        }
    }
}
