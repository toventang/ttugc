package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fb */
public class C15736fb extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18002);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.8788f, 33.1213f);
        this.f37302c.lineTo(7.58586f, 18.8284f);
        this.f37302c.cubicTo(7.19534f, 18.4379f, 7.19534f, 17.8048f, 7.58586f, 17.4142f);
        this.f37302c.lineTo(10.4143f, 14.5858f);
        this.f37302c.cubicTo(10.8048f, 14.1953f, 11.438f, 14.1953f, 11.8285f, 14.5858f);
        this.f37302c.lineTo(24.0001f, 26.7574f);
        this.f37302c.lineTo(36.1716f, 14.5858f);
        this.f37302c.cubicTo(36.5622f, 14.1953f, 37.1953f, 14.1953f, 37.5859f, 14.5858f);
        this.f37302c.lineTo(40.4143f, 17.4142f);
        this.f37302c.cubicTo(40.8048f, 17.8048f, 40.8048f, 18.4379f, 40.4143f, 18.8284f);
        this.f37302c.lineTo(26.1214f, 33.1213f);
        this.f37302c.cubicTo(24.9498f, 34.2929f, 23.0503f, 34.2929f, 21.8788f, 33.1213f);
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
