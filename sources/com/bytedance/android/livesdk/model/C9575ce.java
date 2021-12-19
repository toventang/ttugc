package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2729e;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.ce */
public final class C9575ce implements AbstractC2724b<C9537au> {
    static {
        Covode.recordClassIndex(11114);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9537au mo7304a(C2730f fVar) {
        return m17902b(fVar);
    }

    /* renamed from: b */
    public static C9537au m17902b(C2730f fVar) {
        C9537au auVar = new C9537au();
        ArrayList arrayList = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        auVar.f23166h = C2731g.m7902b(fVar);
                        break;
                    case 2:
                        auVar.f23159a = C2977f.m8301b(fVar);
                        break;
                    case 3:
                        auVar.f23165g = (int) C2731g.m7902b(fVar);
                        break;
                    case 4:
                        arrayList.add(Integer.valueOf((int) C2731g.m7902b(fVar)));
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        auVar.f23161c = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        auVar.f23160b = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        auVar.f23162d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        auVar.f23163e = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        auVar.f23171m = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        auVar.f23170l = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        auVar.f23167i = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        auVar.f23169k = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        auVar.f23168j = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        auVar.f23172n = (int) C2731g.m7902b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                auVar.f23164f = C2729e.m7886a(arrayList);
                return auVar;
            }
        }
    }
}
