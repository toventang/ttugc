package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.eg */
public class C15714eg extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17980);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(46.0f, 24.0f);
        this.f37302c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f37302c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f37302c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(35.2353f, 38.0638f);
        this.f37302c.cubicTo(32.156f, 40.5271f, 28.25f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 19.75f, 7.47293f, 15.844f, 9.93618f, 12.7647f);
        this.f37302c.lineTo(35.2353f, 38.0638f);
        this.f37302c.close();
        this.f37302c.moveTo(38.0638f, 35.2354f);
        this.f37302c.lineTo(12.7646f, 9.93623f);
        this.f37302c.cubicTo(15.8439f, 7.47296f, 19.75f, 6.0f, 24.0f, 6.0f);
        this.f37302c.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 28.25f, 40.527f, 32.1561f, 38.0638f, 35.2354f);
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
