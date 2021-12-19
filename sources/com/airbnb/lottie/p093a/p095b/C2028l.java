package com.airbnb.lottie.p093a.p095b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.p099e.C2047a;
import com.airbnb.lottie.p099e.p101b.C2077l;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.l */
public final class C2028l extends AbstractC2012a<C2077l, Path> {

    /* renamed from: e */
    private final C2077l f6092e = new C2077l();

    /* renamed from: f */
    private final Path f6093f = new Path();

    static {
        Covode.recordClassIndex(2223);
    }

    public C2028l(List<C2202a<C2077l>> list) {
        super(list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.lottie.j.a, float] */
    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Path mo5909a(C2202a<C2077l> aVar, float f) {
        boolean z;
        T t = aVar.f6566b;
        T t2 = aVar.f6567c;
        C2077l lVar = this.f6092e;
        if (lVar.f6236b == null) {
            lVar.f6236b = new PointF();
        }
        if (t.f6237c || t2.f6237c) {
            z = true;
        } else {
            z = false;
        }
        lVar.f6237c = z;
        if (t.f6235a.size() != t2.f6235a.size()) {
            C2041d.m6461a("Curves must have the same number of control points. Shape 1: " + t.f6235a.size() + "\tShape 2: " + t2.f6235a.size());
        }
        if (lVar.f6235a.isEmpty()) {
            int min = Math.min(t.f6235a.size(), t2.f6235a.size());
            for (int i = 0; i < min; i++) {
                lVar.f6235a.add(new C2047a());
            }
        }
        PointF pointF = t.f6236b;
        PointF pointF2 = t2.f6236b;
        float f2 = pointF.x;
        float f3 = f2 + ((pointF2.x - f2) * f);
        float f4 = pointF.y;
        float f5 = f4 + ((pointF2.y - f4) * f);
        if (lVar.f6236b == null) {
            lVar.f6236b = new PointF();
        }
        lVar.f6236b.set(f3, f5);
        for (int size = lVar.f6235a.size() - 1; size >= 0; size--) {
            C2047a aVar2 = t.f6235a.get(size);
            C2047a aVar3 = t2.f6235a.get(size);
            PointF pointF3 = aVar2.f6152a;
            PointF pointF4 = aVar2.f6153b;
            PointF pointF5 = aVar2.f6154c;
            PointF pointF6 = aVar3.f6152a;
            PointF pointF7 = aVar3.f6153b;
            PointF pointF8 = aVar3.f6154c;
            float f6 = pointF3.x;
            float f7 = f6 + ((pointF6.x - f6) * f);
            float f8 = pointF3.y;
            lVar.f6235a.get(size).f6152a.set(f7, f8 + ((pointF6.y - f8) * f));
            float f9 = pointF4.x;
            float f10 = f9 + ((pointF7.x - f9) * f);
            float f11 = pointF4.y;
            lVar.f6235a.get(size).f6153b.set(f10, f11 + ((pointF7.y - f11) * f));
            float f12 = pointF5.x;
            float f13 = f12 + ((pointF8.x - f12) * f);
            float f14 = pointF5.y;
            lVar.f6235a.get(size).f6154c.set(f13, f14 + ((pointF8.y - f14) * f));
        }
        C2192f.m6790a(this.f6092e, this.f6093f);
        return this.f6093f;
    }
}
