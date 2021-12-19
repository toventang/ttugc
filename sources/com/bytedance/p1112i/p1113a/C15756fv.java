package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fv */
public class C15756fv extends AbstractC15287a {

    /* renamed from: d */
    Paint f38281d;

    /* renamed from: e */
    Path f38282e;

    /* renamed from: f */
    Paint f38283f;

    /* renamed from: g */
    Path f38284g;

    static {
        Covode.recordClassIndex(18022);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.addCircle(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-3947581);
        this.f38281d = new Paint();
        Path path = new Path();
        this.f38282e = path;
        path.addCircle(24.0f, 22.0f, 9.0f, Path.Direction.CW);
        this.f38281d.setStyle(Paint.Style.FILL);
        this.f38281d.setColor(-986896);
        this.f37300a.add(this.f38281d);
        this.f38283f = new Paint();
        Path path2 = new Path();
        this.f38284g = path2;
        path2.moveTo(8.28003f, 42.1649f);
        this.f38284g.cubicTo(11.3682f, 36.6939f, 17.2358f, 33.0f, 23.9662f, 33.0f);
        this.f38284g.cubicTo(30.6966f, 33.0f, 36.5642f, 36.6939f, 39.6523f, 42.1649f);
        this.f38284g.cubicTo(35.4456f, 45.8008f, 29.9627f, 48.0f, 23.9662f, 48.0f);
        this.f38284g.cubicTo(17.9696f, 48.0f, 12.4867f, 45.8008f, 8.28003f, 42.1649f);
        this.f38284g.close();
        this.f38284g.setFillType(Path.FillType.EVEN_ODD);
        this.f38283f.setStyle(Paint.Style.FILL);
        this.f38283f.setColor(-986896);
        this.f37300a.add(this.f38283f);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38282e, this.f38281d);
        canvas.drawPath(this.f38284g, this.f38283f);
    }
}
