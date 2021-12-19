package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pa */
public class C16005pa extends AbstractC15287a {

    /* renamed from: d */
    Paint f38636d;

    /* renamed from: e */
    Path f38637e;

    static {
        Covode.recordClassIndex(18271);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 6.0f);
        this.f37302c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(33.9411f, 42.0f, 42.0f, 33.9411f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f37302c.close();
        this.f37302c.moveTo(2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38636d = new Paint();
        Path path = new Path();
        this.f38637e = path;
        path.moveTo(29.1379f, 12.0f);
        this.f38637e.cubicTo(29.1379f, 15.0584f, 31.7072f, 17.6364f, 35.0f, 17.6364f);
        this.f38637e.lineTo(35.0f, 21.6364f);
        this.f38637e.cubicTo(32.8163f, 21.6364f, 30.7837f, 20.9375f, 29.1379f, 19.7487f);
        this.f38637e.lineTo(29.1379f, 27.5909f);
        this.f38637e.cubicTo(29.1379f, 31.7374f, 25.6939f, 35.0f, 21.569f, 35.0f);
        this.f38637e.cubicTo(17.4441f, 35.0f, 14.0f, 31.7374f, 14.0f, 27.5909f);
        this.f38637e.cubicTo(14.0f, 23.4445f, 17.4441f, 20.1818f, 21.569f, 20.1818f);
        this.f38637e.lineTo(21.569f, 24.1818f);
        this.f38637e.cubicTo(19.5426f, 24.1818f, 18.0f, 25.7626f, 18.0f, 27.5909f);
        this.f38637e.cubicTo(18.0f, 29.4192f, 19.5426f, 31.0f, 21.569f, 31.0f);
        this.f38637e.cubicTo(23.5954f, 31.0f, 25.1379f, 29.4192f, 25.1379f, 27.5909f);
        this.f38637e.lineTo(25.1379f, 12.0f);
        this.f38637e.lineTo(29.1379f, 12.0f);
        this.f38637e.close();
        this.f38637e.setFillType(Path.FillType.EVEN_ODD);
        this.f38636d.setStyle(Paint.Style.FILL);
        this.f38636d.setColor(-16777216);
        this.f37300a.add(this.f38636d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38637e, this.f38636d);
    }
}
