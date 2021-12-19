package com.bytedance.android.live.liveinteract.multiguest.p316a.p322f;

import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7606e;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.f.d */
final /* synthetic */ class C5185d implements AbstractC88433f {

    /* renamed from: a */
    private final C5182a f13417a;

    /* renamed from: b */
    private final boolean f13418b;

    static {
        Covode.recordClassIndex(5777);
    }

    C5185d(C5182a aVar, boolean z) {
        this.f13417a = aVar;
        this.f13418b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C5182a aVar = this.f13417a;
        boolean z = this.f13418b;
        C5832d dVar = (C5832d) obj;
        if (dVar.data != null && !((C7606e) dVar.data).f18875n.isEmpty()) {
            C6898g.C6899a.f17285a.f17284c = ((C7606e) dVar.data).f18875n;
        }
        ((C5134a.AbstractC5136b) aVar.f14407f).mo10877a((C7606e) dVar.data, z);
        C5714i.m12554b(z ? 1 : 2, aVar.f13402a.getOwnerUserId(), C6898g.C6899a.f17285a.mo13196a(aVar.f13402a.getOwnerUserId()));
        aVar.f13405d = false;
    }
}
