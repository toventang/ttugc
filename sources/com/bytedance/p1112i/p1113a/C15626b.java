package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.b */
public class C15626b extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17892);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(23.0f, 8.0f);
        this.f37302c.lineTo(23.0f, 28.7803f);
        this.f37302c.lineTo(12.0371f, 19.0823f);
        this.f37302c.cubicTo(11.8302f, 18.8993f, 11.5143f, 18.9187f, 11.3313f, 19.1255f);
        this.f37302c.lineTo(10.6687f, 19.8745f);
        this.f37302c.cubicTo(10.4858f, 20.0813f, 10.5051f, 20.3973f, 10.7119f, 20.5803f);
        this.f37302c.lineTo(23.3374f, 31.749f);
        this.f37302c.cubicTo(23.7158f, 32.0837f, 24.2843f, 32.0837f, 24.6626f, 31.749f);
        this.f37302c.lineTo(37.2881f, 20.5803f);
        this.f37302c.cubicTo(37.4949f, 20.3973f, 37.5143f, 20.0813f, 37.3313f, 19.8745f);
        this.f37302c.lineTo(36.6687f, 19.1255f);
        this.f37302c.cubicTo(36.4858f, 18.9187f, 36.1698f, 18.8993f, 35.9629f, 19.0823f);
        this.f37302c.lineTo(25.0f, 28.7803f);
        this.f37302c.lineTo(25.0f, 8.0f);
        this.f37302c.cubicTo(25.0f, 7.72386f, 24.7761f, 7.5f, 24.5f, 7.5f);
        this.f37302c.lineTo(23.5f, 7.5f);
        this.f37302c.cubicTo(23.2239f, 7.5f, 23.0f, 7.72386f, 23.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.moveTo(12.5f, 37.0f);
        this.f37302c.cubicTo(12.2239f, 37.0f, 12.0f, 37.2239f, 12.0f, 37.5f);
        this.f37302c.lineTo(12.0f, 38.5f);
        this.f37302c.cubicTo(12.0f, 38.7761f, 12.2239f, 39.0f, 12.5f, 39.0f);
        this.f37302c.lineTo(35.5f, 39.0f);
        this.f37302c.cubicTo(35.7761f, 39.0f, 36.0f, 38.7761f, 36.0f, 38.5f);
        this.f37302c.lineTo(36.0f, 37.5f);
        this.f37302c.cubicTo(36.0f, 37.2239f, 35.7761f, 37.0f, 35.5f, 37.0f);
        this.f37302c.lineTo(12.5f, 37.0f);
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
