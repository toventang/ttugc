package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.p */
public final class C7696p implements AbstractC2724b<C7651a> {
    static {
        Covode.recordClassIndex(8478);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7651a mo7304a(C2730f fVar) {
        C7651a aVar = new C7651a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f18956a = (int) fVar.mo7314f();
            } else if (b == 2) {
                aVar.f18958c = fVar.mo7313e();
            } else if (b == 4) {
                aVar.f18957b = fVar.mo7312d();
            } else if (b == 6) {
                aVar.f18959d = (int) fVar.mo7314f();
            } else if (b == 7) {
                aVar.f18960e = fVar.mo7312d();
            } else if (b != 8) {
                C2731g.m7903c(fVar);
            } else {
                long a2 = fVar.mo7307a();
                Long l = null;
                String str = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        l = Long.valueOf(fVar.mo7314f());
                    } else if (b2 == 2) {
                        str = fVar.mo7312d();
                    }
                }
                fVar.mo7309a(a2);
                if (l == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (str != null) {
                    aVar.f18961f.put(l, str);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
