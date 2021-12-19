package com.bytedance.android.livesdk.chatroom.p477a.p480c;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.f */
final /* synthetic */ class C7281f implements AbstractC88433f {

    /* renamed from: a */
    private final C7273a f18114a;

    static {
        Covode.recordClassIndex(8032);
    }

    C7281f(C7273a aVar) {
        this.f18114a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7273a aVar = this.f18114a;
        aVar.f18100g.setVisibility(8);
        aVar.f18101h.setVisibility(8);
        C6555i.m14021b();
        C3854a.m9455a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
