package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.v */
final /* synthetic */ class View$OnLongClickListenerC78430v implements View.OnLongClickListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f176214a;

    static {
        Covode.recordClassIndex(91556);
    }

    View$OnLongClickListenerC78430v(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f176214a = awemeDraftViewHolder;
    }

    public final boolean onLongClick(View view) {
        AwemeDraftViewHolder awemeDraftViewHolder = this.f176214a;
        C70005cr.m123611a();
        if (!C70005cr.m123613a(view.getContext())) {
            return true;
        }
        awemeDraftViewHolder.f175412o.mo122029a(view, (C43223c) awemeDraftViewHolder.f175453t);
        return true;
    }
}
