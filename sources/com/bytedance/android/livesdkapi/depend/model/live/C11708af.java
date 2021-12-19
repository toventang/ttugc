package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.af */
public final class C11708af implements AbstractC2724b<C11727h> {
    static {
        Covode.recordClassIndex(13396);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11727h mo7304a(C2730f fVar) {
        return m20666b(fVar);
    }

    /* renamed from: b */
    public static C11727h m20666b(C2730f fVar) {
        C11727h hVar = new C11727h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f28056a = C2731g.m7901a(fVar);
                        break;
                    case 2:
                        hVar.f28057b = fVar.mo7314f();
                        break;
                    case 3:
                        hVar.f28058c = fVar.mo7314f();
                        break;
                    case 4:
                        hVar.f28059d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        hVar.f28060e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        hVar.f28061f = (long) fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        hVar.f28062g = fVar.mo7312d();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return hVar;
            }
        }
    }
}
