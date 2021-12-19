package com.airbnb.lottie.p093a.p095b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.i */
public final class C2025i extends AbstractC2022f<PointF> {

    /* renamed from: e */
    private final PointF f6086e = new PointF();

    /* renamed from: f */
    private final float[] f6087f = new float[2];

    /* renamed from: g */
    private C2024h f6088g;

    /* renamed from: h */
    private PathMeasure f6089h;

    static {
        Covode.recordClassIndex(2220);
    }

    public C2025i(List<? extends C2202a<PointF>> list) {
        super(list);
        if (C2144d.C2145a.f6479a) {
            this.f6089h = new PathMeasure();
        }
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Object mo5909a(C2202a aVar, float f) {
        PathMeasure pathMeasure;
        C2024h hVar = (C2024h) aVar;
        Path path = hVar.f6084a;
        if (path == null) {
            return aVar.f6566b;
        }
        if (this.f6067d != null) {
            return this.f6067d.mo6126a(hVar.f6569e, hVar.f6570f.floatValue(), hVar.f6566b, hVar.f6567c, mo5915c(), f, this.f6066c);
        }
        if (this.f6088g != hVar) {
            if (!C2144d.C2145a.f6479a || (pathMeasure = this.f6089h) == null) {
                this.f6089h = new PathMeasure(path, false);
            } else {
                pathMeasure.setPath(path, false);
            }
            this.f6088g = hVar;
        }
        PathMeasure pathMeasure2 = this.f6089h;
        pathMeasure2.getPosTan(f * pathMeasure2.getLength(), this.f6087f, null);
        PointF pointF = this.f6086e;
        float[] fArr = this.f6087f;
        pointF.set(fArr[0], fArr[1]);
        return this.f6086e;
    }
}
