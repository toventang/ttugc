package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.jp */
public class C15858jp extends AbstractC15287a {

    /* renamed from: d */
    Paint f38470d;

    /* renamed from: e */
    Path f38471e;

    static {
        Covode.recordClassIndex(18124);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(34.4961f, 70.3557f);
        this.f37302c.cubicTo(34.7809f, 70.7422f, 35.2335f, 70.971f, 35.7166f, 70.971f);
        this.f37302c.cubicTo(36.1997f, 70.971f, 36.6522f, 70.7422f, 36.937f, 70.3557f);
        this.f37302c.lineTo(45.7854f, 58.5121f);
        this.f37302c.lineTo(65.6332f, 58.5121f);
        this.f37302c.cubicTo(67.6978f, 58.5121f, 69.376f, 56.834f, 69.376f, 54.7693f);
        this.f37302c.lineTo(69.376f, 4.77091f);
        this.f37302c.cubicTo(69.376f, 2.70629f, 67.6978f, 1.02815f, 65.6332f, 1.02815f);
        this.f37302c.lineTo(5.79989f, 1.02815f);
        this.f37302c.cubicTo(3.73527f, 1.02815f, 2.05713f, 2.70629f, 2.05713f, 4.77091f);
        this.f37302c.lineTo(2.05713f, 54.7693f);
        this.f37302c.cubicTo(2.05713f, 56.834f, 3.73527f, 58.5121f, 5.79989f, 58.5121f);
        this.f37302c.lineTo(25.6477f, 58.5121f);
        this.f37302c.lineTo(34.4961f, 70.3557f);
        this.f37302c.close();
        this.f37302c.moveTo(5.10829f, 4.77135f);
        this.f37302c.cubicTo(5.10829f, 4.38996f, 5.4185f, 4.07976f, 5.79989f, 4.07976f);
        this.f37302c.lineTo(65.6281f, 4.07976f);
        this.f37302c.cubicTo(66.0095f, 4.07976f, 66.3197f, 4.38996f, 66.3197f, 4.77135f);
        this.f37302c.lineTo(66.3197f, 54.7749f);
        this.f37302c.cubicTo(66.3197f, 55.1562f, 66.0095f, 55.4665f, 65.6281f, 55.4665f);
        this.f37302c.lineTo(45.0175f, 55.4665f);
        this.f37302c.cubicTo(44.5395f, 55.4665f, 44.0869f, 55.6902f, 43.7971f, 56.0767f);
        this.f37302c.lineTo(35.7166f, 66.8981f);
        this.f37302c.lineTo(27.6361f, 56.0767f);
        this.f37302c.cubicTo(27.3513f, 55.6902f, 26.8987f, 55.4614f, 26.4156f, 55.4614f);
        this.f37302c.lineTo(5.79989f, 55.4614f);
        this.f37302c.cubicTo(5.4185f, 55.4614f, 5.10829f, 55.1512f, 5.10829f, 54.7698f);
        this.f37302c.lineTo(5.10829f, 4.77135f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38470d = new Paint();
        Path path = new Path();
        this.f38471e = path;
        path.moveTo(49.6956f, 31.2955f);
        this.f38471e.lineTo(21.7368f, 31.2955f);
        this.f38471e.cubicTo(20.8926f, 31.2955f, 20.2112f, 30.6141f, 20.2112f, 29.7699f);
        this.f38471e.cubicTo(20.2112f, 28.9258f, 20.8926f, 28.2443f, 21.7368f, 28.2443f);
        this.f38471e.lineTo(49.6956f, 28.2443f);
        this.f38471e.cubicTo(50.5398f, 28.2443f, 51.2212f, 28.9258f, 51.2212f, 29.7699f);
        this.f38471e.cubicTo(51.2212f, 30.6141f, 50.5398f, 31.2955f, 49.6956f, 31.2955f);
        this.f38471e.close();
        this.f38471e.setFillType(Path.FillType.WINDING);
        this.f38470d.setStyle(Paint.Style.FILL);
        this.f38470d.setColor(-16777216);
        this.f37300a.add(this.f38470d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 72.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38471e, this.f38470d);
    }
}
