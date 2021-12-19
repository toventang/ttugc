package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.la */
public class C15897la extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18163);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(2.0f, 12.0f);
        this.f37302c.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
        this.f37302c.lineTo(36.0f, 2.0f);
        this.f37302c.cubicTo(41.5228f, 2.0f, 46.0f, 6.47715f, 46.0f, 12.0f);
        this.f37302c.lineTo(46.0f, 36.0f);
        this.f37302c.cubicTo(46.0f, 41.5228f, 41.5228f, 46.0f, 36.0f, 46.0f);
        this.f37302c.lineTo(12.0f, 46.0f);
        this.f37302c.cubicTo(6.47715f, 46.0f, 2.0f, 41.5228f, 2.0f, 36.0f);
        this.f37302c.lineTo(2.0f, 12.0f);
        this.f37302c.close();
        this.f37302c.moveTo(12.0f, 6.0f);
        this.f37302c.cubicTo(8.68629f, 6.0f, 6.0f, 8.68629f, 6.0f, 12.0f);
        this.f37302c.lineTo(6.0f, 36.0f);
        this.f37302c.cubicTo(6.0f, 39.3137f, 8.68629f, 42.0f, 12.0f, 42.0f);
        this.f37302c.lineTo(36.0f, 42.0f);
        this.f37302c.cubicTo(39.3137f, 42.0f, 42.0f, 39.3137f, 42.0f, 36.0f);
        this.f37302c.lineTo(42.0f, 12.0f);
        this.f37302c.cubicTo(42.0f, 8.68629f, 39.3137f, 6.0f, 36.0f, 6.0f);
        this.f37302c.lineTo(12.0f, 6.0f);
        this.f37302c.close();
        this.f37302c.moveTo(22.2f, 15.0f);
        this.f37302c.cubicTo(18.2236f, 15.0f, 15.0f, 18.2236f, 15.0f, 22.2f);
        this.f37302c.cubicTo(15.0f, 26.1765f, 18.2236f, 29.4f, 22.2f, 29.4f);
        this.f37302c.cubicTo(26.1765f, 29.4f, 29.4f, 26.1765f, 29.4f, 22.2f);
        this.f37302c.cubicTo(29.4f, 18.2236f, 26.1765f, 15.0f, 22.2f, 15.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.0f, 22.2f);
        this.f37302c.cubicTo(11.0f, 16.0144f, 16.0144f, 11.0f, 22.2f, 11.0f);
        this.f37302c.cubicTo(28.3856f, 11.0f, 33.4f, 16.0144f, 33.4f, 22.2f);
        this.f37302c.cubicTo(33.4f, 24.5703f, 32.6637f, 26.7687f, 31.4072f, 28.5788f);
        this.f37302c.lineTo(36.7071f, 33.8787f);
        this.f37302c.cubicTo(37.0976f, 34.2692f, 37.0976f, 34.9024f, 36.7071f, 35.2929f);
        this.f37302c.lineTo(35.2929f, 36.7071f);
        this.f37302c.cubicTo(34.9024f, 37.0976f, 34.2692f, 37.0976f, 33.8787f, 36.7071f);
        this.f37302c.lineTo(28.5788f, 31.4072f);
        this.f37302c.cubicTo(26.7687f, 32.6637f, 24.5703f, 33.4f, 22.2f, 33.4f);
        this.f37302c.cubicTo(16.0144f, 33.4f, 11.0f, 28.3856f, 11.0f, 22.2f);
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
