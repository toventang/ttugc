package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dt */
public class C15700dt extends AbstractC15287a {

    /* renamed from: d */
    Paint f38212d;

    /* renamed from: e */
    Path f38213e;

    static {
        Covode.recordClassIndex(17966);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(22.0f, 6.0f);
        this.f37302c.cubicTo(22.0f, 5.44772f, 22.4477f, 5.0f, 23.0f, 5.0f);
        this.f37302c.lineTo(41.0f, 5.0f);
        this.f37302c.cubicTo(41.5304f, 5.0f, 42.0391f, 5.21071f, 42.4142f, 5.58579f);
        this.f37302c.cubicTo(42.7893f, 5.96086f, 43.0f, 6.46957f, 43.0f, 7.0f);
        this.f37302c.lineTo(43.0f, 25.0f);
        this.f37302c.cubicTo(43.0f, 25.5523f, 42.5523f, 26.0f, 42.0f, 26.0f);
        this.f37302c.lineTo(40.0f, 26.0f);
        this.f37302c.cubicTo(39.4477f, 26.0f, 39.0f, 25.5523f, 39.0f, 25.0f);
        this.f37302c.lineTo(39.0f, 11.8284f);
        this.f37302c.lineTo(28.1213f, 22.7071f);
        this.f37302c.cubicTo(27.7308f, 23.0976f, 27.0976f, 23.0976f, 26.7071f, 22.7071f);
        this.f37302c.lineTo(25.2929f, 21.2929f);
        this.f37302c.cubicTo(24.9024f, 20.9024f, 24.9024f, 20.2692f, 25.2929f, 19.8787f);
        this.f37302c.lineTo(36.1716f, 9.0f);
        this.f37302c.lineTo(23.0f, 9.0f);
        this.f37302c.cubicTo(22.4477f, 9.0f, 22.0f, 8.55228f, 22.0f, 8.0f);
        this.f37302c.lineTo(22.0f, 6.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38212d = new Paint();
        Path path = new Path();
        this.f38213e = path;
        path.moveTo(26.0f, 42.0f);
        this.f38213e.cubicTo(26.0f, 42.5523f, 25.5523f, 43.0f, 25.0f, 43.0f);
        this.f38213e.lineTo(7.0f, 43.0f);
        this.f38213e.cubicTo(6.46957f, 43.0f, 5.96086f, 42.7893f, 5.58579f, 42.4142f);
        this.f38213e.cubicTo(5.21072f, 42.0391f, 5.0f, 41.5304f, 5.0f, 41.0f);
        this.f38213e.lineTo(5.0f, 23.0f);
        this.f38213e.cubicTo(5.0f, 22.4477f, 5.44772f, 22.0f, 6.0f, 22.0f);
        this.f38213e.lineTo(8.0f, 22.0f);
        this.f38213e.cubicTo(8.55228f, 22.0f, 9.0f, 22.4477f, 9.0f, 23.0f);
        this.f38213e.lineTo(9.0f, 36.1716f);
        this.f38213e.lineTo(19.8787f, 25.2929f);
        this.f38213e.cubicTo(20.2692f, 24.9024f, 20.9024f, 24.9024f, 21.2929f, 25.2929f);
        this.f38213e.lineTo(22.7071f, 26.7071f);
        this.f38213e.cubicTo(23.0976f, 27.0976f, 23.0976f, 27.7308f, 22.7071f, 28.1213f);
        this.f38213e.lineTo(11.8284f, 39.0f);
        this.f38213e.lineTo(25.0f, 39.0f);
        this.f38213e.cubicTo(25.5523f, 39.0f, 26.0f, 39.4477f, 26.0f, 40.0f);
        this.f38213e.lineTo(26.0f, 42.0f);
        this.f38213e.close();
        this.f38213e.setFillType(Path.FillType.EVEN_ODD);
        this.f38212d.setStyle(Paint.Style.FILL);
        this.f38212d.setColor(-16777216);
        this.f37300a.add(this.f38212d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38213e, this.f38212d);
    }
}
