package com.airbnb.lottie.p093a.p095b;

import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.c */
public final class C2019c extends AbstractC2022f<Float> {
    static {
        Covode.recordClassIndex(2214);
    }

    /* renamed from: g */
    public final float mo5925g() {
        Float f;
        C2202a b = mo5914b();
        float d = mo5916d();
        if (b.f6566b == null || b.f6567c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6067d != null && (f = (Float) this.f6067d.mo6126a(b.f6569e, b.f6570f.floatValue(), b.f6566b, b.f6567c, d, mo5915c(), this.f6066c)) != null) {
            return f.floatValue();
        } else {
            if (b.f6571g == -3987645.8f) {
                b.f6571g = b.f6566b.floatValue();
            }
            float f2 = b.f6571g;
            if (b.f6572h == -3987645.8f) {
                b.f6572h = b.f6567c.floatValue();
            }
            return f2 + (d * (b.f6572h - f2));
        }
    }

    public C2019c(List<C2202a<Float>> list) {
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
            float floatValue = aVar.f6566b.floatValue();
            return Float.valueOf(floatValue + (f * (aVar.f6567c.floatValue() - floatValue)));
        }
    }
}
