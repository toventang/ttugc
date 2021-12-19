package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.a.i */
public final class C45788i implements AbstractC2724b<C45785f> {
    static {
        Covode.recordClassIndex(54306);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C45785f mo7304a(C2730f fVar) {
        return m88385b(fVar);
    }

    /* renamed from: b */
    public static C45785f m88385b(C2730f fVar) {
        C45785f fVar2 = new C45785f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b == 1) {
                fVar2.f106681a = fVar.mo7314f();
            } else if (b == 2) {
                fVar2.f106682f = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f106683g = fVar.mo7314f();
            }
        }
    }
}
