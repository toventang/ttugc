package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.iw */
public class C15838iw extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18104);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(11.0f, 6.64f);
        this.f37302c.cubicTo(11.0f, 5.18197f, 12.182f, 4.0f, 13.64f, 4.0f);
        this.f37302c.lineTo(34.36f, 4.0f);
        this.f37302c.cubicTo(35.818f, 4.0f, 37.0f, 5.18197f, 37.0f, 6.64f);
        this.f37302c.lineTo(37.0f, 11.0f);
        this.f37302c.cubicTo(37.0f, 15.5211f, 34.6921f, 19.5032f, 31.1901f, 21.8323f);
        this.f37302c.cubicTo(35.8439f, 24.3789f, 39.0f, 29.3209f, 39.0f, 35.0f);
        this.f37302c.lineTo(39.0f, 41.16f);
        this.f37302c.cubicTo(39.0f, 42.7285f, 37.7285f, 44.0f, 36.16f, 44.0f);
        this.f37302c.lineTo(11.84f, 44.0f);
        this.f37302c.cubicTo(10.2715f, 44.0f, 9.0f, 42.7285f, 9.0f, 41.16f);
        this.f37302c.lineTo(9.0f, 35.0f);
        this.f37302c.cubicTo(9.0f, 29.3209f, 12.1561f, 24.3789f, 16.8099f, 21.8323f);
        this.f37302c.cubicTo(13.3079f, 19.5032f, 11.0f, 15.5211f, 11.0f, 11.0f);
        this.f37302c.lineTo(11.0f, 6.64f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 20.0f);
        this.f37302c.cubicTo(28.9706f, 20.0f, 33.0f, 15.9706f, 33.0f, 11.0f);
        this.f37302c.lineTo(33.0f, 8.0f);
        this.f37302c.lineTo(15.0f, 8.0f);
        this.f37302c.lineTo(15.0f, 11.0f);
        this.f37302c.cubicTo(15.0f, 15.9706f, 19.0294f, 20.0f, 24.0f, 20.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 24.0f);
        this.f37302c.cubicTo(17.9249f, 24.0f, 13.0f, 28.9249f, 13.0f, 35.0f);
        this.f37302c.lineTo(13.0f, 40.0f);
        this.f37302c.lineTo(35.0f, 40.0f);
        this.f37302c.lineTo(35.0f, 35.0f);
        this.f37302c.cubicTo(35.0f, 28.9249f, 30.0751f, 24.0f, 24.0f, 24.0f);
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
