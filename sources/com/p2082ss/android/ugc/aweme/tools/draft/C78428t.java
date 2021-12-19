package com.p2082ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.t */
final /* synthetic */ class C78428t implements AbstractC89171a {

    /* renamed from: a */
    private final AwemeDraftNewViewHolder.View$OnClickListenerC781081 f176211a;

    /* renamed from: b */
    private final ProgressDialog f176212b;

    static {
        Covode.recordClassIndex(91554);
    }

    C78428t(AwemeDraftNewViewHolder.View$OnClickListenerC781081 r1, ProgressDialog progressDialog) {
        this.f176211a = r1;
        this.f176212b = progressDialog;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        ProgressDialog progressDialog = this.f176212b;
        if (progressDialog == null) {
            return null;
        }
        progressDialog.dismiss();
        return null;
    }
}
