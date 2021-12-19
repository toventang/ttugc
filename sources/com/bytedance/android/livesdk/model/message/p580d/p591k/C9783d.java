package com.bytedance.android.livesdk.model.message.p580d.p591k;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9760j;
import com.bytedance.android.livesdk.model.message.p580d.p588h.C9775d;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.d.k.d */
public final class C9783d implements AbstractC2724b<C9780a> {
    static {
        Covode.recordClassIndex(11325);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9780a mo7304a(C2730f fVar) {
        return m18073b(fVar);
    }

    /* renamed from: b */
    public static C9780a m18073b(C2730f fVar) {
        C9780a aVar = new C9780a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                Long l = null;
                switch (b) {
                    case 1:
                        aVar.f23793a = fVar.mo7314f();
                        break;
                    case 2:
                        aVar.f23795c = fVar.mo7314f();
                        break;
                    case 3:
                        aVar.f23796d = C9785f.m18077b(fVar);
                        break;
                    case 4:
                        aVar.f23797e = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f23799g = C9785f.m18077b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f23800h = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f23801i = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f23802j = C9784e.m18075b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f23794b = C3004j.m8316b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aVar.f23798f = C3004j.m8316b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        long a2 = fVar.mo7307a();
                        String str = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str != null) {
                                    aVar.f23803k.put(l, str);
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
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        aVar.f23804l = C9775d.m18067b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        long a3 = fVar.mo7307a();
                        Long l2 = null;
                        while (true) {
                            int b3 = fVar.mo7310b();
                            if (b3 == -1) {
                                fVar.mo7309a(a3);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (l2 != null) {
                                    aVar.f23805m.put(l, l2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b3 == 2) {
                                l2 = Long.valueOf(C2731g.m7902b(fVar));
                            }
                        }
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        aVar.f23806n = fVar.mo7313e();
                        break;
                    case 15:
                        aVar.f23807o = C9760j.m18053b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return aVar;
            }
        }
    }
}
