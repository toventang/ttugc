package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.p */
public final class C9652p implements AbstractC2724b<C9631a> {
    static {
        Covode.recordClassIndex(11194);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9631a mo7304a(C2730f fVar) {
        return m17959b(fVar);
    }

    /* renamed from: b */
    public static C9631a m17959b(C2730f fVar) {
        C9631a aVar = new C9631a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23475a = (int) fVar.mo7314f();
            } else if (b == 3) {
                aVar.f23476b = (int) fVar.mo7314f();
            } else if (b == 4) {
                aVar.f23477c = fVar.mo7312d();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23478d = C9633ab.m17953b(fVar);
            }
        }
    }
}
