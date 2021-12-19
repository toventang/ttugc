package com.bytedance.android.livesdk.chatroom.model.p495b;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.j */
public final class C7671j implements AbstractC2724b<C7666e> {
    static {
        Covode.recordClassIndex(8453);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7666e mo7304a(C2730f fVar) {
        return m15665b(fVar);
    }

    /* renamed from: b */
    public static C7666e m15665b(C2730f fVar) {
        C7666e eVar = new C7666e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f19001c = C3004j.m8316b(fVar);
                        break;
                    case 2:
                        eVar.f19000b = (int) fVar.mo7314f();
                        break;
                    case 3:
                        eVar.f19002d = fVar.mo7314f();
                        break;
                    case 4:
                        eVar.f19003e = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f19004f = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f19005g = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f18999a = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f19006h = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f19007i = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f19008j = fVar.mo7312d();
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return eVar;
            }
        }
    }
}
