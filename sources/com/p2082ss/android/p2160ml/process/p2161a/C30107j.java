package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30097a;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.j */
public final class C30107j implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36603);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        float[] fArr = dVar.f71842b;
        AbstractC30097a aVar = dVar.f71845e;
        List<String> list = dVar.f71843c;
        List<Float> oPTs = aVar.getOPTs();
        List<String> labels = aVar.getLabels();
        if (fArr[0] > oPTs.get(0).floatValue()) {
            list.add(labels.get(1));
        } else {
            list.add(labels.get(0));
        }
    }
}
