package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.n */
public final class C7617n implements AbstractC2724b<C7606e> {
    static {
        Covode.recordClassIndex(8392);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7606e mo7304a(C2730f fVar) {
        C7606e eVar = new C7606e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f18862a = fVar.mo7312d();
                        break;
                    case 2:
                        eVar.f18863b = fVar.mo7314f();
                        break;
                    case 3:
                        eVar.f18864c = fVar.mo7312d();
                        break;
                    case 4:
                        eVar.f18865d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f18866e = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f18867f = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        eVar.f18868g = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f18869h = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f18870i = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f18871j = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f18872k = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f18873l = String.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        eVar.f18874m = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        long a2 = fVar.mo7307a();
                        Long l = null;
                        Long l2 = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (l2 != null) {
                                    eVar.f18875n.put(l, l2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                l = Long.valueOf(fVar.mo7314f());
                            } else if (b2 == 2) {
                                l2 = Long.valueOf(fVar.mo7314f());
                            }
                        }
                    case 15:
                        eVar.f18876o = C2731g.m7901a(fVar);
                        break;
                    case 16:
                        eVar.f18877p = fVar.mo7313e();
                        break;
                    case 17:
                        eVar.f18878q = fVar.mo7313e();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return eVar;
            }
        }
    }
}
