package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.cb */
public final class C9572cb implements AbstractC2724b<C9532ap> {
    static {
        Covode.recordClassIndex(11111);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9532ap mo7304a(C2730f fVar) {
        return m17896b(fVar);
    }

    /* renamed from: b */
    public static C9532ap m17896b(C2730f fVar) {
        C9532ap apVar = new C9532ap();
        apVar.f23142g = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        apVar.f23136a = C3004j.m8316b(fVar);
                        break;
                    case 2:
                        apVar.f23137b = fVar.mo7312d();
                        break;
                    case 3:
                        apVar.f23139d = C2731g.m7902b(fVar);
                        break;
                    case 4:
                        apVar.f23140e = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        apVar.f23141f = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        long a2 = fVar.mo7307a();
                        Long l = null;
                        Long l2 = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (l2 != null) {
                                    apVar.f23142g.put(l, l2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b2 == 2) {
                                l2 = Long.valueOf(C2731g.m7902b(fVar));
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        apVar.f23143h = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        apVar.f23144i = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        apVar.f23138c = C2731g.m7902b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return apVar;
            }
        }
    }
}
