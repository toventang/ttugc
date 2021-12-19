package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p578b.C9632aa;
import com.bytedance.android.livesdk.model.message.p578b.C9634ac;
import com.bytedance.android.livesdk.model.message.p578b.C9635ad;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9652p;
import com.bytedance.android.livesdk.model.message.p578b.C9659w;
import com.bytedance.android.livesdk.model.message.p578b.C9660x;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11700g;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.message.ec */
public final class C9820ec implements AbstractC2724b<C9614an> {
    static {
        Covode.recordClassIndex(11362);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9614an mo7304a(C2730f fVar) {
        C9614an anVar = new C9614an();
        anVar.f23360k = new ArrayList();
        anVar.f23359j = new HashMap();
        anVar.f23361l = new ArrayList();
        anVar.f23357h = new HashMap();
        anVar.f23363n = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                Long l = null;
                switch (b) {
                    case 1:
                        anVar.f28134O = C11783f.m20759b(fVar);
                        break;
                    case 2:
                        anVar.f23354a = C2731g.m7902b(fVar);
                        break;
                    case 3:
                        anVar.f23356g = C9660x.m17975b(fVar);
                        break;
                    case 4:
                        anVar.f23355f = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        long a2 = fVar.mo7307a();
                        C9642h hVar = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (hVar != null) {
                                    anVar.f23357h.put(l, hVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b2 == 2) {
                                hVar = C9659w.m17973b(fVar);
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        anVar.f23358i = C9652p.m17959b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        anVar.f23364o = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        anVar.f23360k.add(C9635ad.m17957b(fVar));
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        anVar.f23361l.add(C9632aa.m17951b(fVar));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        anVar.f23362m = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        anVar.f23363n.add(C9634ac.m17955b(fVar));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        long a3 = fVar.mo7307a();
                        C11695b bVar = null;
                        while (true) {
                            int b3 = fVar.mo7310b();
                            if (b3 == -1) {
                                fVar.mo7309a(a3);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (bVar != null) {
                                    anVar.f23359j.put(l, bVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b3 == 2) {
                                bVar = C11700g.m20650b(fVar);
                            }
                        }
                }
            } else {
                fVar.mo7309a(a);
                return anVar;
            }
        }
    }
}
