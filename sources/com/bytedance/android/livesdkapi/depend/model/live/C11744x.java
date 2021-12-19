package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.x */
public final class C11744x implements AbstractC2724b<ContinueRoomResponse> {
    static {
        Covode.recordClassIndex(13432);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ ContinueRoomResponse mo7304a(C2730f fVar) {
        ContinueRoomResponse continueRoomResponse = new ContinueRoomResponse();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return continueRoomResponse;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                continueRoomResponse.room = C11714al.m20674b(fVar);
            }
        }
    }
}
