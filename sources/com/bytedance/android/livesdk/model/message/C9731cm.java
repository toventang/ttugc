package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.cm */
public final class C9731cm implements AbstractC2724b<C9695c> {
    static {
        Covode.recordClassIndex(11273);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9695c mo7304a(C2730f fVar) {
        return m18022b(fVar);
    }

    /* renamed from: b */
    public static C9695c m18022b(C2730f fVar) {
        C9695c cVar = new C9695c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f23629b = C9730cl.m18020b(fVar);
                        break;
                    case 2:
                        cVar.f23628a = C9730cl.m18020b(fVar);
                        break;
                    case 3:
                        cVar.f23630c = C9730cl.m18020b(fVar);
                        break;
                    case 4:
                        cVar.f23631d = C9730cl.m18020b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f23632e = C9730cl.m18020b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f23633f = C9730cl.m18020b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f23634g = C9730cl.m18020b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return cVar;
            }
        }
    }
}
