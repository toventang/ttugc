package com.bytedance.android.livesdkapi.p692h;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.h.f */
public final class C11783f implements AbstractC2724b<C11778b> {
    static {
        Covode.recordClassIndex(13473);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11778b mo7304a(C2730f fVar) {
        return m20759b(fVar);
    }

    /* renamed from: b */
    public static C11778b m20759b(C2730f fVar) {
        C11778b bVar = new C11778b();
        bVar.f28147m = new ArrayList();
        bVar.f28142h = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 11) {
                bVar.f28146l = C2731g.m7902b(fVar);
            } else if (b != 17) {
                switch (b) {
                    case 1:
                        bVar.f28139e = fVar.mo7312d();
                        continue;
                    case 2:
                        bVar.f28138d = C2731g.m7902b(fVar);
                        continue;
                    case 3:
                        bVar.f28137c = C2731g.m7902b(fVar);
                        continue;
                    case 4:
                        bVar.f28135a = C2731g.m7902b(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f28143i = fVar.mo7313e();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f28141g = C2731g.m7901a(fVar);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f28140f = fVar.mo7312d();
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        bVar.f28144j = C9716r.m18010b(fVar);
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f28145k = C2731g.m7902b(fVar);
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                bVar.f28147m.add(fVar.mo7312d());
            }
        }
    }
}
