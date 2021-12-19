package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.t */
final /* synthetic */ class C4584t implements AbstractC88433f {

    /* renamed from: a */
    private final C4566e f12214a;

    static {
        Covode.recordClassIndex(5160);
    }

    C4584t(C4566e eVar) {
        this.f12214a = eVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4566e eVar = this.f12214a;
        eVar.mo13747a((Throwable) obj);
        if (!eVar.f12176d.mo10150a(EnumC4440k.CONNECTION_SUCCEED)) {
            ((C4566e.AbstractC4569a) eVar.f38654y).mo10328a(208);
        }
    }
}
