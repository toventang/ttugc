package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.av */
public final class C8834av implements AbstractC2724b<C8860x.C8861a.C8862a> {
    static {
        Covode.recordClassIndex(9715);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8860x.C8861a.C8862a mo7304a(C2730f fVar) {
        return m17153b(fVar);
    }

    /* renamed from: b */
    public static C8860x.C8861a.C8862a m17153b(C2730f fVar) {
        C8860x.C8861a.C8862a aVar = new C8860x.C8861a.C8862a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f21807a = fVar.mo7312d();
            } else if (b == 2) {
                aVar.f21808b = C2977f.m8301b(fVar);
            } else if (b == 3) {
                aVar.f21809c = (int) fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f21810d = fVar.mo7313e();
            }
        }
    }
}
