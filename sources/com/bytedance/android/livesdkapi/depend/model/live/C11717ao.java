package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ao */
public final class C11717ao implements AbstractC2724b<StreamUrl> {
    static {
        Covode.recordClassIndex(13405);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ StreamUrl mo7304a(C2730f fVar) {
        return m20680b(fVar);
    }

    /* renamed from: b */
    public static StreamUrl m20680b(C2730f fVar) {
        StreamUrl streamUrl = new StreamUrl();
        streamUrl.f27954h = new HashMap();
        streamUrl.f27953g = new HashMap();
        streamUrl.f27955i = new HashMap();
        streamUrl.f27951e = new ArrayList();
        streamUrl.f27956j = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        streamUrl.f27949c = (int) C2731g.m7902b(fVar);
                        break;
                    case 2:
                        streamUrl.f27947a = C2731g.m7902b(fVar);
                        break;
                    case 3:
                        streamUrl.f27948b = fVar.mo7312d();
                        break;
                    case 4:
                        long a2 = fVar.mo7307a();
                        String str2 = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str2 != null) {
                                    streamUrl.f27954h.put(str, str2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                str = fVar.mo7312d();
                            } else if (b2 == 2) {
                                str2 = fVar.mo7312d();
                            }
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        streamUrl.f27957k = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        streamUrl.f27958l = C11715am.m20676b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        streamUrl.f27950d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        streamUrl.f27952f = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        long a3 = fVar.mo7307a();
                        String str3 = null;
                        while (true) {
                            int b3 = fVar.mo7310b();
                            if (b3 == -1) {
                                fVar.mo7309a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str3 != null) {
                                    streamUrl.f27953g.put(str, str3);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                str = fVar.mo7312d();
                            } else if (b3 == 2) {
                                str3 = fVar.mo7312d();
                            }
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        streamUrl.f27956j.add(fVar.mo7312d());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        streamUrl.f27959m = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        long a4 = fVar.mo7307a();
                        String str4 = null;
                        while (true) {
                            int b4 = fVar.mo7310b();
                            if (b4 == -1) {
                                fVar.mo7309a(a4);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str4 != null) {
                                    streamUrl.f27955i.put(str, str4);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b4 == 1) {
                                str = fVar.mo7312d();
                            } else if (b4 == 2) {
                                str4 = fVar.mo7312d();
                            }
                        }
                    case 15:
                        streamUrl.f27960n = fVar.mo7312d();
                        break;
                    case 16:
                        streamUrl.f27951e.add(fVar.mo7312d());
                        break;
                    case 17:
                        streamUrl.f27961o = C11704ab.m20658b(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return streamUrl;
            }
        }
    }
}
