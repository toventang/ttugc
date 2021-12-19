package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.t */
public final class C11740t implements AbstractC2724b<BALinkStruct> {
    static {
        Covode.recordClassIndex(13428);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ BALinkStruct mo7304a(C2730f fVar) {
        return m20697b(fVar);
    }

    /* renamed from: b */
    public static BALinkStruct m20697b(C2730f fVar) {
        BALinkStruct bALinkStruct = new BALinkStruct();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bALinkStruct;
            } else if (b == 1) {
                bALinkStruct.baLinkPermission = fVar.mo7313e();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                bALinkStruct.baLinkData = fVar.mo7312d();
            }
        }
    }
}
