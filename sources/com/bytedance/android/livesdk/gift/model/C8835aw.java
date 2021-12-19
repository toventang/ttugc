package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.aw */
public final class C8835aw implements AbstractC2724b<C8860x.C8861a> {
    static {
        Covode.recordClassIndex(9716);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8860x.C8861a mo7304a(C2730f fVar) {
        return m17155b(fVar);
    }

    /* renamed from: b */
    public static C8860x.C8861a m17155b(C2730f fVar) {
        C8860x.C8861a aVar = new C8860x.C8861a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f21803b = fVar.mo7313e();
            } else if (b == 2) {
                aVar.f21802a = fVar.mo7314f();
            } else if (b == 3) {
                aVar.f21804c = (int) fVar.mo7314f();
            } else if (b == 4) {
                aVar.f21805d = (int) fVar.mo7314f();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f21806e = C8834av.m17153b(fVar);
            }
        }
    }
}
