package com.bytedance.android.livesdk.chatroom.model.p498d;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.d.b */
public final class C7684b implements AbstractC2724b<C7683a> {
    static {
        Covode.recordClassIndex(8466);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7683a mo7304a(C2730f fVar) {
        C7683a aVar = new C7683a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f19027a = C3004j.m8316b(fVar);
                        break;
                    case 2:
                        aVar.f19028b = fVar.mo7314f();
                        break;
                    case 3:
                        aVar.f19029c = fVar.mo7313e();
                        break;
                    case 4:
                        aVar.f19030d = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f19031e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f19032f = fVar.mo7313e();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return aVar;
            }
        }
    }
}
