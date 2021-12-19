package com.bytedance.android.livesdk.model.message.p580d.p591k;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.d.k.e */
public final class C9784e implements AbstractC2724b<C9781b> {
    static {
        Covode.recordClassIndex(11326);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9781b mo7304a(C2730f fVar) {
        return m18075b(fVar);
    }

    /* renamed from: b */
    public static C9781b m18075b(C2730f fVar) {
        C9781b bVar = new C9781b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f23808a = fVar.mo7314f();
                        break;
                    case 2:
                        bVar.f23809b = fVar.mo7314f();
                        break;
                    case 3:
                        bVar.f23810c = (int) fVar.mo7314f();
                        break;
                    case 4:
                        bVar.f23811d = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f23812e = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f23813f = (int) fVar.mo7314f();
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
