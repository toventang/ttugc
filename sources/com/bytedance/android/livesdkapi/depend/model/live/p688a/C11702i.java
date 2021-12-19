package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.i */
public final class C11702i implements AbstractC2724b<C11697d> {
    static {
        Covode.recordClassIndex(13390);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11697d mo7304a(C2730f fVar) {
        return m20654b(fVar);
    }

    /* renamed from: b */
    public static C11697d m20654b(C2730f fVar) {
        C11697d dVar = new C11697d((byte) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f27992a = C11699f.m20648b(fVar);
            }
        }
    }
}
