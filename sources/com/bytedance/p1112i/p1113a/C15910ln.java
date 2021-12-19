package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ln */
public class C15910ln extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18176);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(45.7321f, 7.00001f);
        this.f37302c.cubicTo(45.3748f, 6.3812f, 44.7146f, 6.0f, 44.0f, 6.0f);
        this.f37302c.lineTo(4.00004f, 6.0f);
        this.f37302c.cubicTo(3.20826f, 6.0f, 2.49103f, 6.4671f, 2.17085f, 7.19125f);
        this.f37302c.cubicTo(1.85068f, 7.9154f, 1.98785f, 8.76026f, 2.52068f, 9.34592f);
        this.f37302c.lineTo(12.9607f, 20.8209f);
        this.f37302c.cubicTo(13.5137f, 21.4288f, 14.3824f, 21.6365f, 15.1506f, 21.3445f);
        this.f37302c.lineTo(29.65f, 15.8336f);
        this.f37302c.cubicTo(29.8188f, 15.7694f, 29.8953f, 15.796f, 29.9287f, 15.8092f);
        this.f37302c.cubicTo(29.9872f, 15.8325f, 30.0709f, 15.8928f, 30.1366f, 16.0041f);
        this.f37302c.cubicTo(30.2023f, 16.1154f, 30.2147f, 16.2179f, 30.2068f, 16.2802f);
        this.f37302c.cubicTo(30.2023f, 16.3159f, 30.1885f, 16.3958f, 30.0509f, 16.5125f);
        this.f37302c.lineTo(18.1464f, 26.6098f);
        this.f37302c.cubicTo(17.5329f, 27.1301f, 17.2908f, 27.9674f, 17.5321f, 28.7348f);
        this.f37302c.lineTo(22.0921f, 43.2398f);
        this.f37302c.cubicTo(22.33f, 43.9967f, 22.9928f, 44.5413f, 23.7815f, 44.628f);
        this.f37302c.cubicTo(24.5701f, 44.7147f, 25.3354f, 44.3271f, 25.7321f, 43.64f);
        this.f37302c.lineTo(45.7321f, 9.00002f);
        this.f37302c.cubicTo(46.0894f, 8.38122f, 46.0894f, 7.61882f, 45.7321f, 7.00001f);
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
