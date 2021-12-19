package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.gt */
public class C15781gt extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18047);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 14.0589f, 14.0589f, 6.0f, 24.0f, 6.0f);
        this.f37302c.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 33.9411f, 33.9411f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 2.0f);
        this.f37302c.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.f37302c.close();
        this.f37302c.moveTo(18.0f, 24.0f);
        this.f37302c.cubicTo(18.0f, 20.6863f, 20.6863f, 18.0f, 24.0f, 18.0f);
        this.f37302c.cubicTo(25.5352f, 18.0f, 26.9353f, 18.5751f, 27.9979f, 19.5257f);
        this.f37302c.cubicTo(28.4096f, 19.894f, 29.0342f, 19.9709f, 29.4651f, 19.6255f);
        this.f37302c.lineTo(31.0256f, 18.3745f);
        this.f37302c.cubicTo(31.4565f, 18.0291f, 31.5291f, 17.3957f, 31.1425f, 17.0012f);
        this.f37302c.cubicTo(29.3295f, 15.1515f, 26.7987f, 14.0f, 24.0f, 14.0f);
        this.f37302c.cubicTo(18.4772f, 14.0f, 14.0f, 18.4772f, 14.0f, 24.0f);
        this.f37302c.cubicTo(14.0f, 29.5228f, 18.4772f, 34.0f, 24.0f, 34.0f);
        this.f37302c.cubicTo(26.7987f, 34.0f, 29.3295f, 32.8485f, 31.1426f, 30.9988f);
        this.f37302c.cubicTo(31.5291f, 30.6043f, 31.4565f, 29.9709f, 31.0256f, 29.6255f);
        this.f37302c.lineTo(29.4651f, 28.3745f);
        this.f37302c.cubicTo(29.0342f, 28.0291f, 28.4096f, 28.106f, 27.9979f, 28.4743f);
        this.f37302c.cubicTo(26.9353f, 29.4249f, 25.5352f, 30.0f, 24.0f, 30.0f);
        this.f37302c.cubicTo(20.6863f, 30.0f, 18.0f, 27.3137f, 18.0f, 24.0f);
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
