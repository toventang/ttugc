package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.kl */
public class C15881kl extends AbstractC15287a {

    /* renamed from: d */
    Paint f38532d;

    /* renamed from: e */
    Path f38533e;

    static {
        Covode.recordClassIndex(18147);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(33.0f, 33.4249f);
        this.f37302c.cubicTo(37.8043f, 30.421f, 41.0f, 25.0837f, 41.0f, 19.0f);
        this.f37302c.cubicTo(41.0f, 9.61116f, 33.3888f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(14.6112f, 2.0f, 7.0f, 9.61116f, 7.0f, 19.0f);
        this.f37302c.cubicTo(7.0f, 25.0837f, 10.1957f, 30.421f, 15.0f, 33.4249f);
        this.f37302c.lineTo(15.0f, 34.0f);
        this.f37302c.cubicTo(15.0f, 37.0f, 16.0f, 38.0f, 19.0f, 38.0f);
        this.f37302c.lineTo(29.0f, 38.0f);
        this.f37302c.cubicTo(32.0f, 38.0f, 33.0f, 37.0f, 33.0f, 34.0f);
        this.f37302c.lineTo(33.0f, 33.4249f);
        this.f37302c.close();
        this.f37302c.moveTo(17.293f, 20.1213f);
        this.f37302c.lineTo(22.0002f, 24.8285f);
        this.f37302c.lineTo(22.0002f, 30.0f);
        this.f37302c.cubicTo(22.0002f, 30.5523f, 22.4479f, 31.0f, 23.0002f, 31.0f);
        this.f37302c.lineTo(25.0002f, 31.0f);
        this.f37302c.cubicTo(25.5524f, 31.0f, 26.0002f, 30.5523f, 26.0002f, 30.0f);
        this.f37302c.lineTo(26.0002f, 24.8285f);
        this.f37302c.lineTo(30.7073f, 20.1213f);
        this.f37302c.cubicTo(31.0978f, 19.7308f, 31.0978f, 19.0977f, 30.7073f, 18.7071f);
        this.f37302c.lineTo(29.293f, 17.2929f);
        this.f37302c.cubicTo(28.9025f, 16.9024f, 28.2694f, 16.9024f, 27.8788f, 17.2929f);
        this.f37302c.lineTo(24.0002f, 21.1716f);
        this.f37302c.lineTo(20.1215f, 17.2929f);
        this.f37302c.cubicTo(19.7309f, 16.9024f, 19.0978f, 16.9024f, 18.7073f, 17.2929f);
        this.f37302c.lineTo(17.293f, 18.7071f);
        this.f37302c.cubicTo(16.9025f, 19.0977f, 16.9025f, 19.7308f, 17.293f, 20.1213f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38532d = new Paint();
        Path path = new Path();
        this.f38533e = path;
        path.moveTo(19.0f, 43.0f);
        this.f38533e.cubicTo(19.0f, 41.8954f, 19.8954f, 41.0f, 21.0f, 41.0f);
        this.f38533e.lineTo(27.0f, 41.0f);
        this.f38533e.cubicTo(28.1046f, 41.0f, 29.0f, 41.8954f, 29.0f, 43.0f);
        this.f38533e.lineTo(29.0f, 44.0f);
        this.f38533e.cubicTo(29.0f, 45.1046f, 28.1046f, 46.0f, 27.0f, 46.0f);
        this.f38533e.lineTo(21.0f, 46.0f);
        this.f38533e.cubicTo(19.8954f, 46.0f, 19.0f, 45.1046f, 19.0f, 44.0f);
        this.f38533e.lineTo(19.0f, 43.0f);
        this.f38533e.close();
        this.f38533e.setFillType(Path.FillType.WINDING);
        this.f38532d.setStyle(Paint.Style.FILL);
        this.f38532d.setColor(-16777216);
        this.f37300a.add(this.f38532d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38533e, this.f38532d);
    }
}
