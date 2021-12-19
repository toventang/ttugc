package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bg */
public final class C9550bg implements AbstractC2724b<C9588h> {
    static {
        Covode.recordClassIndex(11089);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9588h mo7304a(C2730f fVar) {
        return m17855b(fVar);
    }

    /* renamed from: b */
    public static C9588h m17855b(C2730f fVar) {
        C9588h hVar = new C9588h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hVar;
            } else if (b == 1) {
                hVar.f23241a = fVar.mo7314f();
            } else if (b == 2) {
                hVar.f23242b = fVar.mo7314f();
            } else if (b != 6) {
                C2731g.m7903c(fVar);
            } else {
                hVar.f23243c = fVar.mo7314f();
            }
        }
    }
}
