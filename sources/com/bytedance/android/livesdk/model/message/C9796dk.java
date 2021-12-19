package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.model.C9564bu;
import com.bytedance.android.livesdk.model.C9565bv;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.dk */
public final class C9796dk implements AbstractC2724b<C9895y> {
    static {
        Covode.recordClassIndex(11338);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9895y mo7304a(C2730f fVar) {
        C9895y yVar = new C9895y();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return yVar;
            } else if (b == 13) {
                yVar.f23937l = fVar.mo7314f();
            } else if (b == 15) {
                yVar.f23945t = C9565bv.m17884b(fVar);
            } else if (b == 21) {
                yVar.f23946u = C9564bu.m17882b(fVar);
            } else if (b != 23) {
                switch (b) {
                    case 1:
                        yVar.f28134O = C11783f.m20759b(fVar);
                        continue;
                    case 2:
                        yVar.f23934i = fVar.mo7314f();
                        continue;
                    case 3:
                        yVar.f23936k = (int) fVar.mo7314f();
                        continue;
                    case 4:
                        yVar.f23940o = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        yVar.f23935j = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        yVar.f23939n = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        yVar.f23932g = C3004j.m8316b(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        yVar.f23933h = C3004j.m8316b(fVar);
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        yVar.f23938m = fVar.mo7313e();
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        yVar.f23942q = C9872ga.m18185b(fVar);
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        yVar.f23941p = fVar.mo7314f();
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                yVar.f23948w = C9797dl.m18092b(fVar);
            }
        }
    }
}
