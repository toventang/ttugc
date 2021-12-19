package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fi */
public class C15743fi extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18009);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(38.1716f, 24.0f);
        this.f37302c.lineTo(24.7929f, 10.6213f);
        this.f37302c.cubicTo(24.4024f, 10.2308f, 24.4024f, 9.59763f, 24.7929f, 9.20711f);
        this.f37302c.lineTo(26.2071f, 7.79289f);
        this.f37302c.cubicTo(26.5976f, 7.40237f, 27.2308f, 7.40237f, 27.6213f, 7.79289f);
        this.f37302c.lineTo(42.4142f, 22.5858f);
        this.f37302c.cubicTo(43.1953f, 23.3668f, 43.1953f, 24.6332f, 42.4142f, 25.4142f);
        this.f37302c.lineTo(27.6213f, 40.2071f);
        this.f37302c.cubicTo(27.2308f, 40.5976f, 26.5976f, 40.5976f, 26.2071f, 40.2071f);
        this.f37302c.lineTo(24.7929f, 38.7929f);
        this.f37302c.cubicTo(24.4024f, 38.4024f, 24.4024f, 37.7692f, 24.7929f, 37.3787f);
        this.f37302c.lineTo(38.1716f, 24.0f);
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
