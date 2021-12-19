package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.C9552bi;
import com.bytedance.android.livesdk.model.C9565bv;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.gift.model.aq */
public final class C8829aq implements AbstractC2724b<Prop> {
    static {
        Covode.recordClassIndex(9710);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ Prop mo7304a(C2730f fVar) {
        return m17144b(fVar);
    }

    /* renamed from: b */
    public static Prop m17144b(C2730f fVar) {
        Prop prop = new Prop();
        prop.gifts = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        prop.primaryEffectId = (int) C2731g.m7902b(fVar);
                        break;
                    case 2:
                        prop.nextExpire = C2731g.m7902b(fVar);
                        break;
                    case 3:
                        prop.description = fVar.mo7312d();
                        break;
                    case 4:
                        prop.f21689id = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        prop.manual = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        prop.diamond = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        prop.reddotTip = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        prop.icon = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        prop.count = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        prop.name = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        prop.gift = C9565bv.m17884b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        prop.labelIcon = C2977f.m8301b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        prop.isFragment = Boolean.valueOf(C2731g.m7901a(fVar));
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        prop.fragmentsCompoundCount = Long.valueOf(C2731g.m7902b(fVar));
                        break;
                    case 15:
                        prop.isAwemeFreeGift = (int) C2731g.m7902b(fVar);
                        break;
                    case 16:
                        prop.diamondLabel = C2977f.m8301b(fVar);
                        break;
                    case 17:
                        prop.banner = C9552bi.m17859b(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        prop.propType = C2731g.m7902b(fVar);
                        break;
                    case 19:
                        prop.gifts.add(C8827ao.m17140b(fVar));
                        break;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        prop.schemeUrl = fVar.mo7312d();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return prop;
            }
        }
    }
}
