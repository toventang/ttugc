package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fj */
public class C15744fj extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18010);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(25.4142f, 15.5858f);
        this.f37302c.lineTo(39.7071f, 29.8787f);
        this.f37302c.cubicTo(40.0976f, 30.2692f, 40.0976f, 30.9024f, 39.7071f, 31.2929f);
        this.f37302c.lineTo(38.2929f, 32.7071f);
        this.f37302c.cubicTo(37.9024f, 33.0976f, 37.2692f, 33.0976f, 36.8787f, 32.7071f);
        this.f37302c.lineTo(24.0f, 19.8284f);
        this.f37302c.lineTo(11.1213f, 32.7071f);
        this.f37302c.cubicTo(10.7308f, 33.0976f, 10.0976f, 33.0976f, 9.70711f, 32.7071f);
        this.f37302c.lineTo(8.29289f, 31.2929f);
        this.f37302c.cubicTo(7.90237f, 30.9024f, 7.90237f, 30.2692f, 8.29289f, 29.8787f);
        this.f37302c.lineTo(22.5858f, 15.5858f);
        this.f37302c.cubicTo(23.3668f, 14.8047f, 24.6332f, 14.8047f, 25.4142f, 15.5858f);
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
