package com.bytedance.android.livesdk.model.message.p580d.p587g;

import com.bytedance.android.livesdk.chatroom.model.p495b.C7670i;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.g.b */
public final class C9770b implements AbstractC2724b<C9769a> {
    static {
        Covode.recordClassIndex(11312);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9769a mo7304a(C2730f fVar) {
        return m18063b(fVar);
    }

    /* renamed from: b */
    public static C9769a m18063b(C2730f fVar) {
        C9769a aVar = new C9769a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23781a.add(C7670i.m15663b(fVar));
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23782b.add(C7670i.m15663b(fVar));
            }
        }
    }
}
