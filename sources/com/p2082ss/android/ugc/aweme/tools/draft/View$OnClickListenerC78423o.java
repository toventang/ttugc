package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.o */
final /* synthetic */ class View$OnClickListenerC78423o implements View.OnClickListener {

    /* renamed from: a */
    private final AwemeDraftNewViewHolder f176204a;

    static {
        Covode.recordClassIndex(91549);
    }

    View$OnClickListenerC78423o(AwemeDraftNewViewHolder awemeDraftNewViewHolder) {
        this.f176204a = awemeDraftNewViewHolder;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AwemeDraftNewViewHolder awemeDraftNewViewHolder = this.f176204a;
        if (awemeDraftNewViewHolder.f175379c) {
            awemeDraftNewViewHolder.f175378b.setChecked(!((C43223c) awemeDraftNewViewHolder.f175453t).f100925y);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - awemeDraftNewViewHolder.f175383g >= 500) {
            awemeDraftNewViewHolder.f175383g = currentTimeMillis;
            awemeDraftNewViewHolder.f175381e.mo122025a(awemeDraftNewViewHolder.getAdapterPosition(), (C43223c) awemeDraftNewViewHolder.f175453t);
        }
    }
}
