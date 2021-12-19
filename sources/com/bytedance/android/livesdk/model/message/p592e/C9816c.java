package com.bytedance.android.livesdk.model.message.p592e;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.e.c */
public final class C9816c implements AbstractC2724b<C9814a> {
    static {
        Covode.recordClassIndex(11358);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9814a mo7304a(C2730f fVar) {
        return m18114b(fVar);
    }

    /* renamed from: b */
    public static C9814a m18114b(C2730f fVar) {
        C9814a aVar = new C9814a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23829a = fVar.mo7312d();
                        break;
                    case 2:
                        aVar.f23830b = Integer.valueOf(fVar.mo7313e());
                        break;
                    case 3:
                        aVar.f23831c = fVar.mo7312d();
                        break;
                    case 4:
                        aVar.f23832d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f23833e = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f23834f = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f23835g = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f23836h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f23837i = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aVar.f23838j = fVar.mo7312d();
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
