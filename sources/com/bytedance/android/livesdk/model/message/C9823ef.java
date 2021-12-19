package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* renamed from: com.bytedance.android.livesdk.model.message.ef */
public final class C9823ef implements AbstractC2724b<C9617aq> {
    static {
        Covode.recordClassIndex(11365);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9617aq mo7304a(C2730f fVar) {
        C9617aq aqVar = new C9617aq();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aqVar;
            } else if (b == 16) {
                aqVar.f23404v = (int) fVar.mo7314f();
            } else if (b == 32) {
                aqVar.f23385J = fVar.mo7312d();
            } else if (b == 51) {
                aqVar.f23386K = C2731g.m7901a(fVar);
            } else if (b == 34) {
                aqVar.f23388f = fVar.mo7312d();
            } else if (b != 35) {
                switch (b) {
                    case 1:
                        aqVar.f28134O = C11783f.m20759b(fVar);
                        continue;
                    case 2:
                        aqVar.f23387a = (int) fVar.mo7314f();
                        continue;
                    case 3:
                        aqVar.f23390h = fVar.mo7312d();
                        continue;
                    case 4:
                        aqVar.f23391i = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aqVar.f23393k = fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aqVar.f23394l = fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aqVar.f23395m = fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aqVar.f23396n = fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aqVar.f23397o = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aqVar.f23398p = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        aqVar.f23399q = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        aqVar.f23400r = fVar.mo7312d();
                        continue;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        aqVar.f23401s = fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        aqVar.f23402t = (int) fVar.mo7314f();
                        continue;
                    default:
                        switch (b) {
                            case LiveRechargeAgeThresholdSetting.DEFAULT:
                                aqVar.f23405w = (int) fVar.mo7314f();
                                continue;
                            case 19:
                                aqVar.f23406x = C2731g.m7901a(fVar);
                                continue;
                            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                                aqVar.f23407y = fVar.mo7312d();
                                continue;
                            case 21:
                                aqVar.f23408z = fVar.mo7314f();
                                continue;
                            default:
                                switch (b) {
                                    case 25:
                                        aqVar.f23377B = fVar.mo7312d();
                                        continue;
                                    case 26:
                                        aqVar.f23403u = fVar.mo7314f();
                                        continue;
                                    case 27:
                                        aqVar.f23380E = fVar.mo7313e();
                                        continue;
                                    case 28:
                                        aqVar.f23376A = fVar.mo7314f();
                                        continue;
                                    case 29:
                                        aqVar.f23378C = (int) fVar.mo7314f();
                                        continue;
                                    case 30:
                                        aqVar.f23379D = fVar.mo7314f();
                                        continue;
                                    default:
                                        switch (b) {
                                            case 37:
                                                aqVar.f23392j = fVar.mo7312d();
                                                continue;
                                            case 38:
                                                aqVar.f23381F = fVar.mo7314f();
                                                continue;
                                            case 39:
                                                aqVar.f23382G = (int) fVar.mo7314f();
                                                continue;
                                            case 40:
                                                aqVar.f23383H = fVar.mo7312d();
                                                continue;
                                            case 41:
                                                aqVar.f23384I = C2731g.m7901a(fVar);
                                                continue;
                                            default:
                                                C2731g.m7903c(fVar);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                }
                        }
                }
            } else {
                aqVar.f23389g = fVar.mo7312d();
            }
        }
    }
}
