package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.w */
public final class C11743w implements AbstractC2724b<CommerceStruct> {
    static {
        Covode.recordClassIndex(13431);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ CommerceStruct mo7304a(C2730f fVar) {
        return m20701b(fVar);
    }

    /* renamed from: b */
    public static CommerceStruct m20701b(C2730f fVar) {
        CommerceStruct commerceStruct = new CommerceStruct();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return commerceStruct;
            } else if (b == 1) {
                commerceStruct.commercePermission = (int) fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                commerceStruct.oecInitDataString = fVar.mo7312d();
            }
        }
    }
}
