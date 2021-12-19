package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9726ci;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.gd */
public final class C9875gd implements AbstractC2724b<C9726ci.C9727a> {
    static {
        Covode.recordClassIndex(11417);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9726ci.C9727a mo7304a(C2730f fVar) {
        return m18189b(fVar);
    }

    /* renamed from: b */
    public static C9726ci.C9727a m18189b(C2730f fVar) {
        C9726ci.C9727a aVar = new C9726ci.C9727a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23721a = fVar.mo7314f();
            } else if (b == 2) {
                aVar.f23722b = fVar.mo7314f();
            } else if (b == 3) {
                aVar.f23723c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23724d = fVar.mo7312d();
            }
        }
    }
}
