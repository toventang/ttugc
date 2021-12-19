package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dv */
public class C15702dv extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17968);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 6.0f);
        this.f37302c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(28.0553f, 42.0f, 31.7921f, 40.6614f, 34.8006f, 38.401f);
        this.f37302c.lineTo(35.6001f, 37.8003f);
        this.f37302c.cubicTo(36.0416f, 37.4686f, 36.6685f, 37.5576f, 37.0003f, 37.9992f);
        this.f37302c.lineTo(38.2016f, 39.5981f);
        this.f37302c.cubicTo(38.5334f, 40.0397f, 38.4443f, 40.6666f, 38.0028f, 40.9983f);
        this.f37302c.lineTo(37.2033f, 41.599f);
        this.f37302c.cubicTo(33.5258f, 44.3619f, 28.9513f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f37302c.lineTo(46.0f, 26.0f);
        this.f37302c.cubicTo(46.0f, 30.4843f, 42.1949f, 34.0f, 37.8438f, 34.0f);
        this.f37302c.cubicTo(35.1966f, 34.0f, 32.8496f, 32.7142f, 31.3935f, 30.733f);
        this.f37302c.cubicTo(29.5649f, 32.7403f, 26.9303f, 34.0f, 24.0f, 34.0f);
        this.f37302c.cubicTo(18.4772f, 34.0f, 14.0f, 29.5228f, 14.0f, 24.0f);
        this.f37302c.cubicTo(14.0f, 18.4772f, 18.4772f, 14.0f, 24.0f, 14.0f);
        this.f37302c.cubicTo(29.5228f, 14.0f, 34.0f, 18.4772f, 34.0f, 24.0f);
        this.f37302c.cubicTo(34.0f, 24.5814f, 33.9502f, 25.1528f, 33.8541f, 25.7096f);
        this.f37302c.cubicTo(33.8473f, 25.8052f, 33.8438f, 25.902f, 33.8438f, 26.0f);
        this.f37302c.cubicTo(33.8438f, 28.2091f, 35.6347f, 30.0f, 37.8438f, 30.0f);
        this.f37302c.cubicTo(40.1201f, 30.0f, 42.0f, 28.1431f, 42.0f, 26.0f);
        this.f37302c.lineTo(42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 18.0f);
        this.f37302c.cubicTo(20.6863f, 18.0f, 18.0f, 20.6863f, 18.0f, 24.0f);
        this.f37302c.cubicTo(18.0f, 27.3137f, 20.6863f, 30.0f, 24.0f, 30.0f);
        this.f37302c.cubicTo(26.9395f, 30.0f, 29.3891f, 27.8841f, 29.9013f, 25.0918f);
        this.f37302c.cubicTo(29.9659f, 24.7392f, 30.0f, 24.3744f, 30.0f, 24.0f);
        this.f37302c.cubicTo(30.0f, 20.6863f, 27.3137f, 18.0f, 24.0f, 18.0f);
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
