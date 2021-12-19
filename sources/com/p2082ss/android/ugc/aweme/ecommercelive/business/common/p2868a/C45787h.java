package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.a.h */
public final class C45787h implements AbstractC2724b<C45783d> {
    static {
        Covode.recordClassIndex(54305);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C45783d mo7304a(C2730f fVar) {
        return m88383b(fVar);
    }

    /* renamed from: b */
    public static C45783d m88383b(C2730f fVar) {
        C45783d dVar = new C45783d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f106666a = fVar.mo7312d();
                        break;
                    case 2:
                        dVar.f106667f = fVar.mo7312d();
                        break;
                    case 3:
                        dVar.f106668g = fVar.mo7312d();
                        break;
                    case 4:
                        dVar.f106669h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        dVar.f106670i = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        dVar.f106671j = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        dVar.f106672k = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        dVar.f106673l = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        dVar.f106674m = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        dVar.f106675n = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        dVar.f106676o = (int) fVar.mo7314f();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return dVar;
            }
        }
    }
}
