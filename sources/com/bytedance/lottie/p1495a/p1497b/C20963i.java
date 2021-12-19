package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.i */
public final class C20963i extends AbstractC20960f<PointF> {

    /* renamed from: e */
    private final PointF f49676e = new PointF();

    /* renamed from: f */
    private final float[] f49677f = new float[2];

    /* renamed from: g */
    private C20962h f49678g;

    /* renamed from: h */
    private PathMeasure f49679h;

    static {
        Covode.recordClassIndex(24579);
    }

    public C20963i(List<? extends C21089a<PointF>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        Object a;
        C20962h hVar = (C20962h) aVar;
        Path path = hVar.f49675a;
        if (path == null) {
            return aVar.f49988c;
        }
        if (this.f49659d != null && (a = this.f49659d.mo34571a(hVar.f49991f, hVar.f49992g.floatValue(), hVar.f49988c, hVar.f49989d, mo34468b(), f, this.f49658c)) != null) {
            return a;
        }
        if (this.f49678g != hVar) {
            this.f49679h = new PathMeasure(path, false);
            this.f49678g = hVar;
        }
        PathMeasure pathMeasure = this.f49679h;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f49677f, null);
        PointF pointF = this.f49676e;
        float[] fArr = this.f49677f;
        pointF.set(fArr[0], fArr[1]);
        return this.f49676e;
    }
}
