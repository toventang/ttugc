package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hq */
public class C15805hq extends AbstractC15287a {

    /* renamed from: d */
    Paint f38409d;

    /* renamed from: e */
    Path f38410e;

    static {
        Covode.recordClassIndex(18071);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(26.5001f, 24.0f);
        this.f37302c.cubicTo(27.8808f, 24.0f, 29.0001f, 22.8807f, 29.0001f, 21.5f);
        this.f37302c.cubicTo(29.0001f, 20.1193f, 27.8808f, 19.0f, 26.5001f, 19.0f);
        this.f37302c.cubicTo(25.1194f, 19.0f, 24.0001f, 20.1193f, 24.0001f, 21.5f);
        this.f37302c.cubicTo(24.0001f, 22.8807f, 25.1194f, 24.0f, 26.5001f, 24.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38409d = new Paint();
        Path path = new Path();
        this.f38410e = path;
        path.moveTo(24.0002f, 10.0f);
        this.f38410e.cubicTo(11.2691f, 10.0f, 4.86926f, 18.8638f, 2.78564f, 22.4857f);
        this.f38410e.cubicTo(2.23975f, 23.4346f, 2.23975f, 24.5654f, 2.78564f, 25.5143f);
        this.f38410e.cubicTo(4.86926f, 29.1362f, 11.2691f, 38.0f, 24.0002f, 38.0f);
        this.f38410e.cubicTo(36.7313f, 38.0f, 43.1311f, 29.1362f, 45.2148f, 25.5143f);
        this.f38410e.cubicTo(45.7607f, 24.5654f, 45.7607f, 23.4346f, 45.2148f, 22.4857f);
        this.f38410e.cubicTo(43.1311f, 18.8638f, 36.7313f, 10.0f, 24.0002f, 10.0f);
        this.f38410e.close();
        this.f38410e.moveTo(32.0001f, 24.0f);
        this.f38410e.cubicTo(32.0001f, 28.4183f, 28.4184f, 32.0f, 24.0001f, 32.0f);
        this.f38410e.cubicTo(19.5818f, 32.0f, 16.0001f, 28.4183f, 16.0001f, 24.0f);
        this.f38410e.cubicTo(16.0001f, 19.5817f, 19.5818f, 16.0f, 24.0001f, 16.0f);
        this.f38410e.cubicTo(28.4184f, 16.0f, 32.0001f, 19.5817f, 32.0001f, 24.0f);
        this.f38410e.close();
        this.f38410e.setFillType(Path.FillType.EVEN_ODD);
        this.f38409d.setStyle(Paint.Style.FILL);
        this.f38409d.setColor(-16777216);
        this.f37300a.add(this.f38409d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38410e, this.f38409d);
    }
}
