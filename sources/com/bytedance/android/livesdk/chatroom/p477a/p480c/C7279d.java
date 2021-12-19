package com.bytedance.android.livesdk.chatroom.p477a.p480c;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.d */
final /* synthetic */ class C7279d implements AbstractC88433f {

    /* renamed from: a */
    private final C7273a f18111a;

    static {
        Covode.recordClassIndex(8030);
    }

    C7279d(C7273a aVar) {
        this.f18111a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7273a aVar = this.f18111a;
        aVar.f18098e.setVisibility(8);
        aVar.f18099f.setVisibility(8);
        C6555i.m14021b();
        C3854a.m9455a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
