package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.p */
final /* synthetic */ class C11499p implements AbstractC89172b {

    /* renamed from: a */
    private final C11483b f27572a;

    static {
        Covode.recordClassIndex(13158);
    }

    C11499p(C11483b bVar) {
        this.f27572a = bVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C11483b bVar = this.f27572a;
        bVar.f27550e = ((Boolean) obj).booleanValue();
        bVar.f27549d.setValue(Boolean.valueOf(bVar.f27550e || !bVar.f27551f));
        return C89391z.f203057a;
    }
}
