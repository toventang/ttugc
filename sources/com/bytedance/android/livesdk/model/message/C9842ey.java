package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.ey */
public final class C9842ey implements AbstractC2724b<C9670bg> {
    static {
        Covode.recordClassIndex(11384);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9670bg mo7304a(C2730f fVar) {
        C9670bg bgVar = new C9670bg();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bgVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        bgVar.f23531a = (int) fVar.mo7314f();
                        break;
                    case 3:
                        bgVar.f23532f = fVar.mo7314f();
                        break;
                    case 4:
                        bgVar.f23533g = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bgVar.f23534h = C9839ev.m18143b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bgVar.f23535i = C9841ex.m18147b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bgVar.f23536j = C9840ew.m18145b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                bgVar.mo16595c();
                return bgVar;
            }
        }
    }
}
