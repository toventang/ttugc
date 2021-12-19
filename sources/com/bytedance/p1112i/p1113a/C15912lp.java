package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lp */
public class C15912lp extends AbstractC15287a {

    /* renamed from: d */
    Paint f38582d;

    /* renamed from: e */
    Path f38583e;

    static {
        Covode.recordClassIndex(18178);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(10.0f, 7.89474f);
        this.f37302c.cubicTo(10.0f, 7.40059f, 10.3918f, 7.0f, 10.875f, 7.0f);
        this.f37302c.lineTo(17.875f, 7.0f);
        this.f37302c.cubicTo(18.3582f, 7.0f, 18.75f, 7.40059f, 18.75f, 7.89474f);
        this.f37302c.lineTo(18.75f, 40.1053f);
        this.f37302c.cubicTo(18.75f, 40.5994f, 18.3582f, 41.0f, 17.875f, 41.0f);
        this.f37302c.lineTo(10.875f, 41.0f);
        this.f37302c.cubicTo(10.3918f, 41.0f, 10.0f, 40.5994f, 10.0f, 40.1053f);
        this.f37302c.lineTo(10.0f, 7.89474f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38582d = new Paint();
        Path path = new Path();
        this.f38583e = path;
        path.moveTo(29.25f, 7.89474f);
        this.f38583e.cubicTo(29.25f, 7.40059f, 29.6418f, 7.0f, 30.125f, 7.0f);
        this.f38583e.lineTo(37.125f, 7.0f);
        this.f38583e.cubicTo(37.6082f, 7.0f, 38.0f, 7.40059f, 38.0f, 7.89474f);
        this.f38583e.lineTo(38.0f, 40.1053f);
        this.f38583e.cubicTo(38.0f, 40.5994f, 37.6082f, 41.0f, 37.125f, 41.0f);
        this.f38583e.lineTo(30.125f, 41.0f);
        this.f38583e.cubicTo(29.6418f, 41.0f, 29.25f, 40.5994f, 29.25f, 40.1053f);
        this.f38583e.lineTo(29.25f, 7.89474f);
        this.f38583e.close();
        this.f38583e.setFillType(Path.FillType.WINDING);
        this.f38582d.setStyle(Paint.Style.FILL);
        this.f38582d.setColor(-16777216);
        this.f37300a.add(this.f38582d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38583e, this.f38582d);
    }
}
