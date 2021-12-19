package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30078e;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.HashMap;

/* renamed from: com.ss.android.ml.process.a.m */
public final class C30110m implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36606);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        HashMap<String, Object> hashMap = dVar.f71841a;
        AbstractC30113c cVar = dVar.f71844d;
        for (String str : cVar.getArgs()) {
            Number number = (Number) C30078e.m60836a(hashMap, str);
            if (number != null) {
                hashMap.put(cVar.getFeature(), Double.valueOf(1.0d / (Math.exp((double) (-number.floatValue())) + 1.0d)));
            }
        }
    }
}
