package com.bytedance.android.livesdk.olddialog;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.olddialog.d */
final /* synthetic */ class C10000d implements AbstractC1214u {

    /* renamed from: a */
    private final C9991a f24297a;

    static {
        Covode.recordClassIndex(11554);
    }

    C10000d(C9991a aVar) {
        this.f24297a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f24297a.dismissAllowingStateLoss();
    }
}
