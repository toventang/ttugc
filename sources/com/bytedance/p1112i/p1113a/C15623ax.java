package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ax */
public class C15623ax extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17889);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(5.5f, 21.7143f);
        this.f37302c.cubicTo(5.5f, 13.5525f, 13.5194f, 6.5f, 24.0f, 6.5f);
        this.f37302c.cubicTo(34.4807f, 6.5f, 42.5f, 13.5525f, 42.5f, 21.7143f);
        this.f37302c.cubicTo(42.5f, 26.7589f, 39.9874f, 31.1417f, 36.5292f, 34.7432f);
        this.f37302c.cubicTo(33.8023f, 37.583f, 30.5586f, 39.8589f, 27.7222f, 41.4898f);
        this.f37302c.lineTo(27.7222f, 36.9286f);
        this.f37302c.lineTo(24.0f, 36.9286f);
        this.f37302c.cubicTo(13.5194f, 36.9286f, 5.5f, 29.876f, 5.5f, 21.7143f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 3.5f);
        this.f37302c.cubicTo(12.3893f, 3.5f, 2.5f, 11.414f, 2.5f, 21.7143f);
        this.f37302c.cubicTo(2.5f, 32.0146f, 12.3893f, 39.9286f, 24.0f, 39.9286f);
        this.f37302c.lineTo(24.7222f, 39.9286f);
        this.f37302c.lineTo(24.7222f, 44.0f);
        this.f37302c.cubicTo(24.7222f, 44.5202f, 24.9917f, 45.0032f, 25.4344f, 45.2764f);
        this.f37302c.cubicTo(25.877f, 45.5496f, 26.4296f, 45.574f, 26.8946f, 45.3409f);
        this.f37302c.cubicTo(30.3259f, 43.6203f, 34.9276f, 40.7426f, 38.6931f, 36.8211f);
        this.f37302c.cubicTo(42.4571f, 32.9011f, 45.5f, 27.8125f, 45.5f, 21.7143f);
        this.f37302c.cubicTo(45.5f, 11.414f, 35.6107f, 3.5f, 24.0f, 3.5f);
        this.f37302c.close();
        this.f37302c.moveTo(14.0f, 25.0f);
        this.f37302c.cubicTo(15.6569f, 25.0f, 17.0f, 23.6569f, 17.0f, 22.0f);
        this.f37302c.cubicTo(17.0f, 20.3431f, 15.6569f, 19.0f, 14.0f, 19.0f);
        this.f37302c.cubicTo(12.3431f, 19.0f, 11.0f, 20.3431f, 11.0f, 22.0f);
        this.f37302c.cubicTo(11.0f, 23.6569f, 12.3431f, 25.0f, 14.0f, 25.0f);
        this.f37302c.close();
        this.f37302c.moveTo(27.0f, 22.0f);
        this.f37302c.cubicTo(27.0f, 23.6569f, 25.6569f, 25.0f, 24.0f, 25.0f);
        this.f37302c.cubicTo(22.3431f, 25.0f, 21.0f, 23.6569f, 21.0f, 22.0f);
        this.f37302c.cubicTo(21.0f, 20.3431f, 22.3431f, 19.0f, 24.0f, 19.0f);
        this.f37302c.cubicTo(25.6569f, 19.0f, 27.0f, 20.3431f, 27.0f, 22.0f);
        this.f37302c.close();
        this.f37302c.moveTo(34.0f, 25.0f);
        this.f37302c.cubicTo(35.6569f, 25.0f, 37.0f, 23.6569f, 37.0f, 22.0f);
        this.f37302c.cubicTo(37.0f, 20.3431f, 35.6569f, 19.0f, 34.0f, 19.0f);
        this.f37302c.cubicTo(32.3431f, 19.0f, 31.0f, 20.3431f, 31.0f, 22.0f);
        this.f37302c.cubicTo(31.0f, 23.6569f, 32.3431f, 25.0f, 34.0f, 25.0f);
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
