package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.br */
public final class C9561br implements AbstractC2724b<C9905u> {
    static {
        Covode.recordClassIndex(11100);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9905u mo7304a(C2730f fVar) {
        return m17876b(fVar);
    }

    /* renamed from: b */
    public static C9905u m17876b(C2730f fVar) {
        C9905u uVar = new C9905u();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return uVar;
            } else if (b == 1) {
                uVar.f24023b = C2731g.m7901a(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                uVar.f24022a = fVar.mo7313e();
            }
        }
    }
}
