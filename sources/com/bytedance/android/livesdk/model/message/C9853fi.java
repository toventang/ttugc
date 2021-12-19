package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.fi */
public final class C9853fi implements AbstractC2724b<C9684bq> {
    static {
        Covode.recordClassIndex(11395);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9684bq mo7304a(C2730f fVar) {
        return m18161b(fVar);
    }

    /* renamed from: b */
    public static C9684bq m18161b(C2730f fVar) {
        C9684bq bqVar = new C9684bq();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bqVar.f23568a = fVar.mo7314f();
                        break;
                    case 2:
                        bqVar.f23569b = fVar.mo7314f();
                        break;
                    case 3:
                        bqVar.f23570c = C9716r.m18010b(fVar);
                        break;
                    case 4:
                        bqVar.f23571d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bqVar.f23572e = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bqVar.f23573f = (int) fVar.mo7314f();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return bqVar;
            }
        }
    }
}
