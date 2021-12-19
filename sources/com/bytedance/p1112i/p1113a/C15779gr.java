package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.gr */
public class C15779gr extends AbstractC15287a {

    /* renamed from: d */
    Paint f38381d;

    /* renamed from: e */
    Path f38382e;

    static {
        Covode.recordClassIndex(18045);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(48.0f, 24.0f);
        this.f37302c.cubicTo(48.0f, 37.2548f, 37.2548f, 48.0f, 24.0f, 48.0f);
        this.f37302c.cubicTo(10.7452f, 48.0f, 0.0f, 37.2548f, 0.0f, 24.0f);
        this.f37302c.cubicTo(0.0f, 10.7452f, 10.7452f, 0.0f, 24.0f, 0.0f);
        this.f37302c.cubicTo(37.2548f, 0.0f, 48.0f, 10.7452f, 48.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-65536);
        this.f38381d = new Paint();
        Path path = new Path();
        this.f38382e = path;
        path.moveTo(36.6137f, 14.6272f);
        this.f38382e.cubicTo(37.9483f, 14.973f, 38.9971f, 15.9879f, 39.3544f, 17.2794f);
        this.f38382e.cubicTo(40.0f, 19.6179f, 40.0f, 24.5f, 40.0f, 24.5f);
        this.f38382e.cubicTo(40.0f, 24.5f, 40.0f, 29.3821f, 39.3518f, 31.7206f);
        this.f38382e.cubicTo(38.9946f, 33.0121f, 37.9457f, 34.027f, 36.6111f, 34.3728f);
        this.f38382e.cubicTo(34.1945f, 35.0f, 24.5f, 35.0f, 24.5f, 35.0f);
        this.f38382e.cubicTo(24.5f, 35.0f, 14.8055f, 35.0f, 12.3889f, 34.3728f);
        this.f38382e.cubicTo(11.0542f, 34.027f, 10.0054f, 33.0121f, 9.64817f, 31.7206f);
        this.f38382e.cubicTo(9.0f, 29.3821f, 9.0f, 24.5f, 9.0f, 24.5f);
        this.f38382e.cubicTo(9.0f, 24.5f, 9.0f, 19.6179f, 9.64817f, 17.2794f);
        this.f38382e.cubicTo(10.0054f, 15.9879f, 11.0542f, 14.973f, 12.3889f, 14.6272f);
        this.f38382e.cubicTo(14.8055f, 14.0f, 24.5f, 14.0f, 24.5f, 14.0f);
        this.f38382e.cubicTo(24.5f, 14.0f, 34.1945f, 14.0f, 36.6137f, 14.6272f);
        this.f38382e.close();
        this.f38382e.moveTo(29.4558f, 24.5f);
        this.f38382e.lineTo(21.3995f, 28.9993f);
        this.f38382e.lineTo(21.3995f, 20.0007f);
        this.f38382e.lineTo(29.4558f, 24.5f);
        this.f38382e.close();
        this.f38382e.setFillType(Path.FillType.EVEN_ODD);
        this.f38381d.setStyle(Paint.Style.FILL);
        this.f38381d.setColor(-1);
        this.f37300a.add(this.f38381d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38382e, this.f38381d);
    }
}
