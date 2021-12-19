package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ck */
public final class C9581ck implements AbstractC2724b<C9542az> {
    static {
        Covode.recordClassIndex(11120);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9542az mo7304a(C2730f fVar) {
        return m17913b(fVar);
    }

    /* renamed from: b */
    public static C9542az m17913b(C2730f fVar) {
        C9542az azVar = new C9542az();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return azVar;
            } else if (b == 1) {
                azVar.f23191a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                azVar.f23192b = C2731g.m7901a(fVar);
            } else if (b == 3) {
                azVar.f23193c = C2731g.m7901a(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                azVar.f23194d = fVar.mo7314f();
            }
        }
    }
}
