package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.p */
final /* synthetic */ class View$OnLongClickListenerC78424p implements View.OnLongClickListener {

    /* renamed from: a */
    private final AwemeDraftNewViewHolder f176205a;

    static {
        Covode.recordClassIndex(91550);
    }

    View$OnLongClickListenerC78424p(AwemeDraftNewViewHolder awemeDraftNewViewHolder) {
        this.f176205a = awemeDraftNewViewHolder;
    }

    public final boolean onLongClick(View view) {
        AwemeDraftNewViewHolder awemeDraftNewViewHolder = this.f176205a;
        C70005cr.m123611a();
        if (!C70005cr.m123613a(view.getContext())) {
            return true;
        }
        awemeDraftNewViewHolder.f175381e.mo122026a(view, (C43223c) awemeDraftNewViewHolder.f175453t);
        return true;
    }
}
