package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.bv */
public final class C9565bv implements AbstractC2724b<C9904t> {
    static {
        Covode.recordClassIndex(11104);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9904t mo7304a(C2730f fVar) {
        return m17884b(fVar);
    }

    /* renamed from: b */
    public static C9904t m17884b(C2730f fVar) {
        C9904t tVar = new C9904t();
        tVar.f24016u = new HashMap();
        tVar.f23994K = new HashMap();
        tVar.f23991H = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return tVar;
            } else if (b == 1) {
                tVar.f23997b = C2977f.m8301b(fVar);
            } else if (b == 2) {
                tVar.f23998c = fVar.mo7312d();
            } else if (b == 3) {
                tVar.f24012q = Boolean.valueOf(C2731g.m7901a(fVar));
            } else if (b == 4) {
                tVar.f24003h = (int) C2731g.m7902b(fVar);
            } else if (b == 5) {
                tVar.f23999d = C2731g.m7902b(fVar);
            } else if (b == 7) {
                tVar.f24004i = C2731g.m7901a(fVar);
            } else if (b == 24) {
                tVar.f24010o = fVar.mo7312d();
            } else if (b == 33) {
                tVar.f23985B = fVar.mo7312d();
            } else if (b == 36) {
                tVar.f23986C = fVar.mo7312d();
            } else if (b == 38) {
                tVar.f23987D = Long.valueOf(C2731g.m7902b(fVar));
            } else if (b != 44) {
                String str = null;
                if (b == 100) {
                    long a2 = fVar.mo7307a();
                    String str2 = null;
                    while (true) {
                        int b2 = fVar.mo7310b();
                        if (b2 == -1) {
                            fVar.mo7309a(a2);
                            if (str == null) {
                                throw new IllegalStateException("Map key must not be null!");
                            } else if (str2 != null) {
                                tVar.f23994K.put(str, str2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else if (b2 == 1) {
                            str = fVar.mo7312d();
                        } else if (b2 == 2) {
                            str2 = fVar.mo7312d();
                        }
                    }
                } else if (b != 101) {
                    switch (b) {
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            tVar.f24002g = C2731g.m7901a(fVar);
                            continue;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            tVar.f24000e = fVar.mo7313e();
                            continue;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            tVar.f24001f = fVar.mo7313e();
                            continue;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            tVar.f24008m = C2731g.m7901a(fVar);
                            continue;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            tVar.f24009n = C2731g.m7902b(fVar);
                            continue;
                        case 15:
                            tVar.f24007l = C2977f.m8301b(fVar);
                            continue;
                        case 16:
                            tVar.f23996a = fVar.mo7312d();
                            continue;
                        case 17:
                            tVar.f24013r = fVar.mo7312d();
                            continue;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            tVar.f24014s = fVar.mo7312d();
                            continue;
                        case 19:
                            tVar.f24015t = Boolean.valueOf(C2731g.m7901a(fVar));
                            continue;
                        case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                            long a3 = fVar.mo7307a();
                            Long l = null;
                            while (true) {
                                int b3 = fVar.mo7310b();
                                if (b3 == -1) {
                                    fVar.mo7309a(a3);
                                    if (str == null) {
                                        throw new IllegalStateException("Map key must not be null!");
                                    } else if (l != null) {
                                        tVar.f24016u.put(str, l);
                                        continue;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else if (b3 == 1) {
                                    str = fVar.mo7312d();
                                } else if (b3 == 2) {
                                    l = Long.valueOf(C2731g.m7902b(fVar));
                                }
                            }
                        case 21:
                            tVar.f24017v = C2977f.m8301b(fVar);
                            continue;
                        case 22:
                            tVar.f24018w = Integer.valueOf(fVar.mo7313e());
                            continue;
                        default:
                            switch (b) {
                                case 28:
                                    tVar.f24019x = Integer.valueOf(fVar.mo7313e());
                                    continue;
                                case 29:
                                    tVar.f24020y = fVar.mo7312d();
                                    continue;
                                case 30:
                                    tVar.f24021z = C9562bs.m17878b(fVar);
                                    continue;
                                case 31:
                                    tVar.f23984A = fVar.mo7312d();
                                    continue;
                                default:
                                    switch (b) {
                                        case 40:
                                            tVar.f23988E = Boolean.valueOf(C2731g.m7901a(fVar));
                                            continue;
                                        case 41:
                                            tVar.f23989F = fVar.mo7312d();
                                            continue;
                                        case 42:
                                            tVar.f23990G = Long.valueOf(C2731g.m7902b(fVar));
                                            continue;
                                        default:
                                            switch (b) {
                                                case 47:
                                                    tVar.f24011p = C2977f.m8301b(fVar);
                                                    continue;
                                                case 48:
                                                    tVar.f23992I = C9563bt.m17880b(fVar);
                                                    continue;
                                                case 49:
                                                    tVar.f23993J = C2731g.m7901a(fVar);
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
                    tVar.f23995L = C9561br.m17876b(fVar);
                }
            } else {
                tVar.f23991H.add(fVar.mo7312d());
            }
        }
    }
}
