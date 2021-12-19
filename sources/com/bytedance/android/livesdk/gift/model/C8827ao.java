package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.gift.model.ao */
public final class C8827ao implements AbstractC2724b<C8853q> {
    static {
        Covode.recordClassIndex(9708);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8853q mo7304a(C2730f fVar) {
        return m17140b(fVar);
    }

    /* renamed from: b */
    public static C8853q m17140b(C2730f fVar) {
        C8853q qVar = new C8853q();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        qVar.f21763f = C9716r.m18010b(fVar);
                        break;
                    case 2:
                        qVar.f21764g = fVar.mo7312d();
                        break;
                    case 3:
                        qVar.f21765h = Long.valueOf(fVar.mo7314f());
                        break;
                    case 4:
                        qVar.f21766i = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        qVar.f21767j = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        qVar.f21768k = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        qVar.f21769l = Long.valueOf(fVar.mo7314f());
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return qVar;
            }
        }
    }
}
