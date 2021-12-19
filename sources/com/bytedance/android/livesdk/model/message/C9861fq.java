package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.fq */
public final class C9861fq implements AbstractC2724b<RoomNotifyMessageExtra> {
    static {
        Covode.recordClassIndex(11403);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RoomNotifyMessageExtra mo7304a(C2730f fVar) {
        return m18172b(fVar);
    }

    /* renamed from: b */
    public static RoomNotifyMessageExtra m18172b(C2730f fVar) {
        RoomNotifyMessageExtra roomNotifyMessageExtra = new RoomNotifyMessageExtra();
        roomNotifyMessageExtra.f23283a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return roomNotifyMessageExtra;
            } else if (b == 1) {
                roomNotifyMessageExtra.f23286d = C2731g.m7902b(fVar);
            } else if (b == 2) {
                roomNotifyMessageExtra.f23284b = C9860fp.m18170b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                roomNotifyMessageExtra.f23285c = C9833ep.m18135b(fVar);
            }
        }
    }
}
