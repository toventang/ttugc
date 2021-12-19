package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ce */
public class C15658ce extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17924);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.0f, 10.5f);
        this.f37302c.cubicTo(5.51472f, 10.5f, 3.5f, 12.5147f, 3.5f, 15.0f);
        this.f37302c.lineTo(3.5f, 33.0f);
        this.f37302c.cubicTo(3.5f, 35.4853f, 5.51472f, 37.5f, 8.0f, 37.5f);
        this.f37302c.lineTo(30.0f, 37.5f);
        this.f37302c.cubicTo(32.4853f, 37.5f, 34.5f, 35.4853f, 34.5f, 33.0f);
        this.f37302c.lineTo(34.5f, 26.9457f);
        this.f37302c.lineTo(43.1177f, 33.2131f);
        this.f37302c.cubicTo(43.574f, 33.545f, 44.1779f, 33.5927f, 44.6807f, 33.3367f);
        this.f37302c.cubicTo(45.1834f, 33.0807f, 45.5f, 32.5642f, 45.5f, 32.0f);
        this.f37302c.lineTo(45.5f, 16.0f);
        this.f37302c.cubicTo(45.5f, 15.4358f, 45.1834f, 14.9193f, 44.6807f, 14.6633f);
        this.f37302c.cubicTo(44.1779f, 14.4073f, 43.574f, 14.4551f, 43.1177f, 14.7869f);
        this.f37302c.lineTo(34.5f, 21.0544f);
        this.f37302c.lineTo(34.5f, 15.0f);
        this.f37302c.cubicTo(34.5f, 12.5147f, 32.4853f, 10.5f, 30.0f, 10.5f);
        this.f37302c.lineTo(8.0f, 10.5f);
        this.f37302c.close();
        this.f37302c.moveTo(31.5f, 24.0001f);
        this.f37302c.lineTo(31.5f, 15.0f);
        this.f37302c.cubicTo(31.5f, 14.1716f, 30.8284f, 13.5f, 30.0f, 13.5f);
        this.f37302c.lineTo(8.0f, 13.5f);
        this.f37302c.cubicTo(7.17157f, 13.5f, 6.5f, 14.1716f, 6.5f, 15.0f);
        this.f37302c.lineTo(6.5f, 33.0f);
        this.f37302c.cubicTo(6.5f, 33.8284f, 7.17157f, 34.5f, 8.0f, 34.5f);
        this.f37302c.lineTo(30.0f, 34.5f);
        this.f37302c.cubicTo(30.8284f, 34.5f, 31.5f, 33.8284f, 31.5f, 33.0f);
        this.f37302c.lineTo(31.5f, 24.0001f);
        this.f37302c.close();
        this.f37302c.moveTo(42.5f, 29.0544f);
        this.f37302c.lineTo(35.5503f, 24.0001f);
        this.f37302c.lineTo(42.5f, 18.9457f);
        this.f37302c.lineTo(42.5f, 29.0544f);
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
