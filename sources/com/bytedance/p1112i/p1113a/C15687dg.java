package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dg */
public class C15687dg extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17953);
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
        this.f37302c.moveTo(29.2188f, 14.2227f);
        this.f37302c.cubicTo(28.9125f, 13.7631f, 28.2916f, 13.6389f, 27.8321f, 13.9453f);
        this.f37302c.lineTo(26.168f, 15.0547f);
        this.f37302c.cubicTo(25.7084f, 15.3611f, 25.5843f, 15.9819f, 25.8906f, 16.4415f);
        this.f37302c.lineTo(27.263f, 18.5f);
        this.f37302c.lineTo(16.0f, 18.5f);
        this.f37302c.cubicTo(15.4477f, 18.5f, 15.0f, 18.9477f, 15.0f, 19.5f);
        this.f37302c.lineTo(15.0f, 21.5f);
        this.f37302c.cubicTo(15.0f, 22.0523f, 15.4477f, 22.5f, 16.0f, 22.5f);
        this.f37302c.lineTo(31.0f, 22.5f);
        this.f37302c.cubicTo(31.7376f, 22.5f, 32.4153f, 22.094f, 32.7634f, 21.4437f);
        this.f37302c.cubicTo(33.1114f, 20.7934f, 33.0732f, 20.0043f, 32.6641f, 19.3906f);
        this.f37302c.lineTo(29.2188f, 14.2227f);
        this.f37302c.close();
        this.f37302c.moveTo(17.0f, 25.5f);
        this.f37302c.cubicTo(16.2624f, 25.5f, 15.5847f, 25.906f, 15.2367f, 26.5563f);
        this.f37302c.cubicTo(14.8886f, 27.2066f, 14.9268f, 27.9957f, 15.3359f, 28.6094f);
        this.f37302c.lineTo(18.7812f, 33.7774f);
        this.f37302c.cubicTo(19.0876f, 34.2369f, 19.7084f, 34.3611f, 20.168f, 34.0547f);
        this.f37302c.lineTo(21.8321f, 32.9453f);
        this.f37302c.cubicTo(22.2916f, 32.6389f, 22.4158f, 32.0181f, 22.1094f, 31.5585f);
        this.f37302c.lineTo(20.737f, 29.5f);
        this.f37302c.lineTo(32.0f, 29.5f);
        this.f37302c.cubicTo(32.5523f, 29.5f, 33.0f, 29.0523f, 33.0f, 28.5f);
        this.f37302c.lineTo(33.0f, 26.5f);
        this.f37302c.cubicTo(33.0f, 25.9477f, 32.5523f, 25.5f, 32.0f, 25.5f);
        this.f37302c.lineTo(17.0f, 25.5f);
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
