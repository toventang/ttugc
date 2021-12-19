package com.airbnb.lottie.p093a.p095b;

import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.e */
public final class C2021e extends AbstractC2022f<Integer> {
    static {
        Covode.recordClassIndex(2216);
    }

    /* renamed from: g */
    public final int mo5925g() {
        Integer num;
        C2202a b = mo5914b();
        float d = mo5916d();
        if (b.f6566b == null || b.f6567c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6067d != null && (num = (Integer) this.f6067d.mo6126a(b.f6569e, b.f6570f.floatValue(), b.f6566b, b.f6567c, d, mo5915c(), this.f6066c)) != null) {
            return num.intValue();
        } else {
            if (b.f6573i == 784923401) {
                b.f6573i = b.f6566b.intValue();
            }
            int i = b.f6573i;
            if (b.f6574j == 784923401) {
                b.f6574j = b.f6567c.intValue();
            }
            return C2192f.m6788a(i, b.f6574j, d);
        }
    }

    public C2021e(List<C2202a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Object mo5909a(C2202a aVar, float f) {
        if (aVar.f6566b == null || aVar.f6567c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6067d != null) {
            return this.f6067d.mo6126a(aVar.f6569e, aVar.f6570f.floatValue(), aVar.f6566b, aVar.f6567c, f, mo5915c(), this.f6066c);
        } else {
            return Integer.valueOf(C2192f.m6788a(aVar.f6566b.intValue(), aVar.f6567c.intValue(), f));
        }
    }
}
