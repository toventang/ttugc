package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.cc */
public final class C9573cc implements AbstractC2724b<RoomAuthOffReasons> {
    static {
        Covode.recordClassIndex(11112);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RoomAuthOffReasons mo7304a(C2730f fVar) {
        return m17898b(fVar);
    }

    /* renamed from: b */
    public static RoomAuthOffReasons m17898b(C2730f fVar) {
        RoomAuthOffReasons roomAuthOffReasons = new RoomAuthOffReasons();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return roomAuthOffReasons;
            } else if (b == 1) {
                roomAuthOffReasons.gift = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                roomAuthOffReasons.unAvailableClickReason = (int) fVar.mo7314f();
            }
        }
    }
}
