package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.oi */
public class C15986oi extends AbstractC15287a {

    /* renamed from: d */
    Paint f38620d;

    /* renamed from: e */
    Path f38621e;

    /* renamed from: f */
    Paint f38622f;

    /* renamed from: g */
    Path f38623g;

    /* renamed from: h */
    Paint f38624h;

    /* renamed from: i */
    Path f38625i;

    static {
        Covode.recordClassIndex(18252);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(25.5f, 17.0f);
        this.f37302c.cubicTo(25.5f, 21.1421f, 22.1421f, 24.5f, 18.0f, 24.5f);
        this.f37302c.cubicTo(13.8579f, 24.5f, 10.5f, 21.1421f, 10.5f, 17.0f);
        this.f37302c.cubicTo(10.5f, 12.8579f, 13.8579f, 9.5f, 18.0f, 9.5f);
        this.f37302c.cubicTo(22.1421f, 9.5f, 25.5f, 12.8579f, 25.5f, 17.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38620d = new Paint();
        Path path = new Path();
        this.f38621e = path;
        path.moveTo(7.10396f, 34.7906f);
        this.f38621e.cubicTo(8.78769f, 30.2189f, 12.8204f, 27.0f, 18.0009f, 27.0f);
        this.f38621e.cubicTo(23.1818f, 27.0f, 27.2107f, 30.2213f, 28.8958f, 34.7898f);
        this.f38621e.cubicTo(29.3075f, 35.906f, 28.6141f, 37.0f, 27.5f, 37.0f);
        this.f38621e.lineTo(8.5f, 37.0f);
        this.f38621e.cubicTo(7.38629f, 37.0f, 6.69289f, 35.9067f, 7.10396f, 34.7906f);
        this.f38621e.close();
        this.f38621e.setFillType(Path.FillType.WINDING);
        this.f38620d.setStyle(Paint.Style.FILL);
        this.f38620d.setColor(-16777216);
        this.f37300a.add(this.f38620d);
        this.f38622f = new Paint();
        Path path2 = new Path();
        this.f38623g = path2;
        path2.moveTo(40.6308f, 37.0f);
        this.f38623g.lineTo(32.0f, 37.0f);
        this.f38623g.cubicTo(31.2264f, 34.1633f, 30.0098f, 31.5927f, 28.144f, 29.7682f);
        this.f38623g.cubicTo(29.5384f, 28.9406f, 31.1829f, 28.5f, 33.0f, 28.5f);
        this.f38623g.cubicTo(37.239f, 28.5f, 40.536f, 30.8992f, 41.9148f, 35.0108f);
        this.f38623g.cubicTo(42.2516f, 36.0154f, 41.5423f, 37.0f, 40.6308f, 37.0f);
        this.f38623g.close();
        this.f38623g.setFillType(Path.FillType.WINDING);
        this.f38622f.setStyle(Paint.Style.FILL);
        this.f38622f.setColor(-16777216);
        this.f37300a.add(this.f38622f);
        this.f38624h = new Paint();
        Path path3 = new Path();
        this.f38625i = path3;
        path3.moveTo(33.0f, 26.5f);
        this.f38625i.cubicTo(36.0376f, 26.5f, 38.5f, 24.0376f, 38.5f, 21.0f);
        this.f38625i.cubicTo(38.5f, 17.9624f, 36.0376f, 15.5f, 33.0f, 15.5f);
        this.f38625i.cubicTo(29.9624f, 15.5f, 27.5f, 17.9624f, 27.5f, 21.0f);
        this.f38625i.cubicTo(27.5f, 24.0376f, 29.9624f, 26.5f, 33.0f, 26.5f);
        this.f38625i.close();
        this.f38625i.setFillType(Path.FillType.WINDING);
        this.f38624h.setStyle(Paint.Style.FILL);
        this.f38624h.setColor(-16777216);
        this.f37300a.add(this.f38624h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38621e, this.f38620d);
        canvas.drawPath(this.f38623g, this.f38622f);
        canvas.drawPath(this.f38625i, this.f38624h);
    }
}
