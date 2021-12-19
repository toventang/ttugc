package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ow */
public class C16000ow extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18266);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 46.0f);
        this.f37302c.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.f37302c.close();
        this.f37302c.moveTo(14.4563f, 22.0891f);
        this.f37302c.cubicTo(14.8468f, 21.6986f, 15.48f, 21.6986f, 15.8705f, 22.0891f);
        this.f37302c.lineTo(20.5632f, 26.7817f);
        this.f37302c.lineTo(32.0054f, 15.3395f);
        this.f37302c.cubicTo(32.396f, 14.949f, 33.0291f, 14.949f, 33.4196f, 15.3395f);
        this.f37302c.lineTo(36.0552f, 17.9751f);
        this.f37302c.cubicTo(36.4457f, 18.3656f, 36.4457f, 18.9987f, 36.0552f, 19.3893f);
        this.f37302c.lineTo(24.6129f, 30.8315f);
        this.f37302c.lineTo(21.9774f, 33.4671f);
        this.f37302c.cubicTo(21.1963f, 34.2482f, 19.93f, 34.2482f, 19.1489f, 33.4671f);
        this.f37302c.lineTo(16.5134f, 30.8315f);
        this.f37302c.lineTo(11.8207f, 26.1389f);
        this.f37302c.cubicTo(11.4302f, 25.7484f, 11.4302f, 25.1152f, 11.8207f, 24.7247f);
        this.f37302c.lineTo(14.4563f, 22.0891f);
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
