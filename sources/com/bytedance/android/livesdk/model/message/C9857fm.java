package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.fm */
public final class C9857fm implements AbstractC2724b<C9688bt> {
    static {
        Covode.recordClassIndex(11399);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9688bt mo7304a(C2730f fVar) {
        C9688bt btVar = new C9688bt();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        btVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        btVar.f23578a = fVar.mo7312d();
                        break;
                    case 3:
                        btVar.f23579f = (int) fVar.mo7314f();
                        break;
                    case 4:
                        btVar.f23580g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        btVar.f23581h = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        btVar.f23582i = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        btVar.f23583j = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        btVar.f23584k = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        btVar.f23585l = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        btVar.f23586m = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        btVar.f23587n = C9716r.m18010b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return btVar;
            }
        }
    }
}
