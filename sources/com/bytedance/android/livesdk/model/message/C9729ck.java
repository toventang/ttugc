package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.ck */
public final class C9729ck implements AbstractC2724b<C9630b> {
    static {
        Covode.recordClassIndex(11271);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9630b mo7304a(C2730f fVar) {
        return m18018b(fVar);
    }

    /* renamed from: b */
    public static C9630b m18018b(C2730f fVar) {
        C9630b bVar = new C9630b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f23469a = C9716r.m18010b(fVar);
                        break;
                    case 2:
                        bVar.f23471c = C2977f.m8301b(fVar);
                        break;
                    case 3:
                        bVar.f23472d = C2731g.m7901a(fVar);
                        break;
                    case 4:
                        bVar.f23470b = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f23473e = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f23474f = fVar.mo7312d();
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
