package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.el */
public class C15719el extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17985);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(9.0f, 11.0f);
        this.f37302c.cubicTo(9.0f, 8.23858f, 11.2386f, 6.0f, 14.0f, 6.0f);
        this.f37302c.lineTo(34.0f, 6.0f);
        this.f37302c.cubicTo(36.7614f, 6.0f, 39.0f, 8.23858f, 39.0f, 11.0f);
        this.f37302c.lineTo(39.0f, 40.0f);
        this.f37302c.cubicTo(39.0f, 40.7439f, 38.5871f, 41.4263f, 37.9282f, 41.7716f);
        this.f37302c.cubicTo(37.2693f, 42.1168f, 36.4732f, 42.0678f, 35.8616f, 41.6444f);
        this.f37302c.lineTo(24.0f, 33.4325f);
        this.f37302c.lineTo(12.1384f, 41.6444f);
        this.f37302c.cubicTo(11.5268f, 42.0678f, 10.7307f, 42.1168f, 10.0718f, 41.7716f);
        this.f37302c.cubicTo(9.41286f, 41.4263f, 9.0f, 40.7439f, 9.0f, 40.0f);
        this.f37302c.lineTo(9.0f, 11.0f);
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
