package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* renamed from: com.bytedance.android.livesdk.model.bi */
public final class C9552bi implements AbstractC2724b<C9589i> {
    static {
        Covode.recordClassIndex(11091);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9589i mo7304a(C2730f fVar) {
        return m17859b(fVar);
    }

    /* renamed from: b */
    public static C9589i m17859b(C2730f fVar) {
        C9589i iVar = new C9589i();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        iVar.f23244a = fVar.mo7314f();
                        break;
                    case 2:
                        iVar.f23245b = fVar.mo7312d();
                        break;
                    case 3:
                        iVar.f23246c = C2977f.m8301b(fVar);
                        break;
                    case 4:
                        iVar.f23247d = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        iVar.f23248e = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        iVar.f23249f = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        iVar.f23251h = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        iVar.f23253j = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        iVar.f23252i = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        iVar.f23250g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        iVar.f23254k = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        iVar.f23255l = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        iVar.f23256m = Long.valueOf(fVar.mo7314f());
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        iVar.f23257n = Long.valueOf(fVar.mo7314f());
                        break;
                    case 15:
                        iVar.f23258o = Long.valueOf(fVar.mo7314f());
                        break;
                    case 16:
                        iVar.f23259p = Long.valueOf(fVar.mo7314f());
                        break;
                    case 17:
                        iVar.f23260q = Long.valueOf(fVar.mo7314f());
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        iVar.f23261r = Long.valueOf(fVar.mo7314f());
                        break;
                    case 19:
                        iVar.f23262s = Long.valueOf(fVar.mo7314f());
                        break;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        iVar.f23263t = C9551bh.m17857b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return iVar;
            }
        }
    }
}
