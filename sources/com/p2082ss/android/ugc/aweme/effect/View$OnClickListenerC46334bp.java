package com.p2082ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46331bo;

/* renamed from: com.ss.android.ugc.aweme.effect.bp */
final /* synthetic */ class View$OnClickListenerC46334bp implements View.OnClickListener {

    /* renamed from: a */
    private final C46331bo.C46333b f107999a;

    static {
        Covode.recordClassIndex(54911);
    }

    View$OnClickListenerC46334bp(C46331bo.C46333b bVar) {
        this.f107999a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C46331bo.C46333b bVar = this.f107999a;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            boolean z = false;
            boolean z2 = C46331bo.this.f107992a.get(adapterPosition).isEnabled;
            if (C46331bo.this.f107993b != null) {
                z = C46331bo.this.f107993b.mo78816a(adapterPosition, z2);
            }
            if (z2 && z) {
                C46331bo.this.f107994c = adapterPosition;
                C46331bo.this.notifyDataSetChanged();
            }
        }
    }
}
