package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.j */
public final class C7613j implements AbstractC2724b<C7602a> {
    static {
        Covode.recordClassIndex(8388);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7602a mo7304a(C2730f fVar) {
        return m15625b(fVar);
    }

    /* renamed from: b */
    public static C7602a m15625b(C2730f fVar) {
        C7602a aVar = new C7602a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f18848a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                aVar.f18849b = C2731g.m7901a(fVar);
            } else if (b == 3) {
                aVar.f18850c = C2731g.m7901a(fVar);
            } else if (b == 4) {
                aVar.f18851d = C2731g.m7901a(fVar);
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f18852e = C2731g.m7901a(fVar);
            }
        }
    }
}
