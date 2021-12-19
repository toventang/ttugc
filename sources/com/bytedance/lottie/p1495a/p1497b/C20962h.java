package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1506g.C21089a;

/* renamed from: com.bytedance.lottie.a.b.h */
public final class C20962h extends C21089a<PointF> {

    /* renamed from: a */
    public Path f49675a;

    static {
        Covode.recordClassIndex(24578);
    }

    public C20962h(C21088g gVar, C21089a<PointF> aVar) {
        super(gVar, aVar.f49988c, aVar.f49989d, aVar.f49990e, aVar.f49991f, aVar.f49992g);
        boolean z;
        if (this.f49989d == null || this.f49988c == null || !((PointF) this.f49988c).equals(((PointF) this.f49989d).x, ((PointF) this.f49989d).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f49989d != null && !z) {
            PointF pointF = (PointF) this.f49988c;
            PointF pointF2 = (PointF) this.f49989d;
            PointF pointF3 = aVar.f49993h;
            PointF pointF4 = aVar.f49994i;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            }
            this.f49675a = path;
        }
    }
}
