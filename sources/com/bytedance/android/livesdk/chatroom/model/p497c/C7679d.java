package com.bytedance.android.livesdk.chatroom.model.p497c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.c.d */
public final class C7679d implements AbstractC2724b<C7676a> {
    static {
        Covode.recordClassIndex(8461);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7676a mo7304a(C2730f fVar) {
        return m15671b(fVar);
    }

    /* renamed from: b */
    public static C7676a m15671b(C2730f fVar) {
        C7676a aVar = new C7676a((byte) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 2) {
                aVar.f19019a = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f19020b = fVar.mo7313e();
            }
        }
    }
}
