package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cm */
public class C15666cm extends AbstractC15287a {

    /* renamed from: d */
    Paint f38131d;

    /* renamed from: e */
    Path f38132e;

    static {
        Covode.recordClassIndex(17932);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(0.0f, 5.0f);
        this.f37302c.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
        this.f37302c.lineTo(43.0f, 0.0f);
        this.f37302c.cubicTo(45.7614f, 0.0f, 48.0f, 2.23858f, 48.0f, 5.0f);
        this.f37302c.lineTo(48.0f, 43.0f);
        this.f37302c.cubicTo(48.0f, 45.7614f, 45.7614f, 48.0f, 43.0f, 48.0f);
        this.f37302c.lineTo(5.0f, 48.0f);
        this.f37302c.cubicTo(2.23858f, 48.0f, 0.0f, 45.7614f, 0.0f, 43.0f);
        this.f37302c.lineTo(0.0f, 5.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-119723);
        this.f38131d = new Paint();
        Path path = new Path();
        this.f38132e = path;
        path.moveTo(34.7283f, 11.6936f);
        this.f38132e.cubicTo(35.4809f, 12.4111f, 35.4236f, 13.5972f, 34.6883f, 14.3325f);
        this.f38132e.lineTo(25.0f, 24.0208f);
        this.f38132e.lineTo(34.667f, 33.6878f);
        this.f38132e.cubicTo(35.4032f, 34.424f, 35.4596f, 35.612f, 34.7046f, 36.3289f);
        this.f38132e.cubicTo(31.6564f, 39.2238f, 27.5356f, 41.0f, 23.0f, 41.0f);
        this.f38132e.cubicTo(13.6112f, 41.0f, 6.0f, 33.3888f, 6.0f, 24.0f);
        this.f38132e.cubicTo(6.0f, 14.6112f, 13.6112f, 7.0f, 23.0f, 7.0f);
        this.f38132e.cubicTo(27.5474f, 7.0f, 31.6778f, 8.78547f, 34.7283f, 11.6936f);
        this.f38132e.close();
        this.f38132e.moveTo(22.5f, 17.0f);
        this.f38132e.cubicTo(22.5f, 18.6569f, 21.1569f, 20.0f, 19.5f, 20.0f);
        this.f38132e.cubicTo(17.8431f, 20.0f, 16.5f, 18.6569f, 16.5f, 17.0f);
        this.f38132e.cubicTo(16.5f, 15.3431f, 17.8431f, 14.0f, 19.5f, 14.0f);
        this.f38132e.cubicTo(21.1569f, 14.0f, 22.5f, 15.3431f, 22.5f, 17.0f);
        this.f38132e.close();
        this.f38132e.moveTo(38.0f, 29.0f);
        this.f38132e.cubicTo(40.7614f, 29.0f, 43.0f, 26.7614f, 43.0f, 24.0f);
        this.f38132e.cubicTo(43.0f, 21.2386f, 40.7614f, 19.0f, 38.0f, 19.0f);
        this.f38132e.cubicTo(35.2386f, 19.0f, 33.0f, 21.2386f, 33.0f, 24.0f);
        this.f38132e.cubicTo(33.0f, 26.7614f, 35.2386f, 29.0f, 38.0f, 29.0f);
        this.f38132e.close();
        this.f38132e.setFillType(Path.FillType.EVEN_ODD);
        this.f38131d.setStyle(Paint.Style.FILL);
        this.f38131d.setColor(-1);
        this.f37300a.add(this.f38131d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38132e, this.f38131d);
    }
}
