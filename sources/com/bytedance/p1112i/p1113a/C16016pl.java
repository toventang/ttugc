package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pl */
public class C16016pl extends AbstractC15287a {

    /* renamed from: d */
    Paint f38638d;

    /* renamed from: e */
    Path f38639e;

    /* renamed from: f */
    Paint f38640f;

    /* renamed from: g */
    Path f38641g;

    static {
        Covode.recordClassIndex(18282);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(20.1429f, 7.2963f);
        this.f37302c.cubicTo(20.1429f, 6.58037f, 20.7185f, 6.0f, 21.4286f, 6.0f);
        this.f37302c.lineTo(26.5714f, 6.0f);
        this.f37302c.cubicTo(27.2815f, 6.0f, 27.8571f, 6.58037f, 27.8571f, 7.2963f);
        this.f37302c.lineTo(27.8571f, 39.7037f);
        this.f37302c.cubicTo(27.8571f, 40.4196f, 27.2815f, 41.0f, 26.5714f, 41.0f);
        this.f37302c.lineTo(21.4286f, 41.0f);
        this.f37302c.cubicTo(20.7185f, 41.0f, 20.1429f, 40.4196f, 20.1429f, 39.7037f);
        this.f37302c.lineTo(20.1429f, 7.2963f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38638d = new Paint();
        Path path = new Path();
        this.f38639e = path;
        path.moveTo(6.0f, 16.3704f);
        this.f38639e.cubicTo(6.0f, 15.6544f, 6.57563f, 15.0741f, 7.28571f, 15.0741f);
        this.f38639e.lineTo(12.4286f, 15.0741f);
        this.f38639e.cubicTo(13.1387f, 15.0741f, 13.7143f, 15.6544f, 13.7143f, 16.3704f);
        this.f38639e.lineTo(13.7143f, 39.7037f);
        this.f38639e.cubicTo(13.7143f, 40.4196f, 13.1387f, 41.0f, 12.4286f, 41.0f);
        this.f38639e.lineTo(7.28571f, 41.0f);
        this.f38639e.cubicTo(6.57563f, 41.0f, 6.0f, 40.4196f, 6.0f, 39.7037f);
        this.f38639e.lineTo(6.0f, 16.3704f);
        this.f38639e.close();
        this.f38639e.setFillType(Path.FillType.WINDING);
        this.f38638d.setStyle(Paint.Style.FILL);
        this.f38638d.setColor(-16777216);
        this.f37300a.add(this.f38638d);
        this.f38640f = new Paint();
        Path path2 = new Path();
        this.f38641g = path2;
        path2.moveTo(34.2857f, 21.5556f);
        this.f38641g.cubicTo(34.2857f, 20.8396f, 34.8613f, 20.2593f, 35.5714f, 20.2593f);
        this.f38641g.lineTo(40.7143f, 20.2593f);
        this.f38641g.cubicTo(41.4244f, 20.2593f, 42.0f, 20.8396f, 42.0f, 21.5556f);
        this.f38641g.lineTo(42.0f, 39.7037f);
        this.f38641g.cubicTo(42.0f, 40.4196f, 41.4244f, 41.0f, 40.7143f, 41.0f);
        this.f38641g.lineTo(35.5714f, 41.0f);
        this.f38641g.cubicTo(34.8613f, 41.0f, 34.2857f, 40.4196f, 34.2857f, 39.7037f);
        this.f38641g.lineTo(34.2857f, 21.5556f);
        this.f38641g.close();
        this.f38641g.setFillType(Path.FillType.WINDING);
        this.f38640f.setStyle(Paint.Style.FILL);
        this.f38640f.setColor(-16777216);
        this.f37300a.add(this.f38640f);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38639e, this.f38638d);
        canvas.drawPath(this.f38641g, this.f38640f);
    }
}
