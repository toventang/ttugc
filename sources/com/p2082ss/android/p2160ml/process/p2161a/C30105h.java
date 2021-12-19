package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30078e;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.h */
public final class C30105h implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36601);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        HashMap<String, Object> hashMap = dVar.f71841a;
        AbstractC30113c cVar = dVar.f71844d;
        List<String> args = cVar.getArgs();
        List<Float> oPTs = cVar.getOPTs();
        for (String str : args) {
            Number number = (Number) C30078e.m60836a(hashMap, str);
            if (number != null) {
                float floatValue = number.floatValue();
                float floatValue2 = oPTs.get(0).floatValue();
                float floatValue3 = oPTs.get(1).floatValue();
                hashMap.put(cVar.getFeature(), Float.valueOf((floatValue - floatValue3) / (floatValue2 - floatValue3)));
            }
        }
    }
}
