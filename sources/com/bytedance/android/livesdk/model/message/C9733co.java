package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9812e;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.message.co */
public final class C9733co implements AbstractC2724b<C9812e.C9813a> {
    static {
        Covode.recordClassIndex(11275);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9812e.C9813a mo7304a(C2730f fVar) {
        return m18025b(fVar);
    }

    /* renamed from: b */
    public static C9812e.C9813a m18025b(C2730f fVar) {
        C9812e.C9813a aVar = new C9812e.C9813a();
        aVar.f23828b = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23827a = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                long a2 = fVar.mo7307a();
                String str = null;
                String str2 = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        str = fVar.mo7312d();
                    } else if (b2 == 2) {
                        str2 = fVar.mo7312d();
                    }
                }
                fVar.mo7309a(a2);
                if (str == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (str2 != null) {
                    aVar.f23828b.put(str, str2);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
