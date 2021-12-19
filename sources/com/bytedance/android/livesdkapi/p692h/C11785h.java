package com.bytedance.android.livesdkapi.p692h;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdkapi.h.h */
public final class C11785h implements AbstractC2724b<C11781e> {
    static {
        Covode.recordClassIndex(13475);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11781e mo7304a(C2730f fVar) {
        C11781e eVar = new C11781e();
        eVar.f28159g = new HashMap();
        eVar.f28153a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f28153a.add(C11784g.m20761b(fVar));
                        break;
                    case 2:
                        eVar.f28154b = fVar.mo7312d();
                        break;
                    case 3:
                        eVar.f28155c = C2731g.m7902b(fVar);
                        break;
                    case 4:
                        eVar.f28156d = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f28157e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f28158f = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        long a2 = fVar.mo7307a();
                        String str = null;
                        String str2 = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str2 != null) {
                                    eVar.f28159g.put(str, str2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                str = fVar.mo7312d();
                            } else if (b2 == 2) {
                                str2 = fVar.mo7312d();
                            }
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f28160h = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f28161i = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f28162j = fVar.mo7312d();
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
