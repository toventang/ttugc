package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.l */
public final class C9710l implements AbstractC2724b<C9701e> {
    static {
        Covode.recordClassIndex(11252);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9701e mo7304a(C2730f fVar) {
        return m17998b(fVar);
    }

    /* renamed from: b */
    public static C9701e m17998b(C2730f fVar) {
        C9701e eVar = new C9701e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b == 1) {
                eVar.f23665a = fVar.mo7314f();
            } else if (b == 2) {
                eVar.f23666b = C9708j.m17994b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f23667c = fVar.mo7313e();
            }
        }
    }
}
