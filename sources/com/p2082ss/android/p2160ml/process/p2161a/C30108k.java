package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30097a;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.k */
public final class C30108k implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36604);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        float[] fArr = dVar.f71842b;
        AbstractC30097a aVar = dVar.f71845e;
        List<String> list = dVar.f71843c;
        List<String> labels = aVar.getLabels();
        int i = -1;
        float f = 0.0f;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (f <= fArr[i2]) {
                f = fArr[i2];
                i = i2;
            }
        }
        list.add(labels.get(i));
    }
}
