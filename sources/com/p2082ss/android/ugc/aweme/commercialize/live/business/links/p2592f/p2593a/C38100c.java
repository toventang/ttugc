package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.c */
public final class C38100c implements AbstractC2724b<C38098a> {
    static {
        Covode.recordClassIndex(45567);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C38098a mo7304a(C2730f fVar) {
        C38098a aVar = new C38098a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        aVar.f90005f = fVar.mo7313e();
                        break;
                    case 3:
                        aVar.f90006g = fVar.mo7314f();
                        break;
                    case 4:
                        aVar.f90007h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        aVar.f90008i = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        aVar.f90009j = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        aVar.f90010k = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        aVar.f90011l = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        aVar.f90012m = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        aVar.f90013n = fVar.mo7312d();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return aVar;
            }
        }
    }
}
