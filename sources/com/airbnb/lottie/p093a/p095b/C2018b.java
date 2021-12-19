package com.airbnb.lottie.p093a.p095b;

import com.airbnb.lottie.p106i.C2188b;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.b */
public final class C2018b extends AbstractC2022f<Integer> {
    static {
        Covode.recordClassIndex(2213);
    }

    public C2018b(List<C2202a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Object mo5909a(C2202a aVar, float f) {
        if (aVar.f6566b == null || aVar.f6567c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = aVar.f6566b.intValue();
        int intValue2 = aVar.f6567c.intValue();
        if (this.f6067d != null) {
            return this.f6067d.mo6126a(aVar.f6569e, aVar.f6570f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo5915c(), this.f6066c);
        }
        return Integer.valueOf(C2188b.m6766a(f, intValue, intValue2));
    }
}
