package com.p2082ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46397z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.effect.ab */
public final /* synthetic */ class View$OnClickListenerC46266ab implements View.OnClickListener {

    /* renamed from: a */
    private final C46397z.C46399b f107838a;

    static {
        Covode.recordClassIndex(54843);
    }

    View$OnClickListenerC46266ab(C46397z.C46399b bVar) {
        this.f107838a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C46397z.C46399b bVar = this.f107838a;
        int adapterPosition = bVar.getAdapterPosition();
        if (-1 != adapterPosition) {
            C46397z.this.f108120a.mo78875a(5, adapterPosition, C46397z.this.f107835c.get(adapterPosition));
        }
    }
}
