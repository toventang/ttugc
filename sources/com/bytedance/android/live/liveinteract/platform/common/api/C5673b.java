package com.bytedance.android.live.liveinteract.platform.common.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7604c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.api.b */
public final /* synthetic */ class C5673b implements AbstractC88433f {

    /* renamed from: a */
    public static final AbstractC88433f f14408a = new C5673b();

    static {
        Covode.recordClassIndex(6271);
    }

    private C5673b() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        C5832d dVar = (C5832d) obj;
        if (dVar.data != null) {
            C6805b<Boolean> bVar = AbstractC6804a.f16970bS;
            C7604c cVar = (C7604c) dVar.data;
            boolean z3 = false;
            if (cVar.f18856a == null) {
                z = false;
            } else {
                z = cVar.f18856a.f18848a;
            }
            C6806c.m14603a(bVar, Boolean.valueOf(z));
            C6805b<Boolean> bVar2 = AbstractC6804a.f16971bT;
            C7604c cVar2 = (C7604c) dVar.data;
            if (cVar2.f18856a == null) {
                z2 = false;
            } else {
                z2 = cVar2.f18856a.f18850c;
            }
            C6806c.m14603a(bVar2, Boolean.valueOf(z2));
            C6805b<Boolean> bVar3 = AbstractC6804a.f17035ci;
            C7604c cVar3 = (C7604c) dVar.data;
            if (cVar3.f18856a != null) {
                z3 = cVar3.f18856a.f18852e;
            }
            C6806c.m14603a(bVar3, Boolean.valueOf(z3));
        }
    }
}
