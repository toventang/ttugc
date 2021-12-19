package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fp */
public class C15750fp extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18016);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(32.5395f, 4.0f);
        this.f37302c.cubicTo(32.818f, 6.36773f, 31.8105f, 8.69873f, 30.3367f, 10.4125f);
        this.f37302c.cubicTo(28.7997f, 12.0988f, 26.3381f, 13.3901f, 23.9417f, 13.223f);
        this.f37302c.cubicTo(23.6296f, 10.9471f, 24.8426f, 8.52606f, 26.2018f, 7.04921f);
        this.f37302c.cubicTo(27.7388f, 5.37215f, 30.4058f, 4.08817f, 32.5395f, 4.0f);
        this.f37302c.close();
        this.f37302c.moveTo(40.3837f, 17.6472f);
        this.f37302c.cubicTo(40.1083f, 17.8003f, 35.6843f, 20.2608f, 35.7333f, 25.2724f);
        this.f37302c.cubicTo(35.7886f, 31.3304f, 41.4309f, 33.3307f, 41.5f, 33.3528f);
        this.f37302c.cubicTo(41.4664f, 33.4924f, 40.6169f, 36.2422f, 38.5011f, 39.0324f);
        this.f37302c.cubicTo(36.7329f, 41.4901f, 34.8798f, 43.8928f, 31.9402f, 43.9368f);
        this.f37302c.cubicTo(30.5423f, 43.9665f, 29.5985f, 43.5924f, 28.6151f, 43.2026f);
        this.f37302c.cubicTo(27.5889f, 42.7957f, 26.5195f, 42.3718f, 24.8459f, 42.3718f);
        this.f37302c.cubicTo(23.0723f, 42.3718f, 21.9556f, 42.8092f, 20.8786f, 43.2311f);
        this.f37302c.cubicTo(19.9474f, 43.5958f, 19.0459f, 43.9489f, 17.7752f, 43.9975f);
        this.f37302c.cubicTo(14.9739f, 44.0948f, 12.8343f, 41.3744f, 11.003f, 38.9387f);
        this.f37302c.cubicTo(7.34418f, 33.9681f, 4.49342f, 24.9289f, 8.31419f, 18.779f);
        this.f37302c.cubicTo(10.1653f, 15.7628f, 13.5436f, 13.8194f, 17.151f, 13.768f);
        this.f37302c.cubicTo(18.7401f, 13.7368f, 20.2645f, 14.3064f, 21.6007f, 14.8057f);
        this.f37302c.cubicTo(22.6216f, 15.1873f, 23.5327f, 15.5277f, 24.2789f, 15.5277f);
        this.f37302c.cubicTo(24.9355f, 15.5277f, 25.822f, 15.2004f, 26.8551f, 14.819f);
        this.f37302c.cubicTo(28.4827f, 14.218f, 30.4741f, 13.4828f, 32.5032f, 13.6817f);
        this.f37302c.cubicTo(33.8901f, 13.7184f, 37.8412f, 14.1905f, 40.3897f, 17.6438f);
        this.f37302c.lineTo(40.3837f, 17.6472f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-15329245);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
