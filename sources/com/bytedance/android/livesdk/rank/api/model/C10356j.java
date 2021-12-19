package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.rank.api.model.j */
public final class C10356j implements AbstractC2724b<C10354h> {
    static {
        Covode.recordClassIndex(11924);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C10354h mo7304a(C2730f fVar) {
        return m18835b(fVar);
    }

    /* renamed from: b */
    public static C10354h m18835b(C2730f fVar) {
        C10354h hVar = new C10354h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f25015a = C3004j.m8316b(fVar);
                        break;
                    case 2:
                        hVar.f25016b = fVar.mo7314f();
                        break;
                    case 3:
                        hVar.f25017c = (int) fVar.mo7314f();
                        break;
                    case 4:
                        hVar.f25018d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        hVar.f25019e = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        hVar.f25020f = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        hVar.f25021g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        hVar.f25022h = fVar.mo7312d();
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
