package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.j */
public final class C20964j extends AbstractC20960f<PointF> {

    /* renamed from: e */
    private final PointF f49680e = new PointF();

    static {
        Covode.recordClassIndex(24580);
    }

    public C20964j(List<C21089a<PointF>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        Object a;
        if (aVar.f49988c == null || aVar.f49989d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f49988c;
        T t2 = aVar.f49989d;
        if (this.f49659d != null && (a = this.f49659d.mo34571a(aVar.f49991f, aVar.f49992g.floatValue(), t, t2, f, mo34468b(), this.f49658c)) != null) {
            return a;
        }
        this.f49680e.set(((PointF) t).x + ((((PointF) t2).x - ((PointF) t).x) * f), ((PointF) t).y + (f * (((PointF) t2).y - ((PointF) t).y)));
        return this.f49680e;
    }
}
