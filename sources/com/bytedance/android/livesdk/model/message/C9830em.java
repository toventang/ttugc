package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* renamed from: com.bytedance.android.livesdk.model.message.em */
public final class C9830em implements AbstractC2724b<C9627ay> {
    static {
        Covode.recordClassIndex(11372);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9627ay mo7304a(C2730f fVar) {
        C9627ay ayVar = new C9627ay();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ayVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        ayVar.f23444f = C3004j.m8316b(fVar);
                        break;
                    case 3:
                        ayVar.f23443a = (int) fVar.mo7314f();
                        break;
                    case 4:
                        ayVar.f23448j = C3004j.m8316b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ayVar.f23449k = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ayVar.f23445g = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        ayVar.f23450l = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        ayVar.f23447i = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        ayVar.f23451m = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        ayVar.f23446h = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        ayVar.f23452n = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        ayVar.f23454p = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case 16:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        ayVar.f23455q = fVar.mo7312d();
                        break;
                    case 15:
                        ayVar.f23453o = C9829el.m18129b(fVar);
                        break;
                    case 17:
                        ayVar.f23456r = C2977f.m8301b(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        ayVar.f23457s = C9716r.m18010b(fVar);
                        break;
                    case 19:
                        ayVar.f23458t = fVar.mo7312d();
                        break;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        ayVar.f23459u = fVar.mo7312d();
                        break;
                    case 21:
                        ayVar.f23460v = fVar.mo7312d();
                        break;
                    case 22:
                        ayVar.f23461w = Long.valueOf(fVar.mo7314f());
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return ayVar;
            }
        }
    }
}
