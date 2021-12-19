package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.gift.model.ar */
public final class C8830ar implements AbstractC2724b<C8859w> {
    static {
        Covode.recordClassIndex(9711);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8859w mo7304a(C2730f fVar) {
        return m17146b(fVar);
    }

    /* renamed from: b */
    public static C8859w m17146b(C2730f fVar) {
        C8859w wVar = new C8859w();
        wVar.f21795p = new ArrayList();
        wVar.f21793n = new ArrayList();
        wVar.f21794o = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        wVar.f21781b = C9716r.m18010b(fVar);
                        break;
                    case 2:
                        wVar.f21782c = (int) C2731g.m7902b(fVar);
                        break;
                    case 3:
                        wVar.f21784e = fVar.mo7312d();
                        break;
                    case 4:
                        wVar.f21785f = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        wVar.f21786g = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        wVar.f21783d = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        wVar.f21788i = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        wVar.f21789j = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        wVar.f21791l = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        wVar.f21792m = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        wVar.f21793n.add(C8829aq.m17144b(fVar));
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        wVar.f21790k = C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case 15:
                        wVar.f21794o.add(C8824al.m17135b(fVar));
                        break;
                    case 16:
                        wVar.f21799t = Long.valueOf(C2731g.m7902b(fVar));
                        break;
                    case 17:
                        wVar.f21787h = C2731g.m7902b(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        wVar.f21798s = fVar.mo7312d();
                        break;
                    case 19:
                        wVar.f21780a = C8866z.m17165b(fVar);
                        break;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        wVar.f21795p.add(C8816ad.m17120b(fVar));
                        break;
                    case 21:
                        wVar.f21800u = fVar.mo7312d();
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return wVar;
            }
        }
    }
}
