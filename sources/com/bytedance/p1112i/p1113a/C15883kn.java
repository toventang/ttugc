package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.kn */
public class C15883kn extends AbstractC15287a {

    /* renamed from: d */
    Paint f38534d;

    /* renamed from: e */
    Path f38535e;

    static {
        Covode.recordClassIndex(18149);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(4.0f, 5.0f);
        this.f37302c.lineTo(4.0f, 42.0f);
        this.f37302c.cubicTo(4.0f, 43.1045f, 4.89551f, 44.0f, 6.0f, 44.0f);
        this.f37302c.lineTo(43.0f, 44.0f);
        this.f37302c.cubicTo(43.5522f, 44.0f, 44.0f, 43.5522f, 44.0f, 43.0f);
        this.f37302c.lineTo(44.0f, 41.0f);
        this.f37302c.cubicTo(44.0f, 40.4478f, 43.5522f, 40.0f, 43.0f, 40.0f);
        this.f37302c.lineTo(8.0f, 40.0f);
        this.f37302c.lineTo(8.0f, 5.0f);
        this.f37302c.cubicTo(8.0f, 4.44775f, 7.55225f, 4.0f, 7.0f, 4.0f);
        this.f37302c.lineTo(5.0f, 4.0f);
        this.f37302c.cubicTo(4.44775f, 4.0f, 4.0f, 4.44775f, 4.0f, 5.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38534d = new Paint();
        Path path = new Path();
        this.f38535e = path;
        path.moveTo(43.2964f, 12.3984f);
        this.f38535e.cubicTo(43.3013f, 12.0654f, 43.1396f, 11.7378f, 42.8394f, 11.5435f);
        this.f38535e.lineTo(41.1606f, 10.4565f);
        this.f38535e.cubicTo(40.6968f, 10.1567f, 40.0776f, 10.2896f, 39.7778f, 10.7529f);
        this.f38535e.lineTo(30.4683f, 25.1401f);
        this.f38535e.lineTo(21.1763f, 18.3823f);
        this.f38535e.cubicTo(20.7227f, 18.0527f, 20.1509f, 17.9282f, 19.6011f, 18.04f);
        this.f38535e.cubicTo(19.0513f, 18.1519f, 18.5737f, 18.4897f, 18.2852f, 18.9712f);
        this.f38535e.lineTo(9.79932f, 33.1133f);
        this.f38535e.cubicTo(9.68994f, 33.2959f, 9.64551f, 33.5f, 9.65918f, 33.6973f);
        this.f38535e.lineTo(9.65918f, 37.3472f);
        this.f38535e.cubicTo(9.65918f, 37.8995f, 10.1069f, 38.3472f, 10.6592f, 38.3472f);
        this.f38535e.lineTo(42.2988f, 38.3472f);
        this.f38535e.cubicTo(42.8511f, 38.3472f, 43.2988f, 37.8995f, 43.2988f, 37.3472f);
        this.f38535e.lineTo(43.2988f, 12.395f);
        this.f38535e.lineTo(43.2964f, 12.3984f);
        this.f38535e.close();
        this.f38535e.setFillType(Path.FillType.WINDING);
        this.f38534d.setStyle(Paint.Style.FILL);
        this.f38534d.setColor(-16777216);
        this.f37300a.add(this.f38534d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38535e, this.f38534d);
    }
}
