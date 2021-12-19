package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.bz */
public final class C9569bz implements AbstractC2724b<C9526ak> {
    static {
        Covode.recordClassIndex(11108);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9526ak mo7304a(C2730f fVar) {
        return m17892b(fVar);
    }

    /* renamed from: b */
    public static C9526ak m17892b(C2730f fVar) {
        C9526ak akVar = new C9526ak();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        akVar.f23117a = Long.valueOf(fVar.mo7314f());
                        break;
                    case 2:
                        akVar.f23118b = Long.valueOf(fVar.mo7314f());
                        break;
                    case 3:
                        akVar.f23119c = Long.valueOf(fVar.mo7314f());
                        break;
                    case 4:
                        akVar.f23120d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        akVar.f23121e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        akVar.f23122f = Boolean.valueOf(C2731g.m7901a(fVar));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        akVar.f23123g = Boolean.valueOf(C2731g.m7901a(fVar));
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return akVar;
            }
        }
    }
}
