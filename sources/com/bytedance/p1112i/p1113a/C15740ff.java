package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ff */
public class C15740ff extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18006);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(35.4142f, 22.5858f);
        this.f37302c.lineTo(19.1213f, 6.29289f);
        this.f37302c.cubicTo(18.7308f, 5.90237f, 18.0976f, 5.90237f, 17.7071f, 6.29289f);
        this.f37302c.lineTo(16.2929f, 7.70711f);
        this.f37302c.cubicTo(15.9024f, 8.09763f, 15.9024f, 8.7308f, 16.2929f, 9.12132f);
        this.f37302c.lineTo(31.1716f, 24.0f);
        this.f37302c.lineTo(16.2929f, 38.8787f);
        this.f37302c.cubicTo(15.9024f, 39.2692f, 15.9024f, 39.9024f, 16.2929f, 40.2929f);
        this.f37302c.lineTo(17.7071f, 41.7071f);
        this.f37302c.cubicTo(18.0976f, 42.0976f, 18.7308f, 42.0976f, 19.1213f, 41.7071f);
        this.f37302c.lineTo(35.4142f, 25.4142f);
        this.f37302c.cubicTo(36.1953f, 24.6332f, 36.1953f, 23.3668f, 35.4142f, 22.5858f);
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
