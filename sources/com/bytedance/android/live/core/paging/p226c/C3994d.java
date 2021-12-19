package com.bytedance.android.live.core.paging.p226c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.core.paging.c.d */
final /* synthetic */ class C3994d implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC3993c f10946a;

    static {
        Covode.recordClassIndex(4525);
    }

    C3994d(AbstractC3993c cVar) {
        this.f10946a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC3993c cVar = this.f10946a;
        if (cVar.f10943m != null) {
            cVar.f10943m.run();
            cVar.f10943m = null;
        }
    }
}
