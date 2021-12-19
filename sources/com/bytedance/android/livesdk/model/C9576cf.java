package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.cf */
public final class C9576cf implements AbstractC2724b<RoomStats> {
    static {
        Covode.recordClassIndex(11115);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RoomStats mo7304a(C2730f fVar) {
        return m17904b(fVar);
    }

    /* renamed from: b */
    public static RoomStats m17904b(C2730f fVar) {
        RoomStats roomStats = new RoomStats();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return roomStats;
            } else if (b == 1) {
                roomStats.f23084id = fVar.mo7314f();
            } else if (b == 2) {
                roomStats.idStr = fVar.mo7312d();
            } else if (b == 3) {
                roomStats.ticket = fVar.mo7314f();
            } else if (b == 5) {
                roomStats.totalUser = (int) fVar.mo7314f();
            } else if (b == 6) {
                roomStats.giftUVCount = (int) fVar.mo7314f();
            } else if (b == 7) {
                roomStats.followCount = (int) fVar.mo7314f();
            } else if (b == 9) {
                roomStats.watermelon = (int) fVar.mo7314f();
            } else if (b == 11) {
                roomStats.enterCount = (int) fVar.mo7314f();
            } else if (b == 16) {
                roomStats.replayViewers = (int) fVar.mo7314f();
            } else if (b != 17) {
                C2731g.m7903c(fVar);
            } else {
                roomStats.shareCount = (int) fVar.mo7314f();
            }
        }
    }
}
