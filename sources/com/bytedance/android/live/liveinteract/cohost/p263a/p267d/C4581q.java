package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4497h;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.q */
final /* synthetic */ class C4581q implements AbstractC88433f {

    /* renamed from: a */
    private final C4566e f12210a;

    static {
        Covode.recordClassIndex(5157);
    }

    C4581q(C4566e eVar) {
        this.f12210a = eVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4566e eVar = this.f12210a;
        C89219l.m154721d("data_guest_user", "");
        C89219l.m154721d(obj, "");
        C4384b.f11909ap.put("data_guest_user", obj);
        eVar.f12175c.mo28315b(C4497h.class, obj);
    }
}
