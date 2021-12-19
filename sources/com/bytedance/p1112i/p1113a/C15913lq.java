package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lq */
public class C15913lq extends AbstractC15287a {

    /* renamed from: d */
    Paint f38584d;

    /* renamed from: e */
    Path f38585e;

    static {
        Covode.recordClassIndex(18179);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(26.5858f, 5.08579f);
        this.f37302c.cubicTo(27.3479f, 4.32371f, 28.5767f, 4.30253f, 29.3646f, 5.03789f);
        this.f37302c.lineTo(36.8646f, 12.0379f);
        this.f37302c.cubicTo(37.2612f, 12.408f, 37.4904f, 12.9232f, 37.4997f, 13.4655f);
        this.f37302c.cubicTo(37.5091f, 14.0078f, 37.2977f, 14.5307f, 36.9142f, 14.9142f);
        this.f37302c.lineTo(16.9142f, 34.9142f);
        this.f37302c.cubicTo(16.5391f, 35.2893f, 16.0304f, 35.5f, 15.5f, 35.5f);
        this.f37302c.lineTo(8.5f, 35.5f);
        this.f37302c.cubicTo(7.39543f, 35.5f, 6.5f, 34.6046f, 6.5f, 33.5f);
        this.f37302c.lineTo(6.5f, 26.0f);
        this.f37302c.cubicTo(6.5f, 25.4696f, 6.71071f, 24.9609f, 7.08579f, 24.5858f);
        this.f37302c.lineTo(26.5858f, 5.08579f);
        this.f37302c.close();
        this.f37302c.moveTo(28.0479f, 9.2805f);
        this.f37302c.lineTo(10.5f, 26.8284f);
        this.f37302c.lineTo(10.5f, 31.5f);
        this.f37302c.lineTo(14.6716f, 31.5f);
        this.f37302c.lineTo(32.622f, 13.5496f);
        this.f37302c.lineTo(28.0479f, 9.2805f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38584d = new Paint();
        Path path = new Path();
        this.f38585e = path;
        path.moveTo(7.0f, 41.0f);
        this.f38585e.cubicTo(7.0f, 40.4477f, 7.44772f, 40.0f, 8.0f, 40.0f);
        this.f38585e.lineTo(41.0f, 40.0f);
        this.f38585e.cubicTo(41.5523f, 40.0f, 42.0f, 40.4477f, 42.0f, 41.0f);
        this.f38585e.lineTo(42.0f, 43.0f);
        this.f38585e.cubicTo(42.0f, 43.5523f, 41.5523f, 44.0f, 41.0f, 44.0f);
        this.f38585e.lineTo(8.0f, 44.0f);
        this.f38585e.cubicTo(7.44772f, 44.0f, 7.0f, 43.5523f, 7.0f, 43.0f);
        this.f38585e.lineTo(7.0f, 41.0f);
        this.f38585e.close();
        this.f38585e.setFillType(Path.FillType.WINDING);
        this.f38584d.setStyle(Paint.Style.FILL);
        this.f38584d.setColor(-16777216);
        this.f37300a.add(this.f38584d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38585e, this.f38584d);
    }
}
