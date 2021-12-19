package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.ei */
public final class C9826ei implements AbstractC2724b<C9623av> {
    static {
        Covode.recordClassIndex(11368);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9623av mo7304a(C2730f fVar) {
        C9623av avVar = new C9623av();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        avVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        avVar.f23424a = C3004j.m8316b(fVar);
                        break;
                    case 3:
                        avVar.f23425f = C9716r.m18010b(fVar);
                        break;
                    case 4:
                        avVar.f23426g = C9716r.m18010b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        avVar.f23427h = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        avVar.f23428i = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        avVar.f23429j = C2977f.m8301b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return avVar;
            }
        }
    }
}
