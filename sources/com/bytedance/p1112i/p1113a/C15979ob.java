package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ob */
public class C15979ob extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18245);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(12.051f, 22.8851f);
        this.f37302c.lineTo(14.4088f, 20.7087f);
        this.f37302c.cubicTo(14.8146f, 20.3341f, 15.4472f, 20.3594f, 15.8218f, 20.7652f);
        this.f37302c.lineTo(17.1687f, 22.2242f);
        this.f37302c.cubicTo(17.547f, 22.6342f, 17.5169f, 23.2744f, 17.1016f, 23.6469f);
        this.f37302c.lineTo(11.3567f, 28.8f);
        this.f37302c.cubicTo(10.5679f, 29.5281f, 9.34497f, 29.5591f, 8.58592f, 28.8f);
        this.f37302c.lineTo(3.30668f, 23.6213f);
        this.f37302c.cubicTo(2.90974f, 23.2319f, 2.90667f, 22.5935f, 3.29985f, 22.2003f);
        this.f37302c.lineTo(4.70724f, 20.7929f);
        this.f37302c.cubicTo(5.09776f, 20.4024f, 5.73093f, 20.4024f, 6.12145f, 20.7929f);
        this.f37302c.lineTo(8.05023f, 22.7217f);
        this.f37302c.cubicTo(8.70151f, 14.4828f, 15.5936f, 8.0f, 23.9999f, 8.0f);
        this.f37302c.cubicTo(32.8365f, 8.0f, 39.9999f, 15.1634f, 39.9999f, 24.0f);
        this.f37302c.cubicTo(39.9999f, 32.8366f, 32.8365f, 40.0f, 23.9999f, 40.0f);
        this.f37302c.cubicTo(20.0354f, 40.0f, 16.4047f, 38.5559f, 13.6104f, 36.1683f);
        this.f37302c.cubicTo(13.1906f, 35.8095f, 13.1823f, 35.1738f, 13.5665f, 34.777f);
        this.f37302c.lineTo(14.9578f, 33.3402f);
        this.f37302c.cubicTo(15.3419f, 32.9435f, 15.9726f, 32.9369f, 16.3997f, 33.287f);
        this.f37302c.cubicTo(18.4702f, 34.9839f, 21.1147f, 36.0f, 23.9999f, 36.0f);
        this.f37302c.cubicTo(30.6273f, 36.0f, 35.9999f, 30.6274f, 35.9999f, 24.0f);
        this.f37302c.cubicTo(35.9999f, 17.3726f, 30.6273f, 12.0f, 23.9999f, 12.0f);
        this.f37302c.cubicTo(17.7484f, 12.0f, 12.6135f, 16.7804f, 12.051f, 22.8851f);
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
