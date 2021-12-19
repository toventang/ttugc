package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.kp */
public class C15885kp extends AbstractC15287a {

    /* renamed from: d */
    Paint f38536d;

    /* renamed from: e */
    Path f38537e;

    static {
        Covode.recordClassIndex(18151);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.0f, 8.0f);
        this.f37302c.cubicTo(6.0f, 5.79086f, 7.79086f, 4.0f, 10.0f, 4.0f);
        this.f37302c.lineTo(38.0f, 4.0f);
        this.f37302c.cubicTo(40.2091f, 4.0f, 42.0f, 5.79086f, 42.0f, 8.0f);
        this.f37302c.lineTo(42.0f, 40.0f);
        this.f37302c.cubicTo(42.0f, 42.2091f, 40.2091f, 44.0f, 38.0f, 44.0f);
        this.f37302c.lineTo(10.0f, 44.0f);
        this.f37302c.cubicTo(7.79086f, 44.0f, 6.0f, 42.2091f, 6.0f, 40.0f);
        this.f37302c.lineTo(6.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.moveTo(38.0f, 8.0f);
        this.f37302c.lineTo(10.0f, 8.0f);
        this.f37302c.lineTo(10.0f, 40.0f);
        this.f37302c.lineTo(38.0f, 40.0f);
        this.f37302c.lineTo(38.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38536d = new Paint();
        Path path = new Path();
        this.f38537e = path;
        path.moveTo(16.0f, 15.0f);
        this.f38537e.cubicTo(16.0f, 14.4477f, 16.4477f, 14.0f, 17.0f, 14.0f);
        this.f38537e.lineTo(31.0f, 14.0f);
        this.f38537e.cubicTo(31.5523f, 14.0f, 32.0f, 14.4477f, 32.0f, 15.0f);
        this.f38537e.lineTo(32.0f, 17.0f);
        this.f38537e.cubicTo(32.0f, 17.5523f, 31.5523f, 18.0f, 31.0f, 18.0f);
        this.f38537e.lineTo(17.0f, 18.0f);
        this.f38537e.cubicTo(16.4477f, 18.0f, 16.0f, 17.5523f, 16.0f, 17.0f);
        this.f38537e.lineTo(16.0f, 15.0f);
        this.f38537e.close();
        this.f38537e.moveTo(16.0f, 23.0f);
        this.f38537e.cubicTo(16.0f, 22.4477f, 16.4477f, 22.0f, 17.0f, 22.0f);
        this.f38537e.lineTo(31.0f, 22.0f);
        this.f38537e.cubicTo(31.5523f, 22.0f, 32.0f, 22.4477f, 32.0f, 23.0f);
        this.f38537e.lineTo(32.0f, 25.0f);
        this.f38537e.cubicTo(32.0f, 25.5523f, 31.5523f, 26.0f, 31.0f, 26.0f);
        this.f38537e.lineTo(17.0f, 26.0f);
        this.f38537e.cubicTo(16.4477f, 26.0f, 16.0f, 25.5523f, 16.0f, 25.0f);
        this.f38537e.lineTo(16.0f, 23.0f);
        this.f38537e.close();
        this.f38537e.moveTo(17.0f, 30.0f);
        this.f38537e.cubicTo(16.4477f, 30.0f, 16.0f, 30.4477f, 16.0f, 31.0f);
        this.f38537e.lineTo(16.0f, 33.0f);
        this.f38537e.cubicTo(16.0f, 33.5523f, 16.4477f, 34.0f, 17.0f, 34.0f);
        this.f38537e.lineTo(25.0f, 34.0f);
        this.f38537e.cubicTo(25.5523f, 34.0f, 26.0f, 33.5523f, 26.0f, 33.0f);
        this.f38537e.lineTo(26.0f, 31.0f);
        this.f38537e.cubicTo(26.0f, 30.4477f, 25.5523f, 30.0f, 25.0f, 30.0f);
        this.f38537e.lineTo(17.0f, 30.0f);
        this.f38537e.close();
        this.f38537e.setFillType(Path.FillType.EVEN_ODD);
        this.f38536d.setStyle(Paint.Style.FILL);
        this.f38536d.setColor(-16777216);
        this.f37300a.add(this.f38536d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38537e, this.f38536d);
    }
}
