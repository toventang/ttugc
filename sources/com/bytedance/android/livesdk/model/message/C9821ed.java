package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p578b.C9653q;
import com.bytedance.android.livesdk.model.message.p578b.C9654r;
import com.bytedance.android.livesdk.model.message.p578b.C9655s;
import com.bytedance.android.livesdk.model.message.p578b.C9656t;
import com.bytedance.android.livesdk.model.message.p578b.C9658v;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.ed */
public final class C9821ed implements AbstractC2724b<C9615ao> {
    static {
        Covode.recordClassIndex(11363);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9615ao mo7304a(C2730f fVar) {
        C9615ao aoVar = new C9615ao();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aoVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        aoVar.f23365a = fVar.mo7313e();
                        break;
                    case 3:
                        aoVar.f23366f = C9654r.m17963b(fVar);
                        break;
                    case 4:
                        aoVar.f23367g = C9658v.m17971b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aoVar.f23368h = C9655s.m17965b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aoVar.f23369i = C9653q.m17961b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aoVar.f23370j = C9656t.m17967b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return aoVar;
            }
        }
    }
}
