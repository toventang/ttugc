package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ov */
public class C15999ov extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18265);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 2.0f);
        this.f37302c.cubicTo(17.9254f, 2.0f, 12.4227f, 4.46462f, 8.44365f, 8.44365f);
        this.f37302c.cubicTo(4.46462f, 12.4227f, 2.0f, 17.9254f, 2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 30.0746f, 4.46462f, 35.5773f, 8.44365f, 39.5564f);
        this.f37302c.cubicTo(12.4227f, 43.5354f, 17.9254f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(30.0746f, 46.0f, 35.5773f, 43.5354f, 39.5564f, 39.5564f);
        this.f37302c.cubicTo(43.5354f, 35.5773f, 46.0f, 30.0746f, 46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 17.9254f, 43.5354f, 12.4227f, 39.5564f, 8.44365f);
        this.f37302c.cubicTo(35.5773f, 4.46462f, 30.0746f, 2.0f, 24.0f, 2.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.2721f, 11.2721f);
        this.f37302c.cubicTo(14.5316f, 8.01253f, 19.0289f, 6.0f, 24.0f, 6.0f);
        this.f37302c.cubicTo(28.9711f, 6.0f, 33.4684f, 8.01253f, 36.7279f, 11.2721f);
        this.f37302c.cubicTo(39.9875f, 14.5316f, 42.0f, 19.0289f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 28.9711f, 39.9875f, 33.4684f, 36.7279f, 36.7279f);
        this.f37302c.cubicTo(33.4684f, 39.9875f, 28.9711f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(19.0289f, 42.0f, 14.5316f, 39.9875f, 11.2721f, 36.7279f);
        this.f37302c.cubicTo(8.01253f, 33.4684f, 6.0f, 28.9711f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 19.0289f, 8.01253f, 14.5316f, 11.2721f, 11.2721f);
        this.f37302c.close();
        this.f37302c.moveTo(32.8471f, 20.145f);
        this.f37302c.cubicTo(33.051f, 19.9386f, 33.051f, 19.6039f, 32.8471f, 19.3975f);
        this.f37302c.lineTo(30.6326f, 17.1548f);
        this.f37302c.cubicTo(30.4288f, 16.9484f, 30.0983f, 16.9484f, 29.8945f, 17.1548f);
        this.f37302c.lineTo(21.9122f, 25.2386f);
        this.f37302c.lineTo(18.1055f, 21.3836f);
        this.f37302c.cubicTo(17.9017f, 21.1772f, 17.5712f, 21.1772f, 17.3674f, 21.3836f);
        this.f37302c.lineTo(15.1529f, 23.6262f);
        this.f37302c.cubicTo(14.949f, 23.8327f, 14.949f, 24.1673f, 15.1529f, 24.3738f);
        this.f37302c.lineTo(21.5431f, 30.8452f);
        this.f37302c.cubicTo(21.7469f, 31.0516f, 22.0774f, 31.0516f, 22.2812f, 30.8452f);
        this.f37302c.lineTo(32.8471f, 20.145f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
