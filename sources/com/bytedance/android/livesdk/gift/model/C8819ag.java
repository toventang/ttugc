package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.gift.model.ag */
public final class C8819ag implements AbstractC2724b<C8843h> {
    static {
        Covode.recordClassIndex(9700);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8843h mo7304a(C2730f fVar) {
        return m17126b(fVar);
    }

    /* renamed from: b */
    public static C8843h m17126b(C2730f fVar) {
        C8843h hVar = new C8843h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f21715a = fVar.mo7314f();
                        break;
                    case 2:
                        hVar.f21716b = fVar.mo7312d();
                        break;
                    case 3:
                        hVar.f21717c = fVar.mo7314f();
                        break;
                    case 4:
                        hVar.f21718d = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        hVar.f21719e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        hVar.f21720f = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        hVar.f21721g = Boolean.valueOf(C2731g.m7901a(fVar));
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        hVar.f21722h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        hVar.f21723i = C2977f.m8301b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return hVar;
            }
        }
    }
}
