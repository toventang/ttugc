package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ds */
public class C15699ds extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17965);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(23.2379f, 4.89642f);
        this.f37302c.lineTo(8.40039f, 22.3524f);
        this.f37302c.cubicTo(7.84832f, 23.0019f, 8.30991f, 24.0f, 9.16233f, 24.0f);
        this.f37302c.lineTo(16.9999f, 24.0f);
        this.f37302c.lineTo(16.9999f, 34.0f);
        this.f37302c.cubicTo(16.9999f, 34.5523f, 17.4476f, 35.0f, 17.9999f, 35.0f);
        this.f37302c.lineTo(29.9999f, 35.0f);
        this.f37302c.cubicTo(30.5522f, 35.0f, 30.9999f, 34.5523f, 30.9999f, 34.0f);
        this.f37302c.lineTo(30.9999f, 24.0f);
        this.f37302c.lineTo(38.8374f, 24.0f);
        this.f37302c.cubicTo(39.6899f, 24.0f, 40.1514f, 23.0019f, 39.5994f, 22.3524f);
        this.f37302c.lineTo(24.7618f, 4.89642f);
        this.f37302c.cubicTo(24.3625f, 4.42662f, 23.6373f, 4.42662f, 23.2379f, 4.89642f);
        this.f37302c.close();
        this.f37302c.moveTo(17.9999f, 38.0f);
        this.f37302c.cubicTo(17.4476f, 38.0f, 16.9999f, 38.4477f, 16.9999f, 39.0f);
        this.f37302c.lineTo(16.9999f, 41.0f);
        this.f37302c.cubicTo(16.9999f, 41.5523f, 17.4476f, 42.0f, 17.9999f, 42.0f);
        this.f37302c.lineTo(29.9999f, 42.0f);
        this.f37302c.cubicTo(30.5522f, 42.0f, 30.9999f, 41.5523f, 30.9999f, 41.0f);
        this.f37302c.lineTo(30.9999f, 39.0f);
        this.f37302c.cubicTo(30.9999f, 38.4477f, 30.5522f, 38.0f, 29.9999f, 38.0f);
        this.f37302c.lineTo(17.9999f, 38.0f);
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
