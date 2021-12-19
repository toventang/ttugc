package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ez */
public class C15733ez extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17999);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(22.5858f, 32.4142f);
        this.f37302c.lineTo(8.29289f, 18.1213f);
        this.f37302c.cubicTo(7.90237f, 17.7308f, 7.90237f, 17.0976f, 8.29289f, 16.7071f);
        this.f37302c.lineTo(9.70711f, 15.2929f);
        this.f37302c.cubicTo(10.0976f, 14.9024f, 10.7308f, 14.9024f, 11.1213f, 15.2929f);
        this.f37302c.lineTo(24.0f, 28.1716f);
        this.f37302c.lineTo(36.8787f, 15.2929f);
        this.f37302c.cubicTo(37.2692f, 14.9024f, 37.9024f, 14.9024f, 38.2929f, 15.2929f);
        this.f37302c.lineTo(39.7071f, 16.7071f);
        this.f37302c.cubicTo(40.0976f, 17.0976f, 40.0976f, 17.7308f, 39.7071f, 18.1213f);
        this.f37302c.lineTo(25.4142f, 32.4142f);
        this.f37302c.cubicTo(24.6332f, 33.1953f, 23.3668f, 33.1953f, 22.5858f, 32.4142f);
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
