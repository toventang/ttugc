package com.airbnb.lottie.p093a.p095b;

import android.graphics.PointF;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.j */
public final class C2026j extends AbstractC2022f<PointF> {

    /* renamed from: e */
    private final PointF f6090e = new PointF();

    static {
        Covode.recordClassIndex(2221);
    }

    public C2026j(List<C2202a<PointF>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Object mo5909a(C2202a aVar, float f) {
        if (aVar.f6566b == null || aVar.f6567c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f6566b;
        T t2 = aVar.f6567c;
        if (this.f6067d != null) {
            return this.f6067d.mo6126a(aVar.f6569e, aVar.f6570f.floatValue(), t, t2, f, mo5915c(), this.f6066c);
        }
        this.f6090e.set(((PointF) t).x + ((((PointF) t2).x - ((PointF) t).x) * f), ((PointF) t).y + (f * (((PointF) t2).y - ((PointF) t).y)));
        return this.f6090e;
    }
}
