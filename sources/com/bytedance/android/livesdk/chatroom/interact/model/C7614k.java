package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.k */
public final class C7614k implements AbstractC2724b<C7603b> {
    static {
        Covode.recordClassIndex(8389);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7603b mo7304a(C2730f fVar) {
        C7603b bVar = new C7603b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f18855c = fVar.mo7313e();
            } else if (b == 2) {
                bVar.f18853a = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f18854b = fVar.mo7314f();
            }
        }
    }
}
