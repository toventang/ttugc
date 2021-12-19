package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.p1499c.C20976a;
import com.bytedance.lottie.p1499c.p1501b.C21006l;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.l */
public final class C20966l extends AbstractC20954a<C21006l, Path> {

    /* renamed from: e */
    private final C21006l f49681e = new C21006l();

    /* renamed from: f */
    private final Path f49682f = new Path();

    static {
        Covode.recordClassIndex(24582);
    }

    public C20966l(List<C21089a<C21006l>> list) {
        super(list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.lottie.g.a, float] */
    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Path mo34463a(C21089a<C21006l> aVar, float f) {
        boolean z;
        T t = aVar.f49988c;
        T t2 = aVar.f49989d;
        C21006l lVar = this.f49681e;
        if (lVar.f49793b == null) {
            lVar.f49793b = new PointF();
        }
        if (t.f49794c || t2.f49794c) {
            z = true;
        } else {
            z = false;
        }
        lVar.f49794c = z;
        if (t.f49792a.size() != t2.f49792a.size()) {
            C21044e.m39620a("Curves must have the same number of control points. Shape 1: " + t.f49792a.size() + "\tShape 2: " + t2.f49792a.size());
        }
        if (lVar.f49792a.isEmpty()) {
            int min = Math.min(t.f49792a.size(), t2.f49792a.size());
            for (int i = 0; i < min; i++) {
                lVar.f49792a.add(new C20976a());
            }
        }
        PointF pointF = t.f49793b;
        PointF pointF2 = t2.f49793b;
        float f2 = pointF.x;
        float f3 = f2 + ((pointF2.x - f2) * f);
        float f4 = pointF.y;
        float f5 = f4 + ((pointF2.y - f4) * f);
        if (lVar.f49793b == null) {
            lVar.f49793b = new PointF();
        }
        lVar.f49793b.set(f3, f5);
        for (int size = lVar.f49792a.size() - 1; size >= 0; size--) {
            C20976a aVar2 = t.f49792a.get(size);
            C20976a aVar3 = t2.f49792a.get(size);
            PointF pointF3 = aVar2.f49709a;
            PointF pointF4 = aVar2.f49710b;
            PointF pointF5 = aVar2.f49711c;
            PointF pointF6 = aVar3.f49709a;
            PointF pointF7 = aVar3.f49710b;
            PointF pointF8 = aVar3.f49711c;
            float f6 = pointF3.x;
            float f7 = f6 + ((pointF6.x - f6) * f);
            float f8 = pointF3.y;
            lVar.f49792a.get(size).f49709a.set(f7, f8 + ((pointF6.y - f8) * f));
            float f9 = pointF4.x;
            float f10 = f9 + ((pointF7.x - f9) * f);
            float f11 = pointF4.y;
            lVar.f49792a.get(size).f49710b.set(f10, f11 + ((pointF7.y - f11) * f));
            float f12 = pointF5.x;
            float f13 = f12 + ((pointF8.x - f12) * f);
            float f14 = pointF5.y;
            lVar.f49792a.get(size).f49711c.set(f13, f14 + ((pointF8.y - f14) * f));
        }
        C21084f.m39709a(this.f49681e, this.f49682f);
        return this.f49682f;
    }
}
