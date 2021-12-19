package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.g */
public final class C11700g implements AbstractC2724b<C11695b> {
    static {
        Covode.recordClassIndex(13388);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11695b mo7304a(C2730f fVar) {
        return m20650b(fVar);
    }

    /* renamed from: b */
    public static C11695b m20650b(C2730f fVar) {
        C11695b bVar = new C11695b((char) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f27976a = fVar.mo7314f();
                        break;
                    case 2:
                        bVar.f27977b = fVar.mo7314f();
                        break;
                    case 3:
                        bVar.f27978c = fVar.mo7314f();
                        break;
                    case 4:
                        bVar.f27979d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f27980e = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f27981f = fVar.mo7312d();
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
