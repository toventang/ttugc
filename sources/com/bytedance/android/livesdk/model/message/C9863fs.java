package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.fs */
public final class C9863fs implements AbstractC2724b<C9692bx> {
    static {
        Covode.recordClassIndex(11405);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9692bx mo7304a(C2730f fVar) {
        C9692bx bxVar = new C9692bx();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bxVar;
            } else if (b == 1) {
                bxVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 3) {
                bxVar.f23611f = fVar.mo7312d();
            } else if (b == 6) {
                bxVar.f23614i = fVar.mo7312d();
            } else if (b == 7) {
                bxVar.f23615j = String.valueOf(fVar.mo7314f());
            } else if (b != 8) {
                switch (b) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bxVar.f23619n = C2977f.m8301b(fVar);
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        bxVar.f23618m = C9790de.m18083b(fVar);
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        bxVar.f23620o = fVar.mo7312d();
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                bxVar.f23616k = fVar.mo7314f();
            }
        }
    }
}
