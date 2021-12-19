package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9609al;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dz */
public final class C9811dz implements AbstractC2724b<C9609al.C9612c> {
    static {
        Covode.recordClassIndex(11353);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9609al.C9612c mo7304a(C2730f fVar) {
        return m18110b(fVar);
    }

    /* renamed from: b */
    public static C9609al.C9612c m18110b(C2730f fVar) {
        C9609al.C9612c cVar = new C9609al.C9612c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f23348a = C9810dy.m18108b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f23349b = C9810dy.m18108b(fVar);
            }
        }
    }
}
