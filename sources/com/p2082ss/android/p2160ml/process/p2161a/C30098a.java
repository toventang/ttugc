package com.p2082ss.android.p2160ml.process.p2161a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30078e;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.a */
public final class C30098a implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36594);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        float f;
        HashMap<String, Object> hashMap = dVar.f71841a;
        AbstractC30113c cVar = dVar.f71844d;
        List<String> args = cVar.getArgs();
        Number number = (Number) C30078e.m60836a(hashMap, args.get(0));
        Number number2 = (Number) C30078e.m60836a(hashMap, args.get(1));
        float f2 = 0.0f;
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        if (number2 != null) {
            f2 = number2.floatValue();
        }
        hashMap.put(cVar.getFeature(), Float.valueOf(f / f2));
    }
}
