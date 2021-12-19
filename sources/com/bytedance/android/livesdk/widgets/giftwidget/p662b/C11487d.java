package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.d */
final /* synthetic */ class C11487d implements AbstractC89172b {

    /* renamed from: a */
    private final C11483b f27560a;

    static {
        Covode.recordClassIndex(13146);
    }

    C11487d(C11483b bVar) {
        this.f27560a = bVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C11483b bVar = this.f27560a;
        boolean z = true;
        bVar.f27551f = !((Boolean) obj).booleanValue();
        C1213t<Boolean> tVar = bVar.f27549d;
        if (!bVar.f27550e && (bVar.f27551f || bVar.f27552g)) {
            z = false;
        }
        tVar.setValue(Boolean.valueOf(z));
        return C89391z.f203057a;
    }
}
