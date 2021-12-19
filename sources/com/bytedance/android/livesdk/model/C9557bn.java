package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.bn */
public final class C9557bn implements AbstractC2724b<C9897n> {
    static {
        Covode.recordClassIndex(11096);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9897n mo7304a(C2730f fVar) {
        return m17869b(fVar);
    }

    /* renamed from: b */
    public static C9897n m17869b(C2730f fVar) {
        C9897n nVar = new C9897n();
        nVar.f23957a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        nVar.f23957a.add(C9558bo.m17871b(fVar));
                        break;
                    case 2:
                        nVar.f23958b = (int) C2731g.m7902b(fVar);
                        break;
                    case 3:
                        nVar.f23959c = C2977f.m8301b(fVar);
                        break;
                    case 4:
                        nVar.f23960d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        nVar.f23961e = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        nVar.f23962f = (int) C2731g.m7902b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return nVar;
            }
        }
    }
}
