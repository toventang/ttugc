package com.bytedance.android.livesdk.model.message.p580d.p583c;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.C9567bx;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.d.c.g */
public final class C9757g implements AbstractC2724b<C9752b> {
    static {
        Covode.recordClassIndex(11299);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9752b mo7304a(C2730f fVar) {
        return m18048b(fVar);
    }

    /* renamed from: b */
    public static C9752b m18048b(C2730f fVar) {
        C9752b bVar = new C9752b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f23735a = (int) fVar.mo7314f();
                        break;
                    case 2:
                        bVar.f23736b = fVar.mo7312d();
                        break;
                    case 3:
                        bVar.f23737c = fVar.mo7312d();
                        break;
                    case 4:
                        bVar.f23738d = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f23739e = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f23740f = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f23741g = C9756f.m18046b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        bVar.f23742h = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f23743i = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bVar.f23744j = C9567bx.m17888b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return bVar;
            }
        }
    }
}
