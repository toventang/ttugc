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

/* renamed from: com.bytedance.android.livesdk.model.cl */
public final class C9582cl implements AbstractC2724b<C9545bb> {
    static {
        Covode.recordClassIndex(11121);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9545bb mo7304a(C2730f fVar) {
        return m17915b(fVar);
    }

    /* renamed from: b */
    public static C9545bb m17915b(C2730f fVar) {
        C9545bb bbVar = new C9545bb();
        bbVar.f23209n = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bbVar;
            } else if (b != 1001) {
                switch (b) {
                    case 1:
                        bbVar.f23201f = C2731g.m7902b(fVar);
                        continue;
                    case 2:
                        bbVar.f23196a = C2977f.m8301b(fVar);
                        continue;
                    case 3:
                        bbVar.f23200e = fVar.mo7312d();
                        continue;
                    case 4:
                        bbVar.f23197b = C2977f.m8301b(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bbVar.f23199d = fVar.mo7312d();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bbVar.f23208m = (int) C2731g.m7902b(fVar);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bbVar.f23198c = C2977f.m8301b(fVar);
                        continue;
                    default:
                        switch (b) {
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                bbVar.f23202g = C2731g.m7902b(fVar);
                                continue;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                bbVar.f23212q = C2731g.m7902b(fVar);
                                continue;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                bbVar.f23211p = C2731g.m7902b(fVar);
                                continue;
                            default:
                                switch (b) {
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                        bbVar.f23210o = fVar.mo7312d();
                                        continue;
                                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                        bbVar.f23209n.add(C9566bw.m17886b(fVar));
                                        continue;
                                    case 15:
                                        bbVar.f23219x = C2731g.m7902b(fVar);
                                        continue;
                                    case 16:
                                        bbVar.f23203h = C2977f.m8301b(fVar);
                                        continue;
                                    case 17:
                                        bbVar.f23204i = C2977f.m8301b(fVar);
                                        continue;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                                        bbVar.f23206k = C2977f.m8301b(fVar);
                                        continue;
                                    case 19:
                                        bbVar.f23205j = C2977f.m8301b(fVar);
                                        continue;
                                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                                        bbVar.f23207l = C2977f.m8301b(fVar);
                                        continue;
                                    case 21:
                                        bbVar.f23215t = C2731g.m7902b(fVar);
                                        continue;
                                    case 22:
                                        bbVar.f23217v = fVar.mo7312d();
                                        continue;
                                    case 23:
                                        bbVar.f23213r = C2977f.m8301b(fVar);
                                        continue;
                                    case 24:
                                        bbVar.f23214s = C2977f.m8301b(fVar);
                                        continue;
                                    case 25:
                                        bbVar.f23218w = C2731g.m7902b(fVar);
                                        continue;
                                    default:
                                        C2731g.m7903c(fVar);
                                        continue;
                                        continue;
                                        continue;
                                }
                        }
                }
            } else {
                bbVar.f23216u = fVar.mo7312d();
            }
        }
    }
}
