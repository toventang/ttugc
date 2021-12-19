package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ot */
public class C15997ot extends AbstractC15287a {

    /* renamed from: d */
    Paint f38630d;

    /* renamed from: e */
    Path f38631e;

    static {
        Covode.recordClassIndex(18263);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(30.0471f, 17.1345f);
        this.f37302c.lineTo(30.0471f, 10.1458f);
        this.f37302c.cubicTo(30.0471f, 8.10314f, 28.9615f, 6.31516f, 27.3383f, 5.33223f);
        this.f37302c.cubicTo(25.7612f, 4.37726f, 23.9737f, 5.30972f, 23.2258f, 7.00002f);
        this.f37302c.lineTo(16.0f, 20.5f);
        this.f37302c.lineTo(16.0003f, 42.4998f);
        this.f37302c.cubicTo(16.0004f, 42.7759f, 16.2242f, 42.9998f, 16.5003f, 42.9998f);
        this.f37302c.lineTo(37.658f, 42.9998f);
        this.f37302c.cubicTo(39.5168f, 43.0209f, 41.1069f, 41.6631f, 41.3857f, 39.8171f);
        this.f37302c.lineTo(43.9578f, 21.9405f);
        this.f37302c.cubicTo(44.1219f, 20.8543f, 43.8029f, 19.7507f, 43.0852f, 18.9216f);
        this.f37302c.cubicTo(42.3676f, 18.0927f, 41.3237f, 17.622f, 40.2301f, 17.6345f);
        this.f37302c.lineTo(30.5471f, 17.6345f);
        this.f37302c.cubicTo(30.271f, 17.6345f, 30.0471f, 17.4106f, 30.0471f, 17.1345f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38630d = new Paint();
        Path path = new Path();
        this.f38631e = path;
        path.moveTo(12.4997f, 20.4331f);
        this.f38631e.cubicTo(12.7758f, 20.4331f, 12.9997f, 20.6569f, 12.9997f, 20.933f);
        this.f38631e.lineTo(13.0f, 42.4984f);
        this.f38631e.cubicTo(13.0f, 42.7745f, 12.7762f, 42.9983f, 12.5001f, 42.9984f);
        this.f38631e.lineTo(9.20904f, 42.9993f);
        this.f38631e.cubicTo(7.0928f, 43.0376f, 5.28371f, 41.4486f, 5.0f, 39.3022f);
        this.f38631e.lineTo(5.0f, 24.335f);
        this.f38631e.cubicTo(5.28371f, 22.1886f, 7.0928f, 20.3947f, 9.20904f, 20.4331f);
        this.f38631e.lineTo(12.4997f, 20.4331f);
        this.f38631e.close();
        this.f38631e.setFillType(Path.FillType.WINDING);
        this.f38630d.setStyle(Paint.Style.FILL);
        this.f38630d.setColor(-16777216);
        this.f37300a.add(this.f38630d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38631e, this.f38630d);
    }
}
