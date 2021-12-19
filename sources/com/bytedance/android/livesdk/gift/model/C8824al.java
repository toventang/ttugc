package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.C9564bu;
import com.bytedance.android.livesdk.model.C9565bv;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.gift.model.al */
public final class C8824al implements AbstractC2724b<C8848l> {
    static {
        Covode.recordClassIndex(9705);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8848l mo7304a(C2730f fVar) {
        return m17135b(fVar);
    }

    /* renamed from: b */
    public static C8848l m17135b(C2730f fVar) {
        C8848l lVar = new C8848l();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.f21733a = C9716r.m18010b(fVar);
                        break;
                    case 2:
                        lVar.f21734b = fVar.mo7312d();
                        break;
                    case 3:
                        lVar.f21735c = fVar.mo7314f();
                        break;
                    case 4:
                        lVar.f21736d = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        lVar.f21737e = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        lVar.f21738f = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        lVar.f21739g = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        lVar.f21742j = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        lVar.f21740h = C9564bu.m17882b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        lVar.f21741i = C9565bv.m17884b(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return lVar;
            }
        }
    }
}
