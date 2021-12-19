package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.l */
public final class C30109l implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36605);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        float[] fArr = dVar.f71842b;
        List<Float> oPTs = dVar.f71845e.getOPTs();
        if (oPTs != null && oPTs.size() >= 2) {
            float floatValue = oPTs.get(0).floatValue();
            fArr[0] = (fArr[0] * floatValue) + oPTs.get(1).floatValue();
        }
    }
}
