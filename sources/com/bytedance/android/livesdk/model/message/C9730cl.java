package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.C9552bi;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.cl */
public final class C9730cl implements AbstractC2724b<C9695c.C9696a> {
    static {
        Covode.recordClassIndex(11272);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9695c.C9696a mo7304a(C2730f fVar) {
        return m18020b(fVar);
    }

    /* renamed from: b */
    public static C9695c.C9696a m18020b(C2730f fVar) {
        C9695c.C9696a aVar = new C9695c.C9696a();
        aVar.f23636b = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23635a = fVar.mo7312d();
                        break;
                    case 2:
                        aVar.f23636b.add(C9552bi.m17859b(fVar));
                        break;
                    case 3:
                        aVar.f23637c = C2977f.m8301b(fVar);
                        break;
                    case 4:
                        aVar.f23638d = C9729ck.m18018b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f23639e = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f23640f = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f23641g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f23642h = Long.valueOf(C2731g.m7902b(fVar));
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
