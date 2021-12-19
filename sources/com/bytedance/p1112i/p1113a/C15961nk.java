package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.nk */
public class C15961nk extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18227);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(25.0f, 10.8685f);
        this.f37302c.cubicTo(25.0f, 8.47242f, 22.3296f, 7.04325f, 20.3359f, 8.37236f);
        this.f37302c.lineTo(10.3944f, 15.0f);
        this.f37302c.lineTo(6.0f, 15.0f);
        this.f37302c.cubicTo(4.34315f, 15.0f, 3.0f, 16.3431f, 3.0f, 18.0f);
        this.f37302c.lineTo(3.0f, 30.0f);
        this.f37302c.cubicTo(3.0f, 31.6568f, 4.34314f, 33.0f, 6.0f, 33.0f);
        this.f37302c.lineTo(10.3944f, 33.0f);
        this.f37302c.lineTo(20.3359f, 39.6276f);
        this.f37302c.cubicTo(22.3296f, 40.9567f, 25.0f, 39.5276f, 25.0f, 37.1315f);
        this.f37302c.lineTo(25.0f, 10.8685f);
        this.f37302c.close();
        this.f37302c.moveTo(29.2929f, 18.1213f);
        this.f37302c.lineTo(35.1716f, 24.0f);
        this.f37302c.lineTo(29.2929f, 29.8787f);
        this.f37302c.cubicTo(28.9024f, 30.2692f, 28.9024f, 30.9024f, 29.2929f, 31.2929f);
        this.f37302c.lineTo(30.7071f, 32.7071f);
        this.f37302c.cubicTo(31.0976f, 33.0976f, 31.7308f, 33.0976f, 32.1213f, 32.7071f);
        this.f37302c.lineTo(38.0f, 26.8284f);
        this.f37302c.lineTo(43.8787f, 32.7071f);
        this.f37302c.cubicTo(44.2692f, 33.0976f, 44.9024f, 33.0976f, 45.2929f, 32.7071f);
        this.f37302c.lineTo(46.7071f, 31.2929f);
        this.f37302c.cubicTo(47.0976f, 30.9024f, 47.0976f, 30.2692f, 46.7071f, 29.8787f);
        this.f37302c.lineTo(40.8284f, 24.0f);
        this.f37302c.lineTo(46.7071f, 18.1213f);
        this.f37302c.cubicTo(47.0976f, 17.7308f, 47.0976f, 17.0976f, 46.7071f, 16.7071f);
        this.f37302c.lineTo(45.2929f, 15.2929f);
        this.f37302c.cubicTo(44.9024f, 14.9024f, 44.2692f, 14.9024f, 43.8787f, 15.2929f);
        this.f37302c.lineTo(38.0f, 21.1716f);
        this.f37302c.lineTo(32.1213f, 15.2929f);
        this.f37302c.cubicTo(31.7308f, 14.9024f, 31.0976f, 14.9024f, 30.7071f, 15.2929f);
        this.f37302c.lineTo(29.2929f, 16.7071f);
        this.f37302c.cubicTo(28.9024f, 17.0976f, 28.9024f, 17.7308f, 29.2929f, 18.1213f);
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
