package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.bo */
public final class C9558bo implements AbstractC2724b<C9594m> {
    static {
        Covode.recordClassIndex(11097);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9594m mo7304a(C2730f fVar) {
        return m17871b(fVar);
    }

    /* renamed from: b */
    public static C9594m m17871b(C2730f fVar) {
        C9594m mVar = new C9594m();
        mVar.f23274c = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        mVar.f23280i = fVar.mo7312d();
                        break;
                    case 2:
                        mVar.f23273b = fVar.mo7312d();
                        break;
                    case 3:
                        mVar.f23274c.add(fVar.mo7312d());
                        break;
                    case 4:
                        mVar.f23275d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        mVar.f23276e = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        mVar.f23277f = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        mVar.f23272a = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        mVar.f23278g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        mVar.f23281j = (int) C2731g.m7902b(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return mVar;
            }
        }
    }
}
