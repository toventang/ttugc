package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.am */
public final class C11715am implements AbstractC2724b<C11738s> {
    static {
        Covode.recordClassIndex(13403);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11738s mo7304a(C2730f fVar) {
        return m20676b(fVar);
    }

    /* renamed from: b */
    public static C11738s m20676b(C2730f fVar) {
        C11738s sVar = new C11738s();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        sVar.f28095c = (int) fVar.mo7314f();
                        break;
                    case 2:
                        sVar.f28096d = (int) fVar.mo7314f();
                        break;
                    case 3:
                        sVar.f28103k = (int) fVar.mo7314f();
                        break;
                    case 4:
                        sVar.f28099g = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        sVar.f28097e = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        sVar.f28098f = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        sVar.f28102j = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        sVar.f28104l = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        sVar.f28105m = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        sVar.f28101i = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case 15:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        sVar.f28100h = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        sVar.f28106n = C11716an.m20678b(fVar);
                        break;
                    case 16:
                        sVar.f28108p = (float) fVar.mo7314f();
                        break;
                    case 17:
                        sVar.f28109q = C2731g.m7901a(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        sVar.f28110r = C2731g.m7901a(fVar);
                        break;
                    case 19:
                        sVar.f28111s = C2731g.m7901a(fVar);
                        break;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        sVar.f28107o = C2731g.m7901a(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return sVar;
            }
        }
    }
}
