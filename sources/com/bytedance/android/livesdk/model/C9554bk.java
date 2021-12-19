package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.bk */
public final class C9554bk implements AbstractC2724b<FansClubData> {
    static {
        Covode.recordClassIndex(11093);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ FansClubData mo7304a(C2730f fVar) {
        return m17863b(fVar);
    }

    /* renamed from: b */
    public static FansClubData m17863b(C2730f fVar) {
        FansClubData fansClubData = new FansClubData();
        fansClubData.availableGiftIds = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansClubData.clubName = fVar.mo7312d();
                        break;
                    case 2:
                        fansClubData.level = fVar.mo7313e();
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = fVar.mo7313e();
                        break;
                    case 4:
                        fansClubData.badge = C9555bl.m17865b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        fansClubData.availableGiftIds.add(Long.valueOf(C2731g.m7902b(fVar)));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        fansClubData.anchorId = C2731g.m7902b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return fansClubData;
            }
        }
    }
}
