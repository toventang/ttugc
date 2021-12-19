package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.it */
public class C15835it extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18101);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.66022f, 8.55074f);
        this.f37302c.cubicTo(11.4597f, 3.71786f, 19.0168f, 3.74482f, 24.0f, 9.08441f);
        this.f37302c.cubicTo(28.9832f, 3.74482f, 36.5403f, 3.71786f, 41.3398f, 8.55074f);
        this.f37302c.cubicTo(46.2201f, 13.465f, 46.2201f, 21.4262f, 41.3398f, 26.3404f);
        this.f37302c.lineTo(25.3553f, 42.436f);
        this.f37302c.cubicTo(24.9969f, 42.797f, 24.509f, 43.0f, 24.0f, 43.0f);
        this.f37302c.cubicTo(23.491f, 43.0f, 23.0031f, 42.797f, 22.6447f, 42.436f);
        this.f37302c.lineTo(6.66022f, 26.3404f);
        this.f37302c.cubicTo(1.77993f, 21.4262f, 1.77993f, 13.465f, 6.66022f, 8.55074f);
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
