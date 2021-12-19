package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.be */
public final class C9548be implements AbstractC2724b<C9585e> {
    static {
        Covode.recordClassIndex(11087);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9585e mo7304a(C2730f fVar) {
        return m17851b(fVar);
    }

    /* renamed from: b */
    public static C9585e m17851b(C2730f fVar) {
        C9585e eVar = new C9585e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f23223a = (int) fVar.mo7314f();
                        break;
                    case 2:
                        eVar.f23224b = fVar.mo7314f();
                        break;
                    case 3:
                        eVar.f23225c = fVar.mo7314f();
                        break;
                    case 4:
                        eVar.f23226d = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f23227e = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f23228f = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        eVar.f23229g = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f23230h = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f23231i = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f23232j = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f23233k = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f23234l = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        eVar.f23235m = C2977f.m8301b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return eVar;
            }
        }
    }
}
