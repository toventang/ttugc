package com.p2082ss.android.ugc.aweme.tools.draft;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.q */
final /* synthetic */ class C78425q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final AwemeDraftNewViewHolder f176206a;

    static {
        Covode.recordClassIndex(91551);
    }

    C78425q(AwemeDraftNewViewHolder awemeDraftNewViewHolder) {
        this.f176206a = awemeDraftNewViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AwemeDraftNewViewHolder awemeDraftNewViewHolder = this.f176206a;
        ((C43223c) awemeDraftNewViewHolder.f175453t).f100925y = z;
        C78397c.m136927a().notifyDraftCheckedChanged((C43223c) awemeDraftNewViewHolder.f175453t, z);
    }
}
