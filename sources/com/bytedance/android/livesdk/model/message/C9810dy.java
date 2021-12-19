package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9609al;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dy */
public final class C9810dy implements AbstractC2724b<C9609al.C9611b> {
    static {
        Covode.recordClassIndex(11352);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9609al.C9611b mo7304a(C2730f fVar) {
        return m18108b(fVar);
    }

    /* renamed from: b */
    public static C9609al.C9611b m18108b(C2730f fVar) {
        C9609al.C9611b bVar = new C9609al.C9611b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f23347a = fVar.mo7312d();
            }
        }
    }
}
