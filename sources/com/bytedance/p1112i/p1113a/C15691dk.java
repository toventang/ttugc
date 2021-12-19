package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dk */
public class C15691dk extends AbstractC15287a {

    /* renamed from: d */
    Paint f38210d;

    /* renamed from: e */
    Path f38211e;

    static {
        Covode.recordClassIndex(17957);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(34.9552f, 9.0f);
        this.f37302c.cubicTo(36.0138f, 9.0f, 36.872f, 9.85816f, 36.872f, 10.9168f);
        this.f37302c.lineTo(36.872f, 37.0832f);
        this.f37302c.cubicTo(36.872f, 38.1418f, 36.0138f, 39.0f, 34.9552f, 39.0f);
        this.f37302c.lineTo(25.9594f, 39.0f);
        this.f37302c.cubicTo(25.4301f, 39.0f, 25.001f, 39.4291f, 25.001f, 39.9584f);
        this.f37302c.lineTo(25.001f, 42.0416f);
        this.f37302c.cubicTo(25.001f, 42.5709f, 25.4301f, 43.0f, 25.9594f, 43.0f);
        this.f37302c.lineTo(36.2091f, 43.0f);
        this.f37302c.cubicTo(38.8556f, 43.0f, 41.001f, 40.8546f, 41.001f, 38.2081f);
        this.f37302c.lineTo(41.001f, 9.7919f);
        this.f37302c.cubicTo(41.001f, 7.14541f, 38.8556f, 5.0f, 36.2091f, 5.0f);
        this.f37302c.lineTo(25.9594f, 5.0f);
        this.f37302c.cubicTo(25.4301f, 5.0f, 25.001f, 5.42908f, 25.001f, 5.95838f);
        this.f37302c.lineTo(25.001f, 8.04162f);
        this.f37302c.cubicTo(25.001f, 8.57092f, 25.4301f, 9.0f, 25.9594f, 9.0f);
        this.f37302c.lineTo(34.9552f, 9.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38210d = new Paint();
        Path path = new Path();
        this.f38211e = path;
        path.moveTo(12.8076f, 15.6534f);
        this.f38211e.cubicTo(13.1799f, 15.29f, 13.7742f, 15.29f, 14.1465f, 15.6534f);
        this.f38211e.lineTo(15.5984f, 17.0706f);
        this.f38211e.cubicTo(15.9925f, 17.4553f, 15.9821f, 18.0922f, 15.5757f, 18.4638f);
        this.f38211e.lineTo(11.7079f, 22.0f);
        this.f38211e.lineTo(29.0426f, 22.0f);
        this.f38211e.cubicTo(29.5719f, 22.0f, 30.001f, 22.4291f, 30.001f, 22.9584f);
        this.f38211e.lineTo(30.001f, 25.0416f);
        this.f38211e.cubicTo(30.001f, 25.5709f, 29.5719f, 26.0f, 29.0426f, 26.0f);
        this.f38211e.lineTo(11.7079f, 26.0f);
        this.f38211e.lineTo(15.6538f, 30.0359f);
        this.f38211e.cubicTo(16.0241f, 30.4145f, 16.017f, 31.0217f, 15.638f, 31.3917f);
        this.f38211e.lineTo(14.1465f, 32.8475f);
        this.f38211e.cubicTo(13.7742f, 33.2109f, 13.1799f, 33.2109f, 12.8076f, 32.8475f);
        this.f38211e.lineTo(4.70253f, 24.9363f);
        this.f38211e.cubicTo(4.31726f, 24.5602f, 4.31726f, 23.9407f, 4.70253f, 23.5646f);
        this.f38211e.lineTo(12.8076f, 15.6534f);
        this.f38211e.close();
        this.f38211e.setFillType(Path.FillType.WINDING);
        this.f38210d.setStyle(Paint.Style.FILL);
        this.f38210d.setColor(-16777216);
        this.f37300a.add(this.f38210d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38211e, this.f38210d);
    }
}
