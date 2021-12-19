package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.rank.api.model.i */
public final class C10355i implements AbstractC2724b<CurrentRankListResponse> {
    static {
        Covode.recordClassIndex(11923);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ CurrentRankListResponse mo7304a(C2730f fVar) {
        CurrentRankListResponse currentRankListResponse = new CurrentRankListResponse();
        currentRankListResponse.ranks = new ArrayList();
        currentRankListResponse.seats = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        currentRankListResponse.ranks.add(C10356j.m18835b(fVar));
                        break;
                    case 2:
                        currentRankListResponse.seats.add(C10356j.m18835b(fVar));
                        break;
                    case 3:
                        currentRankListResponse.selfInfo = C10356j.m18835b(fVar);
                        break;
                    case 4:
                        currentRankListResponse.hasMore = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        currentRankListResponse.musicWave = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        currentRankListResponse.total = C2731g.m7902b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return currentRankListResponse;
            }
        }
    }
}
