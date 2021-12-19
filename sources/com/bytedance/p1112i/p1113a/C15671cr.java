package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cr */
public class C15671cr extends AbstractC15287a {

    /* renamed from: d */
    Paint f38151d;

    /* renamed from: e */
    Path f38152e;

    /* renamed from: f */
    Paint f38153f;

    /* renamed from: g */
    Path f38154g;

    /* renamed from: h */
    Paint f38155h;

    /* renamed from: i */
    Path f38156i;

    static {
        Covode.recordClassIndex(17937);
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
        this.f38151d = new Paint();
        Path path = new Path();
        this.f38152e = path;
        path.moveTo(8.0f, 11.0f);
        this.f38152e.cubicTo(8.0f, 9.34315f, 9.34315f, 8.0f, 11.0f, 8.0f);
        this.f38152e.lineTo(37.0f, 8.0f);
        this.f38152e.cubicTo(38.6569f, 8.0f, 40.0f, 9.34315f, 40.0f, 11.0f);
        this.f38152e.lineTo(40.0f, 37.0f);
        this.f38152e.cubicTo(40.0f, 38.6569f, 38.6569f, 40.0f, 37.0f, 40.0f);
        this.f38152e.lineTo(11.0f, 40.0f);
        this.f38152e.cubicTo(9.34315f, 40.0f, 8.0f, 38.6569f, 8.0f, 37.0f);
        this.f38152e.lineTo(8.0f, 11.0f);
        this.f38152e.close();
        this.f38152e.setFillType(Path.FillType.WINDING);
        this.f38151d.setStyle(Paint.Style.FILL);
        this.f38151d.setColor(-1);
        this.f37300a.add(this.f38151d);
        this.f38153f = new Paint();
        Path path2 = new Path();
        this.f38154g = path2;
        path2.moveTo(15.6583f, 29.2415f);
        this.f38154g.lineTo(11.2929f, 33.6069f);
        this.f38154g.cubicTo(11.1054f, 33.7944f, 11.0f, 34.0488f, 11.0f, 34.314f);
        this.f38154g.lineTo(11.0f, 36.0f);
        this.f38154g.cubicTo(11.0f, 36.5523f, 11.4477f, 37.0f, 12.0f, 37.0f);
        this.f38154g.lineTo(36.0f, 37.0f);
        this.f38154g.cubicTo(36.5523f, 37.0f, 37.0f, 36.5523f, 37.0f, 36.0f);
        this.f38154g.lineTo(37.0f, 31.2925f);
        this.f38154g.cubicTo(37.0f, 31.0401f, 36.9045f, 30.797f, 36.7328f, 30.612f);
        this.f38154g.lineTo(31.9122f, 25.4207f);
        this.f38154g.cubicTo(31.1409f, 24.59f, 29.834f, 24.5658f, 29.0324f, 25.3673f);
        this.f38154g.lineTo(22.0f, 32.3998f);
        this.f38154g.lineTo(18.4104f, 29.1691f);
        this.f38154g.cubicTo(17.6197f, 28.4576f, 16.4104f, 28.4894f, 15.6583f, 29.2415f);
        this.f38154g.close();
        this.f38154g.setFillType(Path.FillType.WINDING);
        this.f38153f.setStyle(Paint.Style.FILL);
        this.f38153f.setColor(-411877);
        this.f37300a.add(this.f38153f);
        this.f38155h = new Paint();
        Path path3 = new Path();
        this.f38156i = path3;
        path3.addCircle(18.5f, 18.5f, 3.5f, Path.Direction.CW);
        this.f38155h.setStyle(Paint.Style.FILL);
        this.f38155h.setColor(-411877);
        this.f37300a.add(this.f38155h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38152e, this.f38151d);
        canvas.drawPath(this.f38154g, this.f38153f);
        canvas.drawPath(this.f38156i, this.f38155h);
    }
}
