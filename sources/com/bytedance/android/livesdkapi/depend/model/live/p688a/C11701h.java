package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.android.livesdk.model.message.p578b.C9652p;
import com.bytedance.android.livesdk.model.message.p578b.C9659w;
import com.bytedance.android.livesdk.model.message.p578b.C9660x;
import com.bytedance.android.livesdk.model.message.p578b.C9661y;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.h */
public final class C11701h implements AbstractC2724b<C11696c> {
    static {
        Covode.recordClassIndex(13389);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11696c mo7304a(C2730f fVar) {
        return m20652b(fVar);
    }

    /* renamed from: b */
    public static C11696c m20652b(C2730f fVar) {
        C11696c cVar = new C11696c((char) 0);
        cVar.f27985d = new HashMap();
        cVar.f27987f = new HashMap();
        cVar.f27991j = new HashMap();
        cVar.f27986e = new HashMap();
        cVar.f27989h = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                Long l = null;
                switch (b) {
                    case 1:
                        cVar.f27982a = Long.valueOf(C2731g.m7902b(fVar));
                        break;
                    case 2:
                        cVar.f27983b = Long.valueOf(C2731g.m7902b(fVar));
                        break;
                    case 3:
                        cVar.f27984c = C9660x.m17975b(fVar);
                        break;
                    case 4:
                        long a2 = fVar.mo7307a();
                        C9645j jVar = null;
                        while (true) {
                            int b2 = fVar.mo7310b();
                            if (b2 == -1) {
                                fVar.mo7309a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (jVar != null) {
                                    cVar.f27985d.put(l, jVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b2 == 2) {
                                jVar = C9661y.m17977b(fVar);
                            }
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        long a3 = fVar.mo7307a();
                        C9642h hVar = null;
                        while (true) {
                            int b3 = fVar.mo7310b();
                            if (b3 == -1) {
                                fVar.mo7309a(a3);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (hVar != null) {
                                    cVar.f27986e.put(l, hVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b3 == 2) {
                                hVar = C9659w.m17973b(fVar);
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        long a4 = fVar.mo7307a();
                        C11697d dVar = null;
                        while (true) {
                            int b4 = fVar.mo7310b();
                            if (b4 == -1) {
                                fVar.mo7309a(a4);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (dVar != null) {
                                    cVar.f27987f.put(l, dVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b4 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b4 == 2) {
                                dVar = C11702i.m20654b(fVar);
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f27988g = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        long a5 = fVar.mo7307a();
                        Boolean bool = null;
                        while (true) {
                            int b5 = fVar.mo7310b();
                            if (b5 == -1) {
                                fVar.mo7309a(a5);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (bool != null) {
                                    cVar.f27989h.put(l, bool);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b5 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b5 == 2) {
                                bool = Boolean.valueOf(C2731g.m7901a(fVar));
                            }
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        cVar.f27990i = C9652p.m17959b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    default:
                        C2731g.m7903c(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        long a6 = fVar.mo7307a();
                        C11695b bVar = null;
                        while (true) {
                            int b6 = fVar.mo7310b();
                            if (b6 == -1) {
                                fVar.mo7309a(a6);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (bVar != null) {
                                    cVar.f27991j.put(l, bVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b6 == 1) {
                                l = Long.valueOf(C2731g.m7902b(fVar));
                            } else if (b6 == 2) {
                                bVar = C11700g.m20650b(fVar);
                            }
                        }
                }
            } else {
                fVar.mo7309a(a);
                return cVar;
            }
        }
    }
}
