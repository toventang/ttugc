package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.message.C9722cf;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.fz */
public final class C9870fz implements AbstractC2724b<C9722cf.C9723a> {
    static {
        Covode.recordClassIndex(11412);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9722cf.C9723a mo7304a(C2730f fVar) {
        return m18183b(fVar);
    }

    /* renamed from: b */
    public static C9722cf.C9723a m18183b(C2730f fVar) {
        C9722cf.C9723a aVar = new C9722cf.C9723a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23699a = C9716r.m18010b(fVar);
                        break;
                    case 2:
                        aVar.f23700b = fVar.mo7313e();
                        break;
                    case 3:
                        aVar.f23701c = C2977f.m8301b(fVar);
                        break;
                    case 4:
                        aVar.f23702d = (long) fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f23703e = (long) fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f23704f = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f23705g = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f23706h = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f23707i = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aVar.f23708j = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        aVar.f23709k = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        aVar.f23710l = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        aVar.f23711m = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        aVar.f23712n = fVar.mo7312d();
                        break;
                    case 15:
                        aVar.f23713o = fVar.mo7313e();
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
