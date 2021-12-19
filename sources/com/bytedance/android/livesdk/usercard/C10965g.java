package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.usercard.g */
final /* synthetic */ class C10965g implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC10962f f26393a;

    static {
        Covode.recordClassIndex(12580);
    }

    C10965g(View$OnClickListenerC10962f fVar) {
        this.f26393a = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f26393a.onEvent((C11625a) obj);
    }
}
