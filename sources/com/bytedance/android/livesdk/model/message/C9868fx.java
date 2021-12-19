package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.fx */
public final class C9868fx implements AbstractC2724b<C9719cc> {
    static {
        Covode.recordClassIndex(11410);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9719cc mo7304a(C2730f fVar) {
        C9719cc ccVar = new C9719cc();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ccVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        ccVar.f23688f = C3004j.m8316b(fVar);
                        break;
                    case 3:
                        ccVar.f23690h = fVar.mo7314f();
                        break;
                    case 4:
                        ccVar.f23687a = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ccVar.f23689g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        ccVar.f23691i = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        ccVar.f23692j = (int) fVar.mo7314f();
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return ccVar;
            }
        }
    }
}
