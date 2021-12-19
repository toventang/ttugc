package com.bytedance.android.livesdk.model;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ca */
public final class C9571ca implements AbstractC2724b<MaskLayer> {
    static {
        Covode.recordClassIndex(11110);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ MaskLayer mo7304a(C2730f fVar) {
        return m17894b(fVar);
    }

    /* renamed from: b */
    public static MaskLayer m17894b(C2730f fVar) {
        MaskLayer maskLayer = new MaskLayer();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return maskLayer;
            } else if (b == 1) {
                maskLayer.title = C9716r.m18010b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                maskLayer.subTitle = C9716r.m18010b(fVar);
            }
        }
    }
}
