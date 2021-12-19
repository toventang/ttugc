package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hm */
public class C15801hm extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18067);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(21.0f, 13.0f);
        this.f37302c.cubicTo(21.0f, 12.4477f, 21.4477f, 12.0f, 22.0f, 12.0f);
        this.f37302c.lineTo(26.0f, 12.0f);
        this.f37302c.cubicTo(26.5523f, 12.0f, 27.0f, 12.4477f, 27.0f, 13.0f);
        this.f37302c.lineTo(27.0f, 25.0f);
        this.f37302c.cubicTo(27.0f, 25.5523f, 26.5523f, 26.0f, 26.0f, 26.0f);
        this.f37302c.lineTo(22.0f, 26.0f);
        this.f37302c.cubicTo(21.4477f, 26.0f, 21.0f, 25.5523f, 21.0f, 25.0f);
        this.f37302c.lineTo(21.0f, 13.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 37.0f);
        this.f37302c.cubicTo(25.933f, 37.0f, 27.5f, 35.433f, 27.5f, 33.5f);
        this.f37302c.cubicTo(27.5f, 31.567f, 25.933f, 30.0f, 24.0f, 30.0f);
        this.f37302c.cubicTo(22.067f, 30.0f, 20.5f, 31.567f, 20.5f, 33.5f);
        this.f37302c.cubicTo(20.5f, 35.433f, 22.067f, 37.0f, 24.0f, 37.0f);
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
