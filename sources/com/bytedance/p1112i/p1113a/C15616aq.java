package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.aq */
public class C15616aq extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17882);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.0f, 13.0f);
        this.f37302c.cubicTo(8.0f, 12.4477f, 8.44772f, 12.0f, 9.0f, 12.0f);
        this.f37302c.lineTo(39.0f, 12.0f);
        this.f37302c.cubicTo(39.5523f, 12.0f, 40.0f, 12.4477f, 40.0f, 13.0f);
        this.f37302c.lineTo(40.0f, 15.0f);
        this.f37302c.cubicTo(40.0f, 15.5523f, 39.5523f, 16.0f, 39.0f, 16.0f);
        this.f37302c.lineTo(9.0f, 16.0f);
        this.f37302c.cubicTo(8.44772f, 16.0f, 8.0f, 15.5523f, 8.0f, 15.0f);
        this.f37302c.lineTo(8.0f, 13.0f);
        this.f37302c.close();
        this.f37302c.moveTo(8.0f, 23.0f);
        this.f37302c.cubicTo(8.0f, 22.4477f, 8.44772f, 22.0f, 9.0f, 22.0f);
        this.f37302c.lineTo(39.0f, 22.0f);
        this.f37302c.cubicTo(39.5523f, 22.0f, 40.0f, 22.4477f, 40.0f, 23.0f);
        this.f37302c.lineTo(40.0f, 25.0f);
        this.f37302c.cubicTo(40.0f, 25.5523f, 39.5523f, 26.0f, 39.0f, 26.0f);
        this.f37302c.lineTo(9.0f, 26.0f);
        this.f37302c.cubicTo(8.44771f, 26.0f, 8.0f, 25.5523f, 8.0f, 25.0f);
        this.f37302c.lineTo(8.0f, 23.0f);
        this.f37302c.close();
        this.f37302c.moveTo(9.0f, 32.0f);
        this.f37302c.cubicTo(8.44772f, 32.0f, 8.0f, 32.4477f, 8.0f, 33.0f);
        this.f37302c.lineTo(8.0f, 35.0f);
        this.f37302c.cubicTo(8.0f, 35.5523f, 8.44772f, 36.0f, 9.0f, 36.0f);
        this.f37302c.lineTo(39.0f, 36.0f);
        this.f37302c.cubicTo(39.5523f, 36.0f, 40.0f, 35.5523f, 40.0f, 35.0f);
        this.f37302c.lineTo(40.0f, 33.0f);
        this.f37302c.cubicTo(40.0f, 32.4477f, 39.5523f, 32.0f, 39.0f, 32.0f);
        this.f37302c.lineTo(9.0f, 32.0f);
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
