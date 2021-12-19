package com.airbnb.lottie.p093a.p095b;

import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2202a;
import com.airbnb.lottie.p107j.C2205d;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.k */
public final class C2027k extends AbstractC2022f<C2205d> {

    /* renamed from: e */
    private final C2205d f6091e;

    static {
        Covode.recordClassIndex(2222);
    }

    public C2027k(List<C2202a<C2205d>> list) {
        super(list);
        if (C2144d.C2145a.f6479a) {
            this.f6091e = new C2205d();
        } else {
            this.f6091e = null;
        }
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Object mo5909a(C2202a aVar, float f) {
        C2205d dVar;
        if (aVar.f6566b == null || aVar.f6567c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f6566b;
        T t2 = aVar.f6567c;
        if (this.f6067d != null) {
            return this.f6067d.mo6126a(aVar.f6569e, aVar.f6570f.floatValue(), t, t2, f, mo5915c(), this.f6066c);
        }
        if (!C2144d.C2145a.f6479a || (dVar = this.f6091e) == null) {
            float f2 = t.f6589a;
            float f3 = t.f6590b;
            return new C2205d(f2 + ((t2.f6589a - f2) * f), f3 + (f * (t2.f6590b - f3)));
        }
        float f4 = t.f6589a;
        float f5 = f4 + ((t2.f6589a - f4) * f);
        float f6 = t.f6590b;
        dVar.f6589a = f5;
        dVar.f6590b = f6 + (f * (t2.f6590b - f6));
        return this.f6091e;
    }
}
