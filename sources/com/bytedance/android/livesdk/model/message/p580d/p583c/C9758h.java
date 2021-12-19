package com.bytedance.android.livesdk.model.message.p580d.p583c;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.d.c.h */
public final class C9758h implements AbstractC2724b<C9753c> {
    static {
        Covode.recordClassIndex(11300);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9753c mo7304a(C2730f fVar) {
        return m18050b(fVar);
    }

    /* renamed from: b */
    public static C9753c m18050b(C2730f fVar) {
        C9753c cVar = new C9753c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f23745a = fVar.mo7314f();
                        break;
                    case 2:
                        cVar.f23746b = fVar.mo7314f();
                        break;
                    case 3:
                        cVar.f23747c = fVar.mo7312d();
                        break;
                    case 4:
                        cVar.f23748d = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f23749e = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f23750f = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f23751g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        cVar.f23753i = C3004j.m8316b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        long a2 = fVar.mo7307a();
                        Long l = null;
                        String str = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str != null) {
                                    cVar.f23754j.put(l, str);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                l = Long.valueOf(fVar.mo7314f());
                            } else if (b2 == 2) {
                                str = fVar.mo7312d();
                            }
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        cVar.f23755k = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        cVar.f23756l = C9760j.m18053b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        cVar.f23752h = fVar.mo7312d();
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return cVar;
            }
        }
    }
}
