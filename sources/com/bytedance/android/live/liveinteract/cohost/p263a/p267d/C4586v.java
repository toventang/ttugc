package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.v */
public final /* synthetic */ class C4586v implements AbstractC88433f {

    /* renamed from: a */
    private final C4566e f12216a;

    static {
        Covode.recordClassIndex(5162);
    }

    C4586v(C4566e eVar) {
        this.f12216a = eVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4566e eVar = this.f12216a;
        Throwable th = (Throwable) obj;
        C5721p.m12581a(C5721p.f14514b, th);
        eVar.mo13747a(th);
        ((C4566e.AbstractC4569a) eVar.f38654y).mo10328a(206);
    }
}
