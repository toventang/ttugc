package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lo */
public class C15911lo extends AbstractC15287a {

    /* renamed from: d */
    Paint f38580d;

    /* renamed from: e */
    Path f38581e;

    static {
        Covode.recordClassIndex(18177);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.0f, 6.0f);
        this.f37302c.cubicTo(8.0f, 5.44771f, 8.44772f, 5.0f, 9.0f, 5.0f);
        this.f37302c.lineTo(17.0f, 5.0f);
        this.f37302c.cubicTo(17.5523f, 5.0f, 18.0f, 5.44772f, 18.0f, 6.0f);
        this.f37302c.lineTo(18.0f, 42.0f);
        this.f37302c.cubicTo(18.0f, 42.5523f, 17.5523f, 43.0f, 17.0f, 43.0f);
        this.f37302c.lineTo(9.0f, 43.0f);
        this.f37302c.cubicTo(8.44772f, 43.0f, 8.0f, 42.5523f, 8.0f, 42.0f);
        this.f37302c.lineTo(8.0f, 6.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38580d = new Paint();
        Path path = new Path();
        this.f38581e = path;
        path.moveTo(30.0f, 6.0f);
        this.f38581e.cubicTo(30.0f, 5.44771f, 30.4477f, 5.0f, 31.0f, 5.0f);
        this.f38581e.lineTo(39.0f, 5.0f);
        this.f38581e.cubicTo(39.5523f, 5.0f, 40.0f, 5.44772f, 40.0f, 6.0f);
        this.f38581e.lineTo(40.0f, 42.0f);
        this.f38581e.cubicTo(40.0f, 42.5523f, 39.5523f, 43.0f, 39.0f, 43.0f);
        this.f38581e.lineTo(31.0f, 43.0f);
        this.f38581e.cubicTo(30.4477f, 43.0f, 30.0f, 42.5523f, 30.0f, 42.0f);
        this.f38581e.lineTo(30.0f, 6.0f);
        this.f38581e.close();
        this.f38581e.setFillType(Path.FillType.WINDING);
        this.f38580d.setStyle(Paint.Style.FILL);
        this.f38580d.setColor(-16777216);
        this.f37300a.add(this.f38580d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38581e, this.f38580d);
    }
}
