package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.c */
final /* synthetic */ class C11486c implements AbstractC1214u {

    /* renamed from: a */
    private final C11483b f27559a;

    static {
        Covode.recordClassIndex(13145);
    }

    C11486c(C11483b bVar) {
        this.f27559a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C11483b bVar = this.f27559a;
        if (bVar.f27548c != null) {
            bVar.f27548c.setVisibility(8);
        }
    }
}
