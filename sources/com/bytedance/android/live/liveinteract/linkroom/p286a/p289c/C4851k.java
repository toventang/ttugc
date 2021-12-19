package com.bytedance.android.live.liveinteract.linkroom.p286a.p289c;

import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4500k;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.k */
final /* synthetic */ class C4851k implements AbstractC88433f {

    /* renamed from: a */
    private final C4840b f12705a;

    static {
        Covode.recordClassIndex(5433);
    }

    C4851k(C4840b bVar) {
        this.f12705a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4840b bVar = this.f12705a;
        int intValue = ((Long) obj).intValue();
        bVar.f12684a.f11924N = intValue - 1;
        if (bVar.f18624w != null) {
            bVar.f18624w.mo28315b(C4500k.class, Integer.valueOf(intValue));
        }
    }
}
