package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.on */
public class C15991on extends AbstractC15287a {

    /* renamed from: d */
    Paint f38626d;

    /* renamed from: e */
    Path f38627e;

    static {
        Covode.recordClassIndex(18257);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.99767f, 11.4934f);
        this.f37302c.cubicTo(9.0013f, 10.1153f, 10.1195f, 9.0f, 11.4977f, 9.0f);
        this.f37302c.lineTo(36.5029f, 9.0f);
        this.f37302c.cubicTo(37.8811f, 9.0f, 38.9993f, 10.1152f, 39.0029f, 11.4934f);
        this.f37302c.lineTo(39.0587f, 32.4934f);
        this.f37302c.cubicTo(39.0623f, 33.8767f, 37.942f, 35.0f, 36.5587f, 35.0f);
        this.f37302c.lineTo(29.2111f, 35.0f);
        this.f37302c.lineTo(25.9354f, 39.0039f);
        this.f37302c.cubicTo(24.9352f, 40.2264f, 23.0659f, 40.2265f, 22.0656f, 39.004f);
        this.f37302c.lineTo(18.7895f, 35.0f);
        this.f37302c.lineTo(11.4424f, 35.0f);
        this.f37302c.cubicTo(10.0591f, 35.0f, 8.93875f, 33.8767f, 8.94239f, 32.4934f);
        this.f37302c.lineTo(8.99767f, 11.4934f);
        this.f37302c.close();
        this.f37302c.moveTo(11.9964f, 12.0f);
        this.f37302c.lineTo(11.9437f, 32.0f);
        this.f37302c.lineTo(20.2111f, 32.0f);
        this.f37302c.lineTo(24.0005f, 36.6312f);
        this.f37302c.lineTo(27.7895f, 32.0f);
        this.f37302c.lineTo(36.0573f, 32.0f);
        this.f37302c.lineTo(36.0043f, 12.0f);
        this.f37302c.lineTo(11.9964f, 12.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38626d = new Paint();
        Path path = new Path();
        this.f38627e = path;
        path.moveTo(18.0f, 22.0f);
        this.f38627e.cubicTo(18.0f, 21.4477f, 18.4477f, 21.0f, 19.0f, 21.0f);
        this.f38627e.lineTo(29.0f, 21.0f);
        this.f38627e.cubicTo(29.5523f, 21.0f, 30.0f, 21.4477f, 30.0f, 22.0f);
        this.f38627e.lineTo(30.0f, 23.0f);
        this.f38627e.cubicTo(30.0f, 23.5523f, 29.5523f, 24.0f, 29.0f, 24.0f);
        this.f38627e.lineTo(19.0f, 24.0f);
        this.f38627e.cubicTo(18.4477f, 24.0f, 18.0f, 23.5523f, 18.0f, 23.0f);
        this.f38627e.lineTo(18.0f, 22.0f);
        this.f38627e.close();
        this.f38627e.setFillType(Path.FillType.WINDING);
        this.f38626d.setStyle(Paint.Style.FILL);
        this.f38626d.setColor(-16777216);
        this.f37300a.add(this.f38626d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38627e, this.f38626d);
    }
}
