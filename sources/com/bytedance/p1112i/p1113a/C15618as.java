package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.as */
public class C15618as extends AbstractC15287a {

    /* renamed from: d */
    Paint f38073d;

    /* renamed from: e */
    Path f38074e;

    /* renamed from: f */
    Paint f38075f;

    /* renamed from: g */
    Path f38076g;

    static {
        Covode.recordClassIndex(17884);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(9.0f, 12.5f);
        this.f37302c.cubicTo(9.0f, 12.2239f, 9.22386f, 12.0f, 9.5f, 12.0f);
        this.f37302c.lineTo(38.5f, 12.0f);
        this.f37302c.cubicTo(38.7761f, 12.0f, 39.0f, 12.2239f, 39.0f, 12.5f);
        this.f37302c.lineTo(39.0f, 14.5f);
        this.f37302c.cubicTo(39.0f, 14.7761f, 38.7761f, 15.0f, 38.5f, 15.0f);
        this.f37302c.lineTo(9.5f, 15.0f);
        this.f37302c.cubicTo(9.22386f, 15.0f, 9.0f, 14.7761f, 9.0f, 14.5f);
        this.f37302c.lineTo(9.0f, 12.5f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38073d = new Paint();
        Path path = new Path();
        this.f38074e = path;
        path.moveTo(9.0f, 23.0f);
        this.f38074e.cubicTo(9.0f, 22.7239f, 9.22386f, 22.5f, 9.5f, 22.5f);
        this.f38074e.lineTo(38.5f, 22.5f);
        this.f38074e.cubicTo(38.7761f, 22.5f, 39.0f, 22.7239f, 39.0f, 23.0f);
        this.f38074e.lineTo(39.0f, 25.0f);
        this.f38074e.cubicTo(39.0f, 25.2761f, 38.7761f, 25.5f, 38.5f, 25.5f);
        this.f38074e.lineTo(9.5f, 25.5f);
        this.f38074e.cubicTo(9.22386f, 25.5f, 9.0f, 25.2761f, 9.0f, 25.0f);
        this.f38074e.lineTo(9.0f, 23.0f);
        this.f38074e.close();
        this.f38074e.setFillType(Path.FillType.WINDING);
        this.f38073d.setStyle(Paint.Style.FILL);
        this.f38073d.setColor(-16777216);
        this.f37300a.add(this.f38073d);
        this.f38075f = new Paint();
        Path path2 = new Path();
        this.f38076g = path2;
        path2.moveTo(9.0f, 33.5f);
        this.f38076g.cubicTo(9.0f, 33.2239f, 9.22386f, 33.0f, 9.5f, 33.0f);
        this.f38076g.lineTo(38.5f, 33.0f);
        this.f38076g.cubicTo(38.7761f, 33.0f, 39.0f, 33.2239f, 39.0f, 33.5f);
        this.f38076g.lineTo(39.0f, 35.5f);
        this.f38076g.cubicTo(39.0f, 35.7761f, 38.7761f, 36.0f, 38.5f, 36.0f);
        this.f38076g.lineTo(9.5f, 36.0f);
        this.f38076g.cubicTo(9.22386f, 36.0f, 9.0f, 35.7761f, 9.0f, 35.5f);
        this.f38076g.lineTo(9.0f, 33.5f);
        this.f38076g.close();
        this.f38076g.setFillType(Path.FillType.WINDING);
        this.f38075f.setStyle(Paint.Style.FILL);
        this.f38075f.setColor(-16777216);
        this.f37300a.add(this.f38075f);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38074e, this.f38073d);
        canvas.drawPath(this.f38076g, this.f38075f);
    }
}
