package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.dl */
public final class C9797dl implements AbstractC2724b<C9896z> {
    static {
        Covode.recordClassIndex(11339);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9896z mo7304a(C2730f fVar) {
        return m18092b(fVar);
    }

    /* renamed from: b */
    public static C9896z m18092b(C2730f fVar) {
        C9896z zVar = new C9896z();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        zVar.f23949a = fVar.mo7314f();
                        break;
                    case 2:
                        zVar.f23950b = fVar.mo7314f();
                        break;
                    case 3:
                        zVar.f23951c = fVar.mo7314f();
                        break;
                    case 4:
                        zVar.f23952d = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        zVar.f23953e = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        zVar.f23954f = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        zVar.f23955g = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        zVar.f23956h = fVar.mo7314f();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return zVar;
            }
        }
    }
}
