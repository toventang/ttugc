package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.usercard.q */
final /* synthetic */ class C10980q implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC10973o f26442a;

    static {
        Covode.recordClassIndex(12595);
    }

    C10980q(View$OnClickListenerC10973o oVar) {
        this.f26442a = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        View$OnClickListenerC10973o oVar = this.f26442a;
        C11625a aVar = (C11625a) obj;
        if (!aVar.f27775a.mo18452b()) {
            C13628n.m24510a(oVar.f26434x, 8);
        } else if (aVar.f27775a.f27930a == oVar.f26422g.getOwnerUserId()) {
            C13628n.m24510a(oVar.f26434x, 0);
        }
    }
}
