package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.bl */
public final class C9555bl implements AbstractC2724b<FansClubData.UserBadge> {
    static {
        Covode.recordClassIndex(11094);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ FansClubData.UserBadge mo7304a(C2730f fVar) {
        return m17865b(fVar);
    }

    /* renamed from: b */
    public static FansClubData.UserBadge m17865b(C2730f fVar) {
        FansClubData.UserBadge userBadge = new FansClubData.UserBadge();
        userBadge.icons = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return userBadge;
            } else if (b == 1) {
                long a2 = fVar.mo7307a();
                Integer num = null;
                ImageModel imageModel = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        num = Integer.valueOf(fVar.mo7313e());
                    } else if (b2 == 2) {
                        imageModel = C2977f.m8301b(fVar);
                    }
                }
                fVar.mo7309a(a2);
                if (num == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (imageModel != null) {
                    userBadge.icons.put(num, imageModel);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                userBadge.title = fVar.mo7312d();
            }
        }
    }
}
