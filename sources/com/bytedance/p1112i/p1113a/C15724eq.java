package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.eq */
public class C15724eq extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17990);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.0f, 11.0f);
        this.f37302c.cubicTo(6.0f, 8.79086f, 7.79086f, 7.0f, 10.0f, 7.0f);
        this.f37302c.lineTo(38.0f, 7.0f);
        this.f37302c.cubicTo(40.2092f, 7.0f, 42.0f, 8.79088f, 42.0f, 11.0f);
        this.f37302c.lineTo(42.0f, 32.0f);
        this.f37302c.cubicTo(42.0f, 34.2091f, 40.2092f, 36.0f, 38.0f, 36.0f);
        this.f37302c.lineTo(15.8284f, 36.0f);
        this.f37302c.lineTo(9.41421f, 42.4142f);
        this.f37302c.cubicTo(8.84222f, 42.9862f, 7.98198f, 43.1573f, 7.23463f, 42.8478f);
        this.f37302c.cubicTo(6.48728f, 42.5382f, 6.0f, 41.8089f, 6.0f, 41.0f);
        this.f37302c.lineTo(6.0f, 11.0f);
        this.f37302c.close();
        this.f37302c.moveTo(10.0f, 36.1716f);
        this.f37302c.lineTo(13.5858f, 32.5858f);
        this.f37302c.cubicTo(13.9609f, 32.2107f, 14.4696f, 32.0f, 15.0f, 32.0f);
        this.f37302c.lineTo(38.0f, 32.0f);
        this.f37302c.lineTo(38.0f, 11.0f);
        this.f37302c.lineTo(10.0f, 11.0f);
        this.f37302c.lineTo(10.0f, 36.1716f);
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
