package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dc */
public class C15683dc extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17949);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.9999f, 31.7795f);
        this.f37302c.lineTo(21.9999f, 4.0f);
        this.f37302c.cubicTo(21.9999f, 3.44772f, 22.4477f, 3.0f, 22.9999f, 3.0f);
        this.f37302c.lineTo(24.9999f, 3.0f);
        this.f37302c.cubicTo(25.5522f, 3.0f, 25.9999f, 3.44771f, 25.9999f, 4.0f);
        this.f37302c.lineTo(25.9999f, 31.7795f);
        this.f37302c.lineTo(38.4595f, 21.5853f);
        this.f37302c.cubicTo(38.8869f, 21.2356f, 39.517f, 21.2986f, 39.8667f, 21.726f);
        this.f37302c.lineTo(41.1332f, 23.274f);
        this.f37302c.cubicTo(41.4829f, 23.7014f, 41.4199f, 24.3314f, 40.9925f, 24.6812f);
        this.f37302c.lineTo(25.2664f, 37.5479f);
        this.f37302c.cubicTo(24.5297f, 38.1507f, 23.4702f, 38.1507f, 22.7335f, 37.5479f);
        this.f37302c.lineTo(7.00742f, 24.6812f);
        this.f37302c.cubicTo(6.57997f, 24.3314f, 6.51697f, 23.7014f, 6.8667f, 23.274f);
        this.f37302c.lineTo(8.13317f, 21.726f);
        this.f37302c.cubicTo(8.4829f, 21.2986f, 9.11292f, 21.2356f, 9.54037f, 21.5853f);
        this.f37302c.lineTo(21.9999f, 31.7795f);
        this.f37302c.close();
        this.f37302c.moveTo(37.9999f, 41.0f);
        this.f37302c.cubicTo(38.5522f, 41.0f, 38.9999f, 41.4477f, 38.9999f, 42.0f);
        this.f37302c.lineTo(38.9999f, 44.0f);
        this.f37302c.cubicTo(38.9999f, 44.5523f, 38.5522f, 45.0f, 37.9999f, 45.0f);
        this.f37302c.lineTo(9.99994f, 45.0f);
        this.f37302c.cubicTo(9.44765f, 45.0f, 8.99994f, 44.5523f, 8.99994f, 44.0f);
        this.f37302c.lineTo(8.99994f, 42.0f);
        this.f37302c.cubicTo(8.99994f, 41.4477f, 9.44765f, 41.0f, 9.99994f, 41.0f);
        this.f37302c.lineTo(37.9999f, 41.0f);
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
