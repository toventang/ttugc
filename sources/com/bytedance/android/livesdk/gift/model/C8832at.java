package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.at */
public final class C8832at implements AbstractC2724b<C8860x.C8863b> {
    static {
        Covode.recordClassIndex(9713);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8860x.C8863b mo7304a(C2730f fVar) {
        return m17149b(fVar);
    }

    /* renamed from: b */
    public static C8860x.C8863b m17149b(C2730f fVar) {
        C8860x.C8863b bVar = new C8860x.C8863b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f21811a = C2977f.m8301b(fVar);
            }
        }
    }
}
