package com.bytedance.android.livesdk.chatroom.model.p497c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.c.e */
public final class C7680e implements AbstractC2724b<C7677b> {
    static {
        Covode.recordClassIndex(8462);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7677b mo7304a(C2730f fVar) {
        C7677b bVar = new C7677b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f19021a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                bVar.f19022b = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f19023c = fVar.mo7313e();
            }
        }
    }
}
