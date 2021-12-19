package com.bytedance.android.livesdk.p447ak;

import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.livesdk.live.model.C9304c;
import com.bytedance.android.livesdkapi.service.AbstractC11843a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.ak.d */
final /* synthetic */ class C6768d implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC11843a f16811a;

    static {
        Covode.recordClassIndex(7506);
    }

    C6768d(AbstractC11843a aVar) {
        this.f16811a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C9304c cVar;
        AbstractC11843a aVar = this.f16811a;
        C5831c cVar2 = (C5831c) obj;
        if (!C13617h.m24465a(cVar2.f14684b) && (cVar = (C9304c) cVar2.f14684b.get(0)) != null) {
            aVar.mo18942a(cVar.f22742b);
        }
    }
}
