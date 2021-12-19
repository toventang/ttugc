package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.ct */
public final class C9738ct implements AbstractC2724b<C9878i> {
    static {
        Covode.recordClassIndex(11280);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9878i mo7304a(C2730f fVar) {
        C9878i iVar = new C9878i();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        iVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        iVar.f23854g = C3004j.m8316b(fVar);
                        break;
                    case 3:
                        iVar.f23853f = fVar.mo7312d();
                        break;
                    case 4:
                        iVar.f23855h = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        iVar.f23856i = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        iVar.f23857j = fVar.mo7312d();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return iVar;
            }
        }
    }
}
