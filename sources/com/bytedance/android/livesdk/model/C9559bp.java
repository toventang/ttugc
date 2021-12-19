package com.bytedance.android.livesdk.model;

import com.bytedance.android.livesdkapi.depend.model.live.C11714al;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bp */
public final class C9559bp implements AbstractC2724b<FeedItem> {
    static {
        Covode.recordClassIndex(11098);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ FeedItem mo7304a(C2730f fVar) {
        FeedItem feedItem = new FeedItem();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                feedItem.init();
                return feedItem;
            } else if (b == 1) {
                feedItem.type = (int) fVar.mo7314f();
            } else if (b == 2) {
                feedItem.resId = fVar.mo7312d();
            } else if (b == 3) {
                feedItem.room = C11714al.m20674b(fVar);
            } else if (b == 6) {
                feedItem.bannerContainer = C9557bn.m17869b(fVar);
            } else if (b == 9) {
                feedItem.isRecommendCard = C2731g.m7901a(fVar);
            } else if (b == 13) {
                feedItem.liveReason = fVar.mo7312d();
            } else if (b != 16) {
                C2731g.m7903c(fVar);
            } else {
                feedItem.debugInfo = fVar.mo7312d();
            }
        }
    }
}
