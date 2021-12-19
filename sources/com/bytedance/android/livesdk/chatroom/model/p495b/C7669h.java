package com.bytedance.android.livesdk.chatroom.model.p495b;

import com.bytedance.android.livesdk.chatroom.model.p497c.C7679d;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.h */
public final class C7669h implements AbstractC2724b<C7663b> {
    static {
        Covode.recordClassIndex(8451);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7663b mo7304a(C2730f fVar) {
        C7663b bVar = new C7663b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 2) {
                bVar.f18982a = (int) fVar.mo7314f();
            } else if (b != 3) {
                switch (b) {
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f18983b = fVar.mo7312d();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f18985d = fVar.mo7312d();
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
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
                                    bVar.f18986e.put(l, str);
                                    continue;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b2 == 1) {
                                l = Long.valueOf(fVar.mo7314f());
                            } else if (b2 == 2) {
                                str = fVar.mo7312d();
                            }
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f18987f = fVar.mo7313e();
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bVar.f18988g = C7679d.m15671b(fVar);
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                bVar.f18984c = fVar.mo7313e();
            }
        }
    }
}
