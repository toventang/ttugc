package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hi */
public class C15797hi extends AbstractC15287a {

    /* renamed from: d */
    Paint f38401d;

    /* renamed from: e */
    Path f38402e;

    /* renamed from: f */
    Paint f38403f;

    /* renamed from: g */
    Path f38404g;

    /* renamed from: h */
    Paint f38405h;

    /* renamed from: i */
    Path f38406i;

    static {
        Covode.recordClassIndex(18063);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 6.0f);
        this.f37302c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(33.9411f, 42.0f, 42.0f, 33.9411f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f37302c.close();
        this.f37302c.moveTo(2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38401d = new Paint();
        Path path = new Path();
        this.f38402e = path;
        path.moveTo(17.0f, 23.0f);
        this.f38402e.cubicTo(18.6569f, 23.0f, 20.0f, 21.2091f, 20.0f, 19.0f);
        this.f38402e.cubicTo(20.0f, 16.7909f, 18.6569f, 15.0f, 17.0f, 15.0f);
        this.f38402e.cubicTo(15.3431f, 15.0f, 14.0f, 16.7909f, 14.0f, 19.0f);
        this.f38402e.cubicTo(14.0f, 21.2091f, 15.3431f, 23.0f, 17.0f, 23.0f);
        this.f38402e.close();
        this.f38402e.setFillType(Path.FillType.EVEN_ODD);
        this.f38401d.setStyle(Paint.Style.FILL);
        this.f38401d.setColor(-16777216);
        this.f37300a.add(this.f38401d);
        this.f38403f = new Paint();
        Path path2 = new Path();
        this.f38404g = path2;
        path2.moveTo(31.0f, 23.0f);
        this.f38404g.cubicTo(32.6569f, 23.0f, 34.0f, 21.2091f, 34.0f, 19.0f);
        this.f38404g.cubicTo(34.0f, 16.7909f, 32.6569f, 15.0f, 31.0f, 15.0f);
        this.f38404g.cubicTo(29.3431f, 15.0f, 28.0f, 16.7909f, 28.0f, 19.0f);
        this.f38404g.cubicTo(28.0f, 21.2091f, 29.3431f, 23.0f, 31.0f, 23.0f);
        this.f38404g.close();
        this.f38404g.setFillType(Path.FillType.EVEN_ODD);
        this.f38403f.setStyle(Paint.Style.FILL);
        this.f38403f.setColor(-16777216);
        this.f37300a.add(this.f38403f);
        this.f38405h = new Paint();
        Path path3 = new Path();
        this.f38406i = path3;
        path3.moveTo(16.0f, 28.3431f);
        this.f38406i.cubicTo(16.0f, 31.4673f, 19.5817f, 36.0f, 24.0f, 36.0f);
        this.f38406i.cubicTo(28.4183f, 36.0f, 32.0f, 31.4673f, 32.0f, 28.3431f);
        this.f38406i.cubicTo(32.0f, 25.219f, 16.0f, 25.219f, 16.0f, 28.3431f);
        this.f38406i.close();
        this.f38406i.setFillType(Path.FillType.EVEN_ODD);
        this.f38405h.setStyle(Paint.Style.FILL);
        this.f38405h.setColor(-16777216);
        this.f37300a.add(this.f38405h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38402e, this.f38401d);
        canvas.drawPath(this.f38404g, this.f38403f);
        canvas.drawPath(this.f38406i, this.f38405h);
    }
}
