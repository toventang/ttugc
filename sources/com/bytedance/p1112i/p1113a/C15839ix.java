package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ix */
public class C15839ix extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18105);
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
        this.f37302c.moveTo(27.0f, 16.0f);
        this.f37302c.cubicTo(27.0f, 17.6569f, 25.6569f, 19.0f, 24.0f, 19.0f);
        this.f37302c.cubicTo(22.3431f, 19.0f, 21.0f, 17.6569f, 21.0f, 16.0f);
        this.f37302c.cubicTo(21.0f, 14.3431f, 22.3431f, 13.0f, 24.0f, 13.0f);
        this.f37302c.cubicTo(25.6569f, 13.0f, 27.0f, 14.3431f, 27.0f, 16.0f);
        this.f37302c.close();
        this.f37302c.moveTo(23.0f, 22.0f);
        this.f37302c.cubicTo(22.4477f, 22.0f, 22.0f, 22.4477f, 22.0f, 23.0f);
        this.f37302c.lineTo(22.0f, 34.0f);
        this.f37302c.cubicTo(22.0f, 34.5523f, 22.4477f, 35.0f, 23.0f, 35.0f);
        this.f37302c.lineTo(25.0f, 35.0f);
        this.f37302c.cubicTo(25.5523f, 35.0f, 26.0f, 34.5523f, 26.0f, 34.0f);
        this.f37302c.lineTo(26.0f, 23.0f);
        this.f37302c.cubicTo(26.0f, 22.4477f, 25.5523f, 22.0f, 25.0f, 22.0f);
        this.f37302c.lineTo(23.0f, 22.0f);
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
