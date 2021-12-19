package com.bytedance.android.livesdk.chatroom.model.p495b.p496a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.a.f */
public final class C7662f implements AbstractC2724b<C7659c> {
    static {
        Covode.recordClassIndex(8444);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7659c mo7304a(C2730f fVar) {
        C7659c cVar = new C7659c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 2) {
                cVar.f18976a = (int) fVar.mo7314f();
            } else if (b == 3) {
                cVar.f18977b = fVar.mo7313e();
            } else if (b == 6) {
                cVar.f18978c = fVar.mo7312d();
            } else if (b == 7) {
                cVar.f18979d = (int) fVar.mo7314f();
            } else if (b == 8) {
                cVar.f18980e = fVar.mo7312d();
            } else if (b != 11) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f18981f = (int) fVar.mo7314f();
            }
        }
    }
}
