package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p580d.p581a.C9748b;
import com.bytedance.android.livesdk.model.message.p580d.p582b.C9750b;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9758h;
import com.bytedance.android.livesdk.model.message.p580d.p584d.C9762b;
import com.bytedance.android.livesdk.model.message.p580d.p585e.C9764b;
import com.bytedance.android.livesdk.model.message.p580d.p586f.C9767c;
import com.bytedance.android.livesdk.model.message.p580d.p587g.C9770b;
import com.bytedance.android.livesdk.model.message.p580d.p588h.C9774c;
import com.bytedance.android.livesdk.model.message.p580d.p589i.C9777b;
import com.bytedance.android.livesdk.model.message.p580d.p590j.C9779b;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9783d;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.dv */
public final class C9807dv implements AbstractC2724b<C9606aj> {
    static {
        Covode.recordClassIndex(11349);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9606aj mo7304a(C2730f fVar) {
        C9606aj ajVar = new C9606aj();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return ajVar;
            } else if (b == 16) {
                ajVar.f23329o = C9777b.m18069b(fVar);
            } else if (b == 17) {
                ajVar.f23330p = C9779b.m18071b(fVar);
            } else if (b == 19) {
                ajVar.f23331q = C9774c.m18065b(fVar);
            } else if (b != 20) {
                switch (b) {
                    case 1:
                        ajVar.f28134O = C11783f.m20759b(fVar);
                        continue;
                    case 2:
                        ajVar.f23319a = (int) fVar.mo7314f();
                        continue;
                    case 3:
                        ajVar.f23320f = fVar.mo7314f();
                        continue;
                    case 4:
                        ajVar.f23321g = (int) fVar.mo7314f();
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ajVar.f23322h = C9758h.m18050b(fVar);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ajVar.f23323i = C9783d.m18073b(fVar);
                        continue;
                    default:
                        switch (b) {
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                ajVar.f23326l = C9750b.m18044b(fVar);
                                continue;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                ajVar.f23328n = C9764b.m18057b(fVar);
                                continue;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                ajVar.f23324j = C9748b.m18042b(fVar);
                                continue;
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                ajVar.f23327m = C9762b.m18055b(fVar);
                                continue;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                ajVar.f23325k = C9767c.m18059b(fVar);
                                continue;
                            default:
                                switch (b) {
                                    case 200:
                                        ajVar.f23333s = fVar.mo7312d();
                                        continue;
                                    case 201:
                                        ajVar.f23334t = fVar.mo7314f();
                                        continue;
                                    case 202:
                                        ajVar.f23335u = fVar.mo7312d();
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
                ajVar.f23332r = C9770b.m18063b(fVar);
            }
        }
    }
}
