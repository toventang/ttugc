package com.bytedance.android.livesdk.envelope.p520a;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.envelope.a.g */
public final class C8431g implements AbstractC2724b<C8425a> {
    static {
        Covode.recordClassIndex(9276);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8425a mo7304a(C2730f fVar) {
        return m16640b(fVar);
    }

    /* renamed from: b */
    public static C8425a m16640b(C2730f fVar) {
        C8425a aVar = new C8425a((char) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f20839a = fVar.mo7312d();
                        break;
                    case 2:
                        aVar.f20840b = Integer.valueOf(fVar.mo7313e());
                        break;
                    case 3:
                        aVar.f20841c = fVar.mo7312d();
                        break;
                    case 4:
                        aVar.f20842d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f20843e = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f20844f = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f20845g = Integer.valueOf(fVar.mo7313e());
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f20846h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f20847i = C2977f.m8301b(fVar);
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
