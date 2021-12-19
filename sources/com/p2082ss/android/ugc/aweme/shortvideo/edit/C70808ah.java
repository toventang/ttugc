package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ah */
final /* synthetic */ class C70808ah implements AbstractC1214u {

    /* renamed from: a */
    private final VEVideoPublishEditActivity f158558a;

    static {
        Covode.recordClassIndex(83293);
    }

    C70808ah(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f158558a = vEVideoPublishEditActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        VEVideoPublishEditActivity vEVideoPublishEditActivity = this.f158558a;
        vEVideoPublishEditActivity.f158498x = (View) obj;
        vEVideoPublishEditActivity.cB_();
    }
}
