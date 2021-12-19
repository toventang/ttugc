package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.fr */
public final class C9862fr implements AbstractC2724b<C9691bw> {
    static {
        Covode.recordClassIndex(11404);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9691bw mo7304a(C2730f fVar) {
        return m18174b(fVar);
    }

    /* renamed from: b */
    public static C9691bw m18174b(C2730f fVar) {
        C9691bw bwVar = new C9691bw();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bwVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        bwVar.f23603h = fVar.mo7312d();
                        break;
                    case 3:
                        bwVar.f23601f = fVar.mo7314f();
                        break;
                    case 4:
                        bwVar.f23600a = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bwVar.f23605j = C3004j.m8316b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bwVar.f23604i = C9861fq.m18172b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bwVar.f23602g = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bwVar.f23606k = fVar.mo7312d();
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return bwVar;
            }
        }
    }
}
