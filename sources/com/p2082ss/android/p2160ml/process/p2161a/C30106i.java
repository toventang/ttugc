package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30078e;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.i */
public final class C30106i implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36602);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        float f;
        HashMap<String, Object> hashMap = dVar.f71841a;
        AbstractC30113c cVar = dVar.f71844d;
        List<String> labels = cVar.getLabels();
        List<String> args = cVar.getArgs();
        List<Float> oPTs = cVar.getOPTs();
        String str = args.get(0);
        int indexOf = labels.indexOf(C30078e.m60836a(hashMap, str));
        if (indexOf < 0) {
            indexOf = (int) oPTs.get(0).floatValue();
        }
        for (int i = 0; i < labels.size(); i++) {
            String str2 = str + "#" + i;
            if (indexOf == i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            hashMap.put(str2, Float.valueOf(f));
        }
    }
}
