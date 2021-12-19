package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.user.f */
public final class C3000f implements AbstractC2724b<SubscribeBadge> {
    static {
        Covode.recordClassIndex(3462);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ SubscribeBadge mo7304a(C2730f fVar) {
        return m8308b(fVar);
    }

    /* renamed from: b */
    public static SubscribeBadge m8308b(C2730f fVar) {
        SubscribeBadge subscribeBadge = new SubscribeBadge();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return subscribeBadge;
            } else if (b == 3) {
                subscribeBadge.originImage = C2977f.m8301b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                subscribeBadge.previewImage = C2977f.m8301b(fVar);
            }
        }
    }
}
