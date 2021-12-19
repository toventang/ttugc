package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.ck */
final class C25430ck extends AbstractC25398bh {

    /* renamed from: a */
    private final /* synthetic */ Dialog f60340a;

    /* renamed from: b */
    private final /* synthetic */ RunnableC25428ci f60341b;

    static {
        Covode.recordClassIndex(30829);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25398bh
    /* renamed from: a */
    public final void mo41594a() {
        this.f60341b.f60336a.mo41657f();
        if (this.f60340a.isShowing()) {
            this.f60340a.dismiss();
        }
    }

    C25430ck(RunnableC25428ci ciVar, Dialog dialog) {
        this.f60341b = ciVar;
        this.f60340a = dialog;
    }
}
