package com.p2082ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46327bm;
import com.p2082ss.android.ugc.tools.utils.C84902i;

/* renamed from: com.ss.android.ugc.aweme.effect.bn */
final /* synthetic */ class View$OnClickListenerC46330bn implements View.OnClickListener {

    /* renamed from: a */
    private final C46327bm.C46329b f107991a;

    static {
        Covode.recordClassIndex(54907);
    }

    View$OnClickListenerC46330bn(C46327bm.C46329b bVar) {
        this.f107991a = bVar;
    }

    public final void onClick(View view) {
        int i;
        ClickAgent.onClick(view);
        C46327bm.C46329b bVar = this.f107991a;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            if (C46327bm.this.f107985b == adapterPosition) {
                C46327bm.this.f107985b = -1;
                i = 2;
            } else {
                if (C84902i.m145892a(C46327bm.this.f107835c.get(adapterPosition).resDir)) {
                    C46327bm.this.f107985b = adapterPosition;
                } else {
                    C46327bm.this.f107985b = -1;
                }
                i = 1;
            }
            if (C46327bm.this.f107984a != null) {
                C46327bm.this.f107984a.mo78812a(C46327bm.this.f107835c.get(bVar.getAdapterPosition()), i, adapterPosition);
            }
            C46327bm.this.notifyDataSetChanged();
        }
    }
}
