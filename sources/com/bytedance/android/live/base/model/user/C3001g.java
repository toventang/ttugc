package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.user.g */
public final class C3001g implements AbstractC2724b<SubscribeInfo> {
    static {
        Covode.recordClassIndex(3463);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ SubscribeInfo mo7304a(C2730f fVar) {
        return m8310b(fVar);
    }

    /* renamed from: b */
    public static SubscribeInfo m8310b(C2730f fVar) {
        SubscribeInfo subscribeInfo = new SubscribeInfo();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return subscribeInfo;
            } else if (b == 1) {
                subscribeInfo.isAnchorQualified = C2731g.m7901a(fVar);
            } else if (b == 2) {
                subscribeInfo.isSubscribed = C2731g.m7901a(fVar);
            } else if (b == 3) {
                subscribeInfo.subscribeBadge = C3000f.m8308b(fVar);
            } else if (b == 4) {
                subscribeInfo.anchorEnableSubscription = C2731g.m7901a(fVar);
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                subscribeInfo.subscriberCount = (int) fVar.mo7314f();
            }
        }
    }
}
