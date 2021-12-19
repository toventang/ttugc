package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.ft */
public final class C9864ft implements AbstractC2724b<C9693by> {
    static {
        Covode.recordClassIndex(11406);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9693by mo7304a(C2730f fVar) {
        C9693by byVar = new C9693by();
        byVar.f23622f = new ArrayList();
        byVar.f23624h = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        byVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        byVar.f23622f.add(C9742cx.m18037b(fVar));
                        break;
                    case 3:
                        byVar.f23621a = C2731g.m7902b(fVar);
                        break;
                    case 4:
                        byVar.f23623g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        byVar.f23624h.add(C9742cx.m18037b(fVar));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        byVar.f23625i = C2731g.m7902b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return byVar;
            }
        }
    }
}
