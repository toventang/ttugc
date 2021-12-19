package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bu */
public final class C9564bu implements AbstractC2724b<GiftTrayInfo> {
    static {
        Covode.recordClassIndex(11103);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ GiftTrayInfo mo7304a(C2730f fVar) {
        return m17882b(fVar);
    }

    /* renamed from: b */
    public static GiftTrayInfo m17882b(C2730f fVar) {
        GiftTrayInfo giftTrayInfo = new GiftTrayInfo();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return giftTrayInfo;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                giftTrayInfo.mDynamicImg = C2977f.m8301b(fVar);
            }
        }
    }
}
