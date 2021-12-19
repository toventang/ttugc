package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9685br;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fk */
public final class C9855fk implements AbstractC2724b<C9685br.C9686a> {
    static {
        Covode.recordClassIndex(11397);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9685br.C9686a mo7304a(C2730f fVar) {
        return m18164b(fVar);
    }

    /* renamed from: b */
    public static C9685br.C9686a m18164b(C2730f fVar) {
        C9685br.C9686a aVar = new C9685br.C9686a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23575a = fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23576b = C2731g.m7901a(fVar);
            }
        }
    }
}
