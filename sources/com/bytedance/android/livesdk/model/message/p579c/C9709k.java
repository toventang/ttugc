package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.c.k */
public final class C9709k implements AbstractC2724b<C9699c> {
    static {
        Covode.recordClassIndex(11251);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9699c mo7304a(C2730f fVar) {
        return m17996b(fVar);
    }

    /* renamed from: b */
    public static C9699c m17996b(C2730f fVar) {
        C9699c cVar = new C9699c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f23649a = fVar.mo7312d();
                        break;
                    case 2:
                        cVar.f23652d = Boolean.valueOf(C2731g.m7901a(fVar));
                        break;
                    case 3:
                        cVar.f23650b = C2731g.m7901a(fVar);
                        break;
                    case 4:
                        cVar.f23651c = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f23653e = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f23654f = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f23655g = Boolean.valueOf(C2731g.m7901a(fVar));
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        cVar.f23656h = Boolean.valueOf(C2731g.m7901a(fVar));
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
