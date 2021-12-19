package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.u */
final /* synthetic */ class View$OnClickListenerC78429u implements View.OnClickListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f176213a;

    static {
        Covode.recordClassIndex(91555);
    }

    View$OnClickListenerC78429u(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f176213a = awemeDraftViewHolder;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AwemeDraftViewHolder awemeDraftViewHolder = this.f176213a;
        if (awemeDraftViewHolder.f175410m) {
            awemeDraftViewHolder.f175406i.setChecked(!((C43223c) awemeDraftViewHolder.f175453t).f100925y);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - awemeDraftViewHolder.f175414q >= 500) {
            awemeDraftViewHolder.f175414q = currentTimeMillis;
            awemeDraftViewHolder.f175412o.mo122028a(awemeDraftViewHolder.getAdapterPosition(), (C43223c) awemeDraftViewHolder.f175453t);
        }
    }
}
