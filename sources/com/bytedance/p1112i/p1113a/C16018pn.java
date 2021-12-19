package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pn */
public class C16018pn extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18284);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(7.0f, 10.0f);
        this.f37302c.cubicTo(4.23858f, 10.0f, 2.0f, 12.2386f, 2.0f, 15.0f);
        this.f37302c.lineTo(2.0f, 33.0f);
        this.f37302c.cubicTo(2.0f, 35.7614f, 4.23858f, 38.0f, 7.0f, 38.0f);
        this.f37302c.lineTo(29.0f, 38.0f);
        this.f37302c.cubicTo(31.7614f, 38.0f, 34.0f, 35.7614f, 34.0f, 33.0f);
        this.f37302c.lineTo(34.0f, 27.2763f);
        this.f37302c.lineTo(42.7879f, 33.5909f);
        this.f37302c.cubicTo(43.3927f, 34.0516f, 44.2064f, 34.1297f, 44.8876f, 33.7922f);
        this.f37302c.cubicTo(45.5689f, 33.4548f, 46.0f, 32.7603f, 46.0f, 32.0f);
        this.f37302c.lineTo(46.0f, 16.0f);
        this.f37302c.cubicTo(46.0f, 15.2397f, 45.5689f, 14.5452f, 44.8876f, 14.2078f);
        this.f37302c.cubicTo(44.2063f, 13.8703f, 43.3927f, 13.9484f, 42.7879f, 14.4091f);
        this.f37302c.lineTo(34.0f, 20.7238f);
        this.f37302c.lineTo(34.0f, 15.0f);
        this.f37302c.cubicTo(34.0f, 12.2386f, 31.7614f, 10.0f, 29.0f, 10.0f);
        this.f37302c.lineTo(7.0f, 10.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
