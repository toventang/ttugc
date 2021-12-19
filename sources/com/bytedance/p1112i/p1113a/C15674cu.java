package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cu */
public class C15674cu extends AbstractC15287a {

    /* renamed from: d */
    Paint f38162d;

    /* renamed from: e */
    Path f38163e;

    /* renamed from: f */
    Paint f38164f;

    /* renamed from: g */
    Path f38165g;

    /* renamed from: h */
    Paint f38166h;

    /* renamed from: i */
    Path f38167i;

    static {
        Covode.recordClassIndex(17940);
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
        this.f37301b.setColor(-411877);
        this.f38162d = new Paint();
        Path path = new Path();
        this.f38163e = path;
        path.addRoundRect(new RectF(20.0f, 14.0f, 24.0f, 24.0f), 2.0f, 2.0f, Path.Direction.CW);
        this.f38162d.setStyle(Paint.Style.FILL);
        this.f38162d.setColor(-1);
        this.f37300a.add(this.f38162d);
        this.f38164f = new Paint();
        Path path2 = new Path();
        this.f38165g = path2;
        path2.addRoundRect(new RectF(27.0f, 14.0f, 31.0f, 24.0f), 2.0f, 2.0f, Path.Direction.CW);
        this.f38164f.setStyle(Paint.Style.FILL);
        this.f38164f.setColor(-1);
        this.f37300a.add(this.f38164f);
        this.f38166h = new Paint();
        Path path3 = new Path();
        this.f38167i = path3;
        path3.moveTo(34.0f, 10.0f);
        this.f38167i.lineTo(27.0f, 10.0f);
        this.f38167i.cubicTo(26.4477f, 10.0f, 26.0f, 9.55232f, 26.0f, 9.00003f);
        this.f38167i.lineTo(26.0f, 7.00003f);
        this.f38167i.cubicTo(26.0f, 6.44775f, 26.4477f, 6.00003f, 27.0f, 6.00003f);
        this.f38167i.lineTo(34.0f, 6.0f);
        this.f38167i.cubicTo(36.2091f, 6.0f, 38.0f, 7.79086f, 38.0f, 10.0f);
        this.f38167i.lineTo(38.0f, 38.0f);
        this.f38167i.cubicTo(38.0f, 40.2091f, 36.2091f, 42.0f, 34.0f, 42.0f);
        this.f38167i.lineTo(27.0f, 42.0f);
        this.f38167i.cubicTo(26.4477f, 42.0f, 26.0f, 41.5523f, 26.0f, 41.0f);
        this.f38167i.lineTo(26.0f, 39.0f);
        this.f38167i.cubicTo(26.0f, 38.4477f, 26.4477f, 38.0f, 27.0f, 38.0f);
        this.f38167i.lineTo(34.0f, 38.0f);
        this.f38167i.lineTo(34.0f, 10.0f);
        this.f38167i.close();
        this.f38167i.moveTo(10.0f, 10.0f);
        this.f38167i.cubicTo(10.0f, 7.79089f, 11.7909f, 6.00003f, 14.0f, 6.00003f);
        this.f38167i.lineTo(16.0f, 6.00003f);
        this.f38167i.cubicTo(16.5523f, 6.00003f, 17.0f, 6.44775f, 17.0f, 7.00003f);
        this.f38167i.lineTo(17.0f, 9.00003f);
        this.f38167i.cubicTo(17.0f, 9.55232f, 16.5523f, 10.0f, 16.0f, 10.0f);
        this.f38167i.lineTo(14.0f, 10.0f);
        this.f38167i.lineTo(14.0f, 12.0f);
        this.f38167i.cubicTo(14.0f, 12.5523f, 13.5523f, 13.0f, 13.0f, 13.0f);
        this.f38167i.lineTo(11.0f, 13.0f);
        this.f38167i.cubicTo(10.4477f, 13.0f, 10.0f, 12.5523f, 10.0f, 12.0f);
        this.f38167i.lineTo(10.0f, 10.0f);
        this.f38167i.close();
        this.f38167i.moveTo(19.0f, 7.00003f);
        this.f38167i.cubicTo(19.0f, 6.44775f, 19.4477f, 6.00003f, 20.0f, 6.00003f);
        this.f38167i.lineTo(23.0f, 6.00003f);
        this.f38167i.cubicTo(23.5523f, 6.00003f, 24.0f, 6.44775f, 24.0f, 7.00003f);
        this.f38167i.lineTo(24.0f, 9.00003f);
        this.f38167i.cubicTo(24.0f, 9.55232f, 23.5523f, 10.0f, 23.0f, 10.0f);
        this.f38167i.lineTo(20.0f, 10.0f);
        this.f38167i.cubicTo(19.4477f, 10.0f, 19.0f, 9.55232f, 19.0f, 9.00003f);
        this.f38167i.lineTo(19.0f, 7.00003f);
        this.f38167i.close();
        this.f38167i.moveTo(11.0f, 22.5f);
        this.f38167i.cubicTo(10.4477f, 22.5f, 10.0f, 22.0523f, 10.0f, 21.5f);
        this.f38167i.lineTo(10.0f, 17.0f);
        this.f38167i.cubicTo(10.0f, 16.4477f, 10.4477f, 16.0f, 11.0f, 16.0f);
        this.f38167i.lineTo(13.0f, 16.0f);
        this.f38167i.cubicTo(13.5523f, 16.0f, 14.0f, 16.4477f, 14.0f, 17.0f);
        this.f38167i.lineTo(14.0f, 21.5f);
        this.f38167i.cubicTo(14.0f, 22.0523f, 13.5523f, 22.5f, 13.0f, 22.5f);
        this.f38167i.lineTo(11.0f, 22.5f);
        this.f38167i.close();
        this.f38167i.moveTo(11.0f, 32.0f);
        this.f38167i.cubicTo(10.4477f, 32.0f, 10.0f, 31.5523f, 10.0f, 31.0f);
        this.f38167i.lineTo(10.0f, 26.5f);
        this.f38167i.cubicTo(10.0f, 25.9477f, 10.4477f, 25.5f, 11.0f, 25.5f);
        this.f38167i.lineTo(13.0f, 25.5f);
        this.f38167i.cubicTo(13.5523f, 25.5f, 14.0f, 25.9477f, 14.0f, 26.5f);
        this.f38167i.lineTo(14.0f, 31.0f);
        this.f38167i.cubicTo(14.0f, 31.5523f, 13.5523f, 32.0f, 13.0f, 32.0f);
        this.f38167i.lineTo(11.0f, 32.0f);
        this.f38167i.close();
        this.f38167i.moveTo(13.0f, 35.0f);
        this.f38167i.cubicTo(13.5523f, 35.0f, 14.0f, 35.4477f, 14.0f, 36.0f);
        this.f38167i.lineTo(14.0f, 38.0f);
        this.f38167i.lineTo(16.0f, 38.0f);
        this.f38167i.cubicTo(16.5523f, 38.0f, 17.0f, 38.4477f, 17.0f, 39.0f);
        this.f38167i.lineTo(17.0f, 41.0f);
        this.f38167i.cubicTo(17.0f, 41.5523f, 16.5523f, 42.0f, 16.0f, 42.0f);
        this.f38167i.lineTo(14.0f, 42.0f);
        this.f38167i.cubicTo(11.7909f, 42.0f, 10.0f, 40.2091f, 10.0f, 38.0f);
        this.f38167i.lineTo(10.0f, 36.0f);
        this.f38167i.cubicTo(10.0f, 35.4477f, 10.4477f, 35.0f, 11.0f, 35.0f);
        this.f38167i.lineTo(13.0f, 35.0f);
        this.f38167i.close();
        this.f38167i.moveTo(19.0f, 39.0f);
        this.f38167i.cubicTo(19.0f, 38.4477f, 19.4477f, 38.0f, 20.0f, 38.0f);
        this.f38167i.lineTo(23.0f, 38.0f);
        this.f38167i.cubicTo(23.5523f, 38.0f, 24.0f, 38.4477f, 24.0f, 39.0f);
        this.f38167i.lineTo(24.0f, 41.0f);
        this.f38167i.cubicTo(24.0f, 41.5523f, 23.5523f, 42.0f, 23.0f, 42.0f);
        this.f38167i.lineTo(20.0f, 42.0f);
        this.f38167i.cubicTo(19.4477f, 42.0f, 19.0f, 41.5523f, 19.0f, 41.0f);
        this.f38167i.lineTo(19.0f, 39.0f);
        this.f38167i.close();
        this.f38167i.setFillType(Path.FillType.EVEN_ODD);
        this.f38166h.setStyle(Paint.Style.FILL);
        this.f38166h.setColor(-1);
        this.f37300a.add(this.f38166h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38163e, this.f38162d);
        canvas.drawPath(this.f38165g, this.f38164f);
        canvas.drawPath(this.f38167i, this.f38166h);
    }
}
