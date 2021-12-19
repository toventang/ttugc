package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bh */
public class C15634bh extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17900);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 7.5f);
        this.f37302c.cubicTo(14.8873f, 7.5f, 7.5f, 14.8873f, 7.5f, 24.0f);
        this.f37302c.cubicTo(7.5f, 33.1127f, 14.8873f, 40.5f, 24.0f, 40.5f);
        this.f37302c.cubicTo(33.1127f, 40.5f, 40.5f, 33.1127f, 40.5f, 24.0f);
        this.f37302c.cubicTo(40.5f, 14.8873f, 33.1127f, 7.5f, 24.0f, 7.5f);
        this.f37302c.close();
        this.f37302c.moveTo(4.5f, 24.0f);
        this.f37302c.cubicTo(4.5f, 13.2304f, 13.2304f, 4.5f, 24.0f, 4.5f);
        this.f37302c.cubicTo(34.7696f, 4.5f, 43.5f, 13.2304f, 43.5f, 24.0f);
        this.f37302c.cubicTo(43.5f, 34.7696f, 34.7696f, 43.5f, 24.0f, 43.5f);
        this.f37302c.cubicTo(13.2304f, 43.5f, 4.5f, 34.7696f, 4.5f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(22.5f, 14.5f);
        this.f37302c.cubicTo(22.5f, 14.2239f, 22.7239f, 14.0f, 23.0f, 14.0f);
        this.f37302c.lineTo(25.0f, 14.0f);
        this.f37302c.cubicTo(25.2761f, 14.0f, 25.5f, 14.2239f, 25.5f, 14.5f);
        this.f37302c.lineTo(25.5f, 27.5f);
        this.f37302c.cubicTo(25.5f, 27.7761f, 25.2761f, 28.0f, 25.0f, 28.0f);
        this.f37302c.lineTo(23.0f, 28.0f);
        this.f37302c.cubicTo(22.7239f, 28.0f, 22.5f, 27.7761f, 22.5f, 27.5f);
        this.f37302c.lineTo(22.5f, 14.5f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 30.0f);
        this.f37302c.cubicTo(23.1716f, 30.0f, 22.5f, 30.6716f, 22.5f, 31.5f);
        this.f37302c.lineTo(22.5f, 32.5f);
        this.f37302c.cubicTo(22.5f, 33.3284f, 23.1716f, 34.0f, 24.0f, 34.0f);
        this.f37302c.cubicTo(24.8284f, 34.0f, 25.5f, 33.3284f, 25.5f, 32.5f);
        this.f37302c.lineTo(25.5f, 31.5f);
        this.f37302c.cubicTo(25.5f, 30.6716f, 24.8284f, 30.0f, 24.0f, 30.0f);
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
