package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.q */
public final class C7697q implements AbstractC2724b<EnterRoomExtra> {
    static {
        Covode.recordClassIndex(8479);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ EnterRoomExtra mo7304a(C2730f fVar) {
        EnterRoomExtra enterRoomExtra = new EnterRoomExtra();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return enterRoomExtra;
            } else if (b == 4) {
                enterRoomExtra.isOfficialChannel = C2731g.m7901a(fVar);
            } else if (b == 5) {
                enterRoomExtra.region = fVar.mo7312d();
            } else if (b != 6) {
                C2731g.m7903c(fVar);
            } else {
                enterRoomExtra.isSameAppLanguage = C2731g.m7901a(fVar);
            }
        }
    }
}
