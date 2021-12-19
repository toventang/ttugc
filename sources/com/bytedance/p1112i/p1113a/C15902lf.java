package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lf */
public class C15902lf extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18168);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.0f, 23.0f);
        this.f37302c.cubicTo(6.0f, 22.4477f, 6.44772f, 22.0f, 7.0f, 22.0f);
        this.f37302c.lineTo(41.0f, 22.0f);
        this.f37302c.cubicTo(41.5523f, 22.0f, 42.0f, 22.4477f, 42.0f, 23.0f);
        this.f37302c.lineTo(42.0f, 25.0f);
        this.f37302c.cubicTo(42.0f, 25.5523f, 41.5523f, 26.0f, 41.0f, 26.0f);
        this.f37302c.lineTo(7.0f, 26.0f);
        this.f37302c.cubicTo(6.44772f, 26.0f, 6.0f, 25.5523f, 6.0f, 25.0f);
        this.f37302c.lineTo(6.0f, 23.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
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
