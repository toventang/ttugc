package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ek */
public class C15718ek extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17984);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.0f, 10.0f);
        this.f37302c.cubicTo(8.0f, 7.23858f, 10.2386f, 5.0f, 13.0f, 5.0f);
        this.f37302c.lineTo(35.0f, 5.0f);
        this.f37302c.cubicTo(37.7614f, 5.0f, 40.0f, 7.23858f, 40.0f, 10.0f);
        this.f37302c.lineTo(40.0f, 41.0f);
        this.f37302c.cubicTo(40.0f, 41.7439f, 39.5871f, 42.4263f, 38.9282f, 42.7716f);
        this.f37302c.cubicTo(38.2693f, 43.1168f, 37.4732f, 43.0678f, 36.8616f, 42.6444f);
        this.f37302c.lineTo(24.0f, 33.4325f);
        this.f37302c.lineTo(11.1384f, 42.6444f);
        this.f37302c.cubicTo(10.5268f, 43.0678f, 9.73071f, 43.1168f, 9.07179f, 42.7716f);
        this.f37302c.cubicTo(8.41286f, 42.4263f, 8.0f, 41.7439f, 8.0f, 41.0f);
        this.f37302c.lineTo(8.0f, 10.0f);
        this.f37302c.close();
        this.f37302c.moveTo(13.0f, 9.0f);
        this.f37302c.cubicTo(12.4477f, 9.0f, 12.0f, 9.44772f, 12.0f, 10.0f);
        this.f37302c.lineTo(12.0f, 37.1829f);
        this.f37302c.lineTo(22.8616f, 29.3556f);
        this.f37302c.cubicTo(23.5465f, 28.8815f, 24.4535f, 28.8815f, 25.1384f, 29.3556f);
        this.f37302c.lineTo(36.0f, 37.1829f);
        this.f37302c.lineTo(36.0f, 10.0f);
        this.f37302c.cubicTo(36.0f, 9.44772f, 35.5523f, 9.0f, 35.0f, 9.0f);
        this.f37302c.lineTo(13.0f, 9.0f);
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
