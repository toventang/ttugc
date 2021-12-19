package com.p2082ss.android.ugc.aweme.tools.draft;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.w */
final /* synthetic */ class C78470w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f176348a;

    static {
        Covode.recordClassIndex(91599);
    }

    C78470w(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f176348a = awemeDraftViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AwemeDraftViewHolder awemeDraftViewHolder = this.f176348a;
        ((C43223c) awemeDraftViewHolder.f175453t).f100925y = z;
        C78397c.m136927a().notifyDraftCheckedChanged((C43223c) awemeDraftViewHolder.f175453t, z);
    }
}
