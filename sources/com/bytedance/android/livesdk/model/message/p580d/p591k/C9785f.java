package com.bytedance.android.livesdk.model.message.p580d.p591k;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.d.k.f */
public final class C9785f implements AbstractC2724b<C9782c> {
    static {
        Covode.recordClassIndex(11327);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9782c mo7304a(C2730f fVar) {
        return m18077b(fVar);
    }

    /* renamed from: b */
    public static C9782c m18077b(C2730f fVar) {
        C9782c cVar = new C9782c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f23814a = fVar.mo7312d();
                        break;
                    case 2:
                        cVar.f23815b = fVar.mo7314f();
                        break;
                    case 3:
                        cVar.f23816c = C2731g.m7901a(fVar);
                        break;
                    case 4:
                        cVar.f23817d = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f23818e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f23819f = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f23820g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        cVar.f23821h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        cVar.f23822i = (int) fVar.mo7314f();
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
