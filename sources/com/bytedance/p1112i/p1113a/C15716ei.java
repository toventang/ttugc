package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ei */
public class C15716ei extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17982);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(7.0f, 11.0f);
        this.f37302c.cubicTo(7.0f, 7.13401f, 10.134f, 4.0f, 14.0f, 4.0f);
        this.f37302c.lineTo(38.0f, 4.0f);
        this.f37302c.cubicTo(39.1046f, 4.0f, 40.0f, 4.89543f, 40.0f, 6.0f);
        this.f37302c.lineTo(40.0f, 41.0f);
        this.f37302c.cubicTo(40.0f, 42.1046f, 39.1046f, 43.0f, 38.0f, 43.0f);
        this.f37302c.lineTo(13.5f, 43.0f);
        this.f37302c.cubicTo(9.91015f, 43.0f, 7.0f, 40.0899f, 7.0f, 36.5f);
        this.f37302c.cubicTo(7.0f, 36.3318f, 7.00639f, 36.165f, 7.01894f, 36.0f);
        this.f37302c.lineTo(7.0f, 36.0f);
        this.f37302c.lineTo(7.0f, 11.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.0f, 30.4982f);
        this.f37302c.cubicTo(11.7696f, 30.1772f, 12.6141f, 30.0f, 13.5f, 30.0f);
        this.f37302c.lineTo(36.0f, 30.0f);
        this.f37302c.lineTo(36.0f, 8.0f);
        this.f37302c.lineTo(14.0f, 8.0f);
        this.f37302c.cubicTo(12.3431f, 8.0f, 11.0f, 9.34315f, 11.0f, 11.0f);
        this.f37302c.lineTo(11.0f, 30.4982f);
        this.f37302c.close();
        this.f37302c.moveTo(36.0f, 34.0f);
        this.f37302c.lineTo(13.5f, 34.0f);
        this.f37302c.cubicTo(12.1193f, 34.0f, 11.0f, 35.1193f, 11.0f, 36.5f);
        this.f37302c.cubicTo(11.0f, 37.8807f, 12.1193f, 39.0f, 13.5f, 39.0f);
        this.f37302c.lineTo(36.0f, 39.0f);
        this.f37302c.lineTo(36.0f, 34.0f);
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
