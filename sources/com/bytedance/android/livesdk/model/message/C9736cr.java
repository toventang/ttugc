package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.cr */
public final class C9736cr implements AbstractC2724b<C9871g> {
    static {
        Covode.recordClassIndex(11278);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9871g mo7304a(C2730f fVar) {
        C9871g gVar = new C9871g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        gVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        gVar.f23845a = fVar.mo7312d();
                        break;
                    case 3:
                        gVar.f23846f = fVar.mo7313e();
                        break;
                    case 4:
                        gVar.f23847g = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        gVar.f23848h = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        gVar.f23849i = fVar.mo7313e();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return gVar;
            }
        }
    }
}
