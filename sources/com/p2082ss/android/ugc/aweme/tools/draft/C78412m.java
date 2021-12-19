package com.p2082ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.m */
final /* synthetic */ class C78412m implements AbstractC89171a {

    /* renamed from: a */
    private final C78386i f176179a;

    /* renamed from: b */
    private final ProgressDialog f176180b;

    static {
        Covode.recordClassIndex(91538);
    }

    C78412m(C78386i iVar, ProgressDialog progressDialog) {
        this.f176179a = iVar;
        this.f176180b = progressDialog;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        ProgressDialog progressDialog = this.f176180b;
        if (progressDialog == null) {
            return null;
        }
        progressDialog.dismiss();
        return null;
    }
}
