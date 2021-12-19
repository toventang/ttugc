package com.bytedance.android.livesdk.model.message.p580d.p586f;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.d.f.d */
public final class C9768d implements AbstractC2724b<C9766b> {
    static {
        Covode.recordClassIndex(11310);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9766b mo7304a(C2730f fVar) {
        return m18061b(fVar);
    }

    /* renamed from: b */
    public static C9766b m18061b(C2730f fVar) {
        C9766b bVar = new C9766b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f23771a = C3004j.m8316b(fVar);
                        break;
                    case 2:
                        bVar.f23772b = fVar.mo7314f();
                        break;
                    case 3:
                        bVar.f23773c = fVar.mo7312d();
                        break;
                    case 4:
                        bVar.f23774d = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f23775e = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f23776f = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f23777g = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        bVar.f23778h = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f23779i = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bVar.f23780j = fVar.mo7313e();
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
