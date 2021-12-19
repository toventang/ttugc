package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.android.livesdk.chatroom.model.p495b.C7670i;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.s */
public final class C5606s implements AbstractC2724b<C5594g> {
    static {
        Covode.recordClassIndex(6203);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C5594g mo7304a(C2730f fVar) {
        C5594g gVar = new C5594g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b == 1) {
                gVar.f14234a.add(C7670i.m15663b(fVar));
            } else if (b == 2) {
                gVar.f14235b.add(C7670i.m15663b(fVar));
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f14236c.add(C7670i.m15663b(fVar));
            }
        }
    }
}
