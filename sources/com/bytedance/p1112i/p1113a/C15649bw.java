package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bw */
public class C15649bw extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17915);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(2.63407f, 7.38018f);
        this.f37302c.cubicTo(2.87728f, 6.84421f, 3.41146f, 6.5f, 4.00002f, 6.5f);
        this.f37302c.lineTo(44.0f, 6.5f);
        this.f37302c.cubicTo(44.5347f, 6.5f, 45.029f, 6.78464f, 45.2974f, 7.24711f);
        this.f37302c.cubicTo(45.5658f, 7.70958f, 45.5677f, 8.27995f, 45.3024f, 8.74421f);
        this.f37302c.lineTo(25.3024f, 43.7442f);
        this.f37302c.cubicTo(25.0067f, 44.2616f, 24.4329f, 44.5549f, 23.8404f, 44.4915f);
        this.f37302c.cubicTo(23.2479f, 44.4281f, 22.7491f, 44.0199f, 22.5697f, 43.4517f);
        this.f37302c.lineTo(16.6643f, 24.7513f);
        this.f37302c.lineTo(2.87116f, 8.98776f);
        this.f37302c.cubicTo(2.48359f, 8.54482f, 2.39087f, 7.91614f, 2.63407f, 7.38018f);
        this.f37302c.close();
        this.f37302c.moveTo(19.7828f, 24.6642f);
        this.f37302c.lineTo(24.3982f, 39.2798f);
        this.f37302c.lineTo(41.4153f, 9.5f);
        this.f37302c.lineTo(7.30568f, 9.5f);
        this.f37302c.lineTo(18.2939f, 22.0579f);
        this.f37302c.lineTo(30.788f, 14.3692f);
        this.f37302c.cubicTo(31.0232f, 14.2245f, 31.3312f, 14.2978f, 31.4759f, 14.533f);
        this.f37302c.lineTo(32.5241f, 16.2363f);
        this.f37302c.cubicTo(32.6688f, 16.4715f, 32.5955f, 16.7794f, 32.3603f, 16.9242f);
        this.f37302c.lineTo(19.7828f, 24.6642f);
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
