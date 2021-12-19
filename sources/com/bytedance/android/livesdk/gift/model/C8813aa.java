package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.aa */
public final class C8813aa implements AbstractC2724b<DoodleTemplate> {
    static {
        Covode.recordClassIndex(9694);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ DoodleTemplate mo7304a(C2730f fVar) {
        return m17115b(fVar);
    }

    /* renamed from: b */
    public static DoodleTemplate m17115b(C2730f fVar) {
        DoodleTemplate doodleTemplate = new DoodleTemplate();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return doodleTemplate;
            } else if (b == 1) {
                doodleTemplate.f21688id = fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                doodleTemplate.image = C2977f.m8301b(fVar);
            }
        }
    }
}
