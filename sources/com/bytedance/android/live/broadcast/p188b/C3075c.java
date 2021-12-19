package com.bytedance.android.live.broadcast.p188b;

import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.b.c */
final /* synthetic */ class C3075c implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC3073a f8934a;

    static {
        Covode.recordClassIndex(3555);
    }

    C3075c(View$OnClickListenerC3073a aVar) {
        this.f8934a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3049b.C3050a.m8357a("ttlive_fetch_room_info_all", (Throwable) obj).mo12633b("pc_broadcast").mo12632a();
    }
}
