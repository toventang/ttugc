package com.bytedance.android.livesdk.usercard;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.usercard.h */
final /* synthetic */ class C10966h implements AbstractC89172b {

    /* renamed from: a */
    private final View$OnClickListenerC10962f f26394a;

    static {
        Covode.recordClassIndex(12581);
    }

    C10966h(View$OnClickListenerC10962f fVar) {
        this.f26394a = fVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        View$OnClickListenerC10962f fVar = this.f26394a;
        fVar.f26372h.getOwner().setSubscribeStatus(true);
        fVar.mo17821b();
        return null;
    }
}
