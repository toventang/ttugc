package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.fp */
public final class C9860fp implements AbstractC2724b<RoomNotifyMessageExtra.Background> {
    static {
        Covode.recordClassIndex(11402);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RoomNotifyMessageExtra.Background mo7304a(C2730f fVar) {
        return m18170b(fVar);
    }

    /* renamed from: b */
    public static RoomNotifyMessageExtra.Background m18170b(C2730f fVar) {
        RoomNotifyMessageExtra.Background background = new RoomNotifyMessageExtra.Background();
        background.mUrls = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return background;
            } else if (b == 1) {
                background.width = fVar.mo7313e();
            } else if (b == 2) {
                background.height = fVar.mo7313e();
            } else if (b == 3) {
                background.mUrls.add(fVar.mo7312d());
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                background.mUri = fVar.mo7312d();
            }
        }
    }
}
