package com.bytedance.android.livesdk.chatroom.model.p495b;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.i */
public final class C7670i implements AbstractC2724b<C7664c> {
    static {
        Covode.recordClassIndex(8452);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7664c mo7304a(C2730f fVar) {
        return m15663b(fVar);
    }

    /* renamed from: b */
    public static C7664c m15663b(C2730f fVar) {
        C7664c cVar = new C7664c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f18989a = C3004j.m8316b(fVar);
                        break;
                    case 2:
                        cVar.f18990b = fVar.mo7314f();
                        break;
                    case 3:
                        cVar.f18991c = fVar.mo7313e();
                        break;
                    case 4:
                        cVar.f18992d = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f18995g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f18993e = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f18994f = fVar.mo7314f();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return cVar;
            }
        }
    }
}
