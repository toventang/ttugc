package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.es */
public class C15726es extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17992);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.22419f, 4.0f);
        this.f37302c.cubicTo(6.48528f, 4.0f, 5.07434f, 5.40669f, 5.06976f, 7.14492f);
        this.f37302c.lineTo(5.00001f, 33.6319f);
        this.f37302c.cubicTo(4.99542f, 35.3766f, 6.40905f, 36.7934f, 8.15444f, 36.7934f);
        this.f37302c.lineTo(17.4249f, 36.7934f);
        this.f37302c.lineTo(21.5586f, 41.8436f);
        this.f37302c.cubicTo(22.8208f, 43.3855f, 25.1793f, 43.3855f, 26.4414f, 41.8435f);
        this.f37302c.lineTo(30.5746f, 36.7934f);
        this.f37302c.lineTo(39.8456f, 36.7934f);
        this.f37302c.cubicTo(41.591f, 36.7934f, 43.0046f, 35.3766f, 43.0f, 33.6319f);
        this.f37302c.lineTo(42.9297f, 7.14485f);
        this.f37302c.cubicTo(42.9251f, 5.40665f, 41.5141f, 4.0f, 39.7752f, 4.0f);
        this.f37302c.lineTo(8.22419f, 4.0f);
        this.f37302c.close();
        this.f37302c.moveTo(30.3082f, 19.1354f);
        this.f37302c.lineTo(17.6905f, 19.1354f);
        this.f37302c.cubicTo(16.9936f, 19.1354f, 16.4287f, 19.7001f, 16.4287f, 20.3967f);
        this.f37302c.lineTo(16.4287f, 21.658f);
        this.f37302c.cubicTo(16.4287f, 22.3546f, 16.9936f, 22.9193f, 17.6905f, 22.9193f);
        this.f37302c.lineTo(30.3082f, 22.9193f);
        this.f37302c.cubicTo(31.0051f, 22.9193f, 31.57f, 22.3546f, 31.57f, 21.658f);
        this.f37302c.lineTo(31.57f, 20.3967f);
        this.f37302c.cubicTo(31.57f, 19.7001f, 31.0051f, 19.1354f, 30.3082f, 19.1354f);
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
